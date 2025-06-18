package CardTest2;

public class Card2 {

	//フィールド
	private String suitMark=" ";
	private int no=0;
	
	//コンストラクタ 
	public Card2() {}
	public Card2(String suitMark,int no) {
		this.suitMark=suitMark;
		this.no=no;
	}
	//メソッド（今回はゲッタのみ）。セッタは書かなくても行ける。
	
	public String getsuitMark() {//絵柄のゲッタ
		return suitMark;
	}
	
	public int getno() {	//数字のゲッタ
		return no;
	}
	
	public void setsuitMark(String suitMark) {//絵柄のセッタ
		this.suitMark=suitMark;
	}
	
	public void setno(int no) {    //数字のセッタ
		this.no=no;
	}
	
	//1,11,12,13→A,J,Q,Kに変換する
	public String toString() {
		switch(no) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default:
		}
	return suitMark+no;
	 
	/*別の方法
	 * String suuji=" ";
	switch(no) {
	case 1:
		suuji="A";
		break;
	case 11:
		suuji="J";
		break;
	case 12:
		suuji="Q";
		break;
	case 13:
		suuji="K";
		break;
		default:
			suuji=no+"";
			break;*/
	}
	}

