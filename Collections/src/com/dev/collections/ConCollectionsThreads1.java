package com.dev.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCollectionsThreads1 implements Runnable{
	List<Integer> arrList = new CopyOnWriteArrayList<Integer>();

	public ConCollectionsThreads1(CopyOnWriteArrayList<Integer> arr) {
		this.arrList = arr;
	}

	@Override
	public void run() {
		this.arrList.add(65);
		System.out.println("In child thread class");
	}
}