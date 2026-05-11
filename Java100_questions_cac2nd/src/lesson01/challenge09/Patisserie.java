/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n明日の三色マカロンの配合が決まりました！");
		System.out.println("シトロンの味・・・" + (int) (250 * cicount / totalprice * 100) + "%");
		System.out.println("ショコラの味・・・" + (int) (280 * shocount / totalprice * 100) + "%");
		System.out.println("ピスターシュの味・・・" + (int) (320 * picount / totalprice * 100) + "%");
		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + totalprice / (int) totalcount + "です。");
	}
}
