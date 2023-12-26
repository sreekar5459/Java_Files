import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Book
{
	String name()default "robert kioyaski";
	int year_released() default 1997;
}
@Book
//@Book(name="Robert Kiyoaski",year_released=1998)
class Rich_Dad_Poor_Dad
{
	private int pages;
	private int cost;
    private	String author_name;
    
    
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
    
    
}
public class LaunchAnn02
{

	public static void main(String[] args)
	{
		Rich_Dad_Poor_Dad rdpd=new Rich_Dad_Poor_Dad();
		rdpd.setPages(250);
		rdpd.setCost(35);
		rdpd.setAuthor_name("Robert Kiyoaski");
		
		System.out.println(rdpd.getAuthor_name()+ "   Cost is:: $"+rdpd.getCost()+ "  Pages:: "+rdpd.getPages());
 
		Class c=rdpd.getClass();
		Annotation ann=c.getAnnotation(Book.class);
		Book book=(Book) ann;
		String name=book.name();
		int yr=book.year_released();
		System.out.println(name+ "  "+yr);
	}

}
