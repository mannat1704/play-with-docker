
import java.io.*;
import java.lang.*;
import java.util.*;


class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Please enter the number of the option desired: ");
            System.out.println("TC1. Test Case Sign Up");
            System.out.println("TC2. Test Case Edit Profile");
            System.out.println("TC3. Test Case Attendance");
            System.out.println("TC4. Test Case Scheduling/Viewing Events");
            System.out.println("TC5. Test Case Communication");
            System.out.println("TC6. Test Case Payment");
            System.out.println("TC7. Test Case Grades");
            System.out.println("TC8. Test Case Course Schedule");
            System.out.println("TC9. Test Case Downloads");
            System.out.println("TC10. Test Case Sign Out");
            System.out.println("11. Exit ");
            int s = sc.nextInt();
            switch(s)
            {
                case 1: TestCaseSignUp t1 = new TestCaseSignUp();
                        break;
                case 2: TestCaseEditProfile t2 = new TestCaseEditProfile();
                        break;
                case 3: TestCaseAttendance t3 = new TestCaseAttendance();   
                        break;
                case 4: TestCaseCalendar t4 = new TestCaseCalendar();
                        break;
                case 5: TestCaseCommunication t5 = new TestCaseCommunication();
                        break;
                case 6: TestCaseBillPayment t6 = new TestCaseBillPayment();
                        break;
                case 7: TestCaseGrades t7 = new TestCaseGrades();
                        break;
                case 8: TestCaseTimetable t8 = new TestCaseTimetable();
                        break;
                case 9: TestCaseDownloads t9 = new TestCaseDownloads();
                        break;
                case 10:TestCaseSignOut t10 = new TestCaseSignOut();
                        break;
                case 11:System.exit(0);
                        break;
                default:System.out.println("The number entered is invalid.");
            }
        }
        
       //Profile[] p = new Profile[1000];
       
    }
}
