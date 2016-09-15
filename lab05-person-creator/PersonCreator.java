
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    private String name;
    private int age;
    private String sex;
    private double height;
    private double weight;
    private String social;
    private String address;
    private String phoneNumber;
    private String dateofbirth;
    
    public PersonCreator(String first, String last)
    {
        name = first + " " + last;
    }
    public void inputAge( int age1)
    {
        age = age1;
    }
    public void inputSex( String sex1)
    {
        sex = sex1;
    }
    public void inputHeight (double height1)
    {
        height = height1;
    }
    public void inputWeight (double weight1)
    {
        weight = weight1;
    }
    public void inputSocial (int social1, int social2, int social3)
    {
        if (100 > social1 || social1 > 999)
        {
            System.err.println( "Invalid entry, social 1 must be 3 numbers");
        }
        else if (10 > social2 || social2 > 99)
        {
            System.err.println( "Invalid entry, social 2 must be 2 numbers");
        }
        else if (1000 > social3 || social3 > 9999)
      {
          System.err.println( "Invalid entry, social 3 must be 4 numbers");
        }
        else 
        {
            social = social1 + "-" + social2 + "-" + social3;
        }
            
    }
    public void inputAddress (String address1)
    {
        address = address1;
    }
    public void inputphoneNumber(int areaCode, int numBegin, int numEnd)
    {
       if (100 > areaCode || areaCode > 999 )
       {
           System.err.println( "Invalid entry, Area Code must be 3 numbers");
        }
        else if (100 > numBegin || numBegin > 999)
        {
            System.err.println("Invalid entry, Area Code must be 3 numbers");
        }
        else if (1000 > numEnd || numEnd > 9999)
        {
            System.err.println("Invalid entry, Area Code must be 4 numbers");
        }
        else 
        {
            phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;
        }
    }
    public void inputDateofbirth (int day, int month, int year)
    {
        if (1 > day || day > 31)
        { 
            System.err.println("Invalid entry, please enter a valid day");
        }
        else if ( 1 > month || month > 12)
        {
            System.err.println("Invalid entry, please enter a valid month");
        }
        else if ( 1000 > year || year > 2017)
        {
            System.err.println("Invalid entry, please enter a valid year");
        }
        else 
        { 
            dateofbirth = day + "/" + month + "/" + year;
        }
    }
    public void showInfo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(social);
        System.out.println(sex);
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(dateofbirth);
    }
    
}
//phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;