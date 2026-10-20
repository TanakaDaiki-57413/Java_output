package java_ploblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.io.*;

public class Inputsample {

	public static void main(String[] args) throws IOException {
//		Sample_method();
//		problem1();
//		problem2();
//		problem3();

	}

	public static void Sample_method()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		System.out.print("文字列の入力：");
		String  s = br.readLine();    // 1行分の文字列を入力する
		System.out.println(s.getClass().getSimpleName());
		int n = Integer.parseInt( s );    // 文字列から数値を得る
		Object is_int = n;
		System.out.println(is_int.getClass().getSimpleName());

	}

	public static void problem1() throws IOException{
//		String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
//		BufferedReaderの場合
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("【BufferedReader】sを入力してください:");
		s = br.readLine();
		System.out.println(s);

//		Scanner版
		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("【Scanner】s2を入力してください:");
		String s2 = sc.nextLine();
		System.out.println(s2);
	}

	public static void problem2() throws IOException{
//		int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("【BufferedReader】xの値を入力：");
		String s = br.readLine();
		try{
			int x = Integer.parseInt(s);
			System.out.println("【BufferedReader】xの値は"+x);
		}catch(NumberFormatException e) {
			System.out.println("【error】数値が入力されていない");
		}finally {
			br.close();
		}

		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("【Scanner】xの値を入力：");
		int scx = sc.nextInt();
		System.out.println("【Scanner】xの値は"+scx);
		sc.close();
	}

	public static void problem3() throws IOException {
//		int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した
//		結果を表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("【BufferedReader】sの値を入力してください");
//		String s = br.readLine();
//
//		try {
//			int x = Integer.parseInt(s);
//			System.out.println("【BufferedReader】xの一乗は"+(x*1));
//			System.out.println("【BufferedReader】xの二乗は"+(x*x));
//			System.out.println("【BufferedReader】xの三乗は"+(x*x*x));
//		}catch(NumberFormatException e) {
//			System.out.println("【BufferedReader】数値が正しく入力されていない");
//		}finally {
//			br.close();
//		}

		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("【Scanner】xの値を入力してください");
		int x2 = sc.nextInt();
		System.out.println("【Scanner】xの値の一乗は"+ x2);
		System.out.println("【Scanner】xの値の二乗は"+ (x2*x2));
		System.out.println("【Scanner】xの値の三乗は"+ (x2*x2*x2));
		sc.close();
	}

}
