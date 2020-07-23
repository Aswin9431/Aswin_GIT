import java.util.*;

public class ArrayRotation {
	public static void rotation(int[] array, int n, int d){
		for(int i = 0; i < d; i++){
			rotationByOne(array, n);
		}
	}
	
	public static void rotationByOne(int[] array, int n){
		int temp = array[0];
		for(int i = 0; i < n-1; i++){
			array[i] = array[i+1];
		}
		array[n-1] = temp;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		int d;
		System.out.println("Enter no of elements:");
		n = sc.nextInt();
		System.out.println("Enter no of LeftRotations:");
		d = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter array of elements");
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		rotation(array, n, d);
		for(int i = 0; i < n; i++){
			System.out.print(array[i]+" ");
		}
	}

}
