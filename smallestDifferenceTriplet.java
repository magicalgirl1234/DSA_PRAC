class Solution {
    int[] smallestDifferenceTriplet(int arr1[], int arr2[], int arr3[]){
       Arrays.sort(arr1);
Arrays.sort(arr2);
Arrays.sort(arr3);

       int i =0;
       int j =0;
       int k =0;
       int dif =0;
       int mini=0;
       int maxi=0;
       int res1=0;
       int res2=0;
       int res3=0;
       int minDif =Integer.MAX_VALUE;
       int n = arr1.length;
       while(i < arr1.length && j < arr2.length && k < arr3.length)
       {
           mini = Math.min(arr1[i] , Math.min(arr2[j] , arr3[k]));
           maxi = Math.max(arr1[i] , Math.max(arr2[j] , arr3[k]));
           
           dif = maxi - mini;
           
           if( dif < minDif )
           {
               minDif = dif;
               res1= arr1[i];
               res2= arr2[j];
               res3= arr3[k];
               
           }
           
           if(mini == arr1[i])
           {
               i++;
               
           }
          else if(mini==arr2[j]){ 
             j++;
             
         }
         else if(mini==arr3[k]) {
             k++;
             
         }
       }
       int[] ans = new int[]{res1, res2, res3};
        Arrays.sort(ans);
        return new int[]{ans[2], ans[1], ans[0]};
      
        
    }
}
