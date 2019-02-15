/**
 * 
 */
package bubbolShort;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 *
 */
public class StartPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		BubbolShort bubbolShort = new BubbolShort();
	
		int n=scanner.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			
			arr[i]=random.nextInt(n);
		
		
		for (int i : arr) 
			System.out.print(i+" ");
		System.out.println();
		
		
		bubbolShort.bubbleShort(arr);
		
		
		
		for (int i : arr) {
			System.out.print(i+" ");
			
			
		}
	}

}
