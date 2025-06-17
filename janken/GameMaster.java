// 演習14-3設問1 じゃんけんゲーム進行クラス（完成版）
// 演習14-3設問2 じゃんけんゲーム進行クラス（作成用）
package janken;

import java.util.Scanner;

public class GameMaster {
	
	/* 繰返しの継続を判定するメソッド */
	static boolean confirmRetry() {
		Scanner stdIn = new Scanner(System.in);
		int retry = 1;
		do {
			System.out.print(" 続けますか？（1:はい、0:いいえ）");
			retry = stdIn.nextInt();
		} while (retry != 1 && retry != 0);
		return (retry == 1);
	}
	
	/* じゃんけんプレーヤーの生成 */
	static Player makePlayer(String playerNo) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("（人間：0、コンピュータR：1、コンピュータS：2）");
		int playerKind = stdIn.nextInt();
		Player player = switch (playerKind) {
		 case 0 -> new Player(playerNo + "（人間）",new HumanStrategy());
		 case 1 -> new Player(playerNo + "（コンピュータR）",new ComputerStrategyRandom());
		 case 2 -> new Player(playerNo + "（コンピュータS）",new ComputerStrategySerial());
		 default -> null;
		};
		return player;
	}

	/* じゃんけんのプレーヤーの生成とゲームの進行 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("じゃんけんの手の国別を選択してください");
		System.out.print("（日本：0、中国：1、アメリカ：2）");
		int cSelect = stdIn.nextInt();
		switch (cSelect) {
		/*changeCoutryはJankenRuleクラスから引っ張ってくる*/ 
		case 0: JankenRule.changeCountry(HandSkinnable.HAND_JAPAN);break;
		 case 1: JankenRule.changeCountry(HandSkinnable.HAND_CHINA);break;
		 case 2: JankenRule.changeCountry(HandSkinnable.HAND_AMERICA);break;
		 //breakがないとアメリカ表記にしかならないので、1個1個つけるために必要
		}
		
		Player[] p = new Player[2];	// Player型配列の生成
		
		System.out.println("プレーヤを選択してください");
		for (int i = 0; i < p.length; i++) {
			System.out.println("プレーヤー" + (i + 1));
			p[i] = makePlayer("プレーヤー" + (i + 1));
		}

		Register reg = new Register();	// Registerクラスのインスタンス生成

		do {
			
			p[0].nextHand();	// 人間の手を生成
			p[1].nextHand();	// コンピュータの手を生成
			
			p[0].showHand();	// 人間の手を表示
			p[1].showHand();	// コンピュータの手を表示
			
			int judge = JankenRule.judge(p[0].getHand(), p[1].getHand());	// 勝敗を判定
			JankenRule.showJudge(judge, p[0].getName());// 勝敗を表示
			
			reg.recordJudge(judge);	// 勝敗を記録
			
		} while (confirmRetry());	// ゲーム継続判定

		reg.printMatch(); // 勝敗記録の表示
	}
}
