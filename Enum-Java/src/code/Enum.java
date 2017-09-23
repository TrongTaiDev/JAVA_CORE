package code;

public class Enum {
	public enum WeekDays{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public static void main(String argn[]) {
		//In ra các giá trị của enum WeekDays
		for(WeekDays day : WeekDays.values()) {
			System.out.println(day);
		}
		
		//Enum in switch!!
		WeekDays toDay = WeekDays.MONDAY;
		switch(toDay) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("Coding!");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Nothing!");
			break;
		default: System.out.println("It is not a day!");
			break;		
		}
	}
}
	