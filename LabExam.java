public class LabExam extends Exam {

      String lab_name;
      double lab_degree;

      public LabExam(int id, int student_id, int subject_id, String date, double degree, boolean in_gpa,
                  String lab_name, double lab_degree) {
            super(id, student_id, subject_id, date, degree, in_gpa);
            this.lab_name = lab_name;
            this.lab_degree = lab_degree;
      }

      @Override
      public double getDegree() {
            return degree + lab_degree;
      }
}