package jobbean;

public class likerbean {
 private String name;
 public likerbean(String name, String job, String email, String mess) {
	super();
	this.name = name;
	this.job = job;
	this.email = email;
	this.mess = mess;
}
@Override
public String toString() {
	return "likerbean [name=" + name + ", job=" + job + ", email=" + email + ", mess=" + mess + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMess() {
	return mess;
}
public void setMess(String mess) {
	this.mess = mess;
}
private String job;
 private String email;
 private String mess;
}
