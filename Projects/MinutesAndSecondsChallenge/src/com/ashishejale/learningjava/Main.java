package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65,45));

        System.out.println(getDurationString(3945));

    }
    public static String getDurationString (int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
         //calculation
            int hours = minutes / 60 ;
            int remainderMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainderMinutes + "m ";
            if (remainderMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return ( hoursString + minutesString + secondsString);
        }
        return "Invalid value.";
    }
    public static String getDurationString (int seconds) {
        if (seconds >= 0) {
            //calculation
            int minutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            return getDurationString(minutes,remainderSeconds);
        }
        return "Invalid value";
    }
}
