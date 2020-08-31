package chap09.sec01;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}

}
