package safeVarArgs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SafeVarArgs {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("abc", "def");
		List<String> l2 = Arrays.asList("bcd", "cde");
		varargs(l1, l2);

		List<Integer> lmore = Arrays.asList(40, 50, 20, 15, 6, 7, 2, 8,null);
		System.out.println(lmore.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));
		System.out.println(lmore.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));
		System.out.println(lmore.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));
	}
	

	@SafeVarargs
	public static void varargs(List<String>... l) {
		String s = l[0].get(0);
		System.out.println(s);

	}
}
