package com.javapros.classeight.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		
		String path  = "/Users/p2799013/Desktop/sample.txt";
		readUsingInoutStream(path);
		readUsingFileReader(path);
		usingBuffereReader(path);
		readAllLine(path);
		
	}
	
	static void readUsingInoutStream(String path) {
		
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		try {
			char[] cbuf = new char[2400];
			File file = new File(path);
			fileInputStream = new FileInputStream(file);
			inputStreamReader = new InputStreamReader(fileInputStream);
			
			try {
				while((inputStreamReader.read(cbuf, 0, 200)) != -1) {
					System.out.println(cbuf);	
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static void readUsingFileReader(String path) {
		File file = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			String line = "";
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			try {
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	static void usingBuffereReader(String path) {
			
		Path paths = null;
		BufferedReader br = null;
		try {
			String line = "";
			paths = Paths.get(path);
			br = Files.newBufferedReader(paths);
			try {
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {	
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		
	}
	
	static void readAllLine(String path ) {
		
		Path paths = Paths.get(path);
		try {
			List<String> lines = Files.readAllLines(paths);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
