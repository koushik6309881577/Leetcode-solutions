
class Solution {
    public int minEatingSpeed(int[] piles, int k) {
        int l = 1;
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int h = max;
        int f = max;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int val = func(mid, piles);

            if (val <= k) {
                f = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return f;
    }

    static int func(int mid, int[] piles) {
        int ans = 0;
for(int i=0;i<piles.length;i++)
       ans += Math.ceil((double) piles[i] / mid);

        return ans;
    }
}
