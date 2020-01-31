/*
 * This source code is written by yoo seong min
 * Major : software 
 * ID : 201520908
 * Grade : 3
 * 
 * This source code has polymorphism version
 */

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
		
		// polymorphism
			
		Triangle[] t = new Triangle[3];
		t[0] = new Triangle();
		t[1] = new TrianglePrism();
		t[2] = new TrianglePyramid();
		
		Square[] s = new Square[3];
		s[0] = new Square();
		s[1] = new SquarePrism();
		s[2] = new SquarePyramid();
		
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
						System.out.println("=== Equilateral Triangle ===");
						t[0].getShapes();
						System.out.printf("\n"+t[0].toString()+"\n");
						break;
					// 2D Square
					case 2:
						System.out.println("=== Square ===");
						s[0].getShapes();
						System.out.printf("\n"+s[0].toString()+"\n");
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
						System.out.println("=== Equilateral Triangular Prism ===");
						t[1].getShapes();
						System.out.println();
						// polymorphism
						TrianglePrism tp = (TrianglePrism)t[1];
						tp.setNormalHeight();
						System.out.printf("\n"+tp.toString()+"\n");
						break;
					case 2:
						System.out.println("=== Square Prism ===");
						s[1].getShapes();
						System.out.println();
						// polymorphism
						SquarePrism sp = (SquarePrism)s[1];
						sp.setNormalHeight();
						System.out.printf("\n"+sp.toString()+"\n");
						break;
					case 3:
						System.out.println("===Equilateral Triangular Pyramid===");
						t[2].getShapes();
						System.out.println();
						// polymorphism
						TrianglePyramid tpy = (TrianglePyramid)t[2];
						tpy.setNormalHeight();
						tpy.setSlantHeight();
						System.out.println("\n"+tpy.toString()+"\n");
						break;
					case 4:
						System.out.println("=== Square Pyramid ===");
						s[2].getShapes();
						System.out.println();
						// polymorphism
						SquarePyramid spy = (SquarePyramid)s[2];
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
