package chap07.sec02;

public class ChildExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 parent = new Child1();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.filed2 = "data2";
		parent.method3();
		 */
		
		Child1 child = (Child1) parent; //강제 타입 변환
		child.field2 = "yyy";
		child.method3();
		
	}

}
