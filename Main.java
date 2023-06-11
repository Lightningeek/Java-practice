import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello nerd. What is your name?");
		
		/*var x = new Main();
		x.nerds();
		x.nerds();
		x.nerds();
		x.nerds();
		x.nerds();
		x.nerds();
		x.nerds();*/ 

		//so basically static stuff is that you don't need to make an instance
		//to access a methods quirks and capabilities C:

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello Mr." + name + ", did you know Max is stupid?");

		String Maximportant = new String("This is some very important information btw!");
		System.out.println(Maximportant);

	}
	public void nerds()  {
		System.out.println("Max you are STUPID!");
	}
}
