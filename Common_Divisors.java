import java.util.ArrayList;
import java.util.Scanner;
public class  Common_Divisors{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Long> ob=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		ob.add(sc.nextLong());
		
	}
	long result;
	if(n!=1)
	result= Common_Divisors.gcd(ob.get(0), ob.get(1));
	else
		result=ob.get(0);
	for(int i=2;i<n;i++)
	{
		result= Common_Divisors.gcd(result, ob.get(i));
	}
	//System.out.println(result);
	int c=0;
	if(result==1)
		System.out.println(1);
	else
	{
		
		if((int)Math.sqrt(result)==Math.sqrt(result)) {
		for(int i=1;i<=Math.ceil(Math.sqrt(result));i++)
		{
			if(result%i==0) {
				if(result==Math.pow(i, 2))
				{ 
					c=c+1;
				}
				else
					c=c+2;
			}
		}
		}
		else {
			for(int i=1;i<Math.ceil(Math.sqrt(result));i++)
			{
				if(result%i==0) {
					if(result==Math.pow(i, 2))
					{ 
						c=c+1;
					}
					else
						c=c+2;
				}
			}
		}
		System.out.println(c);
	}
}
static long gcd(long a, long b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
}  
}




