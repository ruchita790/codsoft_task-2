import java.util.Scanner;
class Grade
{
    public static void main(String [] ags)
    {
        float a,b,c;
        System.out.println("Subject 1(Out of 100):");    
        Scanner A=new Scanner(System.in);
        a=A.nextFloat();
        System.out.println("Subject 2(Out of 100):");
        b=A.nextFloat();
        System.out.println("Subject 3(Out of 100):");
        c=A.nextFloat();
        float sum=a+b+c;
        System.out.println("Sum of three subjects:"+ sum);
        float ave=(a+b+c)/3;
        System.out.println("Average of three subjects:"+ ave);
        if(ave>90)
        {
            System.out.println("A+");
        }
        else if(ave>70)
        {
            System.out.println("The grade is:A");
        }
        else if(ave>50)
        {   System.out.println("The grade is:B+");
            
        }
        else if(ave>30)
        {
            System.out.println("The grade is:B");
        }
        else
        {
            System.out.println("Fail");
        }
        System.out.println("---------------------------------");
        System.out.println("           Grade List            ");
        System.out.println("---------------------------------");
        System.out.println("100% - 90% = A+ = Very Good");
        System.out.println("89% - 70% = A =  Good");
        System.out.println("69% - 50% = B+ = Average");
        System.out.println("49% - 30% = B = Pass");
        System.out.println("29% and below = F = Fail");
       }
}