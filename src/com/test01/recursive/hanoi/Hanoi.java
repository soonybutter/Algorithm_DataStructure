package com.test01.recursive.hanoi;

public class Hanoi {
	
	public static void main(String[] args) {
		
		new Hanoi().hanoi(3,1,3);
		
	}
	
	//no: ���� ����, x: ���۱��, y: ��ǥ���
	//no���� ������ x���� y�� �̵�
	public void hanoi(int no, int x, int y) {
		if(no>1) {
			
			hanoi(no-1,x,6-x-y);
		}
		
		System.out.println("���� "+no+"�� "+x+"�� ��տ��� "+y+"�� ������� �ű�");
		
		
		if(no>1) {
			hanoi(no-1,6-x-y,y);
		}
		
	}
	
	

}
