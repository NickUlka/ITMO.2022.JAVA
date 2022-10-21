package lab3.task1;

public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        System.out.println(this.course);
        return this.course;
        // либо
        //String course1=this.course;
        //System.out.println (course1);
        //return course1;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study studyMes = new Study("Изучение Java - это просто!");
        studyMes.printCourse();
    }
}
