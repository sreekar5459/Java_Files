enum Result
{
	PASS,FAIL,NO_RESULT;
	int courseId;
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	Result()
	{
		System.out.println("Constructor Called");
	}
}
public class LaunchEnum2 {

	public static void main(String[] args)
	{
		Result.PASS.setCourseId(455);
		int course=Result.PASS.getCourseId();
		System.out.println(course);
		//Result myVar=Result.FAIL;
		
//		switch(myVar)
//		{
//		case PASS:System.out.println("Passed the exam");
//		        break;
//		case FAIL:System.out.println("Failed the exam");
//		        break;
//		case NO_RESULT : System.out.println("No Result");   
//		        break;
//        default:System.out.println("None of the above");
		
//		}

	}

}
