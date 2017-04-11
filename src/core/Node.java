package core;

public class Node
{
	public static void nodeArray (int nodeNum)
	{
		
		int[] storeValueMax = {0,0,0,0,0};
		int[] storeValueMin = {0,0,0,0,0};
		int[] computeValue = {0,0,0,0,0};
		
		for(int i=1;i<nodeNum;i++)
		{
			if((i%2)==0)
			{
				//even
				computeValue[0] = i;
				computeValue[1] = i/2;
				computeValue[2] = i*2;
				computeValue[3] = (i*2)+1;
				computeValue[4] = (int)Math.ceil(Math.random()*(100*i));
			}

			else
			{
				//Odd
				computeValue[0] = i;
				computeValue[1] = (i-1)/2;
				computeValue[2] = i*2;
				computeValue[3] = (i*2)+1;
				computeValue[4] = (int) Math.ceil(Math.random()*(100*i));
			}
			if(storeValueMax[4] < computeValue[4])
				{
				storeValueMax[0] = computeValue[0];
				storeValueMax[1] = computeValue[1];
				storeValueMax[2] = computeValue[2];
				storeValueMax[3] = computeValue[3];
				storeValueMax[4] = computeValue[4];
				}
			if(storeValueMax[4] > computeValue[4])
				{
				storeValueMin[0] = computeValue[0];
				storeValueMin[1] = computeValue[1];
				storeValueMin[2] = computeValue[2];
				storeValueMin[3] = computeValue[3];
				storeValueMin[4] = computeValue[4];
			}
		}
		System.out.println("Node: :"+storeValueMax[0]+" MaxVal :"+storeValueMax[4]);
		System.out.println("Node: :"+storeValueMin[0]+" MinVal :"+storeValueMin[4]);
	}
}