package com.test03.stack;

public class IntStack {
	
	private int[]s; //������ ����� ���� �迭
	private int capacity; //������ �뷮
	private int ptr;        //������, ���ÿ� ����� ������ ��
	
	//������
	public IntStack(int max) {
		ptr = 0;
		capacity =max;
		
		try {
			s = new int[capacity];
		} catch (Exception e) {
			capacity =0;
		}
	}
	
	//push : ������ ����
	public int push(int no) throws Exception{
		if(ptr>=capacity) { //������ ���� ��
			System.out.println("[������ ���� á��]");
			throw new Exception();
		}
		return s[ptr++]=no; //s[ptr]�� ���� �� ptr 1 ����
	}
	
	//pop : ������ ����
	public int pop() throws Exception {
		if(ptr<=0) { //������ �����.
			System.out.println("[������ �����]");
			throw new Exception();
		}
		return s[--ptr];
	}
	
	//������ ���� �ִ� ������ Ȯ��
	public int peek() throws Exception {
		
		if(ptr<=0) {
			System.out.println("[������ �����]");
			throw new Exception();
		}
		return s[ptr-1];
	}
	
	//������ ����
	public void clear() {
		ptr=0;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	public boolean isFull() {
		return ptr>=capacity;
	}
	
	//������ ��� �����͸� �ٴ� -> ��ũ ������ Ȯ��
	public void dump() {
		if(isEmpty()) {
			System.out.println("������ �����.");
		}
		else {
			for(int i=0; i<ptr; i++) {
				System.out.println(s[i]+" ");
			}
			System.out.println();
		}
		
	}
	
	// ���ÿ��� no�� ã�� �ε��� ����
	public int indexOf(int no) {
		for(int i=0;i<ptr; i++) {
			
			if(s[i]== no) {
				return i; //�˻� ����
			}
		}
		return -1; //�˻� ����=
		
	}

}
