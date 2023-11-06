package models;

/**
 *
 * @author Aalan
 */
public class Friend {
    private String name;
    private String phone;
    private String email;
    private String facebook;
    private String brithday;

    public Friend() {
    }

    public Friend(String name, String phone, String email, String facebook, String brithday) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.facebook = facebook;
        this.brithday = brithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
}
