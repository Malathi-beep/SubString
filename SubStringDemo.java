public class SubStringDemo {
    public static void main(String[] args) {
        String username = "malathi Ganesan";
        int n = 5; // number of characters
        if (username.length() >= n) {
            String result = username.substring(0, n);
            System.out.println("Displayed Name: " + result);
        } else {
            System.out.println("Username too short");
        }
    }
}
