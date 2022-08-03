static int[] solve(int n, int[] arr){
//CODE HERE 
Set<Integer> s=new LinkedHashSet<>();
for(int i=0;i<n;i++){
    s.add(arr[i]);
}
    int i=0;
    int[] arr1=new int[s.size()];
    for(int x:s)
    arr1[i]=x;
    return arr1;

}