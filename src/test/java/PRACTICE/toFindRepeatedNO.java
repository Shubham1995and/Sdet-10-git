package PRACTICE;

public class toFindRepeatedNO {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int a=4;
	    int b=5;
	
	
	for(int i=0;i<arr.length-1;i++)
		
	{
	
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("-1");
			}
			else if(arr[i]==a)
			{
			System.out.println("pass");
			}
			else if(arr[i]==b)
			{
				System.out.println("pass with b");
			}
		}
	}
	
		
			}

	}


