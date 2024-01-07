package ch43;


import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter activity >> ");
        String activity = scanner.nextLine();

        System.out.print("Enter minutes spent " + activity + " >> ");
        int minutes = scanner.nextInt();

        System.out.print("Enter month >> ");
        int month = scanner.nextInt();

        System.out.print("Enter day >> ");
        int day = scanner.nextInt();

        System.out.print("Enter year >> ");
        int year = scanner.nextInt();
        
        //create an obj of the FitnessTracker class
        FitnessTracker track = new FitnessTracker(activity, minutes, LocalDate.of(year, month, day));
    	FitnessTracker old = new FitnessTracker("running", 0, LocalDate.of(2023, 1, 1));

        System.out.println("Activity log: ");
        System.out.println(track.getActivity() + " " + track.getMinutes() + " minutes on " + track.getDate());
        System.out.println(old.getActivity() + " " + old.getMinutes() + " minutes on " + old.getDate());

        scanner.close();
    }
}