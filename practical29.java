import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(85);
        marks.add(92);
        marks.add(76);
        marks.add(88);
        marks.add(95);
        System.out.println("Student Marks:");
        for (int m : marks) {
            System.out.println(m);
        }
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}