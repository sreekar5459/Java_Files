import java.io.FileWriter;
import java.io.IOException;

public class LAunchFileWriter 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter f=new FileWriter("Test_Files",true);
		//Taking integer values
		f.write(67);
		f.write("\n");
		f.write("Phedshdsgvdsdbu");
		f.write("\n");
		char[] ch= {'L','E','A','R','N'};
		f.write(ch);
		
		f.flush();
		f.close();
		System.out.println("Open Test_Files");
		

	}

}
