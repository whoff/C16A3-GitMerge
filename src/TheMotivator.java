
public class TheMotivator {
	private String[] messages = {
		"you're awesome!", "that's great!", "that's good!", "you are ok", "well, what can I say?"
	};

	
	public void feedback(int score) {
		System.out.print("With a score of " + score + ", ");
		if (score > 95)
			System.out.println(messages[0]);
		else if (score > 85)
			System.out.println(messages[1]);
		else if (score > 75)
			System.out.println(messages[2]);
		else if (score > 55)
			System.out.println(messages[3]);
		else
			System.out.println(messages[4]);
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(100);
		tm.feedback(60);
		tm.feedback(40);
	}
}