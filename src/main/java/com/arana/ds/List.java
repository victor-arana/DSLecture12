package com.arana.ds;

public abstract class List {
	protected int size;
	public int length(){
		return size;
	}
	
	public abstract void insertFront(Object item);

}
