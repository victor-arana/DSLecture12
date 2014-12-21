package com.arana.ds;

public class SList extends List {
	
	// Inherits the "size" field.
	protected SListNode head;
	
	// Inherits the "length" method.

	@Override
	public void insertFront(Object item) {
		head = new SListNode(item,head);
		size++;
	}

}
