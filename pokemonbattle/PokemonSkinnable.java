
package pokemonbattle;

public interface PokemonSkinnable {

	String[][] pokemonStrs = { // ポケモンの配列
			{ "カメックス", "リザードン", "フシギバナ" }, // カタカナ
			{ "大力鰐", "爆風", "明治乳業" }, // 漢字
			{ "Swampert", "Blaziken", "Jukain" }, // 英語
			{ "엠페르트", "초염몽", "토대부기" } //韓国語
	};

	int SELECT_KANTO = 0; // カントー地方
	int SELECT_JOUTO = 1; // ジョウト地方
	int SELECT_HOUEN = 2; //ホウエン地方
	int SELECT_SINOU = 3; //シンオウ地方
}
