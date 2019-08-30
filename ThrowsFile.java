package corejava;

import java.io.FileWriter;

public class ThrowsFile {
	public static void main(String[] args) throws IOException{
		FileWriter file=new FileWriter("d:\\Data1.txt");
		file.write("Java 9");
		file.close();
	}

}
