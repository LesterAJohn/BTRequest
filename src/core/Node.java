package core;

import java.util.ArrayList;

public class Node
{
	public static int nodeArray (int nodeNum)
	{
		int[] storeValueMax = {0,0,0,0,0};
		int[] storeValueMin = {0,0,0,0,0};
		
		ArrayList<Integer> nodeParent = new ArrayList<Integer>();
		ArrayList<Integer> nodeC1 = new ArrayList<Integer>();
		ArrayList<Integer> nodeC2 = new ArrayList<Integer>();
		ArrayList<Integer> nodeValue = new ArrayList<Integer>();
		
		for(int i=0;i<nodeNum;i++)
		{
			if((i%2)==0)
			{
				//even Nodes Generator
				nodeParent.add(i, i/2);
				nodeC1.add(i, i*2);
				nodeC2.add(i, (i*2)+1);
				nodeValue.add(i, (int)Math.ceil(Math.random()*(100)));
			}

			else
			{
				//odd Nodes Generator
				nodeParent.add(i, (i-1)/2);
				nodeC1.add(i, i*2);
				nodeC2.add(i, (i*2)+1);
				nodeValue.add(i, (int)Math.ceil(Math.random()*(100)));
			}
		}
		
		for(int i=0;i<nodeValue.size();i++)
		{
			if(nodeValue.get(i) > storeValueMax[4])
			{
				storeValueMax[0] = i;
				storeValueMax[1] = nodeParent.get(i);
				storeValueMax[2] = nodeC1.get(i);
				storeValueMax[3] = nodeC2.get(i);
				storeValueMax[4] = nodeValue.get(i);
			}
			
			if(nodeValue.get(i) < storeValueMin[4] | storeValueMin[4] == 0)
			{
				storeValueMin[0] = i;
				storeValueMin[1] = nodeParent.get(i);
				storeValueMin[2] = nodeC1.get(i);
				storeValueMin[3] = nodeC2.get(i);
				storeValueMin[4] = nodeValue.get(i);
			}
		}

		System.out.println("Node: :"+storeValueMax[0]+" MaxVal :"+storeValueMax[4]);
		System.out.println("Node: :"+storeValueMin[0]+" MinVal :"+storeValueMin[4]);
		System.out.println(nodeValue);
		return(0);
	}
}