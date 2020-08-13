import java.util.Date;
class Welcome {

	public static void main(String[] args) {
		
		Date date = new Date();
		@SuppressWarnings("deprecation")
		int currentHour =date.getHours();
		
		System.out.println("현재시간은 "+date);
		
		if(currentHour <11) 
			System.out.println("GOOD Morning");
		
		else if (currentHour <15)
			System.out.println("GOOD Afternoon");
		
		else if (currentHour <20)
			System.out.println("GOOD Evening");
		
		else if (currentHour <15)
			System.out.println("GOOD Night");
	}

}
