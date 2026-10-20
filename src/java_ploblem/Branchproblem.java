package java_ploblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Branchproblem {

	public static void main(String[] args) throws IOException{
//		problem1();
//		problem2();
//		problem3();
//		problem4();
//		problem5();
//		problem6();
//		problem7();
//		problem8();
//		problem9();
//		problem10();
//		problem11();
//		problem12();
//		problem13();

	}

	public static void problem1() throws IOException {
//		int 型の変数 x、y にそれぞれ数値を入力し、
//		x が y より大きい場合に、“xはyより大きい。”
//		という文を表示するプログラムを作成しなさい。

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("xの値:");
			int x = Integer.parseInt(br.readLine());

			System.out.print("yの値:");
			int y = Integer.parseInt(br.readLine());

			if(x > y) {
				System.out.println("xはyより大きい");
			}else if(x < y){
				System.out.println("yはxより大きい");
			}

		}catch(NumberFormatException e) {
			System.out.println("xまたはyの数値が正しく入力されませんでした。");
		}

		br.close();
	}

	public static void problem2() throws IOException{
//		２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("num1を入力：");
			int num1 = Integer.parseInt(br.readLine());
			System.out.print("num2を入力:");
			int num2 = Integer.parseInt(br.readLine());

			if(num1 > num2) {
				System.out.println("num1:"+ num1);
			}else if(num1 < num2) {
				System.out.println("num2:"+ num2);
			}

		}catch(NumberFormatException e) {
			System.out.println("正しく入力されませんでした。");
		}

		br.close();
		System.out.println("brをcloseします");
	}

	public static void problem3() throws IOException{
//		int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、
//		x が y より小さい場合には“xはyより小さい”
//		と表示するプログラムを作成しなさい。

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("xを入力してください:");
			int x = Integer.parseInt(br.readLine());

			System.out.print("yを入力してください");
			int y = Integer.parseInt(br.readLine());

			if(x > y) {
				System.out.println("xはyより大きい");
			}else if(x < y) {
				System.out.println("xはyより小さい");
			}

		}catch(NumberFormatException e) {
			System.out.println("【error】正しく入力されませんでした。");
		}

		br.close();
		System.out.println("brをcloseします");
	}

	public static void problem4() throws IOException{
//		int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”
//		x が y より小さい場合には“xはyより小さい”	、x と y が等しい場合には“xとyは等しい”
//		と表示するプログラムを作成しなさい。

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("xを入力:");
			int x = Integer.parseInt(br.readLine());
			System.out.print("yを入力");
			int y = Integer.parseInt(br.readLine());

			if(x > y) {
				System.out.println("xはyより大きい");
			}else if(x < y) {
				System.out.println("xはyより小さい");
			}else if(x == y) {
				System.out.println("xとyは等しい");
			}
			System.out.println("正常終了");

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした");
		}

		br.close();
	}

	public static void problem5() throws IOException{
//		正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("整数値を入力：");
			int x = Integer.parseInt(br.readLine());

			if(x%2 == 0) {
				System.out.println("偶数");
			}else if(x%2 == 1) {
				System.out.println("奇数");
			}

			System.out.println("正常終了");

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした");
		}

		br.close();
	}

	public static void problem6() throws IOException{
//		整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
//		“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("整数値を入力：");
			int num = Integer.parseInt(br.readLine());
			boolean is_positive = true;
			boolean is_evennum = true;

			if(num < 0) {
				is_positive = false;
			}

			if(num % 2 == 1 || num % 2 == -1) {
				is_evennum = false;
			}

			if(is_positive && is_evennum) {
				System.out.println("正の偶数");

			}else if(!is_positive && is_evennum) {
				System.out.println("負の偶数");

			}else if(is_positive && !is_evennum) {
				System.out.println("正の奇数");

			}else if(!is_positive && !is_evennum) {
				System.out.println("負の奇数");
			}

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした");
		}

		br.close();
	}

	public static void problem7() throws IOException {
//		試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
//		試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
//		ケース1
//		    60 点以上：“合格”
//		    60 点未満：“不合格”
//		ケース2
//		    80 点以上：“たいへんよくできました。”
//		    60 点以上、80 点未満：“よくできました。”
//		    60 点未満：“ざんねんでした。”
//		ケース3
//		    80 点以上：“優”
//		    70 点以上、80 点未満：“良”
//		    60 点以上、70 点未満：“可”
//		    60 点未満：“不可”

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean is_within_range = true;

		try {
			System.out.println("点数を入力してください");
			int point = Integer.parseInt(br.readLine());
			if(100 < point || point < 0) {
				is_within_range = false;
			}

			if(!is_within_range) {
				System.out.println("範囲外の点数です。処理を終了します。");
				return;
			}

//			ケース1
			if(60 <= point) {
				System.out.println("ケース1:合格");
			}else if(point < 60) {
				System.out.println("ケース1:不合格");
			}

//			ケース2
			if(80 <= point) {
				System.out.println("ケース2:大変よくできました。");
			}else if(60 <= point && point < 80) {
				System.out.println("ケース2:よくできました。");
			}else if(point < 60) {
				System.out.println("ケース2:残念でした。");
			}

//			ケース3
			if(80 <= point) {
				System.out.println("ケース3:優");
			}else if(70 <= point && point < 80) {
				System.out.println("ケース3:良");
			}else if(60 <= point && point < 70) {
				System.out.println("ケース3:可");
			}else if(point < 60) {
				System.out.println("ケース3:不可");
			}

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした。");
		}

		br.close();
	}

	public static void problem8() throws IOException{
//		中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し
//		次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
//		両方とも 60 点以上の場合、合格
//		合計が 130 点以上の場合、合格
//		合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
//		上記以外は不合格

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean is_within_range = true;

		try {
			System.out.print("中間試験の点数を入力してください");
			int middle_point = Integer.parseInt(br.readLine());
			System.out.print("期末試験の点数を入力してください");
			int end_point = Integer.parseInt(br.readLine());

			if(middle_point < 0 || end_point < 0) {
				is_within_range = false;
			}else if(100 < middle_point || 100 < end_point) {
				is_within_range = false;
			}

			if(!is_within_range) {
				System.out.println("点数が範囲外の為、終了します。");
				return;
			}

			if(60 <= middle_point && 60 <= end_point) {
				System.out.println("合格");

			}else if(130 <= middle_point + end_point ) {
				System.out.println("合格");

			}else if(100 <= middle_point + end_point && 90 <= middle_point || 90 <= end_point){
				System.out.println("合格");

			}else {
				System.out.println("不合格");
			}

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした");
		}

		br.close();
	}

	public static void problem9() throws IOException{
//		曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。

//		開いているか、休診であるかは、次の表に従います。
//		 	    日曜	月曜	火曜	水曜	木曜	金曜	土曜
//		午前	休診	○	    休診	 ○	     ○	    休診	○
//		午後	休診	○	     ○	     ○	     ○	     ○	   休診
//		夜間	休診	○	     ○	    休診	 ○	     ○	   休診

//		※ 	曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
//		>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
//		>0=午前、1=午後、2=夜間

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("曜日を数字で入力してください:");
			int day = Integer.parseInt(br.readLine());
			System.out.print("時間帯を数字で入力してください：");
			int time = Integer.parseInt(br.readLine());

			if(day < 0 || 6 < day || time < 0 || 2 < time) {
				System.out.println("無効な数値です。処理を終了します。");
				return;
			}

			System.out.println("曜日："+ day_conversion(day));
			System.out.println("時間帯:"+ time_conversion(time));

			if(day == 1 || day == 4) {
				System.out.println("開診");

			}else if(day == 2 || day == 5 && time != 0) {
				System.out.println("開診");

			}else if(day == 3 && time != 2) {
				System.out.println("開診");

			}else if(day == 6 && time == 0) {
				System.out.println("開診");

			}else {
				System.out.println("閉診");
			}

		}catch(NumberFormatException e) {
			System.out.println("入力された値が正しく入力されませんでした");

		}

		br.close();
	}

	public static String day_conversion(int day) {
		String day_name = "不明";
		switch(day) {
			case 0:
				day_name = "日曜日";
			case 1:
				day_name = "月曜日";
			case 2:
				day_name = "火曜日";
			case 3:
				day_name = "水曜日";
			case 4:
				day_name = "木曜日";
			case 5:
				day_name = "金曜日";
			case 6:
				day_name = "土曜日";
		}
		return day_name;
	}

	public static String time_conversion(int time) {
		String time_name = "不明";
		switch(time) {
			case 0:
				time_name = "午前";
			case 1:
				time_name = "午後";
			case 2:
				time_name = "夜間";
		}
		return time_name;

	}

	public static void problem10()throws IOException{
//		整数値 x, y を入力し、以下の条件に該当する場合、
//		そうであることを示す文を表示しなさい。

//		x は y より小さく、かつ、x と y は共に偶数である。
//		x と y は等しく、かつ、負の数である。
//		x は y より小さい、または、x は偶数である。
//		x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
//		x も y も負の数である、ではない。（ x も y も負の数である、の否定）

//		if( ～ 条件 ～ )
//		    System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
//
//		if( ～ 条件 ～ )
//		    System.out.println( "xとyは等しく、かつ、負の数である。" );
//
//		if( ～ 条件 ～ )
//		    System.out.println( "xはyより小さい、または、xは偶数である。" );
//
//		if( ～ 条件 ～ )
//		    System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
//
//		if( ～ 条件 ～ )
//		    System.out.println( "xもyも負の数である、ではない。" );

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("xの値を入力してください:");
			int x = Integer.parseInt(br.readLine());

			System.out.print("yの値を入力してください:");
			int y = Integer.parseInt(br.readLine());

			if(x < y && (x%2) == 0 && (y%2) == 0)
				System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );


			if( x == y && x < 0 && y < 0 )
				System.out.println( "xとyは等しく、かつ、負の数である。" );


			if( x < y || (x%2) == 0)
				System.out.println( "xはyより小さい、または、xは偶数である。" );


			if((x <= 10 || 100 <= x) && (10 <= y && y <= 100) )
				System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );


			if( ! ( x < 0 && y < 0 ) )
			    System.out.println( "xもyも負の数である、ではない。" );

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした。処理を終了します");
			return;
		}

		br.close();
	}

	public static void problem11() throws IOException{
//		月を表す数値を入力し、その月の初めから年末までにある祝日を
//		表示するプログラムを作成しなさい。

//		表示する祝日は以下の日とします。
//		１月：元日、成人の日
//		２月：建国記念の日
//		３月：春分の日
//		４月：昭和の日
//		５月：憲法記念日、みどりの日、こどもの日
//		７月：海の日
//		９月：敬老の日、秋分の日
//		１０月：体育の日
//		１１月：文化の日、勤労感謝の日
//		１２月：天皇誕生日
//		※ 	switch 文を使用すること。


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("何月ですか?:");
			int month_num = Integer.parseInt(br.readLine());

			if(month_num < 1 || 12 < month_num) {
				System.out.println("無効な数値です。処理を終了します");
				return;
			}

			switch(month_num) {
				case 1:
					System.out.println("1月:元日、成人の日");
				case 2:
					System.out.println("2月：建国記念の日");
				case 3:
					System.out.println("3月：春分の日");
				case 4:
					System.out.println("4月：昭和の日");
				case 5:
					System.out.println("5月：憲法記念日、みどりの日、こどもの日");
				case 6:
					System.out.println("6月：祝日なし");
				case 7:
					System.out.println("7月：海の日");
				case 8:
					System.out.println("8月：祝日なし");
				case 9:
					System.out.println("9月：敬老の日、秋分の日");
				case 10:
					System.out.println("10月：体育の日");
				case 11:
					System.out.println("11月：文化の日、勤労感謝の日");
				case 12:
					System.out.println("12月：天皇誕生日");
					break;
			}

		}catch(NumberFormatException e) {
			System.out.println("入力値が正しく入力されませんでした。処理を終了します");
		}

		br.close();

	}

	public static void problem12() throws IOException{
//		好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
//
//		※ 	switch 文を使用する。
//		※ 	選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
//		※ 	題材は鮨でなくても良い。

		Scanner sc = new java.util.Scanner(System.in);

		try {
			System.out.println("1:マグロ 2:エビ 3:こはだ 4:たこ 5:いか");
			System.out.print("上記候補から選び数値を入力してください：");
			int sushi_id = sc.nextInt();

			if(sushi_id < 1 || 5 < sushi_id) {
				System.out.println("数値が範囲外でした。処理を終了します");
				return;
			}

			switch(sushi_id) {
				case 1:
					System.out.println("マグロを選んだあなたは中吉");
					break;
				case 2:
					System.out.println("エビを選んだあなたは吉");
					break;
				case 3:
					System.out.println("こはだを選んだあなたは小吉");
					break;
				case 4:
					System.out.println("たこを選んだあなたは凶");
					break;
				case 5:
					System.out.println("いかを選んだあなたは大吉");
					break;
			}

		}catch(InputMismatchException e) {
			System.out.println("無効な数値を検出しました。処理を終了します。");
		}

		sc.close();
	}

	public static void problem13() throws IOException{
//		月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。
//		2 月は 28 日とします。
//		また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。

		Scanner sc = new java.util.Scanner(System.in);

		try {
			System.out.print("何月ですか？:");
			int month_num = sc.nextInt();

			switch(month_num) {
				case 2:
					System.out.println( "28日です" );
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println( "30日です" );
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println( "31日です" );
					break;
				default:
					System.out.println( "入力が間違っています" );
					break;
			}

		}catch(InputMismatchException e) {
			System.out.println("無効な数値を検出しました。処理を終了します。");
		}

		sc.close();
	}
}
