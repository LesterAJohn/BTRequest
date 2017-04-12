package core;

import java.util.ArrayList;

public class Node
{
	public static void nodeArray (int nodeNum)
	{
		int[] storeValueMax = {0,0,0,0,0};
		int[] storeValueMin = {0,0,0,0,0};
		
		ArrayList<Integer> nodeE1 = new ArrayList<Integer>();
		ArrayList<Integer> nodeE2 = new ArrayList<Integer>();
		ArrayList<Integer> nodeE3 = new ArrayList<Integer>();
		ArrayList<Integer> nodeE4 = new ArrayList<Integer>();
		
		for(int i=0;i<nodeNum;i++)
		{
			if((i%2)==0)
			{
				//even
				nodeE1.add(i, i/2);
				nodeE2.add(i, i*2);
				nodeE3.add(i, (i*2)+1);
				nodeE4.add(i, (int)Math.ceil(Math.random()*(100)));
			}

			else
			{
				//Odd
				nodeE1.add(i, (i-1)/2);
				nodeE2.add(i, i*2);
				nodeE3.add(i, (i*2)+1);
				nodeE4.add(i, (int)Math.ceil(Math.random()*(100)));
			}
		}
		
		for(int i=0;i<nodeE4.size();i++)
		{
			if(nodeE4.get(i) > storeValueMax[4])
			{
				storeValueMax[0] = i;
				storeValueMax[1] = nodeE1.get(i);
				storeValueMax[2] = nodeE2.get(i);
				storeValueMax[3] = nodeE3.get(i);
				storeValueMax[4] = nodeE4.get(i);
			}
			
			if(nodeE4.get(i) < storeValueMin[4] | storeValueMin[4] == 0)
			{
				storeValueMin[0] = i;
				storeValueMin[1] = nodeE1.get(i);
				storeValueMin[2] = nodeE2.get(i);
				storeValueMin[3] = nodeE3.get(i);
				storeValueMin[4] = nodeE4.get(i);
			}
		}

		System.out.println("Node: :"+storeValueMax[0]+" MaxVal :"+storeValueMax[4]);
		System.out.println("Node: :"+storeValueMin[0]+" MinVal :"+storeValueMin[4]);
		System.out.println(nodeE4);
	}
}