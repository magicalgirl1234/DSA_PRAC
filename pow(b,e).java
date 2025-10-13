class Solution {
    double power(double b, int e) {
       
      double  res = 1.0;
       long pow = Math.abs((long)e);
       
       while(pow >0)
       {
           if(pow%2==0)
           {
               b = b * b;
               pow /= 2;
           }
           else
           {
               res *= b ;
               pow--;
           }
       }
       
       if(e<0)
       {
           return 1.0/res;
       }
       return res;
       
        
    }
}
