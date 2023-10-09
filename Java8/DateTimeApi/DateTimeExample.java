import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Créer des instances de LocalDate, LocalTime et LocalDateTime
        LocalDate date = LocalDate.of(2023, 10, 4);
        LocalTime time = LocalTime.of(14, 30);
        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 4, 14, 30);

        System.out.println("Date : " + date);  // Affiche : Date : 2023-10-04
        System.out.println("Heure : " + time);  // Affiche : Heure : 14:30
        System.out.println("Date et heure : " + dateTime);  // Affiche : Date et heure : 2023-10-04T14:30

        // Créer une instance de ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("Date et heure avec décalage horaire : " + zonedDateTime);

        // Effectuer des calculs de durée et de période
        LocalDateTime startDateTime = LocalDateTime.of(2023, 10, 4, 14, 30);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 10, 4, 16, 45);

        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println("Durée : " + duration.toMinutes() + " minutes");  // Affiche : Durée : 135 minutes

        LocalDate startDate = LocalDate.of(2023, 10, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 6);

        Period period = Period.between(startDate, endDate);
        System.out.println("Période : " + period.getDays() + " jours");  // Affiche : Période : 5 jours

        // Formatter et parser des dates et des heures
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Date formatée : " + formattedDate);  // Affiche : Date formatée : 04-10-2023
    }
}
