package com.test02.list;

import java.util.Comparator;

public class DoubleLinkedList<E> {
	
	class Node<E>{
		private E data;
		private Node<E> prev;
		private Node<E> next;
		
		//������
		Node(){
			data = null;
			prev = next = this;
		}
		Node(E obj,Node<E> prev, Node<E> next){
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	//DoubleLinkedList Ŭ������ �ʵ�
	private Node<E> head;
	private Node<E> crnt;
	
	public DoubleLinkedList() {
		head = crnt = new Node<E>(); //���̳��
	}
	
	//����Ʈ�� ����ִ��� Ȯ��
	public boolean isEmpty() {
		return head.next == head;
	}
	
	//�˻�
	//����Ʈ���� ã�� ������ ������ �ش� ��� ����, ������ null ����
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head.next;
		//���� �񱳸� �ϴ� ���� ���
		
		while(ptr != head) {
			if(c.compare(obj, ptr.data)==0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
	}
	
	//crnt�� ����Ű�� ��� Ȯ��
	public void printCrntNode() {
		if(isEmpty()) {
			System.out.println("��尡 �����ϴ�.");
		}
		else {
			System.out.println(crnt.data);
		}
	}
	
	//����Ʈ�� ��ü ��� Ȯ��
	public void dump() {
		Node<E> ptr = head.next; //���̳�� ���� ���
		
		while(ptr!=head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	//crnt�� �ϳ� ������
	public boolean prev() {
		if(isEmpty()) {
			return false;
		}
		
		if(crnt.prev == head) {
			crnt=head.prev;
		}
		else {
			crnt = crnt.prev;
		}
		return true;
	}
	
	//crnt�� �ϳ� �ڷ�
	public boolean next() {
		if(isEmpty()) {
			return false;
		}
		
		if(crnt.next == head) {
			crnt=head.next;
		}
		else {
			crnt = crnt.next;
		}
		return true;
	}
	
	//��� �߰�
	public void add(E obj) {
		Node<E> node = new Node<E>(obj, crnt, crnt.next);
		crnt.next = crnt.next.prev = node;
		crnt = node;
	}
	
	//���� �տ� ��� �߰�
	public void addFirst(E obj) {
		crnt = head;
		add(obj);
		
	}
	
	//���� �ڿ� ��� �߰�
	public void addLast(E obj) {
		crnt = head.prev; //������ ��带 ����, �ٷ� �ڿ� �߰�
		add(obj);
	}
	
	//��� ����
	public void removeCrnt() {
		if(!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			
			if(crnt== head) {
				crnt = head.next;
				
			}
		}
	}
	
	public void removeFirst() {
		crnt = head.next; 
		// crnt�� ����Ű�� ��带 �����ҰŶ� crnt�� ù���� ��带 ����Ű�Բ� ����
	
		removeCrnt();
	}
	
	public void removeLast() {
		crnt = head.prev;
		removeCrnt();
	}

	public void clear() {
		while(!isEmpty()) {
			removeFirst();
		}
	}
}
