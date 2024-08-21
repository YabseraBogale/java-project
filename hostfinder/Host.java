import java.net.*;
public class Host{
    public static void main(String[] args){
        try{
            String host=InetAddress.getByName("www.google.com").toString();
            System.out.println("google address: "+host.split("/")[1]);
            String localhost=InetAddress.getLocalHost().toString();
            System.out.println("local host: "+localhost);

        } catch(UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
}