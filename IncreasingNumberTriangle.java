/*Input: ‘N’ = 3

Output: 

1
2 3
4 5 6 */
public class IncreasingNumberTriangle 
{
  public static void nNumberTriangle(int n) 
  {
    // Write your code here
    int start = 1;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print(start++ +" ");
        }
        System.out.print("\n");
    }
  }
  public static void main(String[] args) 
  {
    nNumberTriangle(3);
  }
}
