class Conditional{
    public static void main(String[] args)
    {
        System.out.print(2);
        for (int i = 3; i < 1000; i++)
        {
            if (i%2 == 1)
            {
                boolean isPrime = true;
                for (int k = i-1 ; k>= 2 ; k = k - 1)
                {
                    if (i % k == 0)
                    {
                        isPrime = false;
                    }
                }
                if (isPrime == true)
                {
                    System.out.println(i);
                }
            }
        }
    }
}