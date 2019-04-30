import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet{
  String str = null;
  public void init(){
    str = getParameter("Manan");
  }
  public void paint(Graphics g){
    g.drawString(str,100,100);
  }
}
