class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        boolean ans=false;
        while(start<=end){
            int mid = start + (end - start) / 2;
            // int squared=mid*mid;
            long squared = (long)mid * mid; 
            if(squared==num){
                ans=true;
                break;
            }else if(squared<num){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(16)); // Output: true
    }
}

