/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("[ポエール・ネルメ]");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250");
		System.out.println("ショコラ		\\280");
		System.out.println("ピスターシュ	\\320");

		int ci = 30;
		int sho = 30;
		int pi = 30;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + ci + "個");
		System.out.println("ショコラ		\\280・・・残り" + sho + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + pi + "個");
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン	>");
		String cistr = reader.readLine();
		int cicount = Integer.parseInt(cistr);

		System.out.println("ショコラ	>");
		String shostr = reader.readLine();
		int shocount = Integer.parseInt(shostr);

		System.out.println("ピスターシュ	>");
		String pistr = reader.readLine();
		int picount = Integer.parseInt(pistr);

		System.out.println("シトロン		" + cicount + "個");
		System.out.println("ショコラ		" + shocount + "個");
		System.out.println("ピスターシュ	" + picount + "個");

		System.out.println("\n合計個数		" + (cicount + shocount + picount) + "個");
		System.out.println("合計金額		" + (250 * cicount + 280 * shocount + 320 * picount) + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		ci = ci - cicount;
		sho = sho - shocount;
		pi = pi - picount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + ci + "個");
		System.out.println("ショコラ		\\280・・・残り" + sho + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + pi + "個");

	}

}
