import java.io.File;
import java.io.IOException;

public class LaunchFO
{

	public static void main(String[] args) throws IOException
	{
		String fileName="StudyNotes.txt";
		File f=new File(fileName);
		System.out.println(f.exists());//false
		
		f.createNewFile();
		System.out.println(f.exists());//true
		
		
		//Creating a directory in java. For creating a directory we don't need an 
		//extension to write like file name above example(.txt) is not necessary
		
		String directoryName="IPL Teams";
		File f1=new File(directoryName);
		System.out.println(f1.isDirectory());
		f1.mkdir();
		System.out.println(f1);
		
	    
	}

}
