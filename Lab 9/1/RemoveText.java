package package9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class RemoveText {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();	

	}
	
	private static void createFileUsingFileClass() throws IOException{
		
		String delete = "Liam"; // this is the string that will be deleted
		File file = new File("d://testFile12_11.txt"); // creates file in the D drive
		File temp = File.createTempFile("file", ".txt", file.getParentFile()); // for creating a temporary file to write the original file with deleted string
		
		// Write content in original file
		FileWriter writer1 = new FileWriter(file);
			writer1.write("java Exercise12_11 Liam filename");
			writer1.close(); // ends writer1
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file))); // checks for the string
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temp))); // rewrites string in temporary file
		
		/* This takes the string and deletes the string that was assigned in delete */
		for (String line; (line = reader.readLine()) != null;) {
			line = line.replace(delete, "");
			writer.println(line);
		}
		
		reader.close(); // ends reader
		writer.close(); // ends writer

		file.delete(); // deletes original file
		 
		temp.renameTo(file); // renames the temporary file as the original file name, replacing it		
		
		// File should read: java Exercise12_11  filename
	
	}

}
