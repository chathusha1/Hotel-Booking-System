public class LuxurySuite extends Room {
    private boolean hasExtraServices;

    public LuxurySuite(int roomNumber, String guestName, int numNights, boolean hasExtraServices ){
        super(roomNumber, guestName, numNights);
        this.hasExtraServices = hasExtraServices;
    }

    public double calculateRoomCost(){
        return(200.00*numNights)+(hasExtraServices ? 75.00 : 0);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("-------Luxury Suite--------");
        super.displayRoomDetails();
        System.out.println("Extra Services (Breakfast & Pickup): "+(hasExtraServices ? "Yes":"No"));
        System.out.println("Total Cost:Rs."+calculateRoomCost());
        System.out.println("Discounted Cost (per night $15 off): $"+calculateRoomCost(15));
    }
}
