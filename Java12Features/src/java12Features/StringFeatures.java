package java12Features;

import java.text.NumberFormat;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringFeatures {
	public static void main(String[] args) {
		String str = "In Java 12 Features String Features";
		System.out.println(str);
		//str.indent(5)--adds 5 spaces 
		//str.indent(-5)-- removes upto 5 spaces at starting of str
		String st="10";
		//Integer i= st.transform(Integer::parseInt);--transforms string  st to int
		//NumberFormat format=NumberFormat.getCompactNumberInstance();
		//sysout(format.format(1000));// o/p:1k
		//format=NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.style.LONG);  //o/p:1 thousand
																				//	.SHORT O/P:1K
		//\u265A--chess black king
		//\u265B-- chess black Queen ...Unicodes
		
		//teeing
		//Stream.of(12,2,3,40,56,8,5).collect(Collectors.teeing(Collectors.counting(),Collectors.filtering(i->Integer.parseInt(i.toString())>10,Collectors.toList()) merger)))
		

	}

}
