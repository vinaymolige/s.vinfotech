
public class SortingArray {
public static void main(String args[])
{
	int array[] = {15,5,10};
	System.out.println("After Sorting: ");
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[j] < array[i]) {
				int temp = 0;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		System.out.println(array[i]);
	}

}
}
