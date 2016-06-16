
package student.result;


public class StudentResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstSemester std1 = new FirstSemester("SAI JAGADISH", 408, 149);// SAI JAGADISH roll and registration number
        std1.setMarks(60,70);// SAI JAGADISH marks
        System.out.println("\nEnter First Semester Student's Info:");
        std1.getSubject();
        std1.showResult();
        
        SecondSemester std2 = new SecondSemester("VIJAY", 414, 249);// VIJAY roll and registration number
        std2.setMarks(70,80);// set VIJAY marks
        System.out.println("\n\nEnter Second Semester Student's Info:");
        std2.getSubject();
        std2.showResult();
    }
}
