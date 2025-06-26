
package pokemonbattle;

import java.util.Scanner;

public class GameMaster {
	
	static Player makePlayer(String playerNo, Scanner stdIn) {
		
	
		System.out.print("主人公(男）:0、主人公(女)：1、ライバル（男）：2、ライバル（女）：3");
		int playerKind = stdIn.nextInt();
		
		String name;
		Strategy strategy;
		
		if(playerKind==0|| playerKind==1) {
			while(true) {
				System.out.println("あなたの名前を入力してください：");
				name=stdIn.next();
				
				System.out.println("この名前でよろしいですね？（はい/いいえ）：");
				String confirm=stdIn.next();
				
				if(confirm.equals("はい") || confirm.equalsIgnoreCase("yes")) {
					break;
				}else {
					System.out.println("もう一度入力してください");
				}
			}
			strategy=new HumanStrategy();
		}else {
			name=switch(playerKind) {
			case 2 ->playerNo + "グリーン";
			case 3 ->playerNo + "イエロー";
			default -> "ジョン・ドゥ";
			
			};
			
		//プレイヤーを選択する
		strategy = switch (playerKind) {
		 //case 0 -> new Player(playerNo + "レッド",new HumanStrategy());
		 //case 1 -> new Player(playerNo + "ブルー",new HumanStrategy());
		 case 2 -> new ComputerStrategyRandom();
		 case 3 -> new ComputerStrategySerial();
		 default ->new HumanStrategy();
		};
		}
		return  new Player(name,strategy);
	}
	

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int BattleSelect = -1;
		
		while(true) {
			System.out.println("ここから好きな地方を選んでね");
			System.out.print("（カントー：0、ジョウト：1、ホウエン：2、シンオウ：3）");
			
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
				 case 3: PokemonBattleRule.changeRegion(PokemonSkinnable.SELECT_SINOU);
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
		}
		
		
		Player[] p = new Player[2];	// Player型配列の生成
		
		System.out.println("プレーヤを選択してください");
		for (int i = 0; i < p.length; i++) {
			System.out.println("プレーヤー" + (i + 1));
			p[i] = makePlayer("プレーヤー" + (i + 1),stdIn);
		}

		Register reg = new Register();	// Registerクラスのインスタンス生成

		do {
			
			p[0].nextPokemon();	// 人間のポケモンを生成
			p[1].nextPokemon();	// コンピュータのポケモンを生成
			
			p[0].showPokemon();	// 人間のポケモンを表示
			p[1].showPokemon();	// コンピュータのポケモンを表示
			
			int judge = PokemonBattleRule.judge(p[0].getPokemon(), p[1].getPokemon());	// 勝敗を判定
			PokemonBattleRule.showJudge(judge, p[0].getName());// 勝敗を表示
			
			reg.recordJudge(judge);	// 勝敗を記録
			
		} while (confirmRetry(stdIn));	// ゲーム継続判定

		reg.printMatch(); // 勝敗記録の表示
	}
	
	//繰返しの継続を判定するメソッド 
	static boolean confirmRetry(Scanner stdIn) {
		
		int retry = 1;
		do {
			System.out.print(" 続けますか？（1:はい、0:いいえ）");
			if(stdIn.hasNextInt()) {
				retry = stdIn.nextInt();
				stdIn.nextLine();
			}
			
		} while (retry != 1 && retry != 0);
		return (retry == 1);
	}
}
