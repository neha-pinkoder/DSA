import java.util.Arrays;

public class productOfArrayExceptSelf {

  public static void main(String[] args) {
    int[] nums = { -1, 1 };
    int prod = 1;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i > j) {
          prod *= (nums[j] % 10);
        } else if (i != j) {
          prod *= nums[j];
        }
      }
      if ((nums[i] > 0 && prod < 0) || (nums[i] < 0 && prod > 0)) {
        if (prod < 0) {
          nums[i] -= (prod * 10);
        } else {
          nums[i] += (prod * 10);
        }
        nums[i] /= -10;
      } else {
        nums[i] += (prod * 10);
        nums[i] /= 10;
      }
      prod = 1;
    }
    // for (int i = 0; i < nums.length; i++) {
    //   if (nums[i] < 0 || prod < 0) {
    //     nums[i] /= -10;
    //   } else nums[i] /= 10;
    // }
    System.out.println(Arrays.toString(nums));
  }
}
// public int[] productExceptSelf(int[] nums) {
//     // first step is to calculate froduct of all non zero integers in the array
//     // also calculate frequency of zeroes in the array.
//             int allProduct = 1;
//             int flag = 0;
//             for(int i : nums){
//                 if(i == 0){
//                     flag++;
//                     continue;
//                 }
//                 allProduct *= i;
//             }
//             // if number of zeroes is more than 1, than for each elemrnt there will be an extra zero to make product of other non zero elements equal to zero.
//             // if zero appears only once, then for all the elements except that zero product of all alements will become zero.
//             // if all elements are non zero in the array, than product of all elements will be non-zero and every element will get a non-zero value after the calculations are over.
//             for(int i = 0; i < nums.length; i++){
//                 if(flag == 0){
//                     nums[i] = allProduct/nums[i];
//                 }else if(flag == 1){
//                     nums[i] = nums[i] != 0 ? 0 : allProduct;
//                 }else{
//                     nums[i] = 0;
//                 }
//             }
//             return nums;
//         }
