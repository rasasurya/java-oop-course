public class Crewmate extends Characters{
	
	void isDeath() {
		if (status == true) {
			System.out.println("Killing a crewmate");	
		}
	}
	
	void doingTask() {
		task++;
	}
	
	
	void run() {
		System.out.println(username + " is running.....");
	}
	
	int countTask() {
		return task;
	}
	
	int defaultCounterTask() {
		return super.countTask();
	}
}