/*https://codeforces.com/problemset/problem/1208/A
A. XORinacci
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Cengiz recently learned Fibonacci numbers and now he is studying different algorithms to find them. After getting bored of reading them, he came with his own new type of numbers that he named XORinacci numbers. He defined them as follows:

f(0)=a;
f(1)=b;
f(n)=f(n−1)⊕f(n−2) when n>1, where ⊕ denotes the bitwise XOR operation.
You are given three integers a, b, and n, calculate f(n).

You have to answer for T independent test cases.

Input
The input contains one or more independent test cases.

The first line of input contains a single integer T (1≤T≤103), the number of test cases.

Each of the T following lines contains three space-separated integers a, b, and n (0≤a,b,n≤109) respectively.

Output
For each test case, output f(n).

Example
inputCopy
3
3 4 2
4 5 0
325 265 1231232
outputCopy
7
4
76
Note
In the first example, f(2)=f(0)⊕f(1)=3⊕4=7.

*/
import java.util.*;
public class Xor_Codeforces_Manthan {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			
			int c=a^b;
			
			
			
			if(n%3==0)
				System.out.println(a);
			else if(n%3==1)
				System.out.println(b);
			else if(n%3==2)
				System.out.println(c);
			t--;
		}
		
	}

}
