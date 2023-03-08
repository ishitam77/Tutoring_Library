import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Stulogin implements ActionListener,MouseListener,FocusListener
{
	JFrame fr;
	JLabel l1,l2,ml1,ml2;
	JPanel pa;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3;
	Border b;
	Icon showw,hide;
	char ch;
	Font fo;
	Connection con;
	public Stulogin()
	{
		fo = new Font("Times New Roman",Font.BOLD,16);
		showw=new ImageIcon("showw.png");
		hide=new ImageIcon("hide.png");
		b=BorderFactory.createEmptyBorder();
		fr=new JFrame("USER_Login");
		fr.setSize(580,350);
		pa=new JPanel();
		fr.add(pa);
		pa.setLayout(null);
		l1=new JLabel("Username");
		l2=new JLabel("Password");		
		t1=new JTextField();
		t2=new JPasswordField(15);
		ch=t2.getEchoChar();
		b1=new JButton("Back");
		b2=new JButton("Submit");
		b3=new JButton();
		b3.setIcon(hide);
		ml1=new JLabel("");
		ml2=new JLabel("");
		ml1.setForeground(Color.red);
		ml2.setForeground(Color.red);
		l1.setBounds(60,50,120,40);t1.setBounds(180,50,200,40);
		ml1.setBounds(390,50,200,30);
		l2.setBounds(60,120,120,40);t2.setBounds(180,120,160,40);b3.setBounds(340,120,40,40);	
		ml2.setBounds(390,120,200,30);
		b1.setBounds(30,240,100,40);b2.setBounds(400,240,100,40);
		b3.setBorder(b);t2.setBorder(b);t1.setBorder(b);
        b3.setBackground(Color.white);
		l1.setFont(fo);l2.setFont(fo);ml1.setFont(fo);ml2.setFont(fo);
		t1.setFont(fo);t2.setFont(fo);
        pa.add(l1);pa.add(l2);
		pa.add(t1);pa.add(t2);pa.add(ml1);pa.add(ml2);pa.add(b1);pa.add(b2);pa.add(b3);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addMouseListener(this);
		fr.setDefaultCloseOperation(3);
		fr.setVisible(true);
	}
	public void focusGained(FocusEvent evt1)
	{
		if(evt1.getSource()==t1)
		{
			ml1.setText("");
		}
		if(evt1.getSource()==t2)
		{
		    ml2.setText("");
		}
	}
	public void focusLost(FocusEvent evt1)
	{
		if(evt1.getSource()==t1)
		{
			if(t1.getText().equals(""))
			{
				ml1.setText("please fill the Username");
			}
		}
		if(evt1.getSource()==t2)
		{
			if(t2.getText().equals(""))
			{
				ml2.setText("please fill the password");
			}
		}
	}
			
	public void mousePressed(MouseEvent evt2)
	{
		b3.setIcon(showw);
		t2.setEchoChar((char)0);
	}
	public void mouseReleased(MouseEvent evt2)
	{
		b3.setIcon(hide);
		t2.setEchoChar(ch );
	}
	public void mouseEntered(MouseEvent evt2)
	{}
	public void mouseExited(MouseEvent evt2)
	{}
	public void mouseClicked(MouseEvent evt2)
	{}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
		{
			Tul tl=new Tul();
		    fr.dispose();
		}
		if(evt.getSource()==b2)
		{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","1324");
		Statement stmt=con.createStatement();
		String sql="Select * from user1 where u_username='"+t1.getText()+"' and u_password='"+t2.getPassword().toString()+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			JOptionPane.showMessageDialog(null,"Login Sucessfully....");
			Stf qg=new Stf();
		    fr.dispose();   	
		}		
		else
		{
			JOptionPane.showMessageDialog(null,"Incorrect username and password....");
			con.close();
		}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}	
		}
	}	
	public static void main(String ...k)
	{
		new Stulogin();
	}
}
