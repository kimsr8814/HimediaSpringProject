package spring;

public class RegisterRequest {
	
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
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
	public String getConfirmPasswordl() {
		return confirmPassword;
	}
	public void setConfirmPasswordl(String confirmPasswordl) {
		this.confirmPassword = confirmPasswordl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isPasswordEqualsToConfirmPassword() {
		return this.password.equals(this.confirmPassword);
	}

}
