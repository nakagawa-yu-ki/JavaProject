// 演習14-3設問2 じゃんけんルールクラス（演習13-3設問2と同じ）（本問で変更なし）
package janken;

public class JankenRule implements HandSkinnable {
	
	static String[] handStr;	// じゃんけんの手文字列配列
	
	/* 国によって手の呼び名を変える */
	static void changeCountry(int country) {
		handStr = handStrs[country];
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
