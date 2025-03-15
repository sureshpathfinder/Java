/*Interface:
        An interface is a collection of abstract behaviour or a collection of
        method definitions that individual  can implement.
        Any class implementing an interface should provide code for all
        its methods. a class can make use of the methods of an interface by
        using the keyword implements.
        Variable can also be declared with in an interface. when variables
        are included with in an interface, they become static & final. i.e
        the variables cannot be changed by the class implementing them.

note:- Interface consists of empty methods. we can use empty methods
        by implementing the interface. we can implement the interface
        and extends class.


        The general form of an interface
      
        access interface name
        {
                return type method-name1(parameter list);
                return type method-name2(parameter list);
                type final-variable1=value;
                type final-variable2=value;
        }

        Here access is either public or without specification. the
        keyword interface implies that the method definitions inside
        from an interface rather than a class definition. Therefore
        any method belonging to an interface which is implemented with
        in a class should be declared as public. variables are included
        as static & final.

        Ex:-    public interface address  //strore the interface in address.java
                {
                        public void add(String addr);
                        public void name(String nam);
                }
                here the interface named address has 2 methods.
                any class implementing this interface will neccesarily
                have to include code for all its methods.
                */
                class intface implements address
                {
                        public void name(String n)
                        {
                                System.out.println("Inside implemented method name");
                                System.out.println("Name:"+n);
                        }
                        public void add(String a)
                        {
                                System.out.println("Inside implemented method add");
                                System.out.println("Address:"+a);
                        }

                     
                        public static void main(String ar[])
                        {
                                intface a=new intface();
                                a.name("Karthik");
                                a.add("5/83 M.M.D.A Colony");
                        }
                }
                                


                                





