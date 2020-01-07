package comm.example;

public enum Day1 {

	SUN("Today is holiday",1),
	MON("Today ia monday",2),
	TUES("Today is tuesday",3),
	WED("Today is wednesday",4),
	THURS("TOday is thursday",5),
	FRI("Today is Friday",6),
	SAT("Today is holiday",7);
	private final String msg;
	private final int DayOfWeek;
		

	private Day1(String m,int d)
	{
		msg=m;
		DayOfWeek=d;
	}


	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}


	/**
	 * @return the dayOfWeek
	 */
	public int getDayOfWeek() {
		return DayOfWeek;
	}
	

}
