// (1) じゃんけん1回表示
package poly.kansai.janken;

import java.util.Random;

public class Janken1 {

	public static void main(String[] args) {

		// 0,1,2の乱数を取得
		int comp = getHandAtRandom(); // コンピュータの手

		//乱数から手を取得
		String compHand = getHandStr(comp);

		//表示
		System.out.println(compHand);

	}

	// ランダムな手（0～2）を返す自作メソッド
	private static int getHandAtRandom() {
		Random r = new Random();
		int hand = r.nextInt(3);
		return hand;
	}

	//乱数から手を取得する自作メソッド
	private static String getHandStr(int handNum) {
		String handStr = "";

		switch (handNum) {
		case 0:
			handStr = "グー";
			break;
		case 1:
			handStr = "チョキ";
			break;
		case 2:
			handStr = "パー";
			break;
		default:
			// NOT REACHED
		}

		return handStr;
	}

}
