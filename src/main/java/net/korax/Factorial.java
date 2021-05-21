package net.korax;

public class Factorial {
	public static long compute(long number) {
		if(number < 0)
			return 0;
		if(number <= 1)
			return 1;
		return number*compute(number-1);

	}
}
