import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema("'BestCinema'");
        cinema.addHall(new Hall("Hall 1", 8, 6));
        cinema.addHall(new Hall("Hall 2", 7, 4));
        cinema.addSession(new Session("13:00", 120, cinema.halls.get(0)));
        cinema.addSession(new Session("15:30", 90, cinema.halls.get(1)));

        System.out.println("We are happy to see you in our cinema house " + cinema.getName());
        Row r = new Row(1, 5);


        while (true) {
            System.out.println("\nPlease choose your action:");
            System.out.println("1. Watch available sessions");
            System.out.println("2. Buy tickets");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("See you soon!");
                break;
            } else if (choice == 1) {
                // Просмотр сеансов
                System.out.println("\nAvailable sessions:");
                ArrayList<Session> sessions = cinema.getSessions();
                for (int i = 0; i < sessions.size(); i++) {
                    Session session = sessions.get(i);
                    Hall hall = session.getHall();
                    int availableSeats = hall.getCapacity() - session.getSoldTickets();
                    System.out.println((i + 1) + ". Session: " + hall.getName() +
                            ", Beginning: " + session.getStartTime() +
                            ", Duration: " + session.getDuration() +
                            " Minutes, Available seats: " + availableSeats);
                }
            } else if (choice == 2) {
                // Покупка билетов
                    System.out.println("\nEnter number of session:");

                int sessionNum = scanner.nextInt();
                try {
                    Session session = cinema.getSessions().get(sessionNum - 1);
                    Hall hall = session.getHall();
                    System.out.println("Enter number of tickets you'd like to buy:");
                    int numTickets = scanner.nextInt();
                    System.out.println("Choose seats:");
                    for (int i = 0; i < hall.getNumRows(); i++) {
                        for (int j = 0; j < hall.getNumSeatsPerRow(); j++) {
                            if (session.isSeatAccessible(i, j+1)) {
                                System.out.print(hall.getRows().get(i).getSeats().get(j).getSeatNumber() + " ");
                            } else {
                                System.out.print("X ");
                            }
                        }
                        System.out.println("");
                    }

                    ArrayList<Integer> selectedSeats = new ArrayList<>();
                    ArrayList<String> tmpArr = new ArrayList<>();
                    boolean tmpFlag = false;
                    for (int i = 0; i < numTickets; i++) {
                        int seatNum=i+1;
                        System.out.println("Seat №:"+ seatNum + " Choose row");
                        int seatRow = scanner.nextInt();
                        System.out.println("Seat №:"+ seatNum + " Choose seat");
                        int seatNumber = scanner.nextInt();
                        String tmpStr = seatRow + "-" + seatNumber;
                        tmpArr.add(tmpStr);
                        for (int j = 0; j < tmpArr.size(); j++) {
                            for (int k = j+1; k < tmpArr.size(); k++) {
                                if (tmpArr.get(j).equals(tmpArr.get(k))) {
                                    tmpFlag = true;
                                }
                            }
                        }
                        if (session.isSeatAccessible(seatRow-1, seatNumber) && !tmpFlag) {
                            selectedSeats.add(seatRow-1);
                            selectedSeats.add(seatNumber);
                        } else {
                            System.out.println("Seat " + seatRow + "-" + seatNumber + "already taken!");
                            break;
                        }
                    }

                    if (selectedSeats.size()/2 == numTickets) {
                        System.out.println("Succes!");
                        System.out.println("Number of sold tickets: " + numTickets);
                        session.sellTickets(numTickets, selectedSeats);
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Wrong input");
                }

            }
        }
    }
}