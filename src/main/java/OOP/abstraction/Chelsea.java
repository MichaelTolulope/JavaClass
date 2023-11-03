package OOP.abstraction;

import java.util.ArrayList;

public class Chelsea implements FootballClub {

    @Override
    public String stadium() {
        return "Stanford Bridge";
    }

    @Override
    public String coach() {
    return "Mauricio Pochetino";
    }


    public ArrayList<String> players() {
        ArrayList<String> player = new ArrayList<>();
        player.add(0,"Sanchez");
        player.add("Theago costa");
        return  player;
    }

    public static void main(String[] args) {
        System.out.println("the list of players : "+new Chelsea().players());
    }
}
