class Notes
{
	public void disp(String data,int... x)
	{
		System.out.println("Display the data");
	}
}
public class VarArgs2 {

	public static void main(String... args) 
	{
		Notes note=new Notes();
		note.disp("Sreekar");
		note.disp("Rachin", null);
		note.disp("Ram", 10);
		note.disp("Ali", 10,20);

	}

}
