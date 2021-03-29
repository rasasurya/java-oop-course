public class Impostor extends Characters{
	
	void kill() {
		System.out.println("Killing a crewmate");
	}
	
	void sabotage() {
		System.out.println("Sabotage a system");
	}
	
	//override
	void run() {
		System.out.println("You're running...");
	}
	
	void runCharacter() {
		super.run();
	}
	
}