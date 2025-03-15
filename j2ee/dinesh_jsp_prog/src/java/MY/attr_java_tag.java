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
public class attr_java_tag extends TagSupport
{
    private int size=3;
    @Override
    public int doStartTag()
    {
    try
        {
            
            JspWriter out=pageContext.getOut();
            out.println("<h1>Value : "+size+"</h1>");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    return (SKIP_BODY);
    }
    
    public void setSize(String s)
    {
        try
        {
            size=Integer.parseInt(s);
        }
        catch(Exception e)
        {
            
        }
    }
    
}
