/*Example:
Input: ‘N’ = 3

Output: 

1         1
1 2     2 1
1 2 3 3 2 1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1         1
1 2     2 1
1 2 3 3 2 1
Sample Input 2 :
4
Sample Output 2 :
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
Sample Input 3 :
7
Sample Output 3 :
1                         1
1 2                     2 1
1 2 3                 3 2 1
1 2 3 4             4 3 2 1
1 2 3 4 5         5 4 3 2 1
1 2 3 4 5 6     6 5 4 3 2 1
1 2 3 4 5 6 7 7 6 5 4 3 2 1  
 */

public class NumberCrown 
{
  public static void numberCrown(int n) 
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for(int k = 1; k <= n-i; k++)
            {
                System.out.print("  ");
            }
            for(int l = i; l >= 1; l--)
            {
                System.out.print(l+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
      numberCrown(3);
    }
}
