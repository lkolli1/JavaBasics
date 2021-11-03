package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import collections.entities.Employee;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections {
	public static void main(String[] args) {

		List<Employee> lList = new ArrayList<>();
		List<Integer> linkList = new LinkedList<>();
		Set<Employee> hSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Map<String, Integer> hMap = new HashMap<>();
		Map<String, Integer> lhMap = new LinkedHashMap<>();
		Queue<Integer> queue = new PriorityQueue<>();

		Employee employee = new Employee();
		Employee employee1 = new Employee();

		employee.setId(11);
		employee.setName("sKolli");
		employee.setAddress("HYD");
		employee.setSalary(12345);

		lList.add(employee);
		hSet.add(employee);

		employee1.setId(22);
		employee1.setName("lKolli");
		employee1.setAddress("HYD");
		employee1.setSalary(12345);

		lList.add(employee1);
		hSet.add(employee1);

		// Dup allowed
		lList.add(employee1);
		// no Dup
		hSet.add(employee1);

		lList.stream().forEach(i -> System.out.println(i));
		hSet.stream().forEach(i -> System.out.println(i));

		// For Sorting
		treeSet.add("abc");
		treeSet.add("xyz");
		treeSet.add("bcd");
		treeSet.add("cde");

		treeSet.stream().forEach(i -> System.out.println(i));

		// LinkedList with List Iterator--Dup ,Same Order
		linkList.add(555);
		linkList.add(555);
		linkList.add(666);
		linkList.add(777);
		linkList.add(888);
		linkList.add(111);

		linkList.stream().forEach(i -> System.out.println(i));
		List l1 = linkList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1 + " Even List");
		long cnt = linkList.stream().filter(i -> i % 2 == 0).count();
		System.out.println(cnt + " Even List count");
		l1 = linkList.stream().sorted().collect(Collectors.toList());
		System.out.println(l1 + " Sorted list");
		
		//Comparator
		Comparator<Integer> comp=(i1,i2)->i2.compareTo(i1);//Desc
		l1 = linkList.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(l1 + "Desc Sorted list");
		comp=(i1,i2)->i1.compareTo(i2);//Asc
		Integer max=linkList.stream().max(comp).get();
		Integer min=linkList.stream().min(comp).get();
		System.out.println(max + " Max of list");
		System.out.println(min + " Min of list");
		
		// Hash Map --no order,no dup
		hMap.put("sls", 234);
		hMap.put("sls", 234);
		hMap.put("kls", 123);
		hMap.put("sss", 456);
		hMap.put("rrr", 234);

		Set<String> keySet = hMap.keySet();
		System.out.println("hashMap Keys :" + keySet);

		/*
		 * Collection<Integer> values=hMap.values();
		 * System.out.println("hashMap values :"+values);
		 */

		for (String key : keySet) {
			System.out.println("hashMap Key :" + key + " Value :" + hMap.get(key));

		}
		// LINKED HASH MAP Order ,no Dup

		lhMap.put("sls", 234);
		lhMap.put("sls", 234);
		lhMap.put("kls", 123);
		lhMap.put("sss", 456);
		lhMap.put("rrr", 234);

		keySet = lhMap.keySet();
		System.out.println("hashMap Keys :" + keySet);

		for (String key : keySet) {
			System.out.println("LinkedhashMap Key :" + key + " Value :" + lhMap.get(key));

		}

		// Queue --first time it will be ordered
		for (int i = 0; i <= 10; i++) {
			queue.offer(i);// for adding
		}
		System.out.println(queue);
		System.out.println(queue.peek());// first element
		System.out.println(queue.element());// gives first element if null gives exception
		System.out.println(queue.poll());// returns and removes first element
		System.out.println(queue.remove());// removes first element
		System.out.println(queue); // order was messed due to changes

	}

}
