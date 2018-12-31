public class Student implements  Comparable<Student>{
    Integer age;
    public Student(Integer age) {
        this.age = age;
    }
    public int compareTo(Student s) {
        return s.age.compareTo(this.age);
    }
}
