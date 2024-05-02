package videwofourth;

public class Player {
	private int id;
private String firstName;
private String lastName;
private String tc;
private String birthDate;


public Player(int id, String firstName, String lastName, String tc, String birthDate) {

	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.tc = tc;
	this.birthDate = birthDate;
}




public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getTc() {
	return tc;
}
public void setTc(String tc) {
	this.tc = tc;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}


	
}
