package strategy;

import java.io.File;

public class AuthFile implements AuthStrategy{
    private File file;
    
    
	
	
	public AuthFile(File file) {
		super();
		this.file = file;
	}




	@Override
	public boolean checkLogin(String name, String login) {
		System.out.println("Checking fith file...");
		return checkfromFile();
	}
	
	private boolean checkfromFile() {
		return true;
	}

}
