import java.io.*;

public class WriteToFile {
	
	BufferedWriter out;
		
	public WriteToFile(){
		try{
			out = new BufferedWriter(new FileWriter("output.txt"));
		}catch(IOException e){}
	}
	
	public void write(String text){
		try{
			out.write(text + "\n");
			out.newLine();
		}catch(IOException e){}
	}
	
	public void end(){
		try{
			out.close();
		}catch(IOException e){}
	}
}
