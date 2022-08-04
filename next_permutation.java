static int[] solve(int n, int[] nums){
    int i =nums.length-2;
    while(nums[i]>=nums[i+1]){
        i--;
    }
    int j=nums.length-1;
    while(nums[j]<=nums[i])
    j--;
    swap(nums,i,j);
    reverse(nums,i+1);
    return nums;
}
static void swap(int nums[],int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
static void reverse(int nums[],int start){
    int end=nums.length-1;
    while(start<end){
        swap(nums,start,end);
        start++;
        end--;
    }
}