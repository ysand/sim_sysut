import java.util.Random;

public class simpleuserandomizer 
{
Random r = new Random();
String string ="";
String[] stringcont;

	
	/*
	generates 24 random characters based on the value of variable r and
	prints them
	*/
	public simpleuserandomizer()
	{
		stringcont = new String[24];
		for(int i=0; i <= 24; i++)
		{
			int rnd = r.nextInt(100);
	
			if(rnd < 10)
			{
				System.out.println("a");
				string = string + "a";
			}
			else if(rnd>=10 && rnd<20)
			{
				System.out.println("b");
				string = string + "b";
				
			}
			else if(rnd>=20 && rnd<30)
			{
				System.out.println("c");
				string = string + "c";
				
			}
			else if(rnd>=30 && rnd<40)
			{
				System.out.println("d");
				string = string + "d";
				
			}
			else if(rnd>=40 && rnd<50)
			{
				System.out.println("e");
				string = string + "e";
				
			}
			else if(rnd>=50 && rnd<60)
			{
				System.out.println("f");
				string = string + "f";
				
			}
			else if(rnd>=60 && rnd<70)
			{
				System.out.println("g");
				string = string + "g";
				
			}
			else if(rnd>=70 && rnd<80)
			{
				System.out.println("h");
				string = string + "h";
				
			}
			else if(rnd>=80 && rnd<90)
			{
				System.out.println("i");
				string = string + "i";
				
			}
			else if(rnd>=90)
			{
				System.out.println("j");
				string = string + "j";
				
			}			
		}
		System.out.println(string);
		//System.out.println(stringcont);
	}
}