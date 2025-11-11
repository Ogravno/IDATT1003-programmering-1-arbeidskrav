package oppgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EventRegister {
  private List<Event> events;

  public EventRegister() {
    events = new ArrayList<>();
  }

  public void newEvent(String name, String place, String organizer, String type, long time) {
    events.add(new Event(name, place, organizer, type, time));
  }

  public List<Event> getEventsAtPlace(String place) {
    return events.stream().filter(event -> Objects.equals(event.getPlace(), place)).collect(Collectors.toList());
  }

  public List<Event> getEventsAtDate(int date) {
    return events.stream().filter(event -> (event.getTime() >= date * 10000L && event.getTime() < date * 10000L + 10000)).collect(Collectors.toList());
  }

  public List<Event> getEventsFromToDate(int fromDate, int toDate) {
    return events.stream().filter(event -> (event.getTime() >= fromDate * 10000L && event.getTime() < toDate * 10000L)).sorted((event1, event2) -> event1.getTime().compareTo(event2.getTime())).collect(Collectors.toList());
  }

  public List<Event> getAllEvents() {
    return events.stream().sorted((e1, e2) -> e1.getPlace().compareTo(e2.getPlace())).sorted((e1, e2) -> e1.getType().compareTo(e2.getType())).collect(Collectors.toList());
  }
}
