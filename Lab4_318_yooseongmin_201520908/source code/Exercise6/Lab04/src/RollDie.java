
import java.security.SecureRandom;

public class RollDie {
	public static void main(String args[]) {
		SecureRandom randomNumbers = new SecureRandom();

		int frequency[] = new int[7];
		
		// The compiler automatically initializes zeros to every element of the array.

		for (int roll = 1; roll <= 6000000; roll++) {
			int face = 1 + randomNumbers.nextInt(6);
			switch(face) {
				case 1:
				++frequency[1];
				break;
				case 2:
				++frequency[2];
				break;
				case 3:
				++frequency[3];
				break;
				case 4:
				++frequency[4];
				break;
				case 5:
				++frequency[5];
				break;
				case 6:
				++frequency[6];
				break;
			}
		}
		
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",frequency[1],frequency[2],frequency[3],frequency[4],frequency[5],frequency[6]);
	}
}
