package org.sampletask;

public class ProgramClass {
	public static void evenNumber() {

		int count = 0;
		System.out.println("even numbers");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				count++;
				System.out.println(i);

			}
		}
		System.out.println("even no count:" + count);
	}

	public static void oddNumber() {
		int count = 0;
		System.out.println("even numbers");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				count++;
				System.out.println(i);

			}
		}
		System.out.println("even no count:" + count);
	}

	public static void findEvenOrOdd() {
		int a = 12;
		if (a % 2 == 0) {
			System.out.println(a + " is a even number");
		} else {
			System.out.println(a + " is a odd number");
		}
	}
	public static void sumEven() {
		int a = 10;
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of even numbers : " + sum);
	}
	public static void sumOdd() {
		int a = 10;
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of even numbers : " + sum);
	}

	public static void reverseNo() {
		int a = 125;
		int rev = 0;
		for (int i = a; i != 0; i /= 10) {
			int remain = i % 10;
			rev = (rev * 10) + remain;

		}
		System.out.println(rev);
	}

	public static void reversingByString() {
		int a = 325;
		String s = Integer.toString(a);
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			s1 = s1 + c;
		}
		System.out.println(s1);
	}

	public static void productDigit() {
		int a = 425;
		int rev = 1;
		for (int i = a; i != 0; i /= 10) {
			int remain = i % 10;
			rev = rev * remain;

		}
		System.out.println(rev);
	}
	public static void digitCount() {
		int a = 254;
		int digit = 0;
		for (int i = a; i != 0; i /= 10) {
			digit++;
		}
		System.out.println(digit);
	}
	public static void sumDigit() {
		int a = 549;
		int digit = 0;
		for (int i = a; i != 0; i /= 10) {
			int r = i % 10;
			digit = digit + r;
		}
		System.out.println(digit);
	}

		public static void amstrongNo() {
		int a = 1634;
		int num = a;
		int b = a;
		int r = 0;

		int count = 0;
		for (int i = a; i != 0; i /= 10) {

			count++;

		}

		for (int i = a; i != 0; i /= 10) {
			int d = i % 10;
			int c = 1;
			for (int j = 0; j < count; j++) {
				c = c * d;
			}
			r = r + c;
		}
		if (num == r) {
			System.out.println(a + " is amstrong no");
		}else {
		System.out.println(a + " is not amstrong no");
		}
	}
		public static void reverseString() {
		String s = "java";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		System.out.println(rev);
	}

	public static void palindromeNo() {
		int a = 143;
		int num = a;
		int palNo = 0;
		for (int i = a; i != 0; i /= 10) {
			int c = i % 10;
			palNo = (palNo*10) + c;

		}
		System.out.println(palNo);
	}

	public static void reverseWord() {
		String s = "welcome to java class";
		String s1 = "";
		String[] split = s.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			s1 = s1 + " " + split[i];
		}
		System.out.println(s1);
	}

	public static void reverseLetter() {
		String s = "welcome to java class";
		String s1 = "";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String rev = "";
			for (int j = split[i].length() - 1; j >= 0; j--) {
				char c = split[i].charAt(j);
				rev = rev + c;
			}
			s1 = s1 + rev + " ";
		}
		System.out.println(s1);
	}

	public static void firstLetterCaps() {
		String s1 = "welcome to java class";
		String caps = "";
		String[] split = s1.split(" ");
		for (int i = 0; i < split.length; i++) {
			char c = split[i].charAt(0);
			char u = Character.toUpperCase(c);
			caps = caps + u + split[i].substring(1) + " ";
		}
		System.out.println(caps);
	}

	public static void patternK() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (((i == 0 || i == 4) && j == 3) || ((i == 1 || i == 3) && j == 2)
						|| (i == 2 && (j == 2 || j == 1))) {
					System.out.print("*");
				} else if (j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void swapingWithVariable() {
		int a = 12;
		int b = 30;
		System.out.println("before swaping");
		System.out.println(a + "\n" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swaping");
		System.out.println(a + "\n" + b);

	}

	public static void swaping() {
		int a = 46;
		int b = 52;
		System.out.println("before swaping");
		System.out.println(a + "\n" + b);

		a = b + a;
		b = a - b;
		a = a - b;
		System.out.println("after swaping");
		System.out.println(a + "\n" + b);

	}

	public static void StringSwaping() {
		String a = "java";
		String b = "class";
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

	public static void arrayAccending() {
		int[] a = { 9, 5, 7, 3, 6, 1, 0 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void fibbonasSeries() {
		int a = 0;
		int b = 1;

		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i < 6; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

	public static void main(String[] args) {
		evenNumber();
		oddNumber();
		findEvenOrOdd();
		sumEven();
		sumOdd();
		 reverseNo();
		reversingByString();
		productDigit();
		 digitCount();
		 sumDigit();
		amstrongNo();
		reverseString();
		palindromeNo();
		reverseWord();
		reverseLetter();
		firstLetterCaps();
		patternK();
		swapingWithVariable();
		swaping();
		StringSwaping();
		arrayAccending();
		fibbonasSeries();
		

	}

}
