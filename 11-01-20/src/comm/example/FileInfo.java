package comm.example;

import java.io.File;
import java.io.IOException;

public class FileInfo {
public static void main(String[] args)
{
	if(args.length<1)
	{
		System.out.println("provide dummy name as command line argument");
		return;
	}
	String fileName=args[0];
	File fn=new File(fileName);
	try
	{
		fn.createNewFile();
	}catch(IOException e)
	{
		
	}
	System.out.println("name:"+fn.getName());
	if(fn.exists())
	{
		System.out.println(fileName+"does exist");
	}
	if(fn.canRead())
	{
		System.out.println(fileName+"is readable");
	}
	System.out.println(fileName +"is"+fn.length()+"bytes long");
	System.out.println(fileName +"is last modified at"+new java.util.Date(fn.lastModified()));
	if(fn.canWrite())
	{
		System.out.println(fileName+"is writable");
	}
	else
		System.out.println(fileName+"is not writable");
}
}
