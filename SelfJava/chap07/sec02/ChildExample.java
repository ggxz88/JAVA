package chap07.sec02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2(); // �����ǵ� �޼ҵ尡 ȣ���
		//parent.metho3(); // ȣ�� �Ұ���
	}

}
