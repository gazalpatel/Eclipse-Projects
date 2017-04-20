class bubblesort
{
		
		public static void main(String s[])
		{
		int i,j,temp,n;
		n=s.length;
		int a[]=new int[s.length];
		
		for (i=0;i<n;i++)
		{
			a[i]=Integer.parseInt (s[i]);
		}
		for (i=0;i<n;i++)
		{
			for (j=0;j<n-1;j++)
			{
				if (a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	
	for (i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}

	}
}

				