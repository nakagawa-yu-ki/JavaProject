
package pokemonbattle;

public interface PokemonSkinnable {
	
	String[][] pokemonStrs = {	// ポケモンの配列
		{ "カメックス", "リザードン", "フシギバナ" },		// 日本
		{ "大力鰐", "爆風", "明治乳業" },			// 中国表記
		{"Swampert", "Blaziken", "Jukain"}		// アメリカ表記
	};
	
	int SELECT_KANTO = 0;		// カントー地方
	int SELECT_JOUTO = 1;		// ジョウト地方
	int SELECT_HOUEN = 2;		//ホウエン地方
}
