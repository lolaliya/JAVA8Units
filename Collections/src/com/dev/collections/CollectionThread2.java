package com.dev.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionThread2 {

	public static void main(String[] args) {			// Try with vector
		System.out.println("Main thread started.....");
		ArrayList<Integer> arryList = new ArrayList<>();
		arryList.add(1);
		arryList.add(2);
		arryList.add(3);
		arryList.add(4);
		arryList.add(5);
		System.out.println("The numbers are added");

		CollectionsThreads1 t = new CollectionsThreads1(arryList);
		new Thread(t).start();

		Iterator<Integer> itr = arryList.iterator();
		while(itr.hasNext()) {
			System.out.println("Numbers: " + itr.next());
		}
	}

}