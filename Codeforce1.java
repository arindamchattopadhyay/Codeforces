import java.util.*;
public class Codeforce1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();//Students
	int m=sc.nextInt();// questions
	String s[]=new String[n+1];
	//char s1[][]=new char[n+1][m+1];
	int a[]=new int[m];
	
	for(int i=0;i<n;i++)
	{
		s[i]=sc.next();
		
	}
	
	for(int i=0;i<m;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int sum=0,c=1;
	for(int i=0;i<m;i++)
	{
		TreeMap<Character,Integer> ob=new TreeMap<Character,Integer>();
		
		for(int j=0;j<n;j++)
		{
			if(ob.containsKey(s[j].charAt(i)))
			{
				ob.put(s[j].charAt(i),ob.get(s[j].charAt(i))+1);
			}
			else
				ob.put(s[j].charAt(i),1);
	
		}
		List<Map.Entry<Character,Integer> > list = 
           		new LinkedList<Map.Entry<Character, Integer> >(ob.entrySet()); 

    
    			Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >(){ 
        		public int compare(Map.Entry<Character, Integer> o1,  
                           Map.Entry<Character, Integer> o2) 
        		{ 
            		return (o2.getValue()).compareTo(o1.getValue()); 
        		} 
    		}); 
      			
      			
    		 
    		for (Map.Entry<Character, Integer> aa : list) { 
       			 sum+=a[i]*aa.getValue();
       			 break;
    		} 
	
	}
	System.out.println(sum);
	

	
}
}
