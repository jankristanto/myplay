package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void list(){
        List<User> users = User.find().asList();
        render(users);
    }

    public static void form(String email) {
	    if(email != null) {
	        User user = User.find().filter("email",email).first();
	        render(user);
	    }
	    render();
	}
    public static void show() {
    	String email = params.get("email");
    	User user = User.find().filter("email",email).first();

    	render(user);
	}
	public static void save(String email, String password, String fullname){
	    User user = User.find().filter("email",email).first();
	    if(user == null){
	    	user = new User(email, password, fullname);	
	    }else{
	    	user.password = password; 
	    	user.fullname = fullname;
	    }
	    
	    // Save
	    user.save();
	    list();
	}

}