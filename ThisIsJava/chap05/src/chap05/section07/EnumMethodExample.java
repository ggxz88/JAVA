package chap05.section07;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name() 皋家靛
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name); //SUNDAY
		
		//ordinal() 皋家靛
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 6
		
		//compareTo() 皋家靛
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1); //-2
		System.out.println(result2); //2
		
		//valueOf() 皋家靛
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("林富");
			} else {
				System.out.println("乞老");
			}
		} // 林富
		
		//values() 皋家靛
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}

}
