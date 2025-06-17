// 演習14-3設問2 じゃんけんの手インタフェース（演習14-3設問1と同じ）（本問で変更なし）
package janken;

public interface HandSkinnable {
	
	String[][] handStrs = {	// じゃんけんの手文字列配列（国別）
		{ "グー", "チョキ", "パー" },		// 日本
		{ "石", "はさみ", "布" },			// 中国
		{"rock", "scissors", "paper"}	// アメリカ
	};
	
	int HAND_JAPAN = 0;		// 日本
	int HAND_CHINA = 1;		// 中国
	int HAND_AMERICA = 2;	// アメリカ
}
