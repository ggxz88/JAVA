package chap09.sec02;

public class Button {
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	//�Ű� ������ ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
	
	//��ø �������̽�
	static interface OnClickListener {
		void onClick();
	}
}
