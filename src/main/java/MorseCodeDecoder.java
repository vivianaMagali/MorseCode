
public class MorseCodeDecoder {

    public static Boolean signsValid(String morseCode){
        String signValid=MorseCode.get(morseCode);
        if(signValid!=null){
            return true;
        }
        return false;
    }

    public static String getValueMorseCode(String morseCode){
        if(signsValid(morseCode)){
            return MorseCode.get(morseCode);
        }
        return " ";
    }

    public static String decode(String morseCode) {
        String result="";
        String cadena=morseCode.trim().replaceAll(" ","p");
        String cadena2=cadena.replaceAll("p{2,}", "p p");
        String[] words=cadena2.split("p");

        for (int i = 0; i <words.length ; i++) {
            words[i]=getValueMorseCode(words[i]);

            result+=words[i];
        }
        return result;
    }

}
