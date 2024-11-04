/* 
  n= 3
    A
  A B A
A B C B A
*/

public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i = 1; i <= n; i++)
        {
            char p = 'A';
            
            for(int j = n - i; j >= 1; j--)
                System.out.print("  ");

            for(int k = 1; k <= 2 * i - 1; k++)
            {
                if(k<i) System.out.print(p+++" ");
                else if (k==i) System.out.print(p+" ");
                else System.out.print(--p+" ");
            }
            System.out.println();
        }
    }
} 
