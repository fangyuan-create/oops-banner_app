import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {

            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            }));
        }

        public static String[] getPattern(char c) {
            return patternMap.get(c).getPattern();
        }
    }

    public static void main(String[] args) {

        char[] word = {'O','O','P','S'};

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word) {
                line.append(CharacterPatternMap.getPattern(c)[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}