package DAY9;

public class UserTest {

	public static void main(String[] args) {
		User adm=new AdminUser();
		User gus=new GuestUser();
		adm.showMessage();
		gus.showMessage();
		adm.displayUserType();
		gus.displayUserType();

	}

}
