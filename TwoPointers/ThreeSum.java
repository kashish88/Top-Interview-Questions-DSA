public class ThreeSum {
    public int threeSumClosest(int[] A, int B) {
        int diff = Integer.MAX_VALUE, sz = A.length;
   Arrays.sort(A);
   for (int i = 0; i < sz && diff != 0; ++i) {
       int lo = i + 1, hi = sz - 1;
       while (lo < hi) {
           int sum = nums[i] + nums[lo] + nums[hi];
           if (Math.abs(B - sum) < Math.abs(diff))
               diff = B - sum;
           if (sum < target)
               ++lo;
           else
               --hi;
       }
   }
   return B - diff;
   }
}
