package curriculum_New_question;

public class Curriculum_New_1_4 {
	public static void main(String[] args) {

		// Q1 下記9個をローカル変数として宣言のみしてください
		
		//・バイト型
		byte b1;
		
		//・短整数型
		short s1;
		
		//・整数型
		int i;
		//・長整数型
		long l;
		
		//・単精度浮動小数点数型
		float f;
		
		//・倍精度浮動小数点数型
		double d;
		
		//・文字型
		char c;
		
		//・文字列型
		String s2;
		
		//・ブーリアン型 
		boolean b2;


		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください

		//・バイト型
		b1 = 0;	
		
		//・短整数型
		s1 = 0;
		
		//・整数型
		i = 0;
		
		//・長整数型
		l = 0;
		
		//・単精度浮動小数点数型
		f = 0.0f;
		
		//・倍精度浮動小数点数型
		d = 0.0;
		
		//・文字型
		c = '\u0000';
		
		//・文字列型
		s2 = null;
		
		//・ブーリアン型 
		b2 = false;


		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		b1 = 10;
		
		// ・短整数型                 100
		s1 = 100;
		
		// ・整数型                	 1000
		i = 1000;
		
		// ・長整数型                 10000
		l = 10000;
		
		// ・単精度浮動小数点数型   	 9.5
		f = 9.5f;
		
		// ・倍精度浮動小数点数型		 10.5
		d = 10.5;
		
		// ・文字型                   a
		c = 'a'; 
		
		// ・文字列型              	 ハロー
		s2 = "ハロー"; 
		
		// ・ブーリアン型          	 true
		b2 = true;

		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		System.out.println(b1 + s1 + i + l);
		
		// 20.0
		System.out.println(f + d);

		// a ハロー true
		System.out.println(c + s2 + b2);
		
		// 11130.0                    数字を全て足す
		System.out.println(b1 + s1 + i + l + f + d );
		
		// 10000000000                小数点以外の数字を全てかける
		System.out.println(b1 * s1 * i * l);
		
		// 0.105                      10.5割る100をする
		System.out.println(d / s1);
		
		// -90                        10引く100をする
		System.out.println(b1 - s1);

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		//		 
	}
}
