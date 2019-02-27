package Algorithm.Test;

import Algorithm.Sort;

public class TestSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
	  int i=0;
	  int[] a = {2, 3, 4};
        a[0]=3;
        Sort.merge(arr);
	  i++;
	  i--;
	//start
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	//End
    }
}
