package Task6;

public class SeatType {
    double seatPrice;
    int numberOfTicketSold;

    public SeatType(double seatPrice, int numberOfTicketSold) {
        this.seatPrice = seatPrice;
        this.numberOfTicketSold = numberOfTicketSold;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public int getNumberOfTicketSold() {
        return numberOfTicketSold;
    }

    public void setNumberOfTicketSold(int numberOfTicketSold) {
        this.numberOfTicketSold = numberOfTicketSold;
    }

}
