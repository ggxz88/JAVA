package chap09.sec02;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	//�ʵ尪���� �͸� ��ü ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window() {
		button1.setOnClickListener(listener); //�Ű������� �ʵ� ����
		//�Ű������� �͸� ��ü ����
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
