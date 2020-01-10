package comm.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderWriter {
	public static void main(String[]args) throws IOException
	{
		File inputFile=null;
		File outputFile=null;
		FileInputStream in=null;
		FileOutputStream out=null;
		try
		{
		 inputFile=new File("farrago.txt");
		 outputFile=new File("outgain.txt");
		 
		 in=new FileInputStream(inputFile);
		 out=new FileOutputStream(outputFile);
		int c;
		while((c=in.read())!=-1)
		{
			System.out.println((char)c);
			out.write(c);
		}
		System.out.println("input stream is used to read a file and output stream is used to write a file");
	}
		finally
		{
			in.close();
			out.close();
		}

}
}
