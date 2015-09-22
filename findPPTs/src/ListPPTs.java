public class ListPPTs {
	public static void main(String[] args){
		WriteToFile out = new WriteToFile(); //Separate code that writes to file
		String PPTs = "";
		for(int s = 3; s < 100; s+=2){
			for(int t = 3; t < 100; t+=2){ //Run through all s, t from 3 to 21
				System.out.println("" + s + " " + t);
				if(s>t && gcd(s,t) == 1){
					if(PPTs.contains("=" + ((s * s + t * t) / 2))){
						int i = PPTs.indexOf("=" + ((s * s + t * t) / 2));
						if(PPTs.substring(i+1).contains("=" + ((s * s + t * t) / 2))){
							int j = PPTs.substring(i+1).indexOf("=" + ((s * s + t * t) / 2));
							out.write(PPTs.substring(i - 5, i + 3));
							out.write(PPTs.substring(i+ j - 4,  i + j + 4));
							out.write(("" + s + "+" + t + "=" + ((s * s + t * t) / 2) + "."));
						}
					}
					PPTs = PPTs + ("" + s + "+" + t + "=" + ((s * s + t * t) / 2) + ".");
				}
			}	
		}
		out.end();
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
