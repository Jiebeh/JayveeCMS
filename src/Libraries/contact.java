package Libraries;
/**
 *
 * @author Jiebeh
 */
public class contact {
    public Integer id;
    public String firstName;
    public String lastName;
    public String label;
    public String phone;
    public String email;
    public String address;
    public byte[] picture;
    public Integer userId;

    public contact() {}

    public contact(Integer id, String firstName, String lastName, String label, String phone, String email, String address, byte[] picture, Integer userId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.label = label;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.picture = picture;
        this.userId = userId;
    }
    
    public boolean isPictureNull() {
        return this.picture.length > 0;
    }

}
