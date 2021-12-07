package Task6;

public class SeatTypeTest {
    public static void main(String[] args) {
        SeatType seatA = new SeatType(100, 25);
        SeatType seatB = new SeatType(200, 15);
        SeatType seatC = new SeatType(500, 75);

        double total = seatA.seatPrice * seatA.numberOfTicketSold
                + seatB.seatPrice * seatB.numberOfTicketSold +
                seatC.seatPrice * seatC.numberOfTicketSold;

        System.out.printf("\ntotalSales: $%s \n", total);
    }
}
