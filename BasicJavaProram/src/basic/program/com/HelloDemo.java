package basic.program.com;

public class HelloDemo {
	public static void main(String... arg)
	{
		int arr1[]= {7,4,3,4,5,3,6,2};//{1,1,1,1,2,5,6,7}
		int arr2[]=new int[arr1.length];
		int arr3[]=new int[arr1.length];
		int count=0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
			if(arr1[i]==arr1[j])
			{
				arr2[i]=1;
				count++;
			}
			
			}
			
		}
		System.out.println(count);
		/*int temp=arr1.length-count;
		for(int t=count;t<=temp;t++)
		{
			arr2[t]=arr1[t+1];
		}
		
		for(int p=0;p<=arr2.length;p++)
		{
			System.out.println(arr2[p]);
		}
		System.out.println("First Java Program");*/
	}

	
}
