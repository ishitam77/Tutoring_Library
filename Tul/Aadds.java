import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Aadds implements ActionListener,MouseListener,FocusListener
{
	JFrame fr;
	JLabel l1,l2,ml1,ml2,l3,ml3;
	JPanel pa;
	JTextField t1,t3;
	JPasswordField t2;
	JButton b1,b2,b3;
	Border b;
	Icon showw,hide;
	char ch;
	Font fo;
	Connection con;
	public Aadds()
	{
		fo = new Font("Times New Roman",Font.BOLD,16);
		showw=new ImageIcon("showw.png");
		hide=new ImageIcon("hide.png");
		b=BorderFactory.createEmptyBorder();
		fr=new JFrame("Add_User");
		fr.setSize(580,430);
		pa=new JPanel();
		fr.add(pa);
		pa.setLayout(null);
		l1=new JLabel("Username");
		l2=new JLabel("Password");	
		l3=new JLabel("User Id");
		t1=new JTextField();
		t3=new JTextField();
		t2=new JPasswordField(15);
		ch=t2.getEchoChar();
		b1=new JButton("Back");
		b2=new JButton("Submit");
		b3=new JButton();
		b3.setIcon(hide);
		ml1=new JLabel("");
		ml2=new JLabel("");
		ml3=new JLabel("");
		ml1.setForeground(Color.red);
		ml2.setForeground(Color.red);
		ml3.setForeground(Color.red);
		l3.setBounds(60,50,120,40);t3.setBounds(180,50,200,40);
		ml3.setBounds(390,50,200,30);
		l1.setBounds(60,120,120,40);t1.setBounds(180,120,200,40);
		ml1.setBounds(390,120,200,30);
		l2.setBounds(60,190,120,40);t2.setBounds(180,190,160,40);b3.setBounds(340,190,40,40);	
		ml2.setBounds(390,190,200,30);
		b1.setBounds(30,300,100,40);b2.setBounds(400,300,100,40);
		b3.setBorder(b);t2.setBorder(b);t1.setBorder(b);t3.setBorder(b);
        b3.setBackground(Color.white);
		l1.setFont(fo);l2.setFont(fo);ml1.setFont(fo);ml2.setFont(fo);
		t1.setFont(fo);t2.setFont(fo);l3.setFont(fo);ml3.setFont(fo);t3.setFont(fo);
        pa.add(l1);pa.add(l2);pa.add(l3);pa.add(ml3);pa.add(t3);
		pa.add(t1);pa.add(t2);pa.add(ml1);pa.add(ml2);pa.add(b1);pa.add(b2);pa.add(b3);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		t3.addFocusListener(this);
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
		if(evt1.getSource()==t3)
		{
		    ml3.setText("");
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
		if(evt1.getSource()==t3)
		{
			if(t3.getText().equals(""))
			{
				ml3.setText("please fill the User Id");
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
		Admf t10=new Admf();
		fr.dispose();
		}
		if(evt.getSource()==b2)
		{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","1324");
		PreparedStatement stmt=con.prepareStatement("insert into user1(u_id,u_username,u_password) values(?,?,?);");
		stmt.setString(1,t3.getText());
		stmt.setString(1,t1.getText());
		stmt.setString(1,t2.getPassword().toString());
		int x=stmt.executeUpdate();
		if(x>0)
		{
		JOptionPane.showMessageDialog(null,"Record Added Sucessfully....");
		}
		else
		{
		JOptionPane.showMessageDialog(null,"Failed....");
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
		new Aadds();
	}
}
