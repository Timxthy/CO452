
/**
 * Write a description of class Module here.
 *
 * @author (Timothy Arole)
 * @version (2020.11.07)
 */
public class Module
{

    private String title;

    private String codeNo;

    private int mark;

    private boolean completed;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0; 
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }

    public int getMark()
        {
        if(this.mark == -1)
        {
            System.out.println("no mark for this module!");
        }
        return this.mark;
    }
   
        public void awardMark(int mark)
        {
        if((mark >= 0) && (mark <= 100))

        {
            this.mark = mark;
            if(mark >=40)completed = true;
        }
        else
        {
            System.out.print("Invalid mark!");
        }
    }

    /**
     * 
     */
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }
}
