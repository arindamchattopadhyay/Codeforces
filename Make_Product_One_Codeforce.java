import java.util.*;
public class Make_Product_One_Codeforce {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	List<Integer> ob=new ArrayList<>();
	long ans=0,c=0,d=0;
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		ob.add(sc.nextInt());
	}
	sc.close();
	
	for(int i=0;i<n;i++)
	{
		if(ob.get(i)!=1)
			ans+=Math.min(Math.abs(1-ob.get(i)),Math.abs(1+ob.get(i)));
		
		if(ob.get(i)<0)
		{
			c+=1;
		}
		
		else if(ob.get(i)==0)
		{
			d=1;
		}
	}
	if(c%2==1&&d==0)
		ans+=2;
	System.out.println(ans);
}
}
