public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[] {
            String.join("", " ***** ", "   ***** ", "   ***** ", "   ***** "),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", "*     *", " ***** ", "   ***** ", "   ***** "),
            String.join("", "*     *", " *     ", "       *", "       *"),
            String.join("", "*     *", " *     ", "       *", "       *"),
            String.join("", " ***** ", " *     ", " ***** ", "   ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}