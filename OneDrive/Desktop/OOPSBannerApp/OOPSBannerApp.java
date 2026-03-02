public class OOPSBannerApp {

    static class CharacterPatternMap {
        private String[] patterns;

        public CharacterPatternMap(String[] patterns) {
            this.patterns = patterns;
        }

        public String getLine(int index) {
            return patterns[index];
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap charO = new CharacterPatternMap(new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPatternMap charP = new CharacterPatternMap(new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPatternMap charS = new CharacterPatternMap(new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(
                charO.getLine(i) + "  " +
                charO.getLine(i) + "  " +
                charP.getLine(i) + "  " +
                charS.getLine(i)
            );
        }
    }
}