package com.capgemini.exception.first;

import java.io.File;
import java.io.IOException;

public class Bottle
{
	void open() throws IOException
	{
		File f = new File("komal.txt");
		f.createNewFile();
	}
}
