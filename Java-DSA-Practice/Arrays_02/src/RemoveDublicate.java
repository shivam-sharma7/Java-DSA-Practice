import java.util.*;
public class RemoveDublicate {

    public static void main(String[] args) {

        int [] arr = {1, 1, 2};

        int ans = dublicate(arr);

        System.out.println(ans);

    }

    static int dublicate(int [] arr){

        int Index = 1;

        for(int i = 1; i< arr.length; i++){

            if(arr[i-1] != arr[i]){

                arr[Index] = arr[i];
                Index++;
            }
        }

        return Index;
    }
}
