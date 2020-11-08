
/**
 * A class called Course which contains a code number and a title.
 *
 * @author (Timothy Arole)
 * @version (2020.11.07)
 */
public class Course
{
    
    private String codeNo;
    
    private String title;
    
    private int finalMark;
        
    private Grades finalGrade;
    
    private Module module1;
    
    private Module module2;
    
    private Module module3;
    
    private Module module4;
    
    /**
     * Constructor for objects of class Course
     */
    
    public Course (String codeNo, String coursetitle)
    {
        this.codeNo = codeNo;
        this.title = coursetitle;
         
  
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer Architectures", " ");
        module3 = new Module("Digital Tech", " ");
        module4 = new Module("Web Dev", " ");
    }
    
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
    }
    
    
    /**
     * Prints out details of a course.
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >=0) && (mark < 39))
        {
           return Grades.F;
        }
        
        if((mark >=40) && (mark < 49))
        {
           return Grades.D;
        }
        
        if((mark >=50) && (mark < 59))
        {
           return Grades.C;
        }
        
        if((mark >=60) && (mark < 69))
        {
           return Grades.B;
        }
        
        if((mark >=70) && (mark < 100))
        {
           return Grades.A;
        }
        
        return Grades.X;
    }
}
