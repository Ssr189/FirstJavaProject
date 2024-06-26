
public class CommonElementOfArray
{

	public static void main(String[] args)
	{
		int a[]={4,1,3,2};
		int b[]= {9,4,6,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
