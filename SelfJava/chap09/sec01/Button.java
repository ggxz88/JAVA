package chap09.sec01;

public class Button {
	OnClickListener listener;	//�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
