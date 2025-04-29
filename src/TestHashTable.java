import java.util.Random;

public class TestHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(31);
        Random rnd = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i, "Name" + rnd.nextInt(1000));
            Student value = new Student("Student_" + i);
            table.put(key, value);
        }

        int[] buckets = table.bucketSizes();
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("Bucket " + i + " has " + buckets[i] + " elements.");
        }
    }
}
