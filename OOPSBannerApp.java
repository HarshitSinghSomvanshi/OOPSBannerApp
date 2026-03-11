public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                getOPattern()[0] + " " + getOPattern()[0] + " " + getPPattern()[0] + " " + getSPattern()[0],
                getOPattern()[1] + " " + getOPattern()[1] + " " + getPPattern()[1] + " " + getSPattern()[1],
                getOPattern()[2] + " " + getOPattern()[2] + " " + getPPattern()[2] + " " + getSPattern()[2],
                getOPattern()[3] + " " + getOPattern()[3] + " " + getPPattern()[3] + " " + getSPattern()[3],
                getOPattern()[4] + " " + getOPattern()[4] + " " + getPPattern()[4] + " " + getSPattern()[4]
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Pattern for O
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Pattern for P
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Pattern for S
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }
}