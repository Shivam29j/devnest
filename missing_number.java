static int solve(int n, int[] arr){
int a=0;
Arrays.sort(arr);
for(int i=0;i<n;i++){
    if(arr[i]!=a){
        return a;
    }
    else{
        a++;
    }
}
    return n;

}