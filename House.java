package org.example;


import org.springframework.stereotype.Component;

@Component
public class House {

    private String room;

    public void setRoom(String room) {
        this.room = room;
    }

    public House() {
        this.room = "Master";
        System.out.println("Room Object created!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public House(String room) {
        System.out.println("Room is :"  + room);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }
}
