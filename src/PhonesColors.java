public class PhonesColors {
    public static final String Red = "Red";
    public static final String Yellow = "Yellow";

    public static String getColorByNumber(int numberColor) {
        switch (numberColor) {
            case 1:
                return Red;
            case 2:
                return Yellow;
        }
        return "None";
    }
}
