package package9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class CountFile {

	//java exercise number 12.13
	public static void main(String[] args) throws Exception {
		
		//need integers for number of words, lines and characters
		int line = 0;
		int word = 0;
		int character = 0;
		
		File file = new File("d://testFile12_13.txt"); // creates a file to read
		
		
				// Write content in original file
				java.io.PrintWriter output = new java.io.PrintWriter(file);
				output.println("java exercise Liam Ollive");
				output.println("Software Development One");
				output.close();
		
		
		BufferedReader reader = new BufferedReader(new FileReader(file)); // reads the file
		
		/* loop for finding the number of characters, words and lines */
		while(reader.ready()) {
		
		// finds number on lines
		String currentLine = reader.readLine(); // finds number on lines
		line++;
		// finds number of words
		String[] words = currentLine.split(" "); // words are defined as being separated by a blank space
		word = word + words.length;				
		
		// finds number of characters
		for (String w : words)
			{
		       character = character + w.length();
			}
		
		}
		reader.close(); // ends reader

		// prints results
		System.out.println("number of lines " + line);
		System.out.println("number of words " + word);
		System.out.println("number of characters " + character);
		
		
		
	}

}
