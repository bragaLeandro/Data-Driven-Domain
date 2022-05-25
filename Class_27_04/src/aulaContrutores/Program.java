package aulaContrutores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Weight: ");
		double height = input.nextDouble();
		System.out.println("Width: ");
		double width = input.nextDouble();
		System.out.println("Depth: ");
		double depth = input.nextDouble();
		input.close();
		
		Box box1 = new Box();
		System.out.println("Height: " + box1.getHeight());

		Box box2 = new Box(height, width, depth);
		System.out.println(box2.getHeight());
		System.out.println(box2.getWidth());
		System.out.println(box2.getDepth());
	}

}
