package FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void Write(File file, String write) throws IOException{
		   BufferedWriter output = null;
		   output = new BufferedWriter(new FileWriter(file));
		   output.write(write);
		   output.close();
		  }
	}
  