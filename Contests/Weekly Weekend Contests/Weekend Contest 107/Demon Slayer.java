public class Solution {
    static int demonSlayer(int n, int a, int b, int[] x, int[] y) {
        // Write your code here.
        int verticalCount = 0;
        int horizontalCount= 0;
        for(int i=0; i<n; i++){
            
            if(x[i] == a){
                horizontalCount++;   
            }
            if(y[i] == b){
                verticalCount++;
            }
        }
        return Math.max(horizontalCount, verticalCount);
    }
}