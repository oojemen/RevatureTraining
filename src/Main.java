// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //public static void main(String[] args) {
    public static void main(String[] args) {
        String[] daysOfWeek;

        daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[0].charAt(0) == 'S' || daysOfWeek[0].charAt(0) == 'T')
                System.out.println("Go to gym");
            else
                System.out.println("Stay at home");


        }
    }
    }
