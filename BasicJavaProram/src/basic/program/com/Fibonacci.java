package basic.program.com;

public class Fibonacci {
	public static void main(String[] args) {
		int i=0;
		int j=1;
		System.out.print(i+""+j);
		for(int n=0;n<=10;n++)
		{
			int f=i+j;
			System.out.print(f);
			i=j;
			j=f;
			
		}
	}
}
