package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {

		
		
		
		//1.下記9個をローカル変数として宣言のみしてください

		//	バイト型
		byte b1;

		//	短整数型
		short s1;

		//	整数型
		int i;

		//	長整数型
		long l;

		//	単精度浮動小数点数型
		float f;

		//倍精度浮動小数点数型
		double d;

		//	文字型
		char c;

		//	文字列型
		String s2;

		//	ブーリアン型
		boolean b2;

		
		
		
		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		//	バイト型
		b1 = 0;

		//	短整数型
		s1 = 0;

		//	整数型
		i = 0;

		//	長整数型
		l = 0;

		//	単精度浮動小数点数型
		f = 0.0f;

		//倍精度浮動小数点数型
		d = 0.0;

		//	文字型
		c = '\u0000';

		//	文字列型
		s2 = null;

		//	ブーリアン型
		b2 = false;

		
		
		
		//3.初期化をしたそれぞれの変数に下記の値を代入してください

		//	・バイト型		10
		b1 = 10;

		//	・短整数型		100
		s1 = 100;

		//	・整数型		1000
		i = 1000;

		//	・長整数型		10000
		l = 10000;

		//	・単精度浮動小数点数型		9.5
		f = 9.5f;

		//	・倍精度浮動小数点数型		10.5
		d = 10.5;

		//	・文字型		a
		c = 'a';

		//	・文字列型		ハロー
		s2 = "ハロー";

		//	・ブーリアン型		true
		b2 = true;
		
		
		
		//	4.下記の通りにコンソール出力されるようにしてください
		//	上記で作成した変数を必ず使用すること

		//	11110		11110
		System.out.println(b1 + s1 + i + l);

		//	20		20
		System.out.println(f + d);

		//	a ハロー true		a ハロー true
		System.out.println(c + s2 + b2);

		//	11130		11130	数字を全て足す
		System.out.println(b1 + s1 + i + l + f + d);

		//	10000000000		10000000000	小数点以外の数字を全てかける
		System.out.println(b1 * s1 * i * l);

		//	0.105		0.105	10.5割る100をする
		System.out.println(d / s1);

		//	-90		-90	10引く100をする
		System.out.println(b1 - s1);

		
		
		
		//	5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//	「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。
		//	正しく動作するように修正してください。

		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + num + num1);

		
		
		
		//	6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//	ローカル変数に代入し○○に入れてください

		//	『山田太郎 18歳 170.5cm 62.2kg 寿司』
		s2 = "山田太郎";
		i = 18;
		//	身長新しく宣言する
		double height;
		height = 170.5;

		//	double型を新しく宣言する
		double weight;
		//	体重の値を代入
		weight = 62.2;

		//	string型を2回使うので新しく宣言する
		String s3;
		//	"寿司"の値を代入
		s3 = "寿司";

		
		//	↓↓format↓↓
		//	「初めまして○○です」
		System.out.println("初めまして" + s2 + "です");

		//	「年齢は○○歳です」
		System.out.println("年齢は" + i + "歳です");

		//	「身長は○○cmです」
		System.out.println("身長は" + height + "cmです");

		//	「体重は○○kgです」
		System.out.println("体重は" + weight + "kgです");

		//	「好きな食べ物は○○です」
		System.out.println("好きな食べ物は" + s3 + "です");

		
		
		
		//	7.6で作成した自己紹介に続いてBMIが出力されるようにしてください
		//	ただし計算は数値を直書きせず、全て変数を使ってすること
		double bmi = weight / ((height / 100) * (height / 100));
		
		//	「BMIは○○です」
		System.out.println("BMIは" + bmi + "です");

		
		
		
		//	8.6で宣言した変数に再代入し下記の通りコンソールに出力してください

		s2 = "鈴木一郎";
		i = 24;
		height = 168.5;
		weight = 64.2;
		s3 = "オムライス";

		//	初めまして鈴木一郎です
		System.out.println("初めまして" + s2 + "です");

		//	年齢は24歳です
		System.out.println("年齢は" + i + "歳です");

		//	身長168.5cmです
		System.out.println("身長は" + height + "cmです");

		//	体重は64.2kgです
		System.out.println("体重は" + weight + "kgです");

		//	好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + s3 + "です");
		
		//	BMIは22.6です
		double bmi2 = weight / ((height / 100) * (height / 100));
		
		//	小数点第2位を切り捨て
		double bmiData = Math.floor(bmi2 * 10) / 10;
		
		//	BMIを表示	
	    System.out.println("BMIは" + bmiData + "です");

		
		
		
		//	9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
		//	下記の通りコンソールに出力してください


		//	iを2倍にして年齢を表示
		i *= 2;
		//	年齢は48歳です
		System.out.println("年齢は" + i + "歳です");

		//	heightを2倍にして身長を表示
		height *= 2;
		//	身長337.0cmです
		System.out.println("身長は" + height + "cmです");

		//	weightを2倍にして体重を表示
		weight *= 2;
		//	体重は128.4kgです
		System.out.println("体重は" + weight + "kgです");

		//	bmiDataを割る2してBMIを表示
		bmi2 /= 2;
		//	小数点第3位を四捨五入
		double bmiData2 = Math.round(bmi2 * 100.0) / 100.0;
		//	BMIは11.31です
		 System.out.println("BMIは" + bmiData2 + "です");
		
		
		
		
		//	10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

		//	iが25より大きいか判定
		//	結果をAbove25(25より上)に反映
		boolean Above25 = i >= 25;

		//	25歳以上ならtrueをコンソール出力
		System.out.println(Above25);

		//	11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		//年齢
		i = 24;
		//身長
		d = 168.5;
		//体重
		f = 62.2f;
		
		//	文字列型に型変換
		//	年齢24歳
		String str1 = String.valueOf(i);
		//	身長 168.5cm
		String str2 = String.valueOf(d);
		//	体重 62.2kg
		String str3 = String.valueOf(f);

		//	空白で繋げた文字列を作成
		String result = str1 + " " + str2 + " " + str3;

		//	24 168.5 62.2 を出力
		System.out.println(result);

		//	12.11で変換した【年齢・身長】を整数型に変換して出力してください

		//	年齢を表示(string　->int)
		int number1 = Integer.parseInt(str1);
		// 24 を出力
		System.out.println(number1);

		//	身長を表示(string -> double -> int) 
		// double型に変換
		double changeNum = Double.parseDouble(str2);
		//int型に変換
		int number2 = (int) changeNum;
		// 168 を出力
		System.out.println(number2);
		
		
		
		//	13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//	ただしif文は使わないでください

		//	年齢が25もしくは身長が160以上
		//	左右どちらかの式が当てはまればtrue
		boolean SelectProfile = i >= 25 || d >= 160.0;

		//	年齢が25もしくは身長が160以上であればtrueを出力
		System.out.println(SelectProfile);

	}
}
