package project1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TestShapes {
	
	void ChooseShape() {
			
		// input enter
		Scanner sc = new Scanner(System.in);
			
		// member
		// for choice ...
		int choose1 = 0;
		int choose2 = 0;
		int choose3 = 0;
			
		System.out.println("Choose the Dimension what you want");
		System.out.println("1. 2D Shapes");
		System.out.println("2. 3D shapes");
			
		try {
				choose1 = sc.nextInt();
		}catch(InputMismatchException ime) {
			// invaild input from user
			// print error message
			ime.getMessage();
			this.ChooseShape();
		}
		
		switch(choose1) {
			case 1:
				System.out.println("Choose the Shape what you want");
				System.out.println("1. Triangle");
				System.out.println("2. Square");
				try {
					choose2 = sc.nextInt();
				}catch(InputMismatchException ime) {
					// invaild input from user
					// print error message
					ime.getMessage();
					this.ChooseShape();
				}
				switch(choose2) {
					// 2D Triangle 
					case 1:
						Triangle t = new Triangle();
						System.out.println("=== Equilateral Triangle ===");
						t.getShapes();
						System.out.printf("\n"+t.toString()+"\n");
						break;
					// 2D Square
					case 2:
						Square s = new Square();
						System.out.println("=== Square ===");
						s.getShapes();
						System.out.printf("\n"+s.toString()+"\n");
						break;
				}
			break;
			case 2:
				System.out.println("Choose the shape what you want ");
				System.out.println("1. Equilateral Triangular Prism");
				System.out.println("2. Square Prism");
				System.out.println("3. Equilateral Triangular Pyramid");
				System.out.println("4. Square Pyramid");
				try {
					choose3 = sc.nextInt();
				}catch(InputMismatchException ime) {
					// invaild input from user
					// print error message
					ime.getMessage();
					this.ChooseShape();
				}
				switch(choose3) {
					case 1:
						TrianglePrism tp = new TrianglePrism();
						System.out.println("=== Equilateral Triangular Prism ===");
						tp.getShapes();
						System.out.println();
						tp.setNormalHeight();
						System.out.printf("\n"+tp.toString()+"\n");
					break;
					case 2:
						SquarePrism sp = new SquarePrism();
						System.out.println("=== Square Prism ===");
						sp.getShapes();
						System.out.println();
						sp.setNormalHeight();
						System.out.printf("\n"+sp.toString()+"\n");
						break;
					case 3:
						TrianglePyramid tpy = new TrianglePyramid();
						System.out.println("===Equilateral Triangular Pyramid===");
						tpy.getShapes();
						System.out.println();
						tpy.setNormalHeight();
						tpy.setSlantHeight();
						System.out.println("\n"+tpy.toString()+"\n");
						break;
					case 4:
						SquarePyramid spy = new SquarePyramid();
						System.out.println("=== Square Pyramid ===");
						spy.getShapes();
						System.out.println();
						spy.setNormalHeight();
						spy.setSlantHeight();
						System.out.println("\n"+spy.toString()+"\n");
						break;
				}
				break;
			}
	}
	
	public static void main(String args[]) {
		TestShapes ts = new TestShapes();
		Scanner sc = new Scanner(System.in);
		char c = 'q';
		
		do {
			ts.ChooseShape();
			try {
				System.out.println("Please enter q to exit c to continue");
				c = sc.next().charAt(0);
			}catch(InputMismatchException ime) {
				// invaild input from user
				// print error message
				System.out.printf("\n"+ime.getMessage()+"\n");
				continue;
			}
		}while(c != 'q');
	}
}
