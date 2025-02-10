package ArrayProblem;

public class TrappedRainWater{
    public static int trappedRainWater(int height[]){
        int n=height.length;

        // calculate left max boundary

        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        // calculate right max boundary

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        // after that we have to run a loop

        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
        // waterLevel=min(leftMax,rightMax)
        // trappedWater=waterLevel-height[i]

        // 

    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}