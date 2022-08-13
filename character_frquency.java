static int[] solve(String str1){
    LinkedHashMap<Character,Integer>hm=new LinkedHashMap<>();
    for(int i=0;i<str1.length();i++){
    if(hm.containsKey(str1.charAt(i)))
    hm.put(str1.charAt(i),hm.get(str1.charAt(i))+1);
    else
    hm.put(str1.charAt(i),1);
}
int[] ans=new int[hm.size()];
int i=0;
for(var v:hm.values())
ans[i++]=v;
return ans;
}