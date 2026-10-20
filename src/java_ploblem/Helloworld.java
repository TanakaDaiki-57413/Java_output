package java_ploblem;

public class Helloworld {

	public static void main(String[] args) {
//		“Hello World”と表示するプログラムを作成しなさい。
//		Hellomethod();

//		int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。
//		problem1();

//		int 型の変数 x、y に数値 13、17 を代入し、x、y の値を“x=13,y=17”のように表示するプログラムを作成しなさい。
//		problem2();

//		int 型の変数 x に数値 13 と 17 の和を代入し、x の値を表示するプログラムを作成しなさい。
//		problem3();

//		数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。
//		problem4();

//		problem5();

//		problem6();

//		problem7();

//		problem8();

//		problem9();

//		problem10();

		problem11();


	}

	public static void Hellomethod() {
		System.out.print("Hello world");
		System.out.println("Hello world");
		System.out.printf("%s", "Hello world");
	}

	public static void problem1() {
		int x = 11;
		System.out.println("x="+ x);
	}

	public static void problem2() {
		int x,y;
		x = 13;
		y = 17;

		System.out.print("x="+ x +",");
		System.out.println("y="+ y);
	}

	public static void problem3() {
		int x = 13 + 17;
		System.out.print(x);
	}

	public static void problem4() {
		System.out.print(13*17);
	}

	public static void problem5() {
//		次のプログラムを作成しなさい。 業務ソフトを比較
//
//		int 型の変数 x に数値 7 を代入する。
		int x = 7;

//		変数 x の値を 3 倍にする。
		x = x * 3;
//		変数 x の値を表示する。
		System.out.println("現在のxの値は:"+x );
//		変数 x の値を半分（1/2）にする。
		x = x /2;
//		変数 x の値を表示する。
		System.out.println("xを1/2にした値は"+ x);
	}

	public static void problem6() {
//		int 型の変数 x、y に任意の数値を代入し、
//		xの値を y に、y の値を x に入れ替えて
//		x と y の値を表示するプログラムを作成しなさい

		int x,y;
		int eva;

		System.out.print("xの値を入力：");
		x = new java.util.Scanner(System.in).nextInt();

		System.out.print("yの値を入力：");
		y = new java.util.Scanner(System.in).nextInt();

		eva = x;
		x = y;
		y = eva;

		System.out.println("xの値は:"+ x);
		System.out.println("yの値は:"+ y);

	}

	public static void problem7() {
//		int 型の変数 x、y に数値 19、23 を代入し、
//		その積を変数 z に代入して
//		z の値を表示するプログラムを作成しなさい。

		int x,y,z;
		x = 19;
		y = 23;
		z = x * y;
		System.out.print(z);
	}

	public static void problem8() {
//		int 型の変数 x に任意の数値を代入し、
//		x を 2 倍、3 倍、4 倍した
//		結果を表示するプログラムを作成しなさい。

		int x;
		System.out.print("xを入力してください：");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.println("xの2倍は"+x*2);
		System.out.println("xの3倍は"+x*3);
		System.out.println("xの4倍は"+x*4);
	}

	public static void problem9() {
//		int 型の変数 x に任意の数値を代入し、
//		x を 1 乗、2 乗、3 乗した結果を表示する
//		プログラムを作成しなさい。

		int x;
		System.out.print("xの値を入力してください:");
		x = new java.util.Scanner(System.in).nextInt();

		System.out.println("xの一乗は："+ (x*1));

		System.out.println("xの二乗は："+ (x*x));

		System.out.println("xの三乗は："+ (x*x*x));
	}

	public static void problem10() {
//		int 型の変数 x に任意の数値を代入し、
//		x を x より小さい任意の数値で割った商と余りを表示する
//		プログラムを作成しなさい。

		int x,y;
		System.out.print("xの値を入力してください");
		x = new java.util.Scanner(System.in).nextInt();

		System.out.print("yの値を入力してください");
		y = new java.util.Scanner(System.in).nextInt();

		if(x > y){
			System.out.println(x+"/"+y+ "="+ (x/y));
			System.out.println("xをyで割った余りは"+(x%y)+"です");
		}else{
			System.out.println("error:yの値が大きいです。");
		}
	}

	public static void problem11() {
//		int 型の変数 x に任意の数値を代入し、
//		インクリメント演算子、デクリメント演算子を適用して
//		結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。

		int x;
		System.out.print("xの値を入力してください");
		x = new java.util.Scanner(System.in).nextInt();

		System.out.println("後置インクリメント演算子の結果は"+(x++));
		System.out.println("前置インクリメント演算子の結果は"+(++x));

		System.out.println("後置デクリメント演算子の結果は"+(x--));
		System.out.println("前置デクリメント演算子の結果は"+(--x));

//		• 前置インクリメント：++x（値を1増やした「後」に、その値を使う）
//		• 後置インクリメント：x++（現在の値を使った「後」に、値を1増やす）

//		• 前置デクリメント (--x): 1を引いた「後」の値を式の結果とします。
//		• 後置デクリメント (x--): 1を引く「前」の値を式の結果とします（減算はその後に行われます）

	}

}
