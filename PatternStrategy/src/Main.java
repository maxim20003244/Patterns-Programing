import auth.UserChecking;
import strategy.DBauth;

public class Main {
	public static void main(String[] arg) {
		UserChecking userChecking = new UserChecking();
		userChecking.check(new DBauth("jdbc://com.mysql"));
	}

}
