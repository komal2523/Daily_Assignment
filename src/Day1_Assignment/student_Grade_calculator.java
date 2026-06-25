package Day1_Assignment;

public class student_Grade_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//int marks=95;
//int marks=80;
//int marks=65;
//int marks=45;
int marks=20;
{
        System.out.println("Grading Criteria");
        System.out.println("Marks      Grade");
        System.out.println("90 - 100   A");
        System.out.println("75 - 89    B");
        System.out.println("60 - 74    C");
        System.out.println("40 - 59    D");
        System.out.println("0 - 39     Fail");

}
        if (marks >= 90 && marks <= 100)
        {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75)
        {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60)
        
        {
            System.out.println("Grade: C");
        } 
        else if (marks >= 40) 
        
        {
            System.out.println("Grade: D");
        } 
        else if (marks >= 0) 
        {
            System.out.println("Result: Fail");
        } 
    }

	}

