class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int n=nums.length;
        List<Integer>g=new ArrayList<>();
        for(int i=0;i<n;i++){
            int product =1;
            for(int j=0;j<n;j++){
                if (i != j) {
                    product *= nums[j];
                }
            }
            g.add(product);
        }
        for (int i = 0; i < n; i++) arr[i] = g.get(i);
        return arr;
    }
}