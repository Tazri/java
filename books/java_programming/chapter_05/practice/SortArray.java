package practice;

import java.util.Arrays;

public class SortArray {
    static void sortArray(int arr[]){
        if(arr == null){
            System.out.println("> error : called sort array with null.");
        }

        for(int i = 0;i < arr.length;i++){
            int select = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] < arr[select]) select = j;
            }

            // swaping
            int temp = arr[select];
            arr[select] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {3,4,56,7,8,9,3,2};

        System.out.println("> Array before sorting : ");
        System.out.println(Arrays.toString(arr));

        sortArray(arr);

        System.out.println("> Array After sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}

/*
Output : 
> Array before sorting : 
[3, 4, 56, 7, 8, 9, 3, 2]
> Array After sorting : 
[2, 3, 3, 4, 7, 8, 9, 56]
*/