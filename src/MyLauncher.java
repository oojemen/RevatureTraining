
//import rev.training;
public class MyLauncher {

    public static void main(String[] args) {
        String[] daysOfWeek;

        daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].charAt(0) == 'S' || daysOfWeek[i].charAt(0) == 'T') {

                System.out.println(daysOfWeek[i] + "\nGo to gym");
                System.out.println("");
            }
           else {
                System.out.println("");
                System.out.println(daysOfWeek[i] + "\nStay at home");
                System.out.println("");
            }

        }
    }
}