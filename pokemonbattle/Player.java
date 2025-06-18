
// プレイヤーの情報を保存、返したい
package pokemonbattle;

public  class Player {

	private String name;	// 名前
	private int pokemon;		// ポゲモン
	private Strategy strategy=null;   //戦略
	
	// コンストラクタ
	public Player (String name ,Strategy strategy) {
		this.name = name;
		this.strategy=strategy;
	}
	
	// ゲッタ
	public String getName() {
		return name;
	}
	
	public int getPokemon() {
		return pokemon;
	}

	// セッタ
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPokemon(int pokemon) {
		this.pokemon = pokemon;
	}
	
	/* 次の手を生成するメソッド */
	public void nextPokemon() {
		int pokemon=strategy.nextPokemon(this.pokemon);//次の手を考える
		setPokemon(pokemon);//手を保存
	}

	/* じゃんけんの手を表示するメソッド */
	public void showPokemon() {
		System.out.println(toString() + PokemonBattleRule.pokemonbattle[pokemon]);
	}
	
	/* 文字列表現を返却するメソッド */
	public String toString() {
		return name + ":";
	}

}
