package HashMap;
import java.util.Arrays;
import java.util.HashMap;
class Solution{
    public int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0],0);
        int index1 = 0,index2 = 0;

       for (int i=1; i < nums.length; i++){
           if (hm.containsKey(target - nums[i])){
               index1 = hm.get(target - nums[i]);
               index2 = i;
               break;
           }
           hm.put(nums[i],i);
       }
        int[] arr = {index1,index2};
        return arr;
    }



}




public class hashMap extends Solution {
    public static void main(String[] args) {
   int[] s = {160,150,142,50,88,3,45,68};
   int value = 200;
   Solution solution = new Solution();
   int[] a = solution.twoSum(s,value);
   System.out.println(Arrays.toString(a));


    }




}

