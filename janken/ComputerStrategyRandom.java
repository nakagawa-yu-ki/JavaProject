package janken;
import java.util.Random;

public class ComputerStrategyRandom implements Strategy {
	
	@Override
	public int nextHand(int hand) {
		Random rand = new Random();
		int hands = rand.nextInt(3);
		return hands;
	}
	
}
