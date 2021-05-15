class MaximunSubArrayByMergeSort {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int Sub = new MaximunSubArrayByMergeSort().maxSubArray(nums);
        System.out.println(Sub);
        }

    public class Status {
        public int lSum, rSum, mSum, iSum;

        public Status (int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }

    public int maxSubArray (int[] nums) {
        return getInfo(nums, 0, nums.length - 1).mSum;
    }

    public Status getInfo(int[] nums, int l, int r) {
        if (l == r) return new Status(nums[l], nums[l], nums[l], nums[l]);

        int mid = (l + r) >> 1;

        Status lSub = getInfo(nums, l, mid);
        Status rSub = getInfo(nums, mid + 1, r);
        return pushUp(lSub, rSub);
    }

    public Status pushUp(Status l, Status r) {
        int iSum = l.iSum + r.iSum;
        int lSum = Math.max(l.lSum, l.iSum + r.lSum);
        int rSum = Math.max(r.rSum, r.iSum + l.rSum);
        int mSum = Math.max(Math.max(l.mSum, r.mSum), r.lSum + l.rSum);
        return new Status(lSum, rSum, mSum, iSum);
    }
}