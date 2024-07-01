package src.set.BasicOperations.Guests;

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
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", inviteCode=" + inviteCode +
                '}';
    }

}
