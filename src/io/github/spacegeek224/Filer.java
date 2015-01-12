package io.github.spacegeek224;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filer {
	public static void write(String s, String files) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(files)); //you don't need to create a File object, FileWriter takes a string for the filepath as well
			writer.write(s); 
			writer.close();//for a new line in the file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String read(String file) {
		String line = null;
		try {
			File f = new File(file);
			FileReader fr = new FileReader(f);
			BufferedReader br  = new BufferedReader(fr);

			@SuppressWarnings("unused")
			String s = null;

			while ((br.readLine())!=null) {

				line = br.readLine();

			}

			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;		
	}
}
