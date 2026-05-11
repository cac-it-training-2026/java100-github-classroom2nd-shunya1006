/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

interface ICelebrity {
	void learn();
}//ここにICelebrityインターフェースを記述

abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}//ここにSamuraiクラスを記述

class Retainer extends Samurai implements ICelebrity {

	protected String domain;

	public Retainer() {

	}

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	public boolean equals(Object object) {
		boolean Match;
		Retainer retainer = (Retainer) object;
		if (this.domain.equals(retainer.domain)) {
			Match = true;
		} else {
			Match = false;
		}
		return Match;
	}

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}
}//ここにRetainerクラスを記述

class Ronin extends Samurai implements ICelebrity {

	public Ronin() {

	}

	public Ronin(String name) {
		this.name = name;
	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	void work() {
		System.out.println("傘張るよ～。");
	}

	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}

	public void learn() {
		System.out.println("塾を開くよ～。");
	}
}//ここにRoninクラスを記述//ここにICelebrityインターフェースを記述

//ここにSamuraiクラスを記述

//ここにRetainerクラスを記述

//ここにRoninクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		Retainer retainer = new Retainer();
		retainer.learn();//ここに適切な処理を記述

		System.out.println("\n浪人1：");

		Ronin ronin = new Ronin();
		ronin.learn();//ここに適切な処理を記述

	}
}
