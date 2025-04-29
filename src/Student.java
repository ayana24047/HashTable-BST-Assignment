public class Student {
    private String fullName;

    public Student(String name) {
        this.fullName = name;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
