package comm.example;
import java.io.*;



public class CopyBytes {
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
		int b;
		while((b=in.read())!=-1)
		{
			System.out.printf("%x\n",b);
			out.write(b);
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
