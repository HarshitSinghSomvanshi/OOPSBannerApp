public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization
        String[] banner = {
                String.join(" ", " *** ", " *** ", " **** ", " **** "),
                String.join(" ", "*   *", "*   *", "*    *", "*     "),
                String.join(" ", "*   *", "*   *", "****  ", "****  "),
                String.join(" ", "*   *", "*   *", "*     ", "    * "),
                String.join(" ", " *** ", " *** ", "*     ", "****  ")
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}