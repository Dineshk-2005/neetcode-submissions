class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean s=false;
        Map<Integer,Integer>f=new HashMap<>();
        for(int x:nums){
            f.put(x,f.getOrDefault(x,0)+1);
        }
        for(int t:nums){
            if(f.get(t)>1){
                s=true;
              break;
            }
        }
        return s;
    }

}