public static int iteration(int n)
{
     int x, y, z;
 
     startTime = System.nanoTime();
     if(n == 0)
          return 0;
     else
     {
  x = 0;
  y = 1;
  for(int i = 0; i <= n; i++)
  {
       z = x + y;
       x = y;
       y = z;
  }
  endTime = System.nanoTime();
          return y;
     }
 
}