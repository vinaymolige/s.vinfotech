package Array;
public class DuplicateElement {
	 public static void main(String[] args) 
	    {
	        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
	 
	        int count = 0;
			for (int i = 0; i < my_array.length-1; i++)
	        {
	        	count++;
	            for (int j = i+1; j < my_array.length; j++)
	            {count++;
	                if ((my_array[i] == my_array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my_array[j]);
	                }
	            }
	        }
	   System.out.println(count);
	    }    
	}


