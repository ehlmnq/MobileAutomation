import java.util.HashMap;

public class Tester1 {
	
	public static void main(String [] args )
	{
		
		String st = "This is deeeeeeepak check this out";
		String bt = "";
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		
		
		for(char ch : st.toCharArray())
		{
			bt+=ch;
			int i =1;
			if(!hp.containsKey(ch))
			{
				hp.put(ch, i);
				
			}
			else
			{
				hp.put(ch, hp.get(ch)+1);
			}
			
		}
		
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		
	}

	
}
