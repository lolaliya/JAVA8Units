package com.dev.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsThreads1 implements Runnable{
	List<Integer> arrList = new ArrayList<Integer>();

	public CollectionsThreads1(List<Integer> arr) {
		this.arrList = arr;
	}

	@Override
	public void run() {
		System.out.println("In child thread class");
		this.arrList.add(65);
	}
}