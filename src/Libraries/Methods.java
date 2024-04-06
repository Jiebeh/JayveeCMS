package Libraries;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * @author Jiebeh
 *
 * TODO Username Verification & Functional Login Form
 */
public class Methods {

    public static ImageIcon resizePicture(String path, int width, int height) {
        Image img = new ImageIcon(path).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    public static ImageIcon resizePicture(byte[] blob, int width, int height) {
        Image img = new ImageIcon(blob).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    public static ImageIcon resizePicture(ImageIcon image, int width, int height) {
        Image img = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    public static String browseImage(JLabel label) {
        JFileChooser browse = new JFileChooser();
        browse.setCurrentDirectory(new File(System.getProperty("user.home")));
        browse.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif"));

        if (browse.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            String path = browse.getSelectedFile().getAbsolutePath();
            label.setIcon(Methods.resizePicture(path, label.getWidth(), label.getHeight()));

            return path;
        } else {
            System.err.println("No image has been selected!");
        }

        return null;
    }

    public static void populateTable(JTable table, int userId) {
        ArrayList<Libraries.contact> contacts = Connections.getContacts(userId);
        String[] columns = {"Id", "First Name", "Last Name", "Label", "Phone", "Email", "Address", "Picture"};
        Object[][] rows = new Object[contacts.size()][8];
        Libraries.contactsModel model = new Libraries.contactsModel(columns, rows);

        for (int i = 0; i < contacts.size(); i++) {
            rows[i][0] = contacts.get(i).id;
            rows[i][1] = contacts.get(i).firstName;
            rows[i][2] = contacts.get(i).lastName;
            rows[i][3] = contacts.get(i).label;
            rows[i][4] = contacts.get(i).phone;
            rows[i][5] = contacts.get(i).email;
            rows[i][6] = contacts.get(i).address;
            rows[i][7] = new ImageIcon(new ImageIcon(contacts.get(i).picture).getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH));
        }

        table.setShowGrid(true);
        table.setGridColor(Color.darkGray);
        table.setRowHeight(40);
        table.setModel(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(2).setPreferredWidth(80);
        table.getColumnModel().getColumn(3).setPreferredWidth(60);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);
        table.getColumnModel().getColumn(7).setPreferredWidth(70);
        table.getTableHeader().setForeground(Color.darkGray);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));

    }

}
