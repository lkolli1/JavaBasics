import java.util.stream.Collectors;

public class StringUpdates {

	public static void main(String[] args) {
		String str = " ";
		System.out.println(str.isBlank());
		str = "I\nam\nWorking\n on Java10 Features";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));

		char ch = '\u2000';
		str = ch + str + ch;
		System.out.println(str);
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		
		System.out.println("-".repeat(19));

	}

}
