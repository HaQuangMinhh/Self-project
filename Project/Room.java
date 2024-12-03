package Nhap1;

import java.time.LocalDateTime;

public class Room extends Item {
    private String RoomInfor ;   // phải là string 
    //  Updated 
    private LocalDateTime endTime ; 

    public Room(int itemId, String roomInfor) {
        super(itemId, roomInfor);
        this.RoomInfor = roomInfor;
    }

    public String getRoomInfor() {
        return RoomInfor;
    }

    public void setRoomInfor(String roomInfor) {
        this.RoomInfor = roomInfor;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    } 






}
