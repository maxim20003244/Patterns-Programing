package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	private Connection connection;
	private static ConnectionTest instance;
	private static final String URL = "jdbc:mysql://localhost:3306/school?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    	
    private  ConnectionTest () throws SQLException {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			/*if(!connection.isClosed()) {
				System.out.println("Connection succeded!");
				*/
				
			
		} catch (ClassNotFoundException e) {
			System.out.println("Connection is failed");
			e.printStackTrace();
		}
    	
    }
    
    public Connection geConnection() {
    	return connection;
    }
    
    public static ConnectionTest getInstance() throws SQLException{
    	if (instance==null) {
    		instance=new ConnectionTest();
    			}else if(instance.geConnection().isClosed()){
						instance = new ConnectionTest();
				}
    
    	return instance;
    }
}
