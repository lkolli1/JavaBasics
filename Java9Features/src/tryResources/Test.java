package tryResources;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		MyWorker worker = new MyWorker();//Resource outSide 
		try(worker) {
			worker.doSomething();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Immutable Collections
		
		List<String> list = List.of("abc","def","efg");
		//list.add(null);--gives Runtime Exception
		Set<String> set = Set.of("aaa","bbb");
		Map<Integer, String> map = Map.of(11,"sss",22,"kkk");
	 
		
	}

}
