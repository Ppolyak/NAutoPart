package nautopart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String login = "standard_user";
    private String password = "secret_sauce";
    private String firstname = "Firstname";
    private String lastname = "Lastname";
    private String zipPostal = "zipPostal";


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String firstname,String lastname, String zipPostal){
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipPostal = zipPostal;
    }

    /*public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getZipPostal() {
        return zipPostal;
    }

    public void setZipPostal(String zipPostal) {
        this.zipPostal = zipPostal;
    }*/
}
