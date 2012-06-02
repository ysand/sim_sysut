import java.util.Random;
public class simpleuserandomizer 
{
Random r = new Random();
String string ="";	
	/*
	generates 24 random characters based on the value of the variables i and r and
	prints them
	*/
	public simpleuserandomizer()
	{
		for(int i=0; i <= 24; i++)
		{
			int rnd = r.nextInt(100);	
	/*
	All characters have a 10% chance of being selected when i is between 0 and 6.
	*/
			if(i>=0 && i<6 && rnd < 10)
			{
				//System.out.println("a");
				string = string + "a";
			}
			else if(i>=0 && i<6 && rnd>=10 && rnd<20)
			{
				//System.out.println("b");
				string = string + "b";				
			}
			else if(i>=0 && i<6 && rnd>=20 && rnd<30)
			{
				//System.out.println("c");
				string = string + "c";				
			}
			else if(i>=0 && i<6 && rnd>=30 && rnd<40)
			{
				//System.out.println("d");
				string = string + "d";				
			}
			else if(i>=0 && i<6 && rnd>=40 && rnd<50)
			{
				//System.out.println("e");
				string = string + "e";				
			}
			else if(i>=0 && i<6 && rnd>=50 && rnd<60)
			{
				//System.out.println("f");
				string = string + "f";				
			}
			else if(i>=0 && i<6 && rnd>=60 && rnd<70)
			{
				//System.out.println("g");
				string = string + "g";				
			}
			else if(i>=0 && i<6 && rnd>=70 && rnd<80)
			{
				//System.out.println("h");
				string = string + "h";				
			}
			else if(i>=0 && i<6 && rnd>=80 && rnd<90)
			{
				//System.out.println("i");
				string = string + "i";				
			}
			else if(i>=0 && i<6 && rnd>=90)
			{
				//System.out.println("j");
				string = string + "j";				
			}
	/*
	When i is between 6 and 12, the characters a b c d each have a 20% chance of being selected
	and e has a 10% chance. The rest have a 2% chance. 
	*/
			else if(i>=6 && i<12 && rnd<20)
			{
				string = string + "a";
			}
			else if(i>=6 && i<12 && rnd>=20 && rnd<40)
			{
				string = string + "b";
			}
			else if(i>=6 && i<12 && rnd>=40 && rnd<60)
			{
				string = string + "c";
			}
			else if(i>=6 && i<12 && rnd>=60 && rnd<80)
			{
				string = string + "d";
			}
			else if(i>=6 && i<12 && rnd>=80 && rnd<90)
			{
				string = string + "e";
			}
			else if(i>=6 && i<12 && rnd>=90 && rnd<92)
			{
				string = string + "f";
			}
			else if(i>=6 && i<12 && rnd>=92 && rnd<94)
			{
				string = string + "g";
			}
			else if(i>=6 && i<12 && rnd>=94 && rnd<96)
			{
				string = string + "h";
			}
			else if(i>=6 && i<12 && rnd>=96 && rnd<98)
			{
				string = string + "i";
			}
			else if(i>=6 && i<12 && rnd>=98)
			{
				string = string + "j";
			}
		}		
		//Prints the string
		System.out.println(string);
		//System.out.println(stringcont);
	}
}