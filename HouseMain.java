package src;

import src.Room_Type.*;

public class HouseMain {
    public  static final int MAX_BED_ROOMS = 10;
    public  static final int MAX_REST_ROOMS = 10;


    private Kitchen kitchen = new Kitchen();
    private DinningRoom dinningRoom = new DinningRoom();
    private LivingRoom livingRoom = new LivingRoom();
    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;

    public DinningRoom getDinningRoom() {
        return dinningRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Yard getYard() {
        return yard;
    }


    public void setDinningRoom(DinningRoom dinningRoom) {
        this.dinningRoom = dinningRoom;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }


    public void setYard(Yard yard) {
        this.yard = yard;
    }

    public void addRoom(BedRoom[] bedRooms, BedRoom newBedRoom) {
        int n = bedRooms.length;
        if (n < MAX_BED_ROOMS) {
            bedRooms[n-1] = newBedRoom;
        }
    }
    public void addRoom(RestRoom[] restRooms, RestRoom newRestRoom) {
        int n = restRooms.length;
        if (n < MAX_BED_ROOMS) {
            restRooms[n-1] = newRestRoom;
        }
    }
}
