package com.javapros.classeight.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {

	public static void main(String[] args) {
		String path = "/Users/p2799013/Desktop/sampleWrite.txt";
		String data = "My simple write line one using files";
		//usingOutputStream(path, data);
		usingFiles(path, data);
	}

	static void usingOutputStream(String path, String data) {
		File file = null;
		OutputStream os = null;
		try {
			file = new File(path);
			os = new FileOutputStream(file);	
			os.write(data.getBytes());
			System.out.println("DOne writing");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//Try using buffered writer().
	//using file Writes
	
	static void usingFiles(String path, String data) {
		try {
			Path paths = Paths.get(path);
			Files.write(paths, data.getBytes());
			System.out.println("Done writing using files");
		}catch(Exception e) {
			
		}
	}
}
