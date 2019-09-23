
enum Level {

	LOW, MEDIUM, HIGH

}

enum Level1 {

	LOW(1, "low"), MEDIUM(5, "medium"), HIGH(10, "high");

	int rating;
	String name;

	private Level1(int rating, String name) {
		this.rating = rating;
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		System.out.println(this.rating + this.name);
		return this.rating + this.name;
	}

}

public class ExampleEnum {

	public static void main(String[] args) {
		Level l1 = Level.LOW;
		System.out.println(l1);
		Level1 l2 = Level1.LOW;
		System.out.println("-" + l2.toString());
		l2 = Level1.MEDIUM;
		System.out.println("-" + l2.toString());
		l2 = Level1.HIGH;
		System.out.println("-" + l2.toString());

	}
}
