package Array;

public class Sorting {
public static void main(String args[]) {
	int temp=0;
	int[] array= {10,8,9,7,6,5,4,3,2,1};
	for(int i = 0; i<array.length;i++) {
		for(int j=i; j<array.length;j++) {
			System.out.println(i+" "+j);
			System.out.println(" "+array[i]+" "+array[j]);
			System.out.println(array[i]>array[j]);
			if (array[i]>array[j]) {
				System.out.println(array[i]>array[j]);
				
				temp= array[i];
				array[i]=array[j];
				array[j]=temp; 
			}
		}

	}
	for (int k=0;k<array.length;k++) {
		System.out.println(array[k]);
	}
}
}
