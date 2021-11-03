package functional;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExp {
	public static void main(String[] args)
	{
		long f=123456789;
		NumberFormat nf=NumberFormat.getInstance(Locale.UK);
		System.out.println(nf.format(f));
		nf=NumberFormat.getInstance(Locale.US);
		System.out.println(nf.format(f));
		
		Double d=12345678.7765;
		NumberFormat nf1=NumberFormat.getInstance(Locale.FRANCE);
		nf1.setMinimumFractionDigits(4);//min and max are available 
		System.out.println(nf1.format(d));
	}

}
