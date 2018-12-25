import java.util.*;
public class RawData{
    RawData(){

    }
    
    public String getRawData(String path){
        AsciiCode asciiCode = new AsciiCode();
        asciiCode.setCCode(path);
        byte[] asciiCodeArrayPri = new byte[asciiCode.getAsciiCode().size()];
        for(int i = 0; i < asciiCodeArrayPri.length; i++){
            asciiCodeArrayPri[i] = asciiCode.getAsciiCode().get(i);
        }
        
        String rawData = "";
        try {
            rawData = new String(asciiCodeArrayPri, "US-ASCII");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rawData;
    }
}