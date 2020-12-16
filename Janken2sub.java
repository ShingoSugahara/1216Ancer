// (2) じゃんけんをコンピュータ対人間で行う(別解)
package poly.kansai.janken;

import java.util.Random;
import java.util.Scanner;

public class Janken2sub {
	static final String[] HAND = { "グー", "チョキ", "パー" };
	static final String[][] RESULT = { { "引き分け", "勝利", "敗北" },
										{ "敗北", "引き分け", "勝利" },
										{ "勝利", "敗北", "引き分け" } };

	public static void main(String[] args) {

		// コンピュータの手をランダムに取得
		int comp = getHandAtRandom(); // コンピュータの手

		// ユーザーの手を、標準入力から入手
		System.out.println("じゃんけんの手を入力してください。");
		int user = getHandBySystemIn(); // ユーザーの手

		// 手の表示
		System.out.println("コンピュータ: " + HAND[comp]);
		System.out.println("ユーザー: " + HAND[user]);

		// 結果の表示
		dispResult(comp, user);

	}

	// ランダムな手（0～2）を返す。
	private static int getHandAtRandom() {
		Random r = new Random();
		int hand = r.nextInt(3);
		return hand;
	}

	// 標準入力で手（0～2）を取得し返す。
	private static int getHandBySystemIn() {
		Scanner stdin = new Scanner(System.in);
		int hand = -1;
		do {
			System.out.print("[0:グー, 1:チョキ, 2:パー]? ");
			if (stdin.hasNextInt()) {
				hand = stdin.nextInt();
			} else {
				stdin.next();
			}
		} while (hand < 0 || 2 < hand);
		stdin.close(); // クローズ処理（標準入力では省略可）

		return hand;
	}

	// コンピュータとユーザーの手（0～2）をそれぞれ引数で渡し、
	// 結果を表示する。
	private static void dispResult(int comp, int user) {
		System.out.println("<<<" + RESULT[user][comp] + ">>>");
	}
}
