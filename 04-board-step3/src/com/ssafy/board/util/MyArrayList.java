package com.ssafy.board.util;

import java.util.Arrays;

public class MyArrayList {
	private Object[] list = new Object[3];
	private int pos = 0;
	public void add(Object board) {
		if (pos == list.length) {
			list = Arrays.copyOf(list, pos * 2);
		}
		list[pos++] = board;
	}
	public Object get(int index) {
		return list[index];
	}
	public int size() {
		return pos;
	}
}








