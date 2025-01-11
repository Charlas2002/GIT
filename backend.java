class Database {
    void base() {
        String data = "I'm using MySQL";
        System.out.println(data);
    }
}
public class backend {
    public static void main(String[] args) {
        Database obj = new Database();
        obj.base(); 
    }
}
