package core;

import java.util.Arrays;

public class pArray 
{
public static final String arrayValue = null;

public static void arrayValue(int[] arrayValue) {
	int aZero = 0;
	
	Arrays.sort(arrayValue);
	
	System.out.print("Removal of Duplicates: ");
	
	for (int i = 0; i < arrayValue.length; i++) {
			if (i-1 > -1){
				if (arrayValue[i-1] != arrayValue[i]) {
					System.out.print("," + arrayValue[i]);
					}
				else {
					aZero = aZero+1;
					}
				}
				else {
					System.out.print(arrayValue[i]);
				}
			}
	for (int i = 0; i < aZero; i++) {
		System.out.print(",0");
		}
	System.out.println();
	}
}