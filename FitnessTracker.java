package ch43;

import java.util.*;
import java.time.LocalDate;

public class FitnessTracker{

    	Scanner obj = new Scanner(System.in);
    	
        private String activity;
        private int minutes;
        private LocalDate date;


        
        FitnessTracker() {
            this.activity = "running";
            this.minutes = 0;
            this.date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
        }

        // constructor with parameters
        FitnessTracker(String activity, int minutes, LocalDate date) {
            this.activity = activity;
            this.minutes = minutes;
            this.date = date;
        }
        
        public String getActivity() {
        	return activity;
        }
        
        public int getMinutes() {
        	return minutes;
        }
        
        public LocalDate getDate() {
        	return date;
        }
}