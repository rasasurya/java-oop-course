public class AmoungUsApp {

	public static void main(String[] args) {
		
		Crewmate crewmate = new Crewmate();
		Impostor impostor = new Impostor();
		impostor.username = "hanif";
		crewmate.username = "jefri";
		
		impostor.run();
		impostor.runCharacter();
		crewmate.run();
		crewmate.doingTask();
		var defaultCounterTask = crewmate.defaultCounterTask();
		int counterTask = crewmate.countTask();
		System.out.println("Defaul task done: " + defaultCounterTask);
		System.out.println("task done: " + counterTask);

	}

}