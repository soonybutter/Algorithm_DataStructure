package com.test04.queue;

public class IntQueue {
	
	private int[] q; //ť
	private int capacity; //ť�� ũ��, ���� �� �� �ִ� �ִ� ��, �뷮
	private int num; //���� ������ ����
	private int front; //�� ó��
	private int rear;  //�� ������

	public IntQueue(int max) {
		num = front = rear = 0;
		capacity = max;
		
		try {
			q = new int[capacity];
		} catch (Exception e) {
			capacity =0;
		}
	}
	
	
	//ť�� ������ ���� - ��ť
	public int enqueue(int no) {
		if(num>=capacity) { //ť�� ���� á��.
			System.out.println("[ť�� ���� á��]");
			
		}
		
		q[rear++] = no;
		num++;
		
		if(rear==capacity) {
			
			rear =0;
		}
		
		return no;
	}
	
	//ť���� ������ ���� - ��ť
	public int dequeue() throws Exception {
		if(num<=0) {
			System.out.println("[ť�� �����]");
			throw new Exception();
		}
		
		int val = q[front++];
		num--;
		if(front == capacity) {
			
			front=0;
		}
		
		return val;
	}
	
	//�� ���� ������ Ȯ��
	public int peek() throws Exception{
		if(num<=0) {
			System.out.println("[ť�� �����]");
			throw new Exception();
		}
		return q[front];
	}
	
	//ť�� ���
	public void clear() {
		num = front = rear =0;
		
	}
	
	//ť�� ũ�� Ȯ��
	public int getCapacity() {
		
		return capacity;
	}
	
	//ť�� ����� ������ �� Ȯ��
	public int size() {
		
		return num;
	}
	
	//�������?
	public boolean isEmpty() {
		
		return num<=0;
	}
	
	//���� á����?
	public boolean isFull() {
		
		return num>=capacity;
	}
	
	//ť�� ��� �����͸� front-> rear  ������ ���
	public void dump() {
		
		if(num<=0) {
			System.out.println("[ť�� �����]");
		}
		else {
			for(int i=0;i<num; i++) {
				
				System.out.print(q[(i+front)%capacity]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
