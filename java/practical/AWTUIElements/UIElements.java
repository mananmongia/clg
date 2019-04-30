import java.awt.*;
class UIElements extends Frame {
  UIElements(){
    Button b = new Button("clickMe");
    b.setBounds(50,340,80,30);
    add(b);

    Label l = new Label("HI UI ELEMENTS");
    l.setText("To Set new text in label");
    String str = l.getText(); //to get text
    l.setBounds(50, 50, 200, 50);
    add(l);

    TextField tf = new TextField(20); // size of text field
    tf.setText("Manan ka text field");
    tf.setBounds(50, 100, 150, 25);
    str = tf.getText(); //to get text
    add(tf);

    Checkbox ch = new Checkbox("CSE", null, true);
    ch.setBounds(50, 130, 45,20);
    add(ch);

    //radio buttons
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox ch1 = new Checkbox("cse",cbg,true);
    Checkbox ch2 = new Checkbox("ece",cbg,false);
    Checkbox ch3 = new Checkbox("it",cbg,false);
    ch1.setBounds(50, 130, 45, 20);
    add(ch1);
    ch2.setBounds(90, 130, 45, 20);
    add(ch2);
    ch3.setBounds(130, 130, 45, 20);
    add(ch3);

    //list
    List list = new List(3, false);
    list.add("CSE");
    list.add("IT");
    list.add("ECE");
    list.setBounds(50, 150, 250, 65);
    add(list);

    //dropdowns
    Choice c = new Choice();
    c.add("cse");
    c.add("it");
    c.add("ece");
    c.setBounds(50, 220, 200, 25);
    add(c);

    // Multiline text field
    TextArea ta = new TextArea(5,5);// pass rows and columns
    ta.setBounds(50, 250, 200, 75);
    add(ta);

    setSize(600,600);//frame size 300 width and 300 height
    setLayout(null);//no layout manager
    setVisible(true);//now frame will be visible, by default not visibl
  }
  public static void main(String[] args){
    UIElements ele = new UIElements();

    MenuBar mbar = new MenuBar();
    ele.setMenuBar(mbar);
    Menu file = new Menu("Files");
    MenuItem i1= new MenuItem("New");
    MenuItem i2= new MenuItem("Open");
    file.add(i1);
    file.add(i2);
    mbar.add(file);
  }
}
