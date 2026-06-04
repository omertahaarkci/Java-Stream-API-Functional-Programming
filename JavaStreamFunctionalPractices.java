package stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaStreamFunctionalPractices {

	public static void main(String[] args) {
		System.out.println("multOf10");
		multOf10();
		System.out.println();
		
		int[] array = {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6 };
		System.out.println("sum abs value");
		System.out.println(sumAbsValue(array));
		System.out.println();
		
		System.out.println("count negatives");
		System.out.println(countNegatives(array));
		System.out.println();
		
		System.out.println("largest even");
		System.out.println(largestEven(array));
		System.out.println();
		
		System.out.println("toSortedForm");
		System.out.println(toSortedForm("abcadabccab"));
		System.out.println();
	}
	
	public static void multOf10() {
		int enBuyuk = IntStream.of(55, 20, 19, 31, 40, -2, 62, 30)
		                           .filter(n -> n % 10 ==0 )
		                           .max()
		                           .getAsInt();
		System.out.println(enBuyuk);
		
	}
	
	public static int sumAbsValue(int[] array) {
		int sonuc = Arrays.stream(array)
				          .map(n -> Math.abs(n))
				          .sum();
		return sonuc;
		
	}
	public static int countNegatives(int[] array) {
		
		int sonuc = Arrays.stream(array)
	                      .filter(n -> n<0).map(n -> 1)
	                      //.sum();
	                      .reduce(0, (n1, n2) -> n1 + n2);
		return sonuc;
	}
	
	public static int largestEven(int[] array) {
		return Arrays.stream(array)
			          .filter(n-> n % 2 == 0)
			          .max()
			          .getAsInt();
	}
	
	public static String toSortedForm(String str) {
		return str.chars()
				 .sorted()
				 .mapToObj(c -> String.valueOf((char) c))
				 .reduce("", (s1,s2) -> s1 + s2);
		
		
		
				
		
	}

}
