static int solve(int n, int[] prices){
int min =prices[0];
int maxProfit=0;
for(int i=0;i<prices.length;i++){
    min=Math.min(min,prices[i]);
    int profit=prices[i]-min;
    maxProfit=Math.max(maxProfit,profit);
}
return maxProfit;

}