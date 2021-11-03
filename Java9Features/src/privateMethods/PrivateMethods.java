package privateMethods;

public interface PrivateMethods {
	default void sendingNotifications() {
		//System.out.println("Establish Connection");
		establishConnection();
		System.out.println("Sending Multiple Notifications...");
	}

	default void sendingNotification() {
		//System.out.println("Establish Connection");
		establishConnection();
		System.out.println("Sending  Notifications...");
	}

	private void establishConnection() {
		System.out.println("Establish Connection");
	}

}
