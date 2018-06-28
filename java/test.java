// testing reading in arguments from the command line

class butts {
	private int x;
	private int y;
	private static int count = 0;

	public butts(int x, int y) {

		System.out.println("Creating object ...");

		this.x = x;
		this.y = y;
		count++;
	}

	public butts() {

		System.out.println("Creating object ...");
		count++;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class test {

	public static void main(String[] args) {
	
		String[] userInput = args;

		System.out.println();
		System.out.println("Here is what you entered: ");
		System.out.println();
		
		for (String user : userInput) {
			System.out.println(user);
		}
		System.out.println();
	}

}
