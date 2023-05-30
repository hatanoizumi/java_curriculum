package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {

		//1.下記9個をローカル変数として宣言のみしてください

		//	バイト型
		byte by;

		//	短整数型
		short sh;

		//	整数型
		int in;

		//	長整数型
		long lo;

		//	単精度浮動小数点数型
		float fl;

		//倍精度浮動小数点数型
		double dou;

		//	文字型
		char ch;

		//	文字列型
		String st;

		//	ブーリアン型
		boolean bo;

		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		//	バイト型
		by = 0;

		//	短整数型
		sh = 0;

		//	整数型
		in = 0;

		//	長整数型
		lo = 0L;

		//	単精度浮動小数点数型
		fl = 0.0f;

		//倍精度浮動小数点数型
		dou = 0.0d;

		//	文字型
		ch = '\u0000';

		//	文字列型
		st = null;

		//	ブーリアン型
		bo = false;

		//3.初期化をしたそれぞれの変数に下記の値を代入してください

		//	・バイト型		10
		by = 10;

		//	・短整数型		100
		sh = 100;

		//	・整数型		1000
		in = 1000;

		//	・長整数型		10000
		lo = 10000L;

		//	・単精度浮動小数点数型		9.5
		fl = 9.5f;

		//	・倍精度浮動小数点数型		10.5
		dou = 10.5d;

		//	・文字型		a
		ch = 'a';

		//	・文字列型		ハロー
		st = "ハロー";

		//	・ブーリアン型		true
		bo = true;

		//	4.下記の通りにコンソール出力されるようにしてください
		//	上記で作成した変数を必ず使用すること

		//	11110		11110
		System.out.println(by + sh + in + lo);
		//	20		20
		System.out.println(fl + dou);

		//	a ハロー true		a ハロー true
		System.out.println(ch + "\u0020" + st + "\u0020" + bo);

		//	11130		11130	数字を全て足す
		System.out.println(by + sh + in + lo + fl + dou);

		//	10000000000		10000000000	小数点以外の数字を全てかける
		System.out.println(by * sh * in * lo);

		//	0.105		0.105	10.5割る100をする
		System.out.println(dou / sh);

		//	-90		-90	10引く100をする
		System.out.println(by - sh);

		//	5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//	「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。
		//	正しく動作するように修正してください。

		//String num = "20"   string(文字列）-> int(整数型)に変更
		int num = 20;
		int num1 = 23;
		// System.out.println("ハローJAVA" + (num + num1));  numの()を削除
		System.out.println("ハローJAVA" + num + num1);

		//	6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//	ローカル変数に代入し○○に入れてください

		//	『山田太郎 18歳 170.5cm 62.2kg 寿司』
		String name = "山田太郎";

		//　18歳
		int age = 18;

		//	身長新しく宣言する
		double height;
		height = 170.5;

		//	double型を新しく宣言する
		double weight;
		//	体重の値を代入
		weight = 62.2;

		//	string型を2回使うので新しく宣言する
		String favoriteFood;
		//	"寿司"の値を代入
		favoriteFood = "寿司";

		//	↓↓format↓↓
		//	「初めまして山田太郎です」
		System.out.println("初めまして" + name + "です\n");

		//	「年齢は18歳です」
		System.out.println("年齢は" + age + "歳です\n");

		//	「身長は170.5cmです」
		System.out.println("身長は" + height + "cmです\n");

		//	「体重は62.2kgです」
		System.out.println("体重は" + weight + "kgです\n");

		//	「好きな食べ物は寿司です」
		System.out.println("好きな食べ物は" + favoriteFood + "です\n");

		//	7.6で作成した自己紹介に続いてBMIが出力されるようにしてください
		//	ただし計算は数値を直書きせず、全て変数を使ってすること
		
		//	bmiを求める
		double bmi = weight / ((height/100) * (height/100));
		
		//	整数表示に変換（".0"の表示をなくす）
		//	小数点第1位を切り上げで表示
		double decimalPointNumber = Math.ceil(bmi * 10.0) / 10.0;
		
		//「BMIは21です」
		System.out.println("BMIは" + decimalPointNumber + "です\n");

		//	8.6で宣言した変数に再代入し下記の通りコンソールに出力してください
		//名前
		name = "鈴木一郎";
		//年齢
		age = 24;
		//身長
		height = 168.5;
		//体重
		weight = 64.2;
		//好きな食べ物
		favoriteFood = "オムライス";

		//	初めまして鈴木一郎です
		System.out.println("初めまして" + name + "です\n");

		//	年齢は24歳です
		System.out.println("年齢は" + age + "歳です\n");

		//	身長168.5cmです
		System.out.println("身長は" + height + "cmです\n");

		//	体重は64.2kgです
		System.out.println("体重は" + weight + "kgです\n");

		//	好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + favoriteFood + "です\n");

		//	BMIは22.6です
		double bmi2 = weight / ((height / 100) * (height / 100));

		//	小数点第2位を切り捨て
		double bmiData = Math.floor(bmi2 * 10) / 10;

		//	BMIを表示	
		System.out.println("BMIは" + bmiData + "です\n");

		//	9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
		//	下記の通りコンソールに出力してください

		//	iを2倍にして年齢を表示
		age *= 2;
		//	年齢は48歳です
		System.out.println("年齢は" + age + "歳です\n");

		//	heightを2倍にして身長を表示
		height *= 2;
		//	身長337.0cmです
		System.out.println("身長は" + height + "cmです\n");

		//	weightを2倍にして体重を表示
		weight *= 2;
		//	体重は128.4kgです
		System.out.println("体重は" + weight + "kgです\n");

		//	bmiDataを割る2してBMIを表示
		bmi2 /= 2;
		//	小数点第3位を四捨五入
		double bmiData2 = Math.round(bmi2 * 100.0) / 100.0;
		//	BMIは11.31です
		System.out.println("BMIは" + bmiData2 + "です\n");

		//	10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

		//	iが25より大きいか判定
		//	結果をAbove25(25より上)に反映
		boolean above25 = in >= 25;

		//	25歳以上ならtrueをコンソール出力
		System.out.println(above25);

		//	11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください

		//年齢
		age = 24;
		//身長
		height = 168.5;
		//体重
		weight =  64.2;

		//	文字列型に型変換
		//	年齢24歳
		String ageStr = String.valueOf(age);
		//	身長 168.5cm
		String heightStr = String.valueOf(height);
		//	体重 64.2kg
		String weightStr = String.valueOf(weight);

		//	空白で繋げた文字列を作成
		String result = ageStr + " " + heightStr + " " + weightStr;

		//	24 168.5 64.2 を出力
		System.out.println(result);

		//	12.11で変換した【年齢・身長】を整数型に変換して出力してください

		//	年齢を表示(string　->int)
		int ageStrChange = Integer.parseInt(ageStr);
		// 24 を出力
		System.out.println(ageStrChange);

		//	身長を表示(string -> double -> int) 
		// double型に変換
		double changeNum = Double.parseDouble(heightStr); 
		//int型に変換
		int heightStrChange = (int) changeNum;
		// 168 を出力
		System.out.println(heightStrChange);

		//	13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//	ただしif文は使わないでください

		//	年齢が25もしくは身長が160以上
		//	左右どちらかの式が当てはまればtrue
		boolean SelectProfile = in >= 25 || dou >= 160.0;

		//	年齢が25もしくは身長が160以上であればtrueを出力
		System.out.println(SelectProfile);

	}
}
