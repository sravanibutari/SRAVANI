package comm.example.spring.model;

public class User {
public String email;
public String password;
public User()
{
	super();
}
public User(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
