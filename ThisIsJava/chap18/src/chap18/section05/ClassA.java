package chap18.section05;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();
	static int field3;		//����ȭ���� ����
	transient int field4;	//����ȭ���� ����
}
