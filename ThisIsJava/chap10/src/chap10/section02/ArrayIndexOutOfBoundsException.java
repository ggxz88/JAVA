package chap10.section02;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data1 = args[0];
		//String data2 = args[1];
		
		//System.out.println(data1);
		//System.out.println(data2);		
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		} else {
			System.out.println("[���� ���]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("��1  ��2");
		}
 	}

}
