
public class SecondHighestNumber {

	public static void main(String[] args) 
	{
		int arr[]= {5,8,2,9,1};
		int temp,size;
		size=arr.length;
		
		System.out.println("Original array: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i] +"");
			
		}
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if (arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		

		System.out.println("\nSorted array: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i] +"");
			
		}
		System.out.println();
		System.out.println("Second largest no is:"  +arr[(size)-2]);
	}
	}


