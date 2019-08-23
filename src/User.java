import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable
 {
    String name;
    String lastName;
    String eMail;
    ArrayList<String> roles = new ArrayList<>();
    ArrayList<String> phones = new ArrayList<>();


    public User(String name, String lastName, String eMail, ArrayList<String> roles, ArrayList<String>phones){
        this.name=name;
        this.lastName=lastName;
        this.eMail=eMail;

        this.roles = new ArrayList<String>();
        if (roles != null) {
            for (String rol : roles) {
                this.roles.add(rol);
            }
        }
        this.phones = new ArrayList<String>();
        if (phones != null) {
            for (String ph : phones) {
                this.phones.add(ph);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {

        return "Name: "+name+", LastName: " +lastName+"; eMail: "+eMail+"; Roles: "+roles+"; Phones: "+ phones+"\n";

    }




}
