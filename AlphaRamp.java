/*
Example:
Input: ‘N’ = 3

Output: 
A
B B
C C C
*/
public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        char start = 'A';
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(start +" ");
            }
            System.out.print("\n");
            start++;
        }
    }
}
