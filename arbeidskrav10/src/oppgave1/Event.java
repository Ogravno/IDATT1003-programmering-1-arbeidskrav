package oppgave1;

import java.util.UUID;

public class Event {
  private UUID id;
  private String name;
  private String place;
  private String organizer;
  private String type;
  private long time;

  public Event(String name, String place, String organizer, String type, long time) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.place = place;
    this.organizer = organizer;
    this.type = type;
    this.time = time;
  }

  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getPlace() {
    return this.place;
  }

  public String getOrganizer() {
    return this.organizer;
  }

  public String getType() {
    return this.type;
  }

  public Long getTime() {
    return this.time;
  }
}
