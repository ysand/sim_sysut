import java.util.Random;

//placeholder usepattern class
public class simpleusepattern 
{
Random r = new Random();
String string ="";

	public simpleusepattern()
	{
		for(int i=0; i <= 24; i++)
		{
			int rnd = r.nextInt(100);
	
			if(rnd < 50)
			{
				System.out.println("a");
				string = string + "a";
			}
			else if(rnd>=50 && rnd<=60)
			{
				System.out.println("b");
				string = string + "b";
			}
			else if(rnd>60)
			{
				System.out.println("c");
				string = string + "c";
			}
			//System.out.println(string);
		}
	}
}
