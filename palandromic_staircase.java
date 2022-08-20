static String[] solve(int n){
StringBuilder s=new StringBuilder("1");
String[] ans=new String[n];
ans[0]=s.toString();
for(int i=1,size=1;i<n;i++,size+=2){
    int v=(int)Math.ceil(size*1.0/2);
    String p=(i+1)+""+ans[i-1].charAt(v-1);
    s.insert(v,p);
    ans[i]=s.toString();
}
return ans;
}