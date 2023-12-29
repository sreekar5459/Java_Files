import java.io.File;

public class LAunchFO4 {

	public static void main(String[] args) 
	{
		int count=0;
		String location=("D:\\Java Ineuron Notes");
		File f=new File(location);
		
		String[] names=f.list();
		for(String name:names)
		{
			count++;
			System.out.println(name);
			
		}
		System.out.println("The no of files present are ::"+count);

	}

}
