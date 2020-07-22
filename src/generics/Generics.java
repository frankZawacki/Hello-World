package generics;

public class Generics {
	
	public static <T extends Comparable <T>> T findMax(T a, T b){
		int n = a.compareTo(b);
		//compareTo returns -1 if a<b, 0 if a=b, 1 if a>b
		//we will just return whichever is greater here 
		//(we could also show equality)
		if (n < 0) {
			return b;
		}else {
			return a;
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(findMax(6, 12));
		
		System.out.println(findMax('f', 'z'));
		
		System.out.println(findMax("frank", "zawacki"));
		
		System.out.println(findMax(0.5, 0.12));
		
		System.out.println(findMax(6, 6));
		
		
	}

}
