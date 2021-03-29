public class Characters {
	
	String username;
	String color;
	boolean status;
	int task;
	
	void run() {
		System.out.println("Running...");
	}
	
	void vote() {
		System.out.println(username + " has Voted!");
	}
	
	void emergencyCall() {
		System.out.println("Make an emegency call");
	}
	
	int countTask() {
		return 0;
	}
}