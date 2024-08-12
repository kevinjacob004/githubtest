import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class gui{
public static void main(String []args){
	new goo();
}
}

class goo {
	 JFrame jf;
	JLabel jl,jl1;
	JTextField jt1,jt2;
	JButton b1;
	ImageIcon i;
	goo(){
		jf=new JFrame("Example");
		jl=new JLabel("Hello Guys..😃😃");
		b1=new JButton("Click ME ...");
		i=new ImageIcon("java/index.jpg");	 
		jl1=new JLabel();
		jf.add(jl);
		jf.add(b1);
		jf.add(jl1);
		b1.addActionListener(new hello());
		jf.setSize(400,400);
		jf.setLayout(new GridLayout(3,1));
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class hello implements ActionListener{
	public void actionPerformed(ActionEvent ae){
	JButton b=(JButton)ae.getSource();
if(b==b1){jl1.setIcon(i);
}
	}
	}
	
}

