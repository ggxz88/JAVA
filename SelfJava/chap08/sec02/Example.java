package chap08.sec02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); 	//InterfaceA ������ methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();	//InterfaceB ������ methodB()�� ȣ�� ����
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();	//InterfaceC ������ methodA(), methodB(), methodC() ��� ȣ�� ����
		
	}

}
