public class Room {
    protected int roomNumber;
    protected String guestName;
    protected int numNights;

    public Room(){
        this.roomNumber=0;
        this.guestName="Unknown";
        this.numNights=0;
    }
    public Room(int roomNumber, String guestName, int numNights){
        this.roomNumber=roomNumber;
        this.guestName=guestName;
        this.numNights=numNights;
    }
    public void displayRoomDetails(){
        System.out.println("Room Number: "+roomNumber);
        System.out.println("Guest Name: "+guestName);
        System.out.println("Number Of Nights: "+numNights);
    }
    public double calculateRoomCost(){
        return 150.00*numNights;
    }
    public double calculateRoomCost(int discount){
        return calculateRoomCost()-discount*numNights;
    }
}
