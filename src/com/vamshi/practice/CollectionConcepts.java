package com.vamshi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CollectionConcepts {
 
	    // Driver code 
	    static public void main (String[] args) 
	    { 
	          
			List<String> familyList = new ArrayList<String>();
			familyList.add("vamshi");
			familyList.add("krishna");
			familyList.add("Neela");
			List<String> personsList = new ArrayList<String>();
			personsList.add("Kranthi");
			personsList.add("komirishetty");
			personsList.add("advitha");
			personsList.add("neela");
			personsList.add("asrith");
			personsList.add("neela");
			familyList.addAll(personsList);
			familyList.add(0, "srinivas");
			for (int i = 0; i < familyList.size(); i++) {
				if(familyList.get(i).equalsIgnoreCase("srinivas")){
					familyList.remove(0);
				}
				
			}
			familyList.stream().filter(p->p.equals("vamshi")).collect(Collectors.toList());	
			Iterator<String> itr = familyList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			List<String> familyList1 = new LinkedList<String>();
			familyList1.add("vamshi");
			familyList1.add("krishna");
			familyList1.add("Neela");
			List<String> personsList1 = new ArrayList<String>();
			personsList1.add("Kranthi");
			personsList1.add("komirishetty");
			personsList1.add("advitha");
			personsList1.add("neela");
			personsList1.add("asrith");
			personsList1.add("neela");
			familyList.addAll(personsList1);
			Iterator<String> itr1 = familyList.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			//familyList.forEach((Consumer<? super String>) familyList);
			 Consumer<String> lambdaExpression = x -> System.out.println("lambda"+x.toUpperCase());
			 
			 familyList.forEach(lambdaExpression);
	    } 
	  }
	
