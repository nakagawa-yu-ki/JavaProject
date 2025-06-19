
/*今回制作したjavaのゲームプログラム
 * 
 * ①指定した数字やマークを表示できるプログラム
 * 
 * ②表示が難しい数字（トランプのジャックなど）を表示するプログラム
 * 
 * ③じゃんけんのプログラムをモチーフに、自身が好きなゲームを簡易的に遊べるプログラム
 * の3つを構築してみた。
 * 
 * ①このゲームは入力した数字やマークを表示することができるゲームです。
 * 例えばトランプの♠の1、と入力すれば♠1と表記できます。
 * また、トランプに使われる数字やマーク以外も入力が可能ですので、
 * 気軽に捜査して頂ければと思います。
 * 
 * 次に②のゲームについて
 * このゲームは①のゲームよりよりトランプを意識して制作しました。
 * トランプには1をA、11をJ、という特別な読み方があります。
 * ①のゲームではその仕組みを反映していなかったため、その内容を補填するような
 * 仕組みになっています。ただし、このゲームは
 * 実行すれば特定の数字が表記されるだけなので、あまりゲームとしては適していません。
 * 
 * そして③番目のゲーム。
 * 特にこのゲームはこだわりを多くしてみました。
 * 具体的には
 * ・キャラクターの名前を表示する。その際、カタカナだけでなく、漢字や英語のキャラクターも登場する
 * ・指定された以外の数字を入力したら先に進めないようにする
 * ・選択した地方によって使えるキャラクターが変わるようにする
 * ・ランダム関数を用いて、誰でも遊べるようにする
 * ・選んだ地方で起きるバトルの総合勝敗を勝ち・負け・引き分けで表示するなど
 * 
 * 特に
 * 	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int BattleSelect = -1;
		
		while(true) {
			System.out.println("ここから好きな地方を選んでね");
			System.out.print("（カントー：0、ジョウト：1、ホウエン：2）");
			
			if(stdIn.hasNextInt()) {
				BattleSelect = stdIn.nextInt();
				stdIn.nextLine();
				
				switch (BattleSelect) {
				
				case 0: PokemonBattleRule.changeRegion(PokemonSkinnable.SELECT_KANTO);
				break;
				 case 1: PokemonBattleRule.changeRegion(PokemonSkinnable.SELECT_JOUTO);
				 break;
				 case 2: PokemonBattleRule.changeRegion(PokemonSkinnable.SELECT_HOUEN);
				 break;
				 //breakがないとHOUEN表記にしかならないので、1個1個つけるために必要
				 default:
					 System.out.println("無効な番号です。入力しなおしてください");
					 continue;
			}
				break;
		}else {
			System.out.println("数値を入力してください");
			stdIn.nextLine();
		}
		という中で、指定した以外の数字を入力した際にエラー表示をするように
		if文、switch文、while文を同時に使うことにはとても苦労しました。
		
		しかし、そのかいもあって、私でもいいものができたのではないかと自負しています。
		簡易的なゲームではありますが、
		このコードで遊んでくれたら幸いです。*/


