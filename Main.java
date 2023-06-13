import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello nerd. What is your name?");
		
		//so basically static stuff is that you don't need to make an instance
		//to access a methods quirks and capabilities C:

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hello Mr. " + name + ", did you know Max is stupid?");
		String ezString = "I bet Max cant make this easy to type string!" + " :>";
		//this is a combination of 2 literals which is called an expression
		String Maximportant = new String("This is some very important information btw!");
		
		System.out.println(Maximportant + " (plus cool thing is first part of this was a string!)");
		System.out.println(ezString + " but I know " + name + " can!");

		/*java is staticly type language so you have to define variable type upfront :D
		basically you its like the thing in front of the variable in String name =*/
		int randomnum = 5; //for example int is a way of saying the type of variable
		//ooooo look! its a operater (+) thats working on the text operands I added C:

	}
	public void nerds()  {
		System.out.println("Max you are STUPID!");
	}
}
