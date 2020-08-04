package autotest;

import com.codeborne.selenide.Selenide;

import cucumber.api.java.ja.ならば;
import cucumber.api.java.ja.前提;

public class Stepdefs {
	@前提("Googleのページを開く")
	public void Googleのページを開く() {
		Selenide.open("https://www.google.com/");
	}
	@ならば("猫で検索する")
	public void 猫で検索する() {
//		Selenide.$("input[name=q]").setValue("猫").pressEnter();
		//わざと失敗させるために存在しないセレクターを指定
		Selenide.$("no-exists.input[name=q]").setValue("猫").pressEnter();
	}
//	@前提("ここは地球である")
//	public void ここは地球である() {
//		System.out.println("ここは水の星、地球である");
//	}
//	@もし("今日も日が昇る")
//	public void 今日も日が昇る() {
//		System.out.println("今日もいつものように日が昇る");
//	}
//	@ならば("明日も日が昇る")
//	public void 明日も日が昇る() {
//		System.out.println("臨まずとも、明日も日が昇るだろう");
//	}
}
