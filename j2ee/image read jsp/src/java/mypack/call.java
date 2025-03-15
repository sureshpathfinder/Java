/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

/**
 *
 * @author popular
 */
import java.io.*;
class call

{
    String path;
    call(String s)
    {
        path=s;
    }
void del()
    {
    File df=new File(path);
        df.delete();
}
}