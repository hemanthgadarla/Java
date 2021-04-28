// Java Program to Ping an IP address
import java.io.*;
import java.net.*;
class Ping_Median {

    public void sendPingRequest(String ipAddress) throws UnknownHostException, IOException {
        long currentTime = System.currentTimeMillis();
        InetAddress address = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        if (address.isReachable(2000))
            System.out.println("Host is reachable");
        else
            System.out.println("Sorry ! We can't reach to this host");
        currentTime = System.currentTimeMillis() - currentTime;
        System.out.println("Time taken to ping the host:" + ipAddress + " is " + currentTime + " milliseconds");
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipaddress = br.readLine();
        Ping_Median ping_time = new Ping_Median();
        ping_time.sendPingRequest(ipaddress);
    }
}
