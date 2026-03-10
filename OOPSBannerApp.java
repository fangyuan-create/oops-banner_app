public class OOPSBannerApp {

    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] getP() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }

    }
}