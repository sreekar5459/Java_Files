import java.io.File;

public class LaunchFO5
{

	public static void main(String[] args)
	{
		int dirCount=0;
		
		int txtFileCount=0;
		int jpgFileCount=0;
		String location=("D:\\JOB");
		
		File f=new File(location);
		
		String[] names=f.list();
		for(String name:names)
		{
			File f1=new File(f,name);
			
			if(f1.isDirectory())
			{
				dirCount++;
				
			}
		     if(f1.isFile())
			{
		    	 if(name.endsWith(".txt"))
		    	 {
		    		 
					txtFileCount++;
		    	 }
		    	 if(name.endsWith(".jpg"))
		    	 {
		    		 
					
					jpgFileCount++;
		    	 }
				
				
			}
			
		}
		System.out.println("No of directory are::"+dirCount);
		
		System.out.println("No of txt Files are::"+jpgFileCount);
		System.out.println("No of  jpg Files are::"+txtFileCount);

	}

}
