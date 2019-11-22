package com.capgemini.exception.first;

import java.io.File;                                //checked exception example
import java.io.IOException;

public class FileIO 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("vikas.txt");
		f.createNewFile();
		
	}
}
