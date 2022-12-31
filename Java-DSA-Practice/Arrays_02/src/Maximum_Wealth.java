public class Maximum_Wealth {

    public static void main(String[] args) {

        int [][] accounts = {
                {1,2,3},
                {3,2,1},
                {4, 5, 6}
        };

       int ans = maximumWealth(accounts);

        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts){

        int max=0;
        int m=accounts.length;

        int n= accounts[0].length; // mean no. of column
        for(int i=0;i<m;i++){
            int indiv=0;
            for(int j=0;j<n;j++){
                indiv+=accounts[i][j];
            }
            max=Math.max(indiv,max);
        }
        return max;
    }
}
