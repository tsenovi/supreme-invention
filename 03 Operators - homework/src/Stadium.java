

public class Stadium {
    public static void main(String[] args) {
        int capacity = 34999;
        boolean hasLights = false;

        boolean hasLicence = hasLights || (capacity >= 35000);
        String result = hasLicence ? "The Stadium have licence for A group" : "The Stadium does not have licence for A group";
        System.out.println(result);
    }
}
