
/**
 * A class called Course which contains a code number and a title.
 *
 * @author (Timothy Arole)
 * @version (2020.11.07)
 */
public class Course
{
    // Course code
    private String codeNo;
    // Course title
    private String title;
    // Final mark
    private int finalMark;
    // Final grade
    private Grades finalGrade;
    // Module 1
    private Module module1;
    // Module 2
    private Module module2;
    // Module 3
    private Module module3;
    // Module 4
    private Module module4;
    // Student grade
    private Grades grade;
    
    /**
     * Constructor for objects of class Course
     */
    
    public Course (String codeNo, String coursetitle)
    {
        this.codeNo = codeNo;
        this.title = coursetitle;
         
  
        module1 = new Module("Programming Concepts", "CO452 ");
        module2 = new Module("Computer Architectures", "CO450 ");
        module3 = new Module("Digital Tech", "CO454 ");
        module4 = new Module("Web Dev", "CO456 ");
    }
    
    public void createdModules()
    {
        module1 = new Module("Programming Concepts", "CO452 ");
        module2 = new Module("Computer Architectures", "CO450 ");
        module3 = new Module("Digital Tech", "CO454 ");
        module4 = new Module("Web Dev", "CO456 ");
    }
        
    
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
      
    }
    
    
    /**
     * Prints out details of a course.
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
        System.out.println("Grade" + grade);
        module1.print();
        module2.print();
        module3.print();
        module4.print();
        
    }
    
    public void calculateFinalMark()
    {
        finalMark = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        
        finalMark = finalMark / 4;

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
