package java_ploblem;
import java.util.Scanner;

public class Method_problem {

	public static void main(String[] args) {
//		problem1_main();
//		problem2_main();
//		problem3_main();
//		problem4_main();
//		problem5_main();
//		problem6_main();
//		problem7_main();
//		problem8_main();

	}

	public static void problem1_main() {
//		整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り
//		結果を int 型の戻り値として返すこと。
//		また、メソッドの動作を検証できるようにプログラムを作成しなさい
		int result = problem1_method(4);
		System.out.println(result);

	}

	static int problem1_method(int x) {
		return x * x ;
	}

	public static void problem2_main() {
//		２つの整数の平均を計算するメソッドを作成しなさい。
//		２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
//		また、メソッドの動作を検証できるようにプログラムを作成しなさい。
//		※ 	平均の計算は整数で行い、小数点以下は切り捨ててよい。

		int x = 10;
		int y = 20;
		int result = problem2_method(x,y);

		System.out.printf("x:%d,y:%d\n平均値：%d",x,y,result);

	}

	static int problem2_method(int x, int y) {
		return (x + y) /2;
	}

	public static void problem3_main() {
//		２つの整数の大きい方を選ぶメソッドを作成しなさい。
//		２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
//		また、このメソッドを使用して
//		int 型の変数 x、y、z にそれぞれ数値を入力し
//		最も大きい数値を表示するプログラムを作成しなさい。

		System.out.println(problem3_method(6,4));

		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("x:");
		int x = sc.nextInt();

		System.out.print("y:");
		int y = sc.nextInt();

		System.out.print("z:");
		int z = sc.nextInt();

		System.out.printf("最大値は%d",problem3_method(z,problem3_method(x,y)) );

	}

	static int problem3_method(int num1,int num2) {
		int largest = 0;

		if(num1 > num2) {
			largest = num1;
		}else{
			largest = num2;
		}

		return largest;
	}

	public static void problem4_main() {
//		サイズを示す数値（int）を引数とし、
//		何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
//		また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成しなさい。
//		例：
//		$
//		$$
//		$$$
//
//		$
//		$$
//		$$$
//		$$$$
//
//		$
//		$$
//		$$$
//		$$$$
//		$$$$$

		problem4_method(3);
		System.out.println();
		problem4_method(4);
		System.out.println();
		problem4_method(5);
	}

	static void problem4_method(int num) {
		for(int i = 0; i < num ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("$");
			}

			System.out.println();
		}
	}

	public static void problem5_main() {
//		サイズを示す数値と、表示する文字を引数とし
//		三角形を表示するメソッドを作成しなさい。
//		このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
//		※ 	サイズを示す引数は int 型、表示する文字の引数は char 型にする。

		problem5_method(6,'A');
		problem5_method(3,'B');
		problem5_method(5,'C');
	}

	static void problem5_method(int num, char ch) {
//		再帰型 処理はproblem4_methodと変わらない
		if(num > 1) {
			problem5_method((num-1),ch);
		}

		for(int i = 0 ; i < num ; i++) {
			System.out.print(ch);
		}

		System.out.println();
	}

	public static void problem6_main() {
//		九九のひとつの段を表示するメソッドを作成しなさい。
//		何の段（ 1 ～ 9 ）であるかを引数とします。
//		このメソッドを使用して、九九表を作成しなさい。
		problem6_method(1);
		problem6_method(2);
		problem6_method(3);
		problem6_method(4);
		problem6_method(5);
		problem6_method(6);
		problem6_method(7);
		problem6_method(8);
		problem6_method(9);
	}

	static void problem6_method(int kuku) {
		for(int i = 1 ; i < 10; i++) {
			System.out.printf("%3d",kuku * i);
		}
		System.out.println();
	}

	public static void problem7_main() {
//		ある数が素数かどうかを判定するメソッドを作成しなさい。
//		このメソッドを使用して
//		10000 以上 10100 未満の素数を
//		すべて表示するプログラムを作成しなさい。

		for(int num = 10000; num < 10100; num++) {
			problem7_method(num);
		}
	}

	static void problem7_method(int num) {
		boolean is_prime = true;

		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				is_prime = false;
				break;
			}
		}

		if(is_prime) {
			System.out.printf("%6d",num);
		}
	}

	public static void problem8_main() {
//		メソッドを再帰的に呼び出すことによって、
//		フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
//		最初の２つの項、0 番目を 0、1 番目を 1 とします。
//		このメソッドを使用して、11 番目から 20 番目までの項を表示するプログラムを作成しなさい。
//		※ 	フィボナッチ数列：
//		　それぞれの項がその直前の２つの項の和になっている数列のこと。
//		例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
		for( int n = 11 ; n <= 20 ; n++ )
	        System.out.print( problem8_method( n ) + " " );
	}

	static int problem8_method(int n) {
		if( n == 0 )
	        return 0;
	    else if( n == 1 )
	        return 1;
	    else
	    	return problem8_method( n - 2 ) + problem8_method( n - 1 );
	}
}
