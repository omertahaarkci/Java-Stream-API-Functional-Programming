package stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamStringManipulations {

	public static void main(String[] args) {
			System.out.println("reverseString");
			System.out.println(reverseString("merhaba"));
			System.out.println();
			
			System.out.println("remove spaces");
			System.out.println(removeSpaces("J a v a S t r e a m"));
			System.out.println();
			
			String[] kelimeler = {"elma", "armut", "karpuz", "kavun"};
			System.out.println("longest word");
			System.out.println(longestWord(kelimeler));
			System.out.println();
			
			int sum = IntStream.rangeClosed(1,50).sum();
			System.out.println(sum);
			
			IntStream.range(0, 100)
			          .filter(n-> n % 10==0)
			          //.forEach(System.out::println);
			          .forEach(n -> System.out.println(n+" , "));
			System.out.println();
			
			IntStream.iterate(3, n-> n+6)
			         .limit(10)
			         .forEach(System.out::println);
	}
	
	public static String reverseString(String str) {
		return str.chars()
				.mapToObj(c -> String.valueOf((char) c) )
                .reduce("", (s1,s2) -> s2+s1);
		
	}
	public static String removeSpaces(String str) {
		return str.chars()
				.filter(c-> c != ' ')
				.mapToObj(c -> String.valueOf((char) c) )
                .reduce("", (s1,s2) -> s2+s1);
	}
				
	
	
	
	
	public static String longestWord(String[] kelimeler) {
		return Arrays.stream(kelimeler)
				     .reduce("", (w1,w2) -> w1.length() > w2.length() ? w1:w2);
				
				
	}

}
