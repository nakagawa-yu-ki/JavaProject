
package pokemonbattle;

public class PokemonBattleRule implements PokemonSkinnable {

	static String[] pokemonbattle;

	/* 地方にによってポケモンの呼び名を変える */
	static void changeRegion(int region) {
		pokemonbattle = pokemonStrs[region];
	}

	/* じゃんけんの勝敗を判定するメソッド */
	static int judge(int player1, int player2) {
		int judge = (player1 - player2 + 3) % 3;
		return judge;
	}

	/* じゃんけんの勝敗を表示するメソッド */
	static void showJudge(int judge, String firstPlayerName) {
		String[] judgeStr = { "引き分けです", "の負けです", "の勝ちです" }; // 勝敗文字列配列
		System.out.println(((judge == 0) ? "" : firstPlayerName) + judgeStr[judge]);
	}

}
