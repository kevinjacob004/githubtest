 import java.awt.*;  
    import java.awt.event.*;  
    class AEvent extends Frame implements ActionListener{  
    TextField tf;  
    AEvent(){  
JFrame jf=new JFrame("EX");
    //create components  
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    Button b=new Button("click me");  
    b.setBounds(100,120,80,30);  
    //register listener  
    b.addActionListener(this);//passing current instance  
//add components and set size, layout and visibility  
   jf. add(b);
   jf. add(tf);  
    setSize(300,300);  
    setLayout(new FlowLayout());  
    setVisible(true);  
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public void actionPerformed(ActionEvent e){  
    tf.setText("Welcome");  
    }  
    public static void main(String args[]){  
    new AEvent();  
    }  
    } 
