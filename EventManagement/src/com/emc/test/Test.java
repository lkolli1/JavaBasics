package com.emc.test;

import com.emc.entities.Event;

import com.emc.entities.Organizer;
import com.emc.managers.EventManageImpl;
import com.emc.managers.EventManager;

import static java.lang.Math.*;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Organizer org=new Organizer();
		org.setId(12);
		org.setName("Apple Inc");
		System.out.println("Organizer Name :"+org.getName());
	
		Event event=new Event(22,"Iphone Launch","Grand Launch");
		 
		System.out.println("Description :"+event.getDescription());
		
		EventManager eventManager=new EventManageImpl();
		Event event1=eventManager.create(123);
		System.out.println(event1.getId()+" \n"+event1.getName()+"\n "+event1.getDescription());
		
		///practice on static imports
		/*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int y = scan.nextInt();
		double k=Math.pow(n,y);
		System.out.println("k is"+k);
		double l=Math.sqrt(k);
		System.out.println("l is"+l);*/

	}

}
