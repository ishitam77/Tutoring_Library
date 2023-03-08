import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Tul implements ActionListener
{
JFrame fr;
JLabel l1,img;
JButton b1,b3;
JPanel pa;
Font fo;
Icon ic;
public Tul()
{
ic=new ImageIcon("tul.png");
img=new JLabel(ic);
fo=new Font("Times New Roman",Font.BOLD,18);
fr=new JFrame("BCA_TUTORIAL");
fr.setSize(700,450);
fr.setResizable(false);
pa=new JPanel();
pa.setLayout(null);
fr.add(pa);
l1=new JLabel("***HOME***");
b1=new JButton("ADMIN LOGIN");
b3=new JButton("USER LOGIN");
img.setBounds(340,50,300,300);
l1.setBounds(150,50,200,70);
b1.setBounds(100,150,200,40);
b3.setBounds(100,270,200,40);
l1.setFont(fo);b1.setFont(fo);b3.setFont(fo);
pa.add(l1);pa.add(b1);pa.add(b3);
pa.add(img);
fr.setDefaultCloseOperation(3);
fr.setVisible(true);
b1.addActionListener(this);b3.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==b1)
	{
		Alogin yes=new Alogin();
		fr.dispose();
	}
	if(evt.getSource()==b3)
	{
		Stulogin yes2=new Stulogin();
		fr.dispose();
	}
}
public static void main(String ...k)
{
	new Tul();
}
}

	


