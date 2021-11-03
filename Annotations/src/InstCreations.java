import java.text.DateFormat;

public class InstCreations {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		//1
		InstCreations instCreations=new InstCreations();
		//2
		InstCreations instCreations1=InstCreations.class.newInstance();
		//3
		InstCreations instCreations3=(InstCreations)instCreations.clone();
		//with own factory methods
		DateFormat instance = DateFormat.getInstance();
		

	}

}
