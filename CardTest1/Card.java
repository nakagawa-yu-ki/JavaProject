package CardTest1;

public class Card {

	//フィールド
	private String suitMark=" ";
	private int no=0;
	
	//コンストラクタ 
	public Card() {}
	public Card(String suitMark,int no) {
		this.suitMark=suitMark;
		this.no=no;
	}
	//メソッド（今回はゲッタのみ）を保存。今回はセッタンは不要
	
	public String getSuitMark() {//絵柄のゲッタん
		return suitMark;
		//別解答：return this.suitMark;
	}
	
	public int getNo() {	//数字のゲッタン
		return no;
		//別解答：return this.no;
	}
	
	//toStringメソッドをオーバーライドする 
	public String toString() {
		 return suitMark+no;
		 //別解答：return this.suitMark+this.no;
	}
//
}
