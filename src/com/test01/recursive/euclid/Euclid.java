package com.test01.recursive.euclid;

public class Euclid {

	//��Ŭ���� ȣ���� : �� ������ �ִ����� ���ϱ�
	
	public static void main(String[] args) {
		
		Euclid e = new Euclid();
		
		int gcd = e.euclid(22, 8);
		
		System.out.println("�ִ�����: "+gcd);
		
	}
	
	public int euclid(int no1, int no2) {
		
		if(no2==0) {
			return no1;
		}
		else {
			return euclid(no2,no1%no2);
		}
		
	}
	
}
