/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eventreservartion;
import java.util.regex.Pattern;

/**
 *
 * @author Timmyngove
 */
public class EventReservartion {


   public static boolean checkBookingCode(String code) {
        // Check if code contains an underscore and is within 12 characters
        return Pattern.matches("[A-Za-z0-9]+_[A-Za-z0-9]+", code) && code.length() <= 12;
    }

    public static boolean checkPasswordComplexity(String password) {
        // Check if password meets complexity requirements
        return password.length() >= 8 &&
                Pattern.matches(".*[A-Z].*", password) &&
                Pattern.matches(".*\\d.*", password) &&
                Pattern.matches(".*[\\p{Punct}].*", password);
    }

    public static String makeReservation(String bookingCode, String password) {
        if (!checkBookingCode(bookingCode)) {
            return "Booking code is incorrectly formatted.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements.";
        } else {
            return "Reservation successfully made!";
        }
    }

    public static void main(String[] args) {
        String bookingCode = "Event_123";
        String password = "Banothile@101##";

        String result = makeReservation(bookingCode, password);
        System.out.println(result);
    }
}