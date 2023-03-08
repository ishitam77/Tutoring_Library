import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Corz implements ActionListener
{
JFrame fr;
JButton b3,b4,b5,b6,b7,b8,b9,b10;
JPanel pa;
Font fo;
public Corz()
{
fo=new Font("Times New Roman",Font.BOLD,18);
fr=new JFrame("Courses");
fr.setSize(850,570);
fr.setResizable(false);
pa=new JPanel();
pa.setLayout(null);
fr.add(pa);
b3=new JButton("1st_Semester");b4=new JButton("2nd_Semester");
b5=new JButton("3rd_Semester");b6=new JButton("4th_Semester");
b7=new JButton("5th_Semester");b8=new JButton("6th_Semester");
b9=new JButton("Back");b10=new JButton("Logout");
b3.setBounds(100,50,200,40);b4.setBounds(500,50,200,40);
b5.setBounds(100,150,200,40);b6.setBounds(500,150,200,40);
b7.setBounds(100,250,200,40);b8.setBounds(500,250,200,40);
b9.setBounds(30,400,200,40);b10.setBounds(600,400,200,40);
b3.setFont(fo);
b4.setFont(fo);b5.setFont(fo);b6.setFont(fo);b7.setFont(fo);
b8.setFont(fo);b9.setFont(fo);b10.setFont(fo);
pa.add(b3);pa.add(b4);pa.add(b5);
pa.add(b6);pa.add(b7);pa.add(b8);pa.add(b9);pa.add(b10);
fr.setDefaultCloseOperation(3);
fr.setVisible(true);
b3.addActionListener(this);
b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
b10.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==b3)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\1sem.pdf");
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
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\2sem.pdf");
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
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\3sem.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}	
	}
	if(evt.getSource()==b6)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\4sem.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}
	}
	if(evt.getSource()==b7)
	{
	try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\5sem.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}
	}
	if(evt.getSource()==b8)
	{
		try
	{
	Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " +"D:\\Tul\\6sem.pdf");
	}
	catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Check file details");	
	}
	}
	if(evt.getSource()==b9)
	{
		Admf lg=new Admf();
		fr.dispose();
	}
	if(evt.getSource()==b10)
	{
		Tul tl=new Tul();
		fr.dispose();	
	}
}
public static void main(String ...k)
{
	new Corz();
}
}

	


