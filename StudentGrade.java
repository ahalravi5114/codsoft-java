package studentgrade;
import java.util.*;

public class StudentGrade 
{
    public static void main(String[] args) 
    {
        int num,total=0,avg;
        String name,roll;
        Scanner g = new Scanner(System.in);
        System.out.println("Welcome To Student Grade Calculator");
        System.out.println("***********************************");
        System.out.println("Enter Student Name:");
        name = g.nextLine();
        System.out.println("Enter Student Roll Number:");
        roll = g.nextLine();
        System.out.println("Enter Number of Subjects:");
        num = g.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println("Enter subject "+i+" mark:");
            int marks = g.nextInt();
            total+=marks;
        }
        avg = total/num;
        System.out.println("*************************");
        System.out.println("Student Grade Calculator:");
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Total: "+total);
        if(avg>=90)
        {
            System.out.println("Grade: O");
        }
        else if(avg>=80&&avg<90)
        {
            System.out.println("Grade: A");
        }
        else if(avg>=70&&avg<80)
        {
            System.out.println("Grade: B");
        }
        else if(avg>=60&&avg<70)
        {
            System.out.println("Grade: C");
        }
        else if(avg>=50&&avg<60)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Grade: F");
        }
    }
}
