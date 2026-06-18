public class FinalExam extends LabExam {
      String examination_hall;
      double final_degree;

      public FinalExam(int id, int student_id, int subject_id, String date, double degree, boolean in_gpa,
                  String lab_name, double lab_degree, String examination_hall, double final_degree) {
            super(id, student_id, subject_id, date, degree, in_gpa, lab_name, lab_degree);
            this.examination_hall = examination_hall;
            this.final_degree = final_degree;
      }

      @Override
      public double getDegree() {
            return degree + lab_degree + final_degree;
      }

}