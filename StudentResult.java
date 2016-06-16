
package student.result;


public class StudentResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstSemester std1 = new FirstSemester("Shufol", 127, 149);// shufol roll and registration number
        std1.setMarks(60,70);// set shufol marks
        System.out.println("\nEnter First Semester Student's Info:");
        std1.getSubject();
        std1.showResult();
        
        SecondSemester std2 = new SecondSemester("Fakhrul", 227, 249);// Fakhrul roll and registration number
        std2.setMarks(70,80);// set Fakhrul marks
        System.out.println("\n\nEnter Second Semester Student's Info:");
        std2.getSubject();
        std2.showResult();
    }
}
