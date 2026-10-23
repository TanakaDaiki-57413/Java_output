package java_ploblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_problem {

	public static void main(String[] args)throws IOException{
//		problem1();
//		problem2();
//		problem3();
//		problem4();
//		problem5();
//		problem6();
//		problem7();
//		problem8();
//		SampleBubbleSort();

	}

	public static void problem1() {
//		次のプログラムを作成しなさい。 業務ソフトを比較
//		10 個の数値を入力する。
//		入力された各々の数値を 2 倍にして表示する。

		int data[] = new int[10];
		Scanner sc = new java.util.Scanner(System.in);

		for(int i = 0; i < data.length; i++) {
			System.out.printf("[%d回目]数値を入力してください",(i+1));
			data[i] =  sc.nextInt();
		}

		sc.close();

		for(int j = 0; j < data.length; j++) {
			System.out.printf("data[%d]の2倍の値は%dです。\n",(j+1),(data[j]*2));
		}
	}

	public static void problem2() {
//		次のプログラムを作成しなさい。

//		10 個の数値を入力する。
//		入力された順番と逆の順番で 10 個の数値を表示する。

		int data[] = new int[10];
		Scanner sc = new java.util.Scanner(System.in);

		for(int i = 0; i < data.length; i++) {
			System.out.printf("[%d回目]数値を入力してください",(i+1));
			data[i] =  sc.nextInt();
		}

		sc.close();

		for(int j = data.length -1 ; 0 <= j; j-- ) {
			System.out.printf("data[%d]の値は%dです。\n",j,data[j]);
		}
	}

	public static void problem3() throws IOException{
//		次のプログラムを作成しなさい。
//		10 個の数値を入力する。
//		入力された数値を偶数と奇数に分類して表示する。

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList even_Array = new ArrayList<>();
		ArrayList odd_Array = new ArrayList<>();
		int data[] = new int[10];

		try {
//			配列に数値を10個格納
			for(int i = 0; i < data.length; i++) {
				System.out.printf("[%d回目]数値を入力してください",i+1);
				data[i] = Integer.parseInt(br.readLine());
			}

			br.close();

//			配列内にある数値を偶数・奇数リストに仕分け
			for(int j = 0; j < data.length; j++) {
				if(data[j] % 2 == 0) {
					even_Array.add(data[j]);
				}else {
					odd_Array.add(data[j]);
				}
			}

//			偶数の出力
			System.out.print("偶数：");
			for(int k = 0; k < even_Array.size(); k++) {
				System.out.print(even_Array.get(k));

				if((even_Array.size() -1) != k) {
					System.out.print(",");
				}
			}

			System.out.println();

//			奇数の出力
			System.out.print("奇数：");
			for(int m = 0 ; m < odd_Array.size(); m++) {
				System.out.print(odd_Array.get(m));

				if((odd_Array.size()-1) != m) {
					System.out.print(",");
				}
			}

		}catch(NumberFormatException e) {
			System.out.println("無効な値です。");
		}
	}

	public static void problem4() {
//		数値を繰り返して入力し、合計が 100 を超えた場合
//		または入力が 10 回行われた場合
//		入力を止め入力された数値をすべて表示するプログラムを作成しなさい。

		Scanner sc = new java.util.Scanner(System.in);
		ArrayList num_List = new ArrayList<>();
		int num;
		int total = 0;

		for(int i = 0 ; i < 10; i++) {
			System.out.printf("[%d回目]数値を入力してください",i+1);
			num = sc.nextInt();
			total += num;
			num_List.add(num);

			if(total >= 100) {
				System.out.println("合計値が100以上になりました。");
				break;
			}
		}

		sc.close();
		System.out.printf("結果を出力します。\n num_List：");

		for(int j = 0 ; j < num_List.size(); j++){
			System.out.print(num_List.get(j));

			if(j != (num_List.size()-1)) {
				System.out.print(",");
			}
		}
	}

	public static void problem5() throws IOException{
//		次のコードに追加し、入力された数値を
//		16 桁の２進数で表示するプログラムを完成させなさい。
//		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
//		int value = Integer.parseInt( br.readLine() );
//
//		int binary[] = new int[16];
//
//		//配列 binaryに0か1を代入する
//
//		for( int i = 0 ; i < 16 ; i++ )
//			System.out.print( binary[i] );

		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int value = Integer.parseInt( br.readLine() );

		int binary[] = new int[16];

		//配列 binaryに0か1を代入する

		for(int j = 15 ; j >= 0; j--) {
			if(value % 2 == 0){
				binary[j] = 0;
			}else {
				binary[j] = 1;
			}

//			解答例
//			binary[j] = value % 2;

			value = value /2 ;
		}

		for( int i = 0 ; i < 16 ; i++ )
			System.out.print( binary[i] );

		br.close();
	}

	public static void problem6() {
//		次のコードに追加し、九九表を表示するプログラムを完成させなさい。

//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int kuku[][] = new int[9][];

//		配列 kuku に値を代入する

//		for( int i = 0 ; i < 9 ; i++ )
//		{
//			for( int j = 0 ; j < 9 ; j++ )
//				System.out.printf( " %2d", kuku[i][j] );
//
//			System.out.println();
//		}

		BufferedReader br = new BufferedReader(
                			new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];

		//配列 kuku に値を代入する

		for( int i = 0 ; i < 9 ; i++ )
		{
			for( int j = 0 ; j < 9 ; j++ ) {
				kuku[i][j] = (i+1) * (j+1);
				System.out.printf( " %2d", kuku[i][j] );
			}

			System.out.println();
		}
	}

	public static void problem7()throws IOException {
//		1 桁の数値（ 1 ～ 9 に限定）を２つ入力し、
//		その積を表示するプログラムを作成しなさい。
//		ただし、九九の計算結果が入った配列を予め作成して利用すること。（前問を参考に）

		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];

		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				kuku[i][j] = (i+1) * (j+1);
			}
		}

		System.out.print("数値1を入力(1～9内):");
		int num1 = Integer.parseInt(br.readLine());
		if(num1 < 1 || 9 < num1) {
			System.out.println("範囲外の数値です");
			return;
		}

		System.out.print("数値2を入力(1～9内):");
		int num2 = Integer.parseInt(br.readLine());
		if(num2 < 1 || 9 < num2) {
			System.out.println("範囲外の数値です");
			return;
		}

		loop: //ラベルを定義
		for(int i = 0; i < kuku.length; i++) {
			for(int j = 0 ; j < kuku[i].length; j++) {
				if(kuku[i][j] == (num1 * num2)) {
					System.out.printf("%d * %d = %d",num1,num2,kuku[i][j]);
					break loop; //ラベルを定義したところから繰り返し処理を抜け出す。
				}
			}
		}

		br.close();
	}

	public static void problem8() {
//		整数を 10 回入力し、
//		小さい順に並べ替えて表示するプログラムを作成しなさい。
//		バブルソート版

		Scanner sc = new java.util.Scanner(System.in);
		int data[] = new int[10];
		boolean is_change = true;
		int tmp;

		for(int i = 0 ; i < data.length; i++) {
			System.out.printf("[%d回目]数値を入力してください", i+1);
			data[i] = sc.nextInt();
		}

		while(is_change) {
			is_change = false;
			for(int j = 1 ; j < data.length; j++) {
				if(data[j-1] > data[j]) {
					tmp = data[j-1];
					data[j-1] = data[j];
					data[j] = tmp;
					is_change = true;
				}
			}
		}


		for(int k = 0; k < data.length; k++) {
			System.out.print(data[k]);
			if(k != data.length -1) {
				System.out.print(",");
			}

		}

	}

	public static void SampleBubbleSort() {
//		イメージ：隣同士で比較して最大値 or 最小値から確定していく
		int data[] = new int[9];
		data[0] = 1;
		data[1] = 8;
		data[2] = 5;
		data[3] = 7;
		data[4] = 9;
		data[5] = 2;
		data[6] = 3;
		data[7] = 4;
		data[8] = 6;
		boolean is_change = true;
		int tmp;

		System.out.println(Arrays.toString(data));
		while(is_change) {
			is_change = false;
			for(int i = 1; i < data.length; i++) {
				if(data[i-1] < data[i]) {
					tmp = data[i];
					data[i]  = data[i-1];
					data[i-1] = tmp;
					is_change = true;
				}
			}
			System.out.println(Arrays.toString(data));
		}

		for(int j = 0; j < data.length; j++) {
			System.out.print(data[j]+",");
		}

	}
}
