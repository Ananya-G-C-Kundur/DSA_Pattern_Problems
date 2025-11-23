// Leet code problem 2824

import java.util.Collections;
import java.util.List;

public class Count_Pairs_whose_sum_is_less_than_target {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int i = 0;
        int j = nums.size() - 1;

        int count = 0;

        while (i < j)
        {
            int sum = nums.get(i) + nums.get(j);

            if (sum < target)
            {
                count = count + (j - i);
                i = i + 1;
            }
            else
            {
                j = j - 1;
            }
        }
        return count;
    }
}
