class Solution {
    public double myPow(double x, int n) {
       double ans = 1;
       long N = n ;
      
       
       if(N < 0 ){
        x = 1/x ;
       
        N*=-1;
       }
       long  sqr = (long)Math.sqrt(N);
       for(int i = 1 ; i <=sqr ; i++){
         ans*=x;
       }
       double  m = ans ;
       for(int i = 1 ; i < sqr ; i++){
         ans*=m;
       }
       long  rem =   N - (sqr*sqr);
       for(int i = 1 ; i <= rem ; i++){
         ans*=x;
       }
      
        return ans ;
       
        
    }
    
}