package src.set.BasicOperations.Guests;

import java.util.Objects;

public class Guest {

    private String name;
    private int inviteCode;

    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInviteCode() == guest.getInviteCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInviteCode());
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", inviteCode=" + inviteCode +
                '}';
    }

}
