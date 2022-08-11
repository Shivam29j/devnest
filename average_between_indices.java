static float solve(int n, int[] arr, int x, int y){
int sum=0;
for(int i=x;i<=y;i++)
sum+=arr[i];
return(float)(sum*1.0/(y-x+1));
}