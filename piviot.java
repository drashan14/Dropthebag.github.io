// import java.util.ArrayList;
// public class Main
// {
//     public static void main(String[] args) {
//         int arr[]={1,7,3,6,5,6};
//         func(arr);
//     }
//     public static void func(int arr[])
//     {
       
//         for (int i=0;i<arr.length;i++)
//         {
//              ArrayList<Integer>s1=new ArrayList<>();
//             ArrayList<Integer>s2=new ArrayList<>();
//             for (int j=0;j<=i;j++)
//             {
//                 s1.add(arr[j]);
//             }
//             for (int k=i+2;k<arr.length;k++)
//             {
//                   s2.add(arr[k]);
//             }
//             int sum=0;
          
//              for (int l=0;l<s1.size();l++)
//              {
//                      sum=sum+s1.get(l);
                   
//              }
//              int sum2=0;
//             for (int m=0;m<s2.size();m++)
//             {
//                 sum2=sum2+s2.get(m);
              
//              }
            
//          if(sum==sum2)
//              {
//               System.out.println(i+"This is piviot number");
//              }
            
//         }
//       System.out.println(-1);

//     }
// }
import java.util.ArrayList;
class Solution {
    public int pivotIndex(int[] nums) {
       

       
        for (int i=0;i<arr.length;i++)
        {
             ArrayList<Integer>s1=new ArrayList<>();
            ArrayList<Integer>s2=new ArrayList<>();
            for (int j=0;j<=i;j++)
            {
                s1.add(ar[j]);
            }
            for (int k=i+2;k<arr.length;k++)
            {
                  s2.add(arr[k]);
            }
            int sum=0;
          
             for (int l=0;l<s1.size();l++)
             {
                     sum=sum+s1.get(l);
                   
             }
             int sum2=0;
            for (int m=0;m<s2.size();m++)
            {
                sum2=sum2+s2.get(m);
              
             }
            
         if(sum==sum2)
             {
              System.out.println(i+1+"This is piviot number");
             }
            
        }
     return -1;

    }
}