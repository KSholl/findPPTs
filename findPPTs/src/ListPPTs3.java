public class ListPPTs3 {
	public static void main(String[] args){
		WriteToFile out = new WriteToFile(); //Separate code that writes to file
		String PPTs = "";
		for(int s = 3; s < 1000; s+=2){
			for(int t = 3; t < 1000; t+=2){ //Run through all s, t from 3 to 21
				System.out.println("" + s + " " + t);
				if(s>t && gcd(s,t) == 1){
					if(PPTs.contains("=" + ((s * s + t * t) / 2))){
						int i = PPTs.indexOf("=" + ((s * s + t * t) / 2));
						if(PPTs.substring(i+1).contains("=" + ((s * s + t * t) / 2))){
							int j = PPTs.substring(i+1).indexOf("=" + ((s*s + t*t)/2));
							if(PPTs.substring(i+j+2).contains("=" + ((s * s + t * t) / 2))){
								int k = PPTs.substring(i+2+j).indexOf("=" + ((s*s + t*t)/2));
								if(PPTs.substring(i+j+k+3).contains("=" + ((s * s + t * t) / 2))){
									int l = PPTs.substring(i+3+j+k).indexOf("=" + ((s*s + t*t)/2));
									if(PPTs.substring(i+j+k+4+l).contains("=" + ((s * s + t * t) / 2))){
										int m = PPTs.substring(i+4+j+k+l).indexOf("=" + ((s*s + t*t)/2));
										out.write(PPTs.substring(i - 7, i + 5));
										out.write(PPTs.substring(i+ j - 6,  i + j + 6));
										out.write(PPTs.substring(i+ j + k - 5,  i + j + k + 7));
										out.write(PPTs.substring(i+ j + k + l - 4,  i + j + k + l + 8));
										out.write(PPTs.substring(i+ j + k + l + m - 3,  i + j + k + l + m + 9));
										out.write(("" + s + "+" + t + "=" + ((s * s + t * t) / 2) + "."));
									}
								}
							}
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
