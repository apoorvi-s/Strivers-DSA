/* n = 3
C
C B
C B A
*/

public class Solution 
{
    public static void alphaTriangle(int n) 
    {
        for(int i = 1; i <= n; i++)
        {
            char start = (char)('A' + n - 1);
            for(int j = 1; j <= i; j++)
            System.out.print(start--+" ");
            System.out.println();
        }
    }
}
