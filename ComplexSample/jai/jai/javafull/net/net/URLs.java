import java.net.*;

class URLs
{
    public static void main(String args[]) throws MalformedURLException 
    {
        URL url = new URL("ftp://E:/JAY/jai/JScroll2.class");

        System.out.println("URL protocol: " + url.getProtocol());
        System.out.println("Host name: " + url.getHost());
        System.out.println("File name: " + url.getFile());
        System.out.println("Ext:" + url.toExternalForm());
       System.out.println("Port :" + url.getPort());
    }
}
