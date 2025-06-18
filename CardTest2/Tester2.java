package CardTest2;
import java.util.Arrays;
import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("カードを5枚生成します。");

		//配列を利用してCardクラスのインスタンス生成
		/*Card[]cards={
		 * new Card("♠",1),
		 * new Card("♠",2),
		 * new Card("♥",11),
		 * new Card("♣",12),
		 * new Card("♦",13),
		 * */
		Card2 acard=new Card2("♠",1);
		Card2 bcard=new Card2("♠",2);
		Card2 ccard=new Card2("♥",11);
		Card2 dcard=new Card2("♣",12);
		Card2 ecard=new Card2("♦",13);
		
		Card2 []n=new Card2[5];//配列の宣言
		
		//配列にカード型インスタンスの収納
		n[0]=acard;
		n[1]=bcard;
		n[2]=ccard;
		n[3]=dcard;
		n[4]=ecard;
		
		System.out.println("カードを表示します。");
		
		//5つのcardクラスインスタンスにtoString呼び出し
		System.out.println("♠"+n[0].toString());
		System.out.println(bcard.toString());
		System.out.println("♥"+ccard.toString());
		System.out.println("♣"+dcard.toString());
		System.out.println("♦"+ecard.toString());
		
		
	}

}
