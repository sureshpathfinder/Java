
Network Programming
-------------------

Network is simply a collection of interconnected information devices,
which speak the same data transmission protocol. There are different
types of network.

Lan - LAN or Local Area Network is a network, Connecting machines placed
with in a small area spanning a mile or less. All machines share a common
transmission line or cable.

Wan - WAN or Wide Area Network is a network, connecting machines placed
over a longer distance may be across many miles. The machines are
connected through dedicated telephone lines or dialup telephone lines

Internet is the global IP - based network over which the web and other
popular information systems operate. A Machine can get connected to the
internet in the same way as to a WAN

To Communicate between machines a set of rules governing data format,
timing, sequence, access control and error rules should be followed. These
rules are known as protocol.

IP Protocol
        IP is a network protocol for addressing hosts and routing data
        packets called datagrams between them. the IP overlays the
        datalink layer in networks of vastly different sorts to link machines
        of different types. it projects these physical networks as if they
        were on the same network.

TCP Protocol
        TCP is a connection based protocol that sits on top of IP and
        provides a reliable flow of data between two computers. it is
        like posting a letter in registered post for which an
        acknowledgement is recieved if the letter reaches safely

UDP Protocol
        It is a connectionless transport layer protocol that sits on top
        of the IP and sends independent packets of data, called datagrams
        from one computer to another with no guarantees about arrival. it
        is like an posting an ordinary letter that may reach the destination
        or not depending upon the postal department

IP Address Port and Socket
--------------------------

Every system has a unique IP address by which a sytem can be identified
uniquely in a network. It is a 32 bit number. for a system there will
be only one connection to network, but there could be many applications
running in the system. so for communicating with each of these application
uniquely a number is given. This number is known as port number. The
port number is a 16 bit number ranges from 0 to 65535. In this number
ranging from 0 to 1023 is restricted; they are reserved for use by well
known services such as HTTP and FTP.

A Socket is one end point of a two way communication link between two
programs running on the network. A Socket is bound to a port number so
that the TCP layer can identify the application to which the data is
destined to be sent. It can be compared to electrical socket which is
used to connect an appliance to power supply. Here the program is like
an appliance and network is similar to power line.

Server will have a socket, which listens to clients request. This socket
will just listen, it does not establish connection. It notifies the
server that a client is asking for a connection. Once the server receives
the notification it creaes a new socket, which will be used to establish
connection between the server and client

DNS - Domain Naming Service is used to make the user feel comfortable
to locate a website by a name rather than a long IP address

For example here www.karsoft.com is in the COM domain(reserved for U.S
Commercial sites), it is called karsoft (after the company name), www is
the name of the specific computer that is karsoft server.

Java.net Package
----------------

        This package consists of all the classes needed to do any network
programming. The classes present in this package can be broadly classified
into TCP based networking classes, UDP based networking classes and URL
based netwoking classes.

TCP/IP is used when reliable data transfer is a must and overhead is not
a problem. the classes used to work in TCP/IP protocol are given below

        InetAddress class
        This class is used to create an object that contains the IP address
of a computer in the network.

        Socket class
        This class is used to create a socket for establishing connection
with a program in the network. Client and server program communicate with
each other only through thier respective Sockets

        ServerSocket class
        This class is used to create an object in the server, which will
listen to client's request and create a separate socket for each client
in the server.


UDP/IP is used when reliable data transfer is not required and overhead
should be kept minimum

        DatagramPacket class
        This class creates an object containing the message and target
        address where it should be sent.

        DatagramSocket class
        This class creates an object that can send as well as recieve
        messages.

        URL class
        This class is used to create object that can transmit any MIME
        type of data through any protocol. The URL objects are automatically
        downloaded and converted from thier native format to one that is usable
        from java.

InetAddress class
-----------------
        Before writing a client side or server side program it is
necessary to know the IP address of the system, which is being dealt
with. Class InetAddress is the class, which provides methods to get
information about the IP address of the system in the network
        There are no constructors fo this class; instances must  be
created by using the static methods getByName(), getLocalHost(), getAllByName().

The static methods used to create InetAddress are as follows:

        getLocalHost()
        method return an InetAddress object corresponding to the local machine

        getByName()
        method returns an InetAddress object for the specified host host.
        The host can be specified either by name(proxy0.karsoft.com) or
        by IP address(127.0.0.1). In either case, the host is specified as
        a string. There is no other client-side mechanism to construct an
        InetAddress for a remote host.

        getAllByName()
        method returns an array of InetAddress objects corresponding to every
        known IP address for the specified host. Typically a high traffic web
        site will register several IP addresses for a single hostname to distribute
        the load across several machines

Instance methods getting information from existing InetAddress are as follows

        getAddress()
        method returns an array of bytes corresponding to the
        IP address represented by the InetAddress. The array is in the
        network byte order, i.e., high byte first

        getHostName()
        method returns the name of the host represented by the InetAddress
        object. If the hostname is not already known, an attempt is made to
        look it up using DNS, based upon the IP address if this look up fails
        the number IP address is returned in string form

The method of this class could throw an UnknownHostException when host name
could not be successfully identified. The SecurityException is thrown, if
the SecurityManager does not permit a specific operation.

Socket class
------------
A socket is the java representation of TCP network connection. Using this
class, a client can establish a stream-based communication channel with
a remote host.
Creating a socket automatically connects to the specified host and port.
there must be a server listening on the host port; otherwise an exception
of type IOException will be thrown.

Constructors used to create instances

socket(string hostname,int port)
This constructor creates a socket and connects to the specified port port
of the specified host hostname. the host is specified by name or by
textual IP address

socket(InetAddress address,int port)
this constructor creates a socket and connects based on the specified
port and host address

Methods
        The method of socket class permit identification of the remote
        host and the local and remote port number, as well as extraction
        of streams for the purpose of communication

        getInputStream()
        returns an inputstream that permits stream based communication
        accross the TCP connection. All data written by the server at
        the far end of the communication may be read from this inputstream

        getOutputStream()
        returns an OutputStream that permits a stream based communication
        accross the TCP connection. the server at the far end of the
        connection may read all data written to this stream

        close()
        this method closes the socket, releasing any network and system resources
        being used. any data, which has been actually sent before this call will be
        successfully delivered to the remote end unless there is a system failure

        getInetAddress()
        returns the IP address of the remote host.

        getPort()
        returns the port number of the remote host to which the socket is connected

        getLocalPort()
        returns the local port number, i.e.,port number of the socket

ServerSocket class
------------------
        this class creates a socket for each client connection; the server
        can handle these connections in the usual manner, typically by extracting
        an inoutstream and Outputstream and communicating with the client through
        the streams interface.


constructors

        ServerSocket(int port)
        constructs a serversocket that istens on the specific port port of
        the local machine; the default limit on outstanding connection request
        (50) will be used.

        ServerSocket(int port, int count)
        constructs a ServerSocket that listens on the specified port port of the
        local machine. the count parameter specifies the number of outstanding
        connection requests that should be queued byt he operating system

Methods to accept and close connection to the client

        Socket accept()
        method blocks until a client makes connection to the port on which
        the server is listeneing. A socket is returned corresponding to the
        TCP connection to the client.

        close()
        method closes the serversocket

        int getLocalPort()
        returns the port on which this serversocket is listening. this is
        useful if port number is not specified in the socket constructor and
        will be assigned an available unused port




