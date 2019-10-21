
public class TheMotivator {
	private String[] messages = {
		"You're awesome", "That's great", "That's good ", "Well, what can I say?"
	};

	
	public void feedback(int score) {
		System.out.print("With a score of " + score + ", ");
		if (score > 95)
			System.out.println(messages[0]);
		else if (score > 85)
			System.out.println(messages[1]);
		else if (score > 55)
			System.out.println(messages[2]);
		else
			System.out.println(messages[3]);
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(100);
		tm.feedback(60);
		tm.feedback(40);
	}
}