package example.collections;

public class ThreeValues 
{
	
	public static void main(String args[])
	{
		int arr[] ={2,4,5,10,19,22,25,35,1};
		
		int i =0;
		int j =0;
		int k =0;
		Boolean isValueFound = false;
		
		for(i =0 ; i < arr.length-2; i++)
		{
			j = i+1;
			while(j < arr.length - 1)
			{
				if(arr[j] < arr[i])
				{
					k = j+1;
					while(k<arr.length)
					{
						if(arr[k] < arr[j])
						{
							isValueFound = true; 
							break;
						}
						else
						{
							k++;
							continue;
						}
					}
					if(isValueFound)
					{
						break;
					}
				}
				else
				{
					j++;
					continue;
				}
			}
			if(isValueFound)
			{
				break;
			}
			
		}
		
		if(isValueFound)
		{
			System.out.println("Values found..") ;
			System.out.println("ith position is [ "+i+" ] its value is [ "+arr[i]+" ].");
			System.out.println("jth position is [ "+j+" ] its value is [ "+arr[j]+" ]."); 
			System.out.println("kth position is [ "+k+" ] its value is [ "+arr[k]+" ]."); 
		}
		else
		{
			System.out.println("Not such relation found..");  
		}
	}

}
