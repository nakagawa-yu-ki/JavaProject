package janken;
import java.util.Scanner;

public class HumanStrategy implements Strategy {
	
	@Override
	public int nextHand(int hand) {
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.print("人間の手");
			for (int i = 0; i < 3; i++)
				System.out.print("(" + i + ")" + JankenRule.handStr[i] + " ");
			System.out.print("：");
			hand = stdIn.nextInt();
		} while (hand < 0 || hand > 2);
		return hand;
		//
	}
	}


