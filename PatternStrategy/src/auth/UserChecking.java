package auth;

import strategy.AuthStrategy;

public class UserChecking {
	private String nameString;
	private String paswString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getPaswString() {
		return paswString;
	}
	public void setPaswString(String paswString) {
		this.paswString = paswString;
	}
    
	public boolean check(AuthStrategy authStrategy) {
		return authStrategy.checkLogin(nameString,paswString);
	}
}
