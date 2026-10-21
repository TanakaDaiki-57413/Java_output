package java_ploblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


public class For_problem {

	public static void main(String[] args)throws IOException{
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
//		problem14();
//		problem15();
//		problem16();
//		problem17();
//		problem18();
//		problem19();
//		problem20();
//		problem21();
//		problem22();
	}

	public static void problem1() {
//		“SPAM”という単語を 10 回表示するプログラムを作成しなさい。
		for(int i = 0 ; i < 10; i++ ) {
			System.out.println((i+1)+"回目の出力");
			System.out.println("SPAM");
		}
	}

	public static void problem2() {
//		九九、三の段（ 3 ～ 27 の 3 の倍数）を表示する
//		プログラムを作成しなさい。
		int num = 3;
		for(int i = 0; i < 9 ; i++) {
			System.out.println(num+"*"+(i+1)+"="+(num*(i+1)));
		}
	}

	public static void problem3() {
//		2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
		int num = 1;
		for(int i = 0; i < 8; i++) {
			num *=2;
			System.out.println("2の" + (i+1)  +"乗は" + num + "です");
		}
	}

	public static void problem4() {
//		7 の階乗を計算し、表示するプログラムを作成しなさい。
		int num = 7;
		for(int i = 6; i >= 1; i--) {
			num *= i;
		}

		System.out.println(num);
	}


	public static void problem5() {
//		整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
		Scanner sc = new java.util.Scanner(System.in);
		int num,i;
		int total = 0;

		for(i = 0; i<10 ; i++) {
			System.out.print("【"+(i+1)+"回目】の値を入力:");
			num = sc.nextInt();
			total += num;
		}
//		System.out.println("合計値は"+total+"です");
		System.out.println("平均値は"+(total/i)+"です");
		sc.close();
	}

	public static void problem6() {
//		整数、0 か 1 を 10 回入力する。
//		これを対戦成績と考え、0 を負け、1 を勝ちとして、
//		勝ちの総数、負けの総数を表示するプログラムを作成しなさい。

		Scanner sc = new java.util.Scanner(System.in);
		int num;
		int win_cnt = 0;
		int lose_cnt = 0;
		boolean is_flag = true;

		for(int i = 0; i < 10; i++) {
			while(is_flag) {
				System.out.println("【"+(i+1)+"】0か1のどちらかを入力");
				num = sc.nextInt();
				switch(num) {
					case 0:
						lose_cnt += 1;
						is_flag = false;
						break;
					case 1:
						win_cnt += 1;
						is_flag = false;
						break;
					default:
						is_flag = true;
						System.out.println("不正な値です。入力しなおしてください");
				}
			}

			is_flag = true;
		}

		System.out.println("負けの総数は"+ lose_cnt +"です");
		System.out.println("勝ちの総数は"+ win_cnt +"です");
		sc.close();
	}

	public static void problem7(){
//		次のプログラムを作成しなさい。
//		巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//		入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。

		int giant_point = 0;
		int tiger_point = 0;
		boolean is_flag = true;

		Scanner sc = new java.util.Scanner(System.in);

		for(int i=0; i < 9; i++) {
			System.out.print("【"+(i+1)+"回表】巨人の点数：");
			giant_point += sc.nextInt();

			System.out.print("【"+(i+1)+"回裏】阪神の点数：");
			tiger_point += sc.nextInt();

		}


		System.out.println("巨人:"+ giant_point +"点,阪神:"+tiger_point +"点");

		if(giant_point < tiger_point) {
			System.out.println("阪神の勝ち!");
		}else if(tiger_point < giant_point){
			System.out.println("巨人の勝ち!");
		}else {
			System.out.println("引き分け");
		}

		sc.close();
	}

	public static void problem8() throws IOException{
//		自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
		int x = 0;
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.print((i+1)+"回目の入力:");
				x = Integer.parseInt(br.readLine());
				if(max < x) {
					max = x;
				}
			}

			System.out.println("最大値は"+max+"です");

		}catch(NumberFormatException e) {
			System.out.println("【error】数値以外が入力された");
		}

		br.close();
	}

	public static void problem9(){
//		整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
		int max = 0;
		int min = 0;
		int x;

		Scanner sc = new java.util.Scanner(System.in);

		try {
			for(int i = 0; i< 10; i++) {
				System.out.print((i+1)+"回目の入力：");
				x = sc.nextInt();

				if(max < x) {
					max = x;
				}

				if(x < min) {
					min = x;
				}
			}

			System.out.println("最大値は"+max);
			System.out.println("最小値は"+min);

		}catch(InputMismatchException e) {
			System.out.println("【エラー】入力値が不正でした。");
		}

		sc.close();

	}

	public static void problem10() {
//		個数を示す数値を入力し、その個数分だけ‘*’を
//		表示するプログラムを作成しなさい。

		int num;
		Scanner sc = new java.util.Scanner(System.in);

		try {
			System.out.print("*は何個必要ですか？:");
			num = sc.nextInt();

			for(int i = 0 ; i < num; i++) {
				System.out.print("*");
			}

		}catch(InputMismatchException e) {
			System.out.println("【エラー】入力値が不正でした");
		}

		sc.close();
	}

	public static void problem11() {
//		個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
//		数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//		例:14
//		結果:01234567890123

		int num;
		Scanner sc = new java.util.Scanner(System.in);

		try {
			System.out.print("数値を入力してください：");
			num = sc.nextInt();

			for(int i = 0; i < num; i++) {
				System.out.print(i%10);
			}

		}catch(InputMismatchException e) {
			System.out.println("入力値が不正でした");
		}

		sc.close();
	}

	public static void problem12() {
//		数値を繰り返し入力し、
//		合計が 100 を超えたら入力を止めて合計を表示する
//		プログラムを作成しなさい。
		int total = 0;
		int num;
		Scanner sc = new java.util.Scanner(System.in);
		boolean is_flag = true;

		try {
			while(is_flag) {
				System.out.print("数値を入力してください：");
				num = sc.nextInt();
				total += num;

				if(100 <= total) {
					is_flag = false;
				}
			}

//			for(;total <= 100;) {
//				System.out.print("数値を入力してください：");
//				num = sc.nextInt();
//				total += num;
//			}

			System.out.println("合計値は"+total);

		}catch(InputMismatchException e){
			System.out.println("入力値が不正でした。");
		}

		sc.close();
	}

	public static void problem13() {
//		ストライク・カウントを数えるプログラムを作成しなさい。
//		１球ごとにストライクかボールかを入力する。
//		３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//		※ 	ストライクの場合は1、ボールの場合は2を入力する。

		int pitching;
		int strike_cnt = 0;
		int ball_cnt = 0;

		boolean is_flag = true;
		Scanner sc = new java.util.Scanner(System.in);
		try {
			for(;is_flag;) {
				System.out.println("ストライク:1, ボール:2");
				System.out.print("上記候補から数字で入力してください：");
				pitching = sc.nextInt();

				switch(pitching) {
					case 1:
						strike_cnt += 1;
						break;
					case 2:
						ball_cnt += 1;
						break;
					default:
						System.out.println("範囲外の数字です。");
						break;
				}

				if(strike_cnt == 3 || ball_cnt == 4){
					is_flag = false;
				}
			}

			System.out.println("ストライク数は"+strike_cnt+"です。");
			System.out.println("ボール数は"+ball_cnt+"です。");

		}catch(InputMismatchException e) {
			System.out.println("入力値が不正でした");
		}

		sc.close();
	}

	public static void problem14() {
//		前の問題に次の修正を加えなさい。
//		１球ごとにストライク、ボール、ファウルの何れかを入力する。
//		（残念ながらヒットにはなりません）
//		ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//		３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
		int pitching;
		int strike_cnt = 0;
		int ball_cnt = 0;

		boolean is_flag = true;
		Scanner sc = new java.util.Scanner(System.in);
		try {
			for(;is_flag;) {
				System.out.println("ストライク:1, ボール:2, ファール:3");
				System.out.print("上記候補から数字で入力してください：");
				pitching = sc.nextInt();

				switch(pitching) {
					case 1:
						strike_cnt += 1;
						break;
					case 2:
						ball_cnt += 1;
						break;
					case 3:
//						追加
						if(strike_cnt < 2) {
							strike_cnt += 1;
						}
						break;
					default:
						System.out.println("範囲外の数字です。");
						break;
				}

				if(strike_cnt == 3 || ball_cnt == 4){
					is_flag = false;
				}
			}

			System.out.println("ストライク数は"+strike_cnt+"です。");
			System.out.println("ボール数は"+ball_cnt+"です。");

		}catch(InputMismatchException e) {
			System.out.println("入力値が不正でした");
		}

		sc.close();
	}

	public static void problem15() throws IOException {
//		入力された数が素数かどうかを判定するプログラムを作成しなさい
//		※ 	判定する数は 4 以上としてよい。

		Scanner sc = new java.util.Scanner(System.in);
		boolean is_prime = true;
		try {
			System.out.print("4以上の数値を入力してください:");
			int num = sc.nextInt();

			if(num < 4) {
				System.out.println("4未満の数値が検出されました");
				System.out.println("処理を終了します");
				sc.close();
				return;
			}

			for(int i = 2; i < num ; i++) {
				if(num % i == 0) {
					is_prime = false;
					break;
				}
			}

			if(is_prime) {
				System.out.println(num+"は素数です。");
			}else{
				System.out.println(num+"は素数ではありません。");
			}

			sc.close();

		}catch(InputMismatchException e) {
			System.out.println("無効な値を検出しました");
		}
	}

	public static void problem16() throws IOException{
//		2 以上の数値を入力し、素因数分解した結果を表示しなさい。
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean is_prime = false;

		try {
			System.out.print("2以上の数値を入力してください");
			int x = Integer.parseInt(br.readLine());
			if (x < 2) {
				System.out.println("2未満の数値を検出");
				System.out.println("処理を終了します");
				br.close();
				return;
			}

			for(int i = 2; (!is_prime);) {
				if(x == i) {
					System.out.print(i);
					is_prime = true;
				}else if(x % i == 0) {
					x = x / i;
					System.out.print(i+" ");
				}else {
					i++;
				}
			}

		}catch(NumberFormatException e) {
			System.out.println("無効な値を検出しました");
		}
	}

	public static void problem17() {
//		九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//		※ 	System.out.printfを使用する。System.out.printf(" %2d", x );のように、
//		%2dと記述すると表示が2桁に揃う。

		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d\n",(i * j));
//				書式指定子 %d=整数、 \n=改行
			}
		}
	}

	public static void problem18() throws IOException {
//		数値を繰り返して入力し、0 が入力されたら入力を止め、
//		それまでの合計を表示するプログラムを作成しなさい
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		int total = 0;

		System.out.print("数値を入力してください:");
		num = Integer.parseInt(br.readLine());

		while(num != 0) {
			total += num;
			System.out.print("数値を入力してください:");
			num = Integer.parseInt(br.readLine());
		}

		System.out.printf("合計値は%dです。",(total));

	}

	public static void problem19() throws IOException{
//		数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//		※ 	最後に入力された 0 は平均に含めない。
//		※ 	少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）

		Scanner sc = new java.util.Scanner(System.in);
		int num;
		int total = 0;
		int i;

		boolean is_flag = true;

		try {
			for(i = 1; is_flag ;) {
				System.out.print("数値を入力してください：");
				num = sc.nextInt();
				total += num;

				if(num == 0) {
					i--;
					is_flag = false;
				}else {
					i++;
				}
			}

			System.out.printf("平均値は%.2fです",((double) total / i));

		}catch(InputMismatchException e) {
			System.out.println("不正な値です。");
		}
	}

	public static void problem20() {
//		サイズを示す数値を入力し、
//		何等かの文字で例のような三角形を表示するプログラムを作成しなさい。

//		サイズ 4 の例
//		$
//		$$
//		$$$
//		$$$$

		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("数値を入力してください");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("$");
			}

			System.out.println("");
		}
	}

	public static void problem21() {
//		サイズを示す数値を入力し、
//		そのサイズの×印を何等かの文字で表示する
//		プログラムを作成しなさい。

//		サイズ 3 の例
//		X X
//		 X
//		X X

//		サイズ 4 の例
//		X  X
//		 XX
//		 XX
//		X  X

//		サイズ 5 の例 0 4 1 3 2
//		X   X
//		 X X
//		  X
//		 X X
//		X   X

		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("数値を入力してください：");

		int size = sc.nextInt();
		int max = size -1;
		int min = 0;

		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(j == min) {
					System.out.print("X");

				}else if(j == max){
					System.out.print("X");

				}else {
					System.out.print(" ");
				}

				if(j == (size -1)) {
					System.out.println();
				}
			}
			max -=1;
			min +=1;
		}
	}

	public static void problem22() {
//		フィボナッチ数列を表示するプログラムを作成しなさい。
//		最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
//		※ 	フィボナッチ数列：
//		　それぞれの項がその直前の 2 つの項の和になっている数列のこと。
//		例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...

		int term1 = 0;
		int term2 = 1;
		int evacuate = term1 + term2;
		boolean is_first = true;

		while(evacuate <= 1000) {
			if(is_first) {
				is_first = false;
				System.out.print(term1+","+evacuate);
			}

			System.out.print(","+evacuate );

			term1 = term2;
			term2 = evacuate;
			evacuate = term1 + term2;
		}
//		結果：
//		0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987
	}

}
