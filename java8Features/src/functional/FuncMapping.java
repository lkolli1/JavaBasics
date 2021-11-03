package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FuncMapping {
	void hello1() {
		System.out.println("hi in Method");
	}

	public static void main(String[] args) {
		
		FuncMapping f=new FuncMapping();
		
		InterFunctional interFunctional=f::hello1;
		interFunctional.heloo();

		//Constructor Reference;
		
		InterConcFunctional interConcFunctional=ConstructReference::new;
		interConcFunctional.referFunction("sls");
		List<Integer> l1=new ArrayList<>();
		l1.add(123);
		l1.add(234);
		l1.stream().forEach(i->System.out.println(i));
		 
		
	}

}
