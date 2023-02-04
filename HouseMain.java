import java.util.*;

public class HouseMain {
    Kitchen kitchen = new Kitchen();
    DinningRoom dinningRoom = new DinningRoom();
    LivingRoom livingRoom = new LivingRoom();
    List<RestRoom> restRoom = new ArrayList<RestRoom>();
    List<List<BedRoom>> bedRoom = new ArrayList<List<BedRoom>>();
    Yard yard;

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

    public List<List<BedRoom>> getBedRoom() {
        return bedRoom;
    }

    public List<RestRoom> getRestRoom() {
        return restRoom;
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

    public void addRestRoom(List<RestRoom> newRestRoom) {
        restRoom.add((RestRoom) newRestRoom);
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }

    public void addBedRoom(List<BedRoom> newBedRoom) {
        bedRoom.add(newBedRoom);
    }
}
