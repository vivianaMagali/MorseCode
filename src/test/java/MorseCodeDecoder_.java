import org.junit.Test;
import static org.junit.Assert.*;


public class MorseCodeDecoder_ {


    @Test
    public void signsValid(){
        assertTrue(MorseCodeDecoder.signsValid("."));
        assertFalse(MorseCodeDecoder.signsValid("?"));
    }

    @Test
    public void decodeGoodMorseCode(){

        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }


}
