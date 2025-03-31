public class StandardRoom extends Room {
    private boolean hasWIFI;

    public StandardRoom(){
        super();
        this.hasWIFI=false;
    }
    public StandardRoom(int roomNumber, String guestName, int numNights, boolean hasWIFI){
        super(roomNumber, guestName, numNights);
        this.hasWIFI=hasWIFI;
    }

    @Override
    public double calculateRoomCost() {
        return 100.00*numNights;
    }
    @Override
    public void displayRoomDetails(){
        System.out.println("------Standard Room----------");
        super.displayRoomDetails();
        System.out.println("WIFI Included: "+(hasWIFI ? "Yes" : "No"));
        System.out.println("Total Cost: $"+calculateRoomCost());
        System.out.println("Discounted Cost (Per night $10 off):$"+calculateRoomCost(10));
    }
}
