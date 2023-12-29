import java.io.File;
import java.io.IOException;

public class LaunchFO1 {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("IPL");
		f.mkdir();
		System.out.println("Is f pointing to directory :: " +f.isDirectory());
  
		System.out.println();
		
		File f1=new File(f,"IPL-Teams");
		f1.mkdir();
		System.out.println("Is f1 pointing to directory :: " +f1.isDirectory());
		
		System.out.println();
		
		File f2=new File(f1,"RCB.txt");
		f2.createNewFile();
		System.out.println("Is f2 pointing to a file ::"+ f2.exists());
		
		File f3=new File(f1,"SRH.txt");
		f3.createNewFile();
		System.out.println("Is f3 pointing to a file ::"+ f3.exists());
		
	}

}
