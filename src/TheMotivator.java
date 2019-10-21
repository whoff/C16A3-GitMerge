
public class TheMotivator {
	public void feedback(int score) {
		if (score > 95)
			System.out.println("You're awesome");
		else if (score > 85)
			System.out.println("That's great");
		else if (score > 55)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}