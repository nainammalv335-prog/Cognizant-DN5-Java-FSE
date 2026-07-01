public class SpringIoCExample {

    static class Student {

        private String name;

        public Student(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

      
        Student student = new Student("Nainammal");

        student.display();

        System.out.println("Spring IoC Container Configured Successfully");
    }
}
