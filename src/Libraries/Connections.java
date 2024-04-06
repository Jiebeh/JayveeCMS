package Libraries;

import Forms.registerForm;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Jiebeh
 */
public class Connections {
    
    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/javacms", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }
    
    //Login Account
    //Takes username & password | Returns boolean true or false if the login is successful
    //Takes lbPicture as JLabel | Set the lbPicture icon inside the method | lbUsername & userId same as lbPicture that modified inside the method
    public static boolean Login(String username, String password, JLabel lbPicture, JLabel lbUsername, JLabel userId) {
        Connection connection = getConnection();
        PreparedStatement preparedstatement;
        ResultSet resultset;

        try {
            preparedstatement = connection.prepareStatement("SELECT `username`, `password`, `picture`, `id` FROM `users` WHERE `username` = ? AND `password` = ?");
            preparedstatement.setString(1, username);
            preparedstatement.setString(2, password);

            resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                lbPicture.setIcon(Methods.resizePicture(resultset.getBytes(3), lbPicture.getWidth(), lbPicture.getHeight()));
                lbUsername.setText(resultset.getString(1));
                userId.setText(resultset.getString(4));

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean register(String firstName, String lastName, String username, String password, String confirmPassword, String picture) {
        if (!verifyRegistrationForm(firstName, lastName, username, password, confirmPassword, picture)) {
            return false;
        }

        Connection connection = getConnection();
        PreparedStatement preparedstatement;

        try {
            preparedstatement = connection.prepareStatement("INSERT INTO `users`(`firstName`, `lastName`, `username`, `password`, `picture`) VALUES (?,?,?,?,?)");

            preparedstatement.setString(1, firstName);
            preparedstatement.setString(2, lastName);
            preparedstatement.setString(3, username);
            preparedstatement.setString(4, password);
            preparedstatement.setBlob(5, new FileInputStream(new File(picture)));

            if (preparedstatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Account Successfully Created");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Account Creation Error", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (HeadlessException | FileNotFoundException | SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public static boolean isUserExist(String username) {
        Connection connection = getConnection();
        PreparedStatement preparedstatement;
        
        try {
            preparedstatement = connection.prepareStatement("SELECT * FROM `users` WHERE `username` = ?");
            ResultSet resultset;

            preparedstatement.setString(1, username);

            resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public static byte[] getImage(int id) {
        Connection connection = getConnection();
        PreparedStatement preparedstatement;
        
        try {
            preparedstatement = connection.prepareStatement("SELECT `picture` FROM `contacts` WHERE `id` = ?");
            ResultSet resultset;

            preparedstatement.setInt(1, id);

            resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                return resultset.getBytes(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new byte[0];
    }
    
    public static void updateUserPicture(int userId, String path) {
        if (path == null) {
            return;
        }
        
        Connection connection = getConnection();
        PreparedStatement preparedstatement;
        
        try {
            preparedstatement = connection.prepareStatement("UPDATE `users` SET `picture`=? WHERE `id`=?");

            preparedstatement.setBytes(1, Files.readAllBytes(Paths.get(path)));
            preparedstatement.setInt(2, userId);
            preparedstatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Integer insertContact(Libraries.contact contact) {
        Connection connection = getConnection();
        PreparedStatement preparedstatement;

        try {
            preparedstatement = connection.prepareStatement("INSERT INTO `contacts`(`firstName`, `lastName`, `label`, `phone`, `email`, `address`, `picture`, `userId`) VALUES (?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            preparedstatement.setString(1, contact.firstName);
            preparedstatement.setString(2, contact.lastName);
            preparedstatement.setString(3, contact.label);
            preparedstatement.setString(4, contact.phone);
            preparedstatement.setString(5, contact.email);
            preparedstatement.setString(6, contact.address);
            preparedstatement.setBytes(7, contact.picture);
            preparedstatement.setInt(8, contact.userId);

            if (preparedstatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Contact Successfully Added");

                ResultSet keys = preparedstatement.getGeneratedKeys();
                if (keys.next()) {
                    return keys.getInt(1);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Adding Contact Failed", "", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public static boolean updateContact(Libraries.contact contact) {
        Connection connection = getConnection();
        PreparedStatement preparedstatement;

        String updateQuery;

        if (contact.picture.length > 0) {
            updateQuery = "UPDATE `contacts` SET `firstName`=?,`lastName`=?,`label`=?,`phone`=?,`email`=?,`address`=?,`picture`=?,`userId`=? WHERE id = " + contact.id;
        } else {
            updateQuery = "UPDATE `contacts` SET `firstName`=?,`lastName`=?,`label`=?,`phone`=?,`email`=?,`address`=?,`userId`=? WHERE id = " + contact.id;
        }
        
        try {
            preparedstatement = connection.prepareStatement(updateQuery);
            preparedstatement.setString(1, contact.firstName);
            preparedstatement.setString(2, contact.lastName);
            preparedstatement.setString(3, contact.label);
            preparedstatement.setString(4, contact.phone);
            preparedstatement.setString(5, contact.email);
            preparedstatement.setString(6, contact.address);

            if (contact.picture.length > 0) {
                preparedstatement.setBytes(7, contact.picture);
                preparedstatement.setInt(8, contact.userId);
            } else {
                preparedstatement.setInt(7, contact.userId);
            }

            if (preparedstatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Contact Updated");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Updating Contact Failed", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public static void deleteContact(Integer id) {
        Connection connection = getConnection();
        PreparedStatement preparedstatement;

        try {
            preparedstatement = connection.prepareStatement("DELETE FROM `contacts` WHERE `id` = ?");
            preparedstatement.setInt(1, id);

            if (preparedstatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Contact Deleted");
            } else {
                JOptionPane.showMessageDialog(null, "Deleting Contact Failed", "", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Libraries.contact> getContacts(Integer userId) {
        ArrayList<Libraries.contact> contactsList = new ArrayList<>();

        Connection connection = getConnection();
        Statement statement;
        ResultSet resultset;

        try {
            statement = connection.createStatement();
            resultset = statement.executeQuery("SELECT `id`, `firstName`, `lastName`, `label`, `phone`, `email`, `address`, `picture` FROM `contacts` WHERE `userId` = " + userId);

            while (resultset.next()) {
                contactsList.add(new Libraries.contact(
                        resultset.getInt("id"),
                        resultset.getString("firstName"),
                        resultset.getString("lastName"),
                        resultset.getString("label"),
                        resultset.getString("phone"),
                        resultset.getString("email"),
                        resultset.getString("address"),
                        resultset.getBytes("picture"),
                        userId
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contactsList;
    }
    
    public static boolean verifyRegistrationForm(String firstName, String lastName, String username, String password, String confirmPassword, String picture) {
        if (isUserExist(username)) {
            JOptionPane.showMessageDialog(null, "User already existed", "", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (firstName.equals("") && lastName.equals("") || username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all fields", "", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (password.equals("") || !password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords are not matched", "", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (picture == null) {
            JOptionPane.showMessageDialog(null, "There is no image selected", "", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }
    
}
