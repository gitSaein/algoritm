package algoritm.basic;

public class Cardinal {
	
	//x를 r진수로 d에 넣어주고, 자릿 수 반
	static int cardConvR(int x, int r, char[] d) {
		int digit = 0;
		String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digit++] = dChar.charAt(x%r);
			x /= r;
			
		}while(x/r != 0);
		
		return digit;
	}

	 public static void main(final String[] args) {
	        System.out.println(cardConvR(259,16,new char[10]));
	    }
}
