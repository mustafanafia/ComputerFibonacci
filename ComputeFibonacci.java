public class ComputeFibonacci {
  /** Main method */
  public static void main(String[] args) {
    
      System.out.println("THE ANSWER IS: " + factorial(6));
      System.out.println("THE ANSWER IS: " + fib(5));
      System.out.println("THE ANSWER IS: " + thiss(4));
      System.out.println("THE ANSWER IS: " + that(85));
      System.out.println("THE ANSWER IS: " + power(2,2));
      System.out.println("THE ANSWER IS: " + digitsum(912));

      
  }

  

  public static long fib(long index) {
      
      System.out.println("index method:" + index);
      
    if (index == 0) // Base case
      return 0;
    else if (index == 1) // Base case
      return 1;
    else  // Reduction and recursive calls
      return fib(index - 1) + fib(index - 2);
  }
  
  
  public static long factorial(int n) {
      System.out.println("factorial method:("+n+")");
      
    if (n == 0) // Base case
      return 1;
    else
      return n * factorial(n - 1);
    }// Recursive call


   public static int that(int N){
    
    System.out.println("that method:("+N+")");
    int result = 0;
    if(N!=0)
    result = that(N/10)+(N%10);
    return result;

   }

   public static int thiss(int n){
     System.out.println("thiss method("+n+")");
     if(n==0)
     return 5;
     else
     return n+thiss(n-1);
    }
    
     public static int power(int base, int powerRaised) {
         System.out.println("Power method:("+powerRaised+")");
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
      }
    
    
    static int digitsum(int n) 
    {  
        System.out.println("sum of digits: " + n);
        if (n == 0) 
            return 0; 
        return (n % 10 + digitsum(n / 10)); 
    } 
    
    private static int count8(int n, boolean eight) {
  if (n <= 0)
    return 0;
  else if (n % 10 == 8)
    return 1 + (eight ? 1 : 0) + count8(n / 10, true);
  else
    return count8(n / 10, false);
}
}






