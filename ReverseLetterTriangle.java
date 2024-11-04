/*
Example:
Input: ‘N’ = 3

Output: 

A B C
A B
A
*/

public class Solution 
{
    public static void nLetterTriangle(int n) 
  {
        // Write your code here
        for(int i = n; i >= 1; i--)
        {
            char start = 'A';
            for(int j = 1; j <= i; j++)
            {
                System.out.print(start++ +" ");
            }
            System.out.print("\n");
        }
    }
}
