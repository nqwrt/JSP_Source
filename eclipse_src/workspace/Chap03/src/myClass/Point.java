package myClass;


public class Point { // Point Ŭ���� ����
	
	public int x; // X��ǥ
	public int y; // Y��ǥ
	
	public Point(){ // �Է� �Ķ���Ͱ� ���� ������ ����
		this.x = 0;
		this.y = 0;
	} // ������ ����
	
	public Point(int x, int y){ // �Է� �Ķ���Ͱ� �����ϴ� ������ ����
		this.x = x;
		this.y = y;
	}// ������ ����
	
	public int getX() { // getX �޼ҵ� ����
		return x;
	}// �޼ҵ� ����
	
	public void setX(int x) { // setX �޼ҵ� ����
		this.x = x;
	}// �޼ҵ� ����
	
	public int getY() { // getY �޼ҵ� ����
		return y;
	}// �޼ҵ� ����
	
	public void setY(int y) { // setY �޼ҵ� ����
		this.y = y;
	}// �޼ҵ� ����
	
} // Point Ŭ���� ����

