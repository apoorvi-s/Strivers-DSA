public class BinaryNumberTree 
{
  public static void nBinaryTriangle(int n) 
    {
        int first = 1;
        for(int i = 1; i <= n; i++)
        {
            first = (i%2==0) ? 0 : 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(first+" ");
                first = (first==1) ? 0 : 1;
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) 
    {
      nBinaryTriangle(3);
    }
}
