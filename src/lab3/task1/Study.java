package lab3.task1;

public class Study {
    private String course;

   public  Study(String course){
      this.course=course;
   }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study studyMes = new Study("Изучение Java - это просто!");
        System.out.println(studyMes.printCourse());
    }

}
