package chap09.section05;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}