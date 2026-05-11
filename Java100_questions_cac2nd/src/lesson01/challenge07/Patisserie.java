/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		double ci = 30;
		double sho = 30;
		double pi = 30;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + ci + "個");
		System.out.println("ショコラ		\\280・・・残り" + sho + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + pi + "個");
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン	>");
		String cistr = reader.readLine();
		double cicount = Double.parseDouble(cistr);

		System.out.println("ショコラ	>");
		String shostr = reader.readLine();
		double shocount = Double.parseDouble(shostr);

		System.out.println("ピスターシュ	>");
		String pistr = reader.readLine();
		double picount = Double.parseDouble(pistr);

		System.out.println("シトロン		" + cicount + "個");
		System.out.println("ショコラ		" + shocount + "個");
		System.out.println("ピスターシュ	" + picount + "個");

		double totalcount = cicount + shocount + picount;
		int totalprice = (int) (250 * cicount + 280 * shocount + 320 * picount);

		System.out.println("\n合計個数		" + totalcount + "個");
		System.out.println("合計金額		" + totalprice + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		ci = (int) ci - cicount;
		sho = (int) sho - shocount;
		pi = (int) pi - picount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + ci + "個");
		System.out.println("ショコラ		\\280・・・残り" + sho + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + pi + "個");

	}

}
