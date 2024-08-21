import java.io.File;
import java.io.IOException;
import javax.imageio.*;
public class imageToAscii{
    public static void main(String[] args) {
        try{
        var wall=new File("./wall.png");
        var bufferimage=ImageIO.read(wall);
        System.err.println(bufferimage);
        } catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}