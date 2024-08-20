import java.net.InetAddress;
public class Host{
    public static void main(String[] args){
        try{
            String host=InetAddress.getByName("www.google.com").toString();
            System.out.println("google address: "+host.split("/")[1]);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}