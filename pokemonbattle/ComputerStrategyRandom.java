package pokemonbattle;

import java.util.Random;

public class ComputerStrategyRandom implements Strategy {

	@Override
	public int nextPokemon(int pokemon) {
		Random rand = new Random();
		int pokemons = rand.nextInt(3);
		return pokemons;
	}

}
