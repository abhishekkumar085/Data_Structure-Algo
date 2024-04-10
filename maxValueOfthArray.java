public class maxValueOfthArray {
      public static void main(String[] args) {
        int arr[]={2,3,5,10,45,3,60};
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}

