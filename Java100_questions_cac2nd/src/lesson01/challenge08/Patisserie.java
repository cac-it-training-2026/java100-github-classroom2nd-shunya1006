/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println("シトロン		\\250・・・残り" + (int) ci + "個");
		System.out.println("ショコラ		\\280・・・残り" + (int) sho + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + (int) pi + "個");

		System.out.println("閉店時間となりました。");
		System.out.println("\nまたのお越しをお待ちしております。");
		System.out.println("\n売り上げの割合");
		System.out.println("合計金額\\" + totalprice);

		System.out.println("\n内訳");
		System.out.println(
				"シトロン		\\" + (int) (250 * cicount) + "・・・" + (int) (250 * cicount / totalprice * 100) + "%");
		System.out.println(
				"ショコラ		\\" + (int) (280 * shocount) + "・・・" + (int) (280 * shocount / totalprice * 100) + "%");
		System.out.println(
				"ピスターシュ	\\" + (int) (320 * picount) + "・・・" + (int) (320 * picount / totalprice * 100) + "%");
	}
}
