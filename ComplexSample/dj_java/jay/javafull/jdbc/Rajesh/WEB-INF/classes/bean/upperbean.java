package bean;
import java.io.*;
public class upperbean implements Serializable
{
String str;
public void setStr(String str)
	{
	this.str=str;
	}
public String getStr()
	{
	return (str.toUpperCase());
	}
}