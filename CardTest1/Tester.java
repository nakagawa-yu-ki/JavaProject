package CardTest1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		//キーボードからの入力をしたいので
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("カードを生成します。");
		System.out.print("絵柄：");
		String suitMark=stdIn.next();
		
		System.out.println("数字：");
		int no=stdIn.nextInt();
		
		//入力した絵柄と数字によりCardクラスのインスタンス生成
		Card ca=new Card(suitMark,no);//クラスインスタンスの生成
		System.out.println("カードを表示します。");
		
		//toString()を呼び出して画面表示
		System.out.println(ca.toString());//返却値を画面表示
	}
	

}
