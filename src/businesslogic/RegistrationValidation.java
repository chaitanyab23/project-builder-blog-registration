package businesslogic;

public class RegistrationValidation {
	
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if (validPassword (password, confirmPassword) && validEmail(email))
			return true;
		else 
			return false;
		
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		String check="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,20}$";
		if (password.matches(check)==confirmPassword.matches(check))
			return true;
		else 
			return false;
		
	}
	
	private boolean validEmail(String email) {
		String regex= "^[a-zA-Z0-9_,@]*$";
		if (email.matches(regex))
			return true;
		else 
			return false;
	}
}
