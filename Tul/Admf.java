import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
class Admf implements ActionListener
{
JFrame fr;
JLabel l1;
JButton b1,b2,b3,b4,b5,b7,b8,b9,b10;
JPanel pa;
Font fo;
Connection con;
public Admf()
{
fo=new Font("Times New Roman",Font.BOLD,18);
fr=new JFrame("ADMIN");
fr.setSize(850,600);
fr.setResizable(false);
pa=new JPanel();
pa.setLayout(null);
fr.add(pa);
l1=new JLabel("_Admin Functions_");
b1=new JButton("View_Courses");b2=new JButton("Read_Notes");
b3=new JButton("View_Users");b5=new JButton("Add_Users");
b7=new JButton("Remove_Users");b4=new JButton("View_Papers");
b9=new JButton("Back");b10=new JButton("Logout");
l1.setBounds(350,0,400,150);
b3.setBounds(100,150,200,40);b5.setBounds(500,150,200,40);
b7.setBounds(100,250,200,40);b4.setBounds(500,250,200,40);
b1.setBounds(100,350,200,40);b2.setBounds(500,350,200,40);
b9.setBounds(30,500,200,40);b10.setBounds(600,500,200,40);
l1.setFont(fo);b1.setFont(fo);b2.setFont(fo);
b3.setFont(fo);b5.setFont(fo);b7.setFont(fo);
b9.setFont(fo);b10.setFont(fo);b4.setFont(fo);
pa.add(l1);pa.add(b1);pa.add(b2);pa.add(b3);pa.add(b5);
pa.add(b7);pa.add(b9);pa.add(b10);pa.add(b4);
fr.setDefaultCloseOperation(3);
fr.setVisible(true);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
b5.addActionListener(this);b7.addActionListener(this);b4.addActionListener(this);
b9.addActionListener(this);b10.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==b1)
	{
		Corz t2=new Corz();
		fr.dispose();
	}
	if(evt.getSource()==b2)
	{
		Coraf t2=new Coraf();
		fr.dispose();
	}
	if(evt.getSource()==b3)
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","1324");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from user1");
		while(rs.next())
		{
		System.out.println("User_ID_ : Username : Password");
        System.out.println(rs.getInt(1)+ " : " +rs.getString(2)+ " : " +rs.getString(3));
		con.close();
		}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}		
	if(evt.getSource()==b4)
	{
		Admvp n8=new Admvp();
		fr.dispose();
	}
	if(evt.getSource()==b5)
	{
		Aadds no1=new Aadds();
		fr.dispose();
	}
	if(evt.getSource()==b7)
	{
		Arms no3=new Arms();
		fr.dispose();
	}
	if(evt.getSource()==b9)
	{
		Alogin yes=new Alogin();
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
	new Admf();
}
}

	


