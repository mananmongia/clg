/* <applet code="Myjapplet.class" width="300" height="300">  */
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
public class Myjapplet extends Applet implements ActionListener{
  JButton b;
  JTextField tf;
  public void init(){

    tf=new JTextField();
    tf.setBounds(30,40,150,20);

    b=new JButton("Click");
    b.setBounds(80,150,70,40);

    add(b);add(tf);
    b.addActionListener(this);

    setLayout(null);
  }

  public void actionPerformed(ActionEvent e){
    tf.setText("Welcome");
  }
}
