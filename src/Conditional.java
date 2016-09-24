class Conditional{
    public static void main(String[] args)
    {
        System.out.print(2+", ");
        for (int j = 3; j < 1000; j++)
        {
            if (j%2 == 1)
            {
                boolean isPrime = true;
                for (int k = j-1 ; k>= 2 ; k = k - 1)
                {
                    if (j % k == 0)
                    {
                        isPrime = false;
                    }
                }
                if (isPrime == true)
                {
                    System.out.print(j + ", ");
                }
            }
        }
    }
}