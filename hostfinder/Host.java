import java.net.*;
public class Host{
    public static void main(String[] args){
        try{
            String host=InetAddress.getByName("www.google.com").toString();
            System.out.println("google address: "+host.split("/")[1]);
        } catch(UnknownHostException e){
            System.out.println(e);
        }
    }
}