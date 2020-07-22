package recursionPractice;

public class RecursionPractice {
	
	//f(f(f(f(x))))
	//x = 20
	//f(x)= 5 + x
	//f(f(f(f(5 + 20))))
	//f(f(f(f(25))))
	//f(f(f(5+25))) = f(f(f(30)))
	//f(f(5+30)) = f(f(35))
	//f(5+35) = 40
	
	//summation using recursion
	//summation(5)= 5+4+3+2+1 =15	
	

	
	public static int summation(int n) {
		
		//base case
		if (n <= 0) { 
			return 0;//additive identity //note this is being returned to the 
			//...calculation not to the place where summation was originally called (ie/ it
			//... returning the zero as the final part of the calculation --> 3+2+1+ZERO
			//... so now we can do the calculation as no more functions are being called
			//... we have all numbers and can do the calculation.
		//recursive case
		}else {
			return n + summation(n-1);
		}
	}
	
	//example
	//summmation(3)
	//return n+summation(n-1)
	//return 3+summation(3-1)= 3+summation(2)
	//return 3+(2+summation(2-1)) = 3+(2+summation(1))
	//return 3+(2+(1+summation(1-1))) = 3+(2+(1+summation(0)))
	//summation(0)--> if (n <= 0) return 0-->down to base case or final stage--> returning  
	//...zero to the calculation (instead of returning another summation), so we can now 
	//...complete the calculation because we have all the numbers (no more summations 
	//...being called)
	//3+(2+(1+(0)))= 6
	
	//5! = 5*4*3*2*1 = 5*(4!) = 5*(4*(3!)) = 5*(4*(3*(2!))) = 5*(4*(3*(2*(1!))))
	public static int factorial(int n) {
		//base case
		if (n <= 1) { 
			return 1; //multiplicative identity
		}else {
			return n * factorial(n-1); 
		}
	}
	
	public static int exponentiation(int n, int p) {
		if (p<= 0) {
			return 1;			
		}else {
			return n * exponentiation(n, p-1);
		}
	}
	
	// Multiply 'n' by 'k' using addition:
	private static int nTimesK(int n, int k) {
	    System.out.println("n: " + n);
	    // Recursive Case
	    if(n > 1) { 
	        return k + nTimesK(n - 1, k);
	    }
	    // Base Case n = 1
	    else { 
	        return k;
	    }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		


	}

}
