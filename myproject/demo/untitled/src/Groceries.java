public class Groceries {
    private int salt;
    private String chilliPowder;
    private int paste;
    private String dal;

    @Override
    public String toString() {
        return "Groceries{" +
                "salt=" + salt +
                ", chilliPowder='" + chilliPowder + '\'' +
                ", paste=" + paste +
                ", dal='" + dal + '\'' +
                '}';
    }

    public Groceries(int salt, String chilliPowder, int paste, String dal) {
        this.salt = salt;
        this.chilliPowder = chilliPowder;
        this.paste = paste;
        this.dal = dal;
    }
}
