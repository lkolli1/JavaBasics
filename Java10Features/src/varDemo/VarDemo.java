package varDemo;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class VarDemo {
	public static void main(String[] args) {
		var x = 10;// inferred type
		var map = new HashMap<String, List<String>>();
		for (var entry : map.entrySet()) {// entryset used to create set out of same elements
			var value = entry.getValue();
			//null is not allowed on var
			//no class level variables 
			//no on lamda expressions
		//	Collectors.toUnmodifiableList()
			// method added in 10 features which doesnt allow adding new values
		}
	}

}
