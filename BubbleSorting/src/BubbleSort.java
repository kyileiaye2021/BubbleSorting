
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		//getting user input for array 
		Scanner s = new Scanner(System.in);
		System.out.print("How many numbers do u wanna put?: ");
		int n = s.nextInt();
        int array[] = new int[n];
        
        for(int a = 0; a < n; a++) {
        	System.out.print( "array[" + a + "]: ");
        	int num = s.nextInt();
        	array[a] = num;
        }
        
        System.out.println();
        
    //calling the method of ordered array
	bubble(array);
	
	System.out.println();
	
	//calling the print method to print the ordered array
	print(array);
	}
	
	
    public static void bubble(int arr[]) {
		
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
				
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				
			}
		
		}System.out.println(arr[i]);	
		
		}
	 	System.out.println("finish");
	 	
}
    //output the numbers in array in ascending order
	public static void print(int arr[])
	{
		
		for (int i= 0; i< arr.length; i++)
		{
			
			System.out.println("array[" + i + "]: " + arr[i]);
			
		}
		
	}
	
}