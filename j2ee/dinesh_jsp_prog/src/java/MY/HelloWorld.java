/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MY;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

/**
 *
 * @author THENNARASU
 */
public class HelloWorld extends TagSupport
{
    @Override
    
    public int doStartTag()
    {
        try
        {
            JspWriter out=pageContext.getOut();
            out.println("<font color=blue size=+3> Hello J2ee Programmer..!!!</font>");
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        return (SKIP_BODY);
    }
}
