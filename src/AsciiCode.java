import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;

import javax.imageio.ImageIO;

public class AsciiCode{
    private String filePath;
    private List<Byte> asciiCode = new ArrayList<Byte>();
    AsciiCode(){
        
    }
    public void setCCode(String path){
        filePath = path;
    }
    public List<Byte> getAsciiCode(){
        try {
            BufferedImage img = ImageIO.read(new File(filePath));
            for(int i = 0; i < 100; i = i + 10){
                for(int j = 0; j < 100; j = j + 10){
                    Color color = new Color(img.getRGB(j, i));
                    asciiCode.add((byte)color.getRed());
                    asciiCode.add((byte)color.getGreen());
                    asciiCode.add((byte)color.getBlue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return asciiCode;
    }
}