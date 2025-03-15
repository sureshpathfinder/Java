import java.awt.*;
public class NewTextArea extends TextArea
{
String data;
public NewTextArea()
{
super(10,50);
data="Java beans are reusable software components written in java.\n";
data+="Java beans are not only way to write component software.\n";
data+="They are however,the easiest.\n";
data+="Java beans that we create can run in nearly any computing environment\n";
data+="That can connect to internet because java compiles to portable code.\n";
data+="Java beans defines an entirely new class of commercial software,which will be delivered primarily over the internet.\n";
setText(data);
}
}
 