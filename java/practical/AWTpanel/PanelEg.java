// Panel is a simplest container class.
// It provides space in which an application can attach any other component.
// It inherits the Container class.
// It doesn't have title bar.
//
// AWT Panel class declaration :
// public class Panel extends Container implements Accessible
import java.awt.*;
public class PanelEg {
     PanelEg(){
        Frame f= new Frame("Panel Example");
        Panel panel=new Panel();

        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.gray);

        Button b1=new Button("Button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        panel.add(b1);
        
        Button b2=new Button("Button 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
        panel.add(b2);

        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new PanelEg();
    }
}
