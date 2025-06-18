package pokemonbattle;

public class ComputerStrategySerial implements Strategy {

	@Override
	public int nextPokemon(int pokemon) {
		/*hand÷3の余りで、次の手を示したい*/
		int nh;
		nh=(pokemon+1)%3;
		return nh;
		//return ++hand%3;でも可
		
		/*static int judge(int human, int comp) {
			int judge = (human - comp + 3) % 3;
			return judge;*/
	}
}
