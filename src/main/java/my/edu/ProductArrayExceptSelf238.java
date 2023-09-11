package my.edu;

import java.util.Arrays;

public class ProductArrayExceptSelf238 {

    public static void main(String[] args) {
        ProductArrayExceptSelf238 pro = new ProductArrayExceptSelf238();

        int[] array = {1,2,3,4};
        int[] array2 = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(array) + " = " + Arrays.toString(pro.productExceptSelf(array)));
        System.out.println(Arrays.toString(array2) + " = " + Arrays.toString(pro.productExceptSelf(array2)));


    }
    public int[] productExceptSelf(int[] nums) {
        int product = 0;
        int [] prefixProduct = new int[nums.length];
        prefixProduct[0] =1;

        for(int i = 1; i < nums.length; i++){
            prefixProduct[i] =prefixProduct[i - 1] * nums[i-1];
        }
        int suffixProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            prefixProduct[i] = prefixProduct[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return prefixProduct;
    }

    public int[] productExceptSelfDad(int[] nums) {
        int product = 0;
        int [] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    result[i] *= nums[j];
                }
            }
            product *= nums[i];
        }
        System.out.println("product = " + product);
        return result;
    }



}
