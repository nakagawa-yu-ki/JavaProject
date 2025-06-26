package pokemonbattle;

import java.util.Scanner;

public class HumanStrategy implements Strategy {

	@Override
	public int nextPokemon(int pokemon) {
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.print("行け！");
			for (int i = 0; i < 3; i++)
				System.out.print("(" + i + ")" + PokemonBattleRule.pokemonbattle[i] + " ");
			System.out.print("：");
			pokemon = stdIn.nextInt();
		} while (pokemon < 0 || pokemon > 2);
		return pokemon;
	}
}
