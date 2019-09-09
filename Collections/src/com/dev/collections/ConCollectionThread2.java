package com.dev.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCollectionThread2 {

	public static void main(String[] args) {			// Try with vector
		System.out.println("Main thread started.....");
		CopyOnWriteArrayList<Integer> arryList = new CopyOnWriteArrayList<>();
		arryList.add(1);
		arryList.add(2);
		System.out.println("The numbers are added");

		CollectionsThreads1 t = new CollectionsThreads1(arryList);
		new Thread(t).start();

		Iterator<Integer> itr = arryList.iterator();
		while(itr.hasNext()) {
			System.out.println("Numbers: " + itr.next());
		}
	}

}