

public class MorseCodeDecoder {

    public static Boolean signsValid(String morseCode){
        String signValid=MorseCode.get(morseCode);
        if(signValid!=null){
            return true;
        }
        return false;
    }
    


}
