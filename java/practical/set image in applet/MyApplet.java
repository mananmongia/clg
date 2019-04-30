import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet{
  Image i;
  public void init(){
    i = getImage(getDocumentBase(),"Java.png");
                  // return url of document in which Applet is enabled => getDocumentBase()
  }
  public void paint(Graphics g){
    g.drawImage(i,0,0,this);
  }
}
