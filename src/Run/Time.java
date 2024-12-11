package Run;

class Time extends runTime
{
	
	String st = "Run";
	
	
	
	Time()
	{		
	System.out.println("Constructor Time()");	
	}
	
	void m1()
	{
		
		System.out.println("Time m1()");
	}
	
	public static void main(String [] args)
	{
		
		runTime r1 = new runTime();
		runTime r2 = new Time();
	    Time r3 = new Time();
	    
	    r1.m1();  //
	    r2.m1();  //
	    r3.m1();  //    
	    System.out.println(r1.st);
	    System.out.println(r2.st);
	    System.out.println(r3.st);
	}
}
