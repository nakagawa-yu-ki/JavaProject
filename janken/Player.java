// 演習14-3設問1 じゃんけんプレーヤクラス（完成版）
// 演習14-3設問2 じゃんけんプレーヤクラス（作成用）
package janken;

public  class Player {

	private String name;	// 名前
	private int hand;		// じゃんけんの手
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
	
	public int getHand() {
		return hand;
	}

	// セッタ
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHand(int hand) {
		this.hand = hand;
	}
	
	/* 次の手を生成するメソッド */
	public void nextHand() {
		int hand=strategy.nextHand(this.hand);//次の手を考える
		setHand(hand);//手を保存
	}

	/* じゃんけんの手を表示するメソッド */
	public void showHand() {
		System.out.println(toString() + JankenRule.handStr[hand]);
	}
	
	/* 文字列表現を返却するメソッド */
	public String toString() {
		return name + ":";
	}

}
