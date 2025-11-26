import java.util.Scanner;

//The student template
class Student {
    String Full_Name;
    String Reg_No;
    int CCS2211;
    int IGS2202;
    int CCS2208;
    int SMA2215;
    int CCS2207;
    int CCS2209;
    int CCS2210;
    int TOTALS;
    double AVERAGE;
    String STATUS;
    char GRADE;
    
    //Method for taking the student details
    void inputDetails(Scanner input){
        System.out.print("Enter Full Name:");
        Full_Name = input.nextLine();

        System.out.print("Enter Your Reg No:");
        Reg_No=input.nextLine();

        System.out.print("Enter Your CCS2211:");
        CCS2211=Integer.parseInt(input.nextLine());

        System.out.print("Enter Your IGS2202:");
        IGS2202=Integer.parseInt(input.nextLine());

        System.out.print("Enter Your CCS2208:");
        CCS2208=Integer.parseInt(input.nextLine());

        System.out.print("Enter Your SMA2215:");
        SMA2215=Integer.parseInt(input.nextLine());

        System.out.print("Enter Your CCS2207:");
        CCS2207=Integer.parseInt(input.nextLine());

        System.out.print("Enter Your CCS2209:");
        CCS2209=Integer.parseInt(input.nextLine());

        System.out.print("Enter Your CCS2210:");
        CCS2210=Integer.parseInt(input.nextLine());
    }
    //Method to calculate total score
    int calculateTotalScore(){
        return CCS2211 + IGS2202 + CCS2208 + SMA2215 + CCS2207 + CCS2209 + CCS2210;
    }
    //Method to calculate average score
    double calculateAverageScore(){
        return calculateTotalScore() / 7.0;
    }
    //Method for displaying student information
    void displayStudentInfo(){
        System.out.printf("%-20s %-25s %-20d %-20d %-20d %-20d %-20d %-20d %-20d %-20d %-20.1f %-20s %-10s\n",
            Reg_No, Full_Name, CCS2211, CCS2207, CCS2208, CCS2209, IGS2202,SMA2215,CCS2210, TOTALS, AVERAGE, STATUS, GRADE);
    }

}
public class MarkSheet {
    public static void main(String[] args) {

        //Title
        System.out.println("                                                 Dedan Kimathi University of Technology              ");
        System.out.println("                                                   School of Computer Science and IT                 ");
        System.out.println("                                                     Department of Computer Science                  ");
        System.out.println("                                                        Academic Year: 2024/2025                     ");
        System.out.println("                                                STUDENT MARKSHEET ( SECOND YEAR RESULTS )            ");

        Scanner input=new Scanner(System.in);

        Student s1 = new Student();
        s1.inputDetails(input);

        Student s2 = new Student();
        s2.inputDetails(input);

        Student s3 = new Student();
        s3.inputDetails(input);

        Student s4 = new Student();
        s4.inputDetails(input);

        Student s5 = new Student();
        s5.inputDetails(input);

        System.out.println("Student Score Sheet");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-25s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-10s\n",
        "Reg_No", "Full_Name", "CCS2211", "CCS2207", "CCS2208", "CCS2209", "IGS2202", "SMA2215", "CCS2210", "TOTALS", "AVERAGE", "STATUS", "GRADE");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        s4.displayStudentInfo();
        s5.displayStudentInfo();
        }
    }
