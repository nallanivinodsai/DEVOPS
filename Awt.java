import java.awt.*;
import java.awt.event.*;
public class AwtControlDemo {
public static void main(String[] args)
{
 Frame mainFrame = new Frame("Java AWT Examples");
 mainFrame.setSize(400,400);
 mainFrame.setLayout(new GridLayout(3, 1));
 mainFrame.addWindowListener(new WindowAdapter() {public void
windowClosing(WindowEvent windowEvent){System.exit(0);}});
 Label headerLabel = new Label();
 headerLabel.setText("Hello");
 Panel controlpanel= new Panel();
 controlpanel.setLayout(new FlowLayout());
 List fruit = new List();
 fruit.add("Orange");
 fruit.add("Apple");
 Choice fruit1 = new Choice();
 fruit1.add("Orange");
 fruit1.add("Apple");
 CheckboxGroup cbg1=new CheckboxGroup();
 CheckboxGroup cbg2=new CheckboxGroup();
 Checkbox ch1=new Checkbox("Apple");
 Checkbox ch2=new Checkbox("Orange");
Checkbox ch11=new Checkbox("Apple",cbg1,false);
 Checkbox ch21=new Checkbox("Orange",cbg2,false);
 Button b1 =new Button("Submit");
 Button b2=new Button("OK");
 Scrollbar scroll = new Scrollbar(Scrollbar.HORIZONTAL);
 scroll.setMinimum(1);
 scroll.setMaximum(100);
 controlpanel.add(fruit);
 controlpanel.add(fruit1);
 controlpanel.add(b1);
 controlpanel.add(b2);
 controlpanel.add(ch1);
 controlpanel.add(ch2);
 controlpanel.add(ch11);
 controlpanel.add(ch21);
 controlpanel.add(scroll);
 mainFrame.add(headerLabel);
 mainFrame.add(controlpanel);
 mainFrame.setVisible(true);
}
}
