# codsoft_task-2

TASK 2
STUDENT GRADE CALCULATOR
1. Input: Take marks obtained (out of 100) in each subject.
2. Calculate Total Marks: Sum up the marks obtained in all subjects.
3. Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
4. Grade Calculation: Assign grades based on the average percentage achieved.
5. Display Results: Show the total marks, average percentage, and the corresponding grade to the user

		import java.util.Scanner;
		class Grade
		{
    	public static void main(String [] ags)
    	{
        float a,b,c;
        System.out.println("Subject 1(Out of 100):");
        System.out.println("Subject 2(Out of 100):");
        System.out.println("Subject 3(Out of 100):");
        Scanner A=new Scanner(System.in);
        a=A.nextFloat();
        b=A.nextFloat();
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

	# Instraction:

			1. Copy Full code.
			2. Save: StudentGrade.java
			3. Compile: javac StudentGradeCalculator.java
			4. Run: java StudentGradeCalculator
