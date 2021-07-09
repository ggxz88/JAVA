package chap06.section15;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declareMethods = Service.class.getDeclaredMethods(); //Service Ŭ������ ����� �޼ҵ� ���(���÷���)
		
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declareMethods) {
			//PrintAnnotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotaion ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "] ");
				//���м� ���
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//�޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}

}