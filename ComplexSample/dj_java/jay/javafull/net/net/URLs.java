import java.net.*;

class URLs
{
    public static void main(String args[]) throws MalformedURLException 
    {
        URL url = new URL("http://WWW.freeway.com:80/root/htmlfiles/index.html");

        System.out.println("URL protocol: " + url.getProtocol());
        System.out.println("Host name: " + url.getHost());
        System.out.println("File name: " + url.getFile());
        System.out.println("Ext:" + url.toExternalForm());
       System.out.println("Port :" + url.getPort());
    }
}
