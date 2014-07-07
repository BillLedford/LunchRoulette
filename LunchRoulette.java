import java.util.*;

public class LunchRoulette{

		ArrayList locations = new ArrayList();

		boolean done = false;
		
		Scanner userInput = new Scanner( System.in );
		String foodSpot;
		
		public void getInput() {
			System.out.print("Enter a place to eat, or say 'done'");
			foodSpot = userInput.nextLine();
			}
		
		public void doStuff() {
			if (!done) {
				getInput();
				}
		
			if (foodSpot.equals("done")) {
				done = true;
				//System.out.println("it worked!");
				System.out.println("Contents of locations: " + locations);
				Random r = new Random();
				System.out.println(locations.get(r.nextInt(locations.size())));
			} else {
			locations.add(foodSpot);
		
			System.out.println("Contents of locations: " + locations);
			doStuff();
			}
		}
}