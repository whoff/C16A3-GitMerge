
public class TheMotivator {
	private String[] messages = {
		"you're awesome!", "that's great!", "that's good!", "well, what can I say?"
	};
	
	private int[] scores = {95, 85, 55 };

	
	public void feedback(int score) {
		System.out.print("With a score of " + score + ", ");
		if (score > scores[0])
			System.out.println(messages[0]);
		else if (score > scores[1])
			System.out.println(messages[1]);
		else if (score > scores[2])
			System.out.println(messages[2]);
		else
			System.out.println(messages[3]);
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(100);
		tm.feedback(95);
		tm.feedback(90);
		tm.feedback(85);
		tm.feedback(80);
		tm.feedback(40);
	}
}