public class ArraysDemo {
    
    public static void main(String[] args) {
        
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("The days of the week are: ");
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println("The days of the week in reverse are: ");
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }

       // Print every other day of the week

    }
}
