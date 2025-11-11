package oppgave1;

import java.util.List;

public class Oppgave1 {
  public static void main(String[] args) {
    EventRegister events = new EventRegister();

    events.newEvent("Teambasert", "A4-112", "NTNU", "Forelesning", 202510290815L);
    events.newEvent("Nummerikk", "Der nede", "NTNU", "Forelesning", 202510291415L);
    events.newEvent("Programmering", "A4-112", "NTNU", "Øvingstime", 202510300815L);
    events.newEvent("Matte", "S-noe", "NTNU", "Forelesning", 202510301215L);
    events.newEvent("Matte", "S-noe", "NTNU", "Forelesning", 202510311015L);
    events.newEvent("Teambasert", "A4-112", "NTNU", "Forelesning", 202510311215L);

    String place = "A4-112";
    System.out.println("Events at " + place + ":");
    List<Event> eventsAtPlace = events.getEventsAtPlace(place);
    eventsAtPlace.forEach(event -> System.out.println(event.getName() + ", " + event.getPlace()));

    int date = 20251029;
    System.out.println("\nEvents at " + date + ":");
    List<Event> eventsAtDate = events.getEventsAtDate(date);
    eventsAtDate.forEach(event -> System.out.println(event.getName() + ", " + event.getTime()));

    int fromDate = 20251029;
    int toDate = 20251030;
    System.out.println("\nEvents from " + fromDate + " to " + toDate + ":");
    List<Event> eventsFromToDate = events.getEventsFromToDate(fromDate, toDate);
    eventsFromToDate.forEach(event -> System.out.println(event.getName() + ", " + event.getTime()));

    System.out.println("\nAll events:");
    List<Event> allEvents = events.getAllEvents();
    allEvents.forEach(event -> System.out.println(event.getName() + ", " + event.getPlace() + ", " + event.getOrganizer() + ", " + event.getType() + ", " + event.getTime()));
  }
}
