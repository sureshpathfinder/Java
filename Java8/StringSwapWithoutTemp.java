import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class StringSwapWithoutTemp {
    public static void main(String[] args) {
        String s1 = "Suresh";
        String s2 = "Anil";
        s1 = s1.concat(s2);
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        
        System.out.println("S1:"+ s1+ ", s2:"+ s2);
    }
}
