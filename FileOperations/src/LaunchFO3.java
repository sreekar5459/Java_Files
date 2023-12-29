import java.io.File;
import java.io.IOException;

public class LaunchFO3 
{

	public static void main(String[] args) throws IOException
	{
		File f1=new File("D:\\Hollywood Movies");
		f1.mkdir();
		System.out.println("f1 has a directory: "+f1.isDirectory());

		File f2=new File(f1,"Sniper-Ghost.txt");
		f2.createNewFile();
		System.out.println("f2 has a file:" +f2.exists());
		
	}

}
