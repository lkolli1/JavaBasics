package functional;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lamda {
	public static void referMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Referencing Method");

		}
	}

	public static void main(String[] args) {
		InterFunctional lamda = () -> System.out.println("Inside heloo with lessCode Lamda");
		lamda.heloo();

		Calc calc = (x, y) -> System.out.println("Sum is :" + (x + y));
		calc.caal(3, 4);
		calc = (x, y) -> System.out.println("Product is :" + (x * y));
		calc.caal(3, 5);

		Runnable r = () -> {
			int i = 0;
			do {
				i++;
				System.out.println("Child Thread");
			} while (i <= 5);
		};
		Thread t = new Thread(r);
		t.start();
		for (int k = 0; k <= 5; k++) {
			System.out.println("Main Thread");
		}

		// Predicate return type should be Boolean
		Predicate<Integer> p = i -> (i > 0);
		Predicate<Integer> p2 = i -> (i < 0);
		Predicate<Integer> p3 = i -> (i > 10);
		Predicate<Integer> p4 = i -> (i % 2 == 0);

		int x[] = { 10, 20, 30, -10, -20, -30 };
		int y[] = { 0, 12, 23, 10, 30, 43, 78, 22, 89 };

		method(p2, x);
		method(p, x);
		method(p3, y);
		method(p4, y);
		method(p3.and(p4), y);
		method(p3.or(p4), y);
		method(p3.negate(), y);
		method(p4.negate(), y);

		// Function return type boolean not requied like Predicate
		Function<String, Integer> f = s -> s.length();
		Function<String, String> f1 = s1 -> s1 + " Welcome To Evoke ";

		System.out.println(f.apply("Satya"));
		System.out.println(f1.apply("Soujanya"));

		// Method Referencing --parameters ,types --should be same
		Runnable r1 = Lamda::referMethod;// reuse with referencing
		Thread t1 = new Thread(r1);
		t1.start();

		for (int k = 0; k <= 5; k++) {
			System.out.println(" Refer Main Thread");
		}

		Locale locale=Locale.getDefault();
		System.out.println("Country "+locale.getCountry()+" Language :"+locale.getLanguage());
		//Locale.setDefault(locale.CANADA_FRENCH);
		String[] countries=locale.getISOCountries();
		String[] langs=locale.getISOLanguages();
		Double d=12345678.7765;
		NumberFormat nf=NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(nf.format(d));
		/*for (String string : countries) {
			System.out.println(string);
			
		}*/
	}

	static void method(Predicate<Integer> p1, int[] x) {
		for (int s : x)
			if (p1.test(s)) {
				System.out.print(s);
			}
		System.out.println();
	}

}
