package Connection;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			ConnectionTest.getInstance().geConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
