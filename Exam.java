// inside Exam.java file
public class Exam {
      int id;
      int student_id;
      int subject_id;
      String date;
      double degree;
      boolean in_gpa; // default scale is percentage
      static final double CONV_RATE = 25.0; // conversion rate from percentage to GPA

      public double getDegree() {
            return degree;
      }

      public void setDegree(double degree) {
            if (degree < 0 || degree > 100) {
                  System.out.println("Invalid degree. Please enter a value between 0 and 100.");
                  return;
            }
            this.degree = degree;
      }

      public Exam(int id, int student_id, int subject_id, String date, double degree, boolean in_gpa) {
            this.id = id;
            this.student_id = student_id;
            this.subject_id = subject_id;
            this.date = date;
            this.degree = degree;
            this.in_gpa = in_gpa;
      }

      public void convertToGPA() {
            if (!in_gpa) {
                  degree = degree / CONV_RATE;
            }
      }

      private int getIdFromServer(int student_id, int subject_id) {
            // Simulate fetching ID from server
            return 11; // Example ID
      }

      private int getIdFromLocalDB(int student_id, int subject_id) {
            // Simulate fetching ID from local database
            return 11; // Example ID
      }

      public boolean isValid() {
            int serverId = getIdFromServer(student_id, subject_id);
            int localId = getIdFromLocalDB(student_id, subject_id);
            if (serverId != localId || serverId != id) {
                  return false;
            }
            return true;
      }

}
