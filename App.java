// inside App.java file
public class App {

      public static void main(String[] args) {
            Exam exam_1 = new Exam(10, 13, 792, "2026-02-28", 3.7, true);
            Exam exam_2 = new Exam(11, 14, 793, "2026-03-01", 95, false);

            exam_1.convertToGPA();
            exam_2.convertToGPA();

            System.out.println(exam_1.degree);
            System.out.println(exam_2.degree);

            LabExam lab_exam = new LabExam(12, 15, 794, "2026-03-02", 10, false, "CS Lab Alzahra", 35);
            System.out.println(lab_exam.getDegree());
            FinalExam final_exam = new FinalExam(13, 15, 794, "2026-06-20", 10, false, "CS Lab Alzahra", 35, "Hall 3",
                        45);
            System.out.println(final_exam.getDegree());

            System.out.println("Exam 1 is valid: " + exam_1.isValid());
            System.out.println("Exam 2 is valid: " + exam_2.isValid());
      }
}