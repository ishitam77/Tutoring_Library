import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Sem3s implements ActionListener
{
JFrame fr;
JButton b1,b2,b3,b4,b5,b6,b7;
JPanel pa;
Font fo;
public Sem3s()
{
fo=new Font("Times New Roman",Font.BOLD,18);
fr=new JFrame("3rd_Semester");
fr.setSize(800,500);
fr.setResizable(false);
pa=new JPanel();
pa.setLayout(null);
fr.add(pa);
b1=new JButton("Code-301");b2=new JButton("Code-302");
b3=new JButton("Code-303");
b4=new JButton("Code-304");
b5=new JButton("Code-305");
b6=new JButton("Back");b7=new JButton("Logout");
b1.setBounds(100,50,200,40);b2.setBounds(450,50,200,40);
b3.setBounds(100,150,200,40);b4.setBounds(450,150,200,40);
b5.setBounds(270,250,200,40);
b6.setBounds(50,370,200,40);b7.setBounds(490,370,200,40);
b1.setFont(fo);b2.setFont(fo);b3.setFont(fo);
b4.setFont(fo);b5.setFont(fo);b6.setFont(fo);b7.setFont(fo);
pa.add(b1);pa.add(b2);pa.add(b3);pa.add(b4);pa.add(b5);
pa.add(b6);pa.add(b7);
fr.setDefaultCloseOperation(3);
fr.setVisible(true);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
b7.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==b1)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\c301.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}				
	}
	if(evt.getSource()==b2)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\c302.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}					
	}
	if(evt.getSource()==b3)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\c303.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}					
	}
	if(evt.getSource()==b4)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\c304.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}					
	}
	if(evt.getSource()==b5)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\c305.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}					
	}
	if(evt.getSource()==b6)
	{
		Cors yr5=new Cors();
		fr.dispose();
	}
	if(evt.getSource()==b7)
	{
		Tul tl=new Tul();
		fr.dispose();
	}
}
public static void main(String ...k)
{
	new Sem3s();
}
}

	


