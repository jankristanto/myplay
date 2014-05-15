package models;
import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
@Entity
public class User extends Model {
 
    public String email;
    public String password;
    public String fullname;
    
    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }
    public static void test(){}
}