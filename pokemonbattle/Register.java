//最終結果を表示したい。
package pokemonbattle;

public class Register {
	
	int[] result = { 0, 0, 0 }; // 勝敗記録配列
	String playerName;
	
	public Register(String name) {
		this.playerName=name;
	}	// コンストラクタ
	
	/* 	ポゲモンバトルの勝敗を記録するメソッド */
	public void recordJudge(int judge) {
		result[judge]++;
	}
	
	/* じゃんけんの勝敗記録を表示するメソッド */
	public void printMatch() {
		System.out.println("【"+playerName+"の総合勝敗表】");
		System.out.println("引分 負け 勝ち");
		for (int i = 0; i < 3; i++)
			System.out.printf("%4d", result[i]);
		System.out.println();
	}
}
