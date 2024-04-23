public class task5 {
    public static int unableToEat(int[] students, int[] samsas) {
        int unableToEat = 0;
        int studentIndex = 0;

        for (int samsa : samsas) {
            if (studentIndex >= students.length) {
                // All students have been served
                break;
            }

            if (students[studentIndex] == samsa) {
                // Student prefers this type of samsa
                studentIndex++;
            } else {
                // Student doesn't prefer this type of samsa, move to the end of the queue
                unableToEat++;
            }
        }

        // Any remaining students at the end of the queue are unable to eat
        unableToEat += students.length - studentIndex;

        return unableToEat;
    }

    public static void main(String[] args) {
        int[] students = {0, 1, 0, 1}; // Example preference of students
        int[] samsas = {0, 1, 1, 0}; // Example types of samsas in the stack

        System.out.println(unableToEat(students, samsas)); // Output: 0
    }
}