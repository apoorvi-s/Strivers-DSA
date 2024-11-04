/*
Input: ‘N’ = 3

Output: 

A
A B
A B C
/*

public class Solution 
{
    public static void nLetterTriangle(int n) 
    {
        for(int i = 1; i <= n; i++)
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
