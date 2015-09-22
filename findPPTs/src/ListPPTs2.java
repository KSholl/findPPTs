public class ListPPTs2 {
	public static void main(String[] args){
		boolean searching = true;
		for(int s = 10001; s < 20000; s+=2){
			for(int t = 10001; t < 20000; t+=2){ //Run through all s, t from 3 to 21
				if(s>t && gcd(s,t) == 1 && searching){
					if(s*t+2 == (s*s+t*t)/2){
						System.out.println(""+s+","+t+","+(s*s+t*t)/2);
					}
				}
			}	
		}
	}
	
	private static int gcd(int a, int b){
		int t;
		while(b != 0){
			t = a;
			a = b;
			b = t%b;
		}
		return a;
	}
}
