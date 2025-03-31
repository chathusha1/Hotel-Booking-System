public class HotelApp {
    public static void main(String[] args) {
        StandardRoom standard=new StandardRoom();
        LuxurySuite luxury=new LuxurySuite(305,"Alice Green",3,true);

        standard.displayRoomDetails();
        System.out.println();
        luxury.displayRoomDetails();
    }
}
