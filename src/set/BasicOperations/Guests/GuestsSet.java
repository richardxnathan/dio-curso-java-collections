package src.set.BasicOperations.Guests;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {

    private Set<Guest> guests = new HashSet<>();

    public void addGuest(String name, int inviteCode){
        guests.add(new Guest(name, inviteCode));
    }

    public void removeGuest(int inviteCode){
        for (Guest g : guests) {
            if(g.getInviteCode() == inviteCode){
                guests.remove(g);
                break;
            }
        }
    }

    public int getTotalNumberGuests(){
        return guests.size();
    }

    public void showGuests(){
        System.out.println(guests);
    }

}
