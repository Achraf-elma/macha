package businessLogic;
import java.util.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import userinterface.*;

	
     
 
public class User {
 
    private StringProperty nicknameProperty;
    private StringProperty pwdProperty;
    private StringProperty userfirstnameProperty;
    private StringProperty userlastnameProperty;
    private StringProperty userdateofbirthProperty;
    private StringProperty addressProperty;
    
    private String nickname;
    private String pwd;
    private String userfirstname;
    private String userlastname;
    private String userdateofbirth;
    private String address;
    
    public User() {
        this.userfirstname = null;
        this.userlastname = null;
    }
 
    public User(String nickname, String userfirstname, String lastname) {
        this.userfirstnameProperty = new SimpleStringProperty(userfirstname);
        this.userlastnameProperty = new SimpleStringProperty(lastname);
        this.nicknameProperty = new SimpleStringProperty(nickname);
   
    }
    
    public User(String nick, String pwd, String firstname, String lastname, String birth, String address) {
        this.nickname = nick;
        this.pwd = pwd;
        this.userfirstname = firstname;
        this.userlastname = lastname;
        this.userdateofbirth = birth;
        this.address = address;
     }
    
    public User(String nick, String pwd)
    {
        this.nickname = nick;
        this.pwd = pwd;
    }
 
  // communication object
public void login(String userid, String pwd) {
if(userid.equals(this.getNickname()) && pwd.equals(this.getPwd())) {
System.out.println("Login correct");
}
else {
System.out.println("Login incorrect");
}
}

public void display(User usr) {
System.out.println("Bonjour, " + usr.getUserfirstname() + " " + usr.getUserlastname());
//UserIndex ui = new UserIndex(usr);
}
 

// GETTERS & SETTERS
public String getNickname() {
return this.nicknameProperty.get();
}
public void setNickname(String nickname) {
this.nicknameProperty.set(nickname);
}
public String getPwd() {
return this.pwdProperty.get();
}
public void setPwd(String pwd) {
 this.pwdProperty.set(pwd);
}
public String getUserfirstname() {
return this.userfirstnameProperty.get();
}
public void setUserfirstname(String userfirstname) {
this.userfirstnameProperty.set(userfirstname);
}
public String getUserlastname() {
return this.userlastnameProperty.get();
}
public void setUserlastname(String userlastname) {
this.userlastnameProperty.set(userlastname);
}
public String getUserdateofbirth() {
return this.userdateofbirthProperty.get();

}
public void setUserdateofbirth(String userdateofbirth) {
this.userdateofbirthProperty.set(userdateofbirth);

}
public String getAddress() {
return this.addressProperty.get();

}
public void setAddress(String address) {
this.addressProperty.set(address);

}

    /**
     * @return the nicknameProperty
     */
    public StringProperty getNicknameProperty() {
        return nicknameProperty;
    }

    /**
     * @param nicknameProperty the nicknameProperty to set
     */
    public void setNicknameProperty(StringProperty nicknameProperty) {
        this.nicknameProperty = nicknameProperty;
    }

    /**
     * @return the pwdProperty
     */
    public StringProperty getPwdProperty() {
        return pwdProperty;
    }

    /**
     * @param pwdProperty the pwdProperty to set
     */
    public void setPwdProperty(StringProperty pwdProperty) {
        this.pwdProperty = pwdProperty;
    }

    /**
     * @return the userfirstnameProperty
     */
    public StringProperty getUserfirstnameProperty() {
        return userfirstnameProperty;
    }

    /**
     * @param userfirstnameProperty the userfirstnameProperty to set
     */
    public void setUserfirstnameProperty(StringProperty userfirstnameProperty) {
        this.userfirstnameProperty = userfirstnameProperty;
    }

    /**
     * @return the userlastnameProperty
     */
    public StringProperty getUserlastnameProperty() {
        return userlastnameProperty;
    }

    /**
     * @param userlastnameProperty the userlastnameProperty to set
     */
    public void setUserlastnameProperty(StringProperty userlastnameProperty) {
        this.userlastnameProperty = userlastnameProperty;
    }

    /**
     * @return the userdateofbirthProperty
     */
    public StringProperty getUserdateofbirthProperty() {
        return userdateofbirthProperty;
    }

    /**
     * @param userdateofbirthProperty the userdateofbirthProperty to set
     */
    public void setUserdateofbirthProperty(StringProperty userdateofbirthProperty) {
        this.userdateofbirthProperty = userdateofbirthProperty;
    }

    /**
     * @return the addressProperty
     */
    public StringProperty getAddressProperty() {
        return addressProperty;
    }

    /**
     * @param addressProperty the addressProperty to set
     */
    public void setAddressProperty(StringProperty addressProperty) {
        this.addressProperty = addressProperty;
    }


}

     