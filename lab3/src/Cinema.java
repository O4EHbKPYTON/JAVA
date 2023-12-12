import java.util.ArrayList;

public class Cinema {
    public String getName() {
        return name;
    }

    private String name;

    public ArrayList<Hall> halls = new ArrayList<>();
    private ArrayList<Session> sessions = new ArrayList<>();

    public Cinema(String name) {
        this.name = name;
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }
}

