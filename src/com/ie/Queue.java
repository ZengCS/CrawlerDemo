package com.ie;

import java.util.LinkedList;

/**
 * ���ݽṹ����
 */
public class Queue<T> {

	private LinkedList<T> queue = new LinkedList<T>();

	public void enQueue(T t) {
		queue.addLast(t);
	}

	public T deQueue() {
		return queue.removeFirst();
	}

	public boolean isQueueEmpty() {
		return queue.isEmpty();
	}

	public boolean contians(T t) {
		return queue.contains(t);
	}

	public boolean empty() {
		return queue.isEmpty();
	}
}