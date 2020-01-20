import java.util.HashMap;

public class MorseCode {
    private static final HashMap<String, String> Morse = new HashMap(){{

        put(".-", "A");
        put(".-", "A");
        put("-...", "B");
        put("-.-.", "C");
        put("-..", "D");
        put(".", "E");
        put("..-.", "F");
        put("--.", "G");
        put("....", "H");
        put("..", "I");
        put(".---", "J");
        put("-.-", "K");
        put(".-..", "L");
        put("--", "M");
        put("-.", "N");
        put("---", "O");
        put(".--.", "P");
        put("--.-", "Q");
        put(".-.", "R");
        put("...", "S");
        put("-", "T");
        put("..-", "U");
        put("...-", "V");
        put(".--", "W");
        put("-..-", "X");
        put("-.--", "Y");
        put("--..", "Z");
        put("-----", "0");
        put(".----", "1");
        put("..---", "2");
        put("...--", "3");
        put("....-", "4");
        put(".....", "5");
        put("-....", "6");
        put("--...", "7");
        put("---..", "8");
        put("----.", "9");
        put(".-.-.-", ".");
        put("--..--", ",");
        put("..--..", "?");
        put(".----.", "'");
        put("-.-.--", "!");
        put("-..-.", "/");
        put("-.--.", "(");
        put("-.--.-", ")");
        put(".-...", "&");
        put("---...", ",");
        put("-.-.-.", ";");
        put("-...-", "=");
        put(".-.-.", "+");
        put("-....-", "-");
        put("..--.-", "_");
        put(".-..-.", "\"");
        put("...-..-", "$");
        put(".--.-.", "@");
        put("...---...", "SOS");


    }};

    public static String get(String morseCode){
        return Morse.get(morseCode);
    }


    public static void main(String[] args) {
        System.out.println(Morse.get("...---..."));
    }

}
