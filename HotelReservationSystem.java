import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Guest {
    private String name;
    private int age;
    private String idProof;

    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    public Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation ID: ").append(reservationId).append(" Room: ").append(roomType).append("\nGuests:\n");
        for (Guest g : guests) {
            sb.append(g.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}

public class HotelReservationSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Line 1: R101, Deluxe, 2
        String[] r = sc.nextLine().trim().split(",\\s*");
        String resId = r[0];
        String roomType = r[1];
        int n = Integer.parseInt(r[2]);

        Reservation reservation = new Reservation(resId, roomType);

        // Read N guest lines
        for (int i = 0; i < n; i++) {
            String[] g = sc.nextLine().trim().split(",\\s*");
            reservation.addGuest(new Guest(g[0], Integer.parseInt(g[1]), g[2]));
        }

        System.out.println(reservation);
        sc.close();
    }
}