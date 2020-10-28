
/**
 * A class called Course which contains a code number and a title.
 *
 * @author (Timothy Arole)
 * @version (27.10.2020)
 */
public class Course
{
    
    //This is the course code
    private String code;
    //This is the course title
    private String title;
    
    /**
     * Set code and title for a course
     */
    
    public Course (String coursecode, String coursetitle)
    {
        code = coursecode;
        title = coursetitle;
    
    }
    
    public String getcode()
    {
        return code;
    }
    
    public String getname()
    {
        return title;
    }
}
