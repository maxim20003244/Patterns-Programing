package strategy;

import javax.swing.text.StyledEditorKit.BoldAction;

public class DBauth implements AuthStrategy {
    private Object dbRef;
    private String dbUrl;
    
    
    
    
    public DBauth(String dbUrl) {
		
		this.dbUrl = dbUrl;
	}
	private void createConnection(String dbUrl) {
    	//dbRef
    	
    }
	@Override
	public boolean checkLogin(String name, String passwordString) {
		System.out.println("Checking with DB");
		String uesrHash = getHash(name);
		String passwordHash = getHash(passwordString);
		return checkUsers(uesrHash, passwordHash);
	}
	
	private boolean checkUsers(String nameString,String passwordString) {
		
		return true;
		
	}
	
	private String getHash(String value) {
		
		return "2dA45OMt";
	}

}
