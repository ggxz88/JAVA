package chap07.section07.casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();	// �ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "data2"; parent.method3();
		 */
		
		Child child = (Child) parent;	// ���� Ÿ�� ��ȯ
		child.field2 = "yyy";
		child.method3();
	}

}