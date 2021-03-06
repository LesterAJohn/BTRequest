package core;

public class Main {
	private static int rc;

	public static void main (String [] arg) {
		
		//Array duplicate removal function; while keeping position consistency
		//Will remove duplicate int numbers next to each other
		//Alter array below to adjust output
		
		try{
		int[] nArray = {1,1,1,2,1,2,3,3,8,9,12,4,5,6,7,7};
		rc = pArray.arrayValue(nArray);
		}
		finally{if(rc!=0)BS();}
		
		//Mathematically Computes Nodes with 2 Children Each
		//Provides Node with Maximum and Minimum Values
		//Working on in memory and disk storage for node structure
		//Adjust numbers below to define number of nodes created
		
		try {
		rc = Node.nodeArray(50);
		}
		finally {if(rc!=0) BS();}
	}

	private static void BS() {
		System.out.print("Charlie Brown");
		
	}
	
}