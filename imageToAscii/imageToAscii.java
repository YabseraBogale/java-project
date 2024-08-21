import java.io.File;
import java.io.IOException;
import javax.imageio.*;
public class imageToAscii{
    public static void main(String[] args) {
        try{
        var wall=new File("./wall.png");
        var bufferimage=ImageIO.read(wall);
        for(int i=0;i<bufferimage.getWidth();i++){
            for(int j=0;j<bufferimage.getHeight();j++){
                System.err.println(bufferimage.getRGB(j, i));
            }
        }
        } catch(IOException e ){
            System.err.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
    }
}