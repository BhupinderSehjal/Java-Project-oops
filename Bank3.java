import javax.swing.*;            //For adding table content ex tablemodel tabel fonts etc;
import java.awt.*;               //For  adding actionlistener
import java.awt.event.*;         //For adding events to perform action of actionlistener; 
import java.io.FileReader;       // Library to read the content of datafiles
import java.io.FileWriter;       // Library to Write the content in the datafile
import java.io.IOException;      // Library to catch the the exception related to input and output of the program
import java.io.BufferedReader;   // Library to occupiy the memory of the buffered area(Which is faster in the process of exchanging values of variables)
import java.io.*;                // Library to use any input output(io) library
import javax.swing.table.DefaultTableModel;   //Library to add DefaultTableModel in the program
import javax.swing.table.JTableHeader;        //Library to add the Heading of the coloumns of the table
import java.util.ArrayList;                   //Library to add arraylist(class) to store data in parts
import java.util.List;                        //Library to add list for storing data in the form of rows to show in table
import java.time.LocalDate;
public class Bank3
{
public void login(JFrame U)                          //function of type(no argument no return)         
{
JFrame J1 = new JFrame("Bank");              //To create Window ("Window name")
J1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //To add Default buttons which are minimize maximize close
J1.setSize(1920,1080);                                //To set Size of the window  
J1.setLocationRelativeTo(U);
JPanel P1 = new JPanel();                            //To create part of the window 
P1.setLayout(null);                                  //To To set size according to user


JLabel L1 = new JLabel("Account Login");            //To add the text in the pannel
L1.setBounds(550,50,550,70);                       //Size of the label 600 coloumn 60 line 400 breadth 70 length
L1.setFont(new Font("Unispace",Font.PLAIN,50));   // To set the font of the label
L1.setForeground(Color.BLACK);                   //To set the color of the text
P1.add(L1);                                      //To add the label in the panel

JLabel L2 = new JLabel("User Name ");            //To add the text in the pannel
L2.setBounds(480,200,400,30);            // Size of the label 600 coloumn 60 line 400 breadth 70 length
L2.setFont(new Font("Arial",Font.PLAIN,30));
L2.setForeground(Color.BLACK);
P1.add(L2);

JTextField T1 = new JTextField();            //To add the box in the pannel
T1.setBounds(670,200,350,30);                      //Size of the box 600 coloumn 60 line 400 breadth 70 length
T1.setFont(new Font("Arial",Font.PLAIN,20));       //To set the color of the box text
T1.setForeground(Color.BLACK);                    //To set the color of the text of the box
P1.add(T1);                                      // To add the box in the panel                            

JLabel L3 = new JLabel("Password  ");            //To add the text in the pannel
L3.setBounds(480,270,400,30);            //Size of the label 600 coloumn 60 line 400 breadth 70 length
L3.setFont(new Font("Arial",Font.PLAIN,30));
L3.setForeground(Color.BLACK);
P1.add(L3);


JPasswordField PF = new JPasswordField();    //To createbox and hide text in the box
PF.setBounds(670,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
PF.setFont(new Font("Arial",Font.PLAIN,20));    //To set the color of the box text
PF.setForeground(Color.BLACK);                //To set the color of the text of the box
P1.add(PF);                                   // To add the box in the panel

JButton B1 = new JButton("OK ");               //To create button inthe panel
B1.setBounds(670,350,100,30);                 //Size of the button 600 coloumn 60 line 400 breadth 70 length
B1.setFont(new Font("Arial",Font.PLAIN,30));  //To set the font of the button text
B1.setForeground(Color.BLACK);                //To set the color of the text of the box
P1.add(B1);

JButton B2 = new JButton(" Close ");
B2.setBounds(885,350,130,30);
B2.setFont(new Font("Arial",Font.PLAIN,30));
B2.setForeground(Color.BLACK);
P1.add(B2);                                   //To add button in the pannel

//To perform action on pressing button

B1.addActionListener(new ActionListener()     // To add action listener on button and create the object of the function 
{
public void actionPerformed(ActionEvent E)    // Function to add the action performed on clicking the buttton
{
	  //String UN=T1.getText();                 //  T1.getText() :- to take the data from textfield T1 and store into the variable
	  //String P=new String(PF.getPassword());  // If we want to fetch  data from the passwordfield,first we have to create an object the of then store into it
	 // if(UN.equals("Karan") &&  P.equals("Karan"))
		// if(UN.equals("t") &&  P.equals("t"))
		/*	 if(UN.equals(P) && !UN.equals("") && !P.equals(""))   //equals()is used to compare the values or content of the object Which means "=="	  
			 {                                                       //Where !equals()is used to compare the values or content of the object Which means "!="
      JOptionPane.showMessageDialog(null,"Login SuccessFully");
       Menu(J1);
 }	   
	else
	{
		JOptionPane.showMessageDialog(null,"Invalid User");
}*/
try
	{
		String d;
		String UN=T1.getText();                 //  T1.getText() :- to take the data from textfield T1 and store into the variable
	    String P=new String(PF.getPassword());
		FileReader R= new FileReader("userpass.txt");
		BufferedReader Br = new BufferedReader(R);
		int f=0;
		while((d=Br.readLine())!=null)
		{
			String []Parts = d.split("  ");
			//String []Parts = d.split("  ");
			if(UN.equals(Parts[0]) && P.equals(Parts[1]))
			{
				f=1;
			Menu(J1);
			}
			
		}
		 if(f==0)
			{ JOptionPane.showMessageDialog(null,"Invalid Username and password"); 
			} 
	}
	
	catch(IOException e)
	{
	System.out.print("Error");
	}
//JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);
B2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	J1.setVisible(false);

	}
}
);
	J1.setContentPane(P1);
    J1.setVisible(true);

			
}
public void Signup(JFrame t)                          //function of type(no argument no return)         
{
JFrame J23 = new JFrame("Bank");              //To create Window ("Window name")
J23.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //To add Default buttons which are minimize maximize close
J23.setSize(1920,1080);                                   //To set Size of the window
J23.setLocationRelativeTo(t);                               //To set Size of the window  
JPanel P23 = new JPanel();                            //To create part of the window 
P23.setLayout(null);                                  //To To set size according to user

JLabel L1 = new JLabel("Account Signup");            //To add the text in the pannel
L1.setBounds(550,50,550,70);                       //Size of the label 600 coloumn 60 line 400 breadth 70 length
L1.setFont(new Font("Unispace",Font.PLAIN,50));   // To set the font of the label
L1.setForeground(Color.BLACK);                   //To set the color of the text
P23.add(L1);                                      //To add the label in the panel

JLabel L2 = new JLabel("User Name ");            //To add the text in the pannel
L2.setBounds(480,200,400,30);            // Size of the label 600 coloumn 60 line 400 breadth 70 length
L2.setFont(new Font("Arial",Font.PLAIN,30));
L2.setForeground(Color.BLACK);
P23.add(L2);

JTextField T1 = new JTextField();            //To add the box in the pannel
T1.setBounds(670,200,350,30);                      //Size of the box 600 coloumn 60 line 400 breadth 70 length
T1.setFont(new Font("Arial",Font.PLAIN,20));       //To set the color of the box text
T1.setForeground(Color.BLACK);                    //To set the color of the text of the box
P23.add(T1);                                      // To add the box in the panel                            

JLabel L3 = new JLabel("Password  ");            //To add the text in the pannel
L3.setBounds(480,270,400,30);            //Size of the label 600 coloumn 60 line 400 breadth 70 length
L3.setFont(new Font("Arial",Font.PLAIN,30));
L3.setForeground(Color.BLACK);
P23.add(L3);


JPasswordField PF = new JPasswordField();    //To createbox and hide text in the box
PF.setBounds(670,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
PF.setFont(new Font("Arial",Font.PLAIN,20));    //To set the color of the box text
PF.setForeground(Color.BLACK);                //To set the color of the text of the box
P23.add(PF);                                   // To add the box in the panel

JButton B1 = new JButton("OK ");               //To create button inthe panel
B1.setBounds(670,350,100,30);                 //Size of the button 600 coloumn 60 line 400 breadth 70 length
B1.setFont(new Font("Arial",Font.PLAIN,30));  //To set the font of the button text
B1.setForeground(Color.BLACK);                //To set the color of the text of the box
P23.add(B1);

JButton B2 = new JButton(" Close ");
B2.setBounds(885,350,130,30);
B2.setFont(new Font("Arial",Font.PLAIN,30));
B2.setForeground(Color.BLACK);
P23.add(B2); 
B1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	String user=T1.getText();
	String P=new String(PF.getPassword());

//JOptionPane.showMessageDialog(null,Accno+"\n"+Name+"\n"+Amount+"\n"+TYPE);

try
	{
		FileWriter W= new FileWriter("userpass.txt",true);
		W.write(user+"  "+P);
		W.write(System.lineSeparator());
		W.close();
		JOptionPane.showMessageDialog(null,"Signed Up Successfully");
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
}
}
);
B2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	J23.setVisible(false);

	}
}
);
J23.setContentPane(P23);
J23.setVisible(true);
}
public void logsign()                          //function of type(no argument no return)         
{
JFrame J24 = new JFrame("Bank");              //To create Window ("Window name")
J24.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //To add Default buttons which are minimize maximize close
J24.setSize(1920,1080);                               //To set Size of the window  
JPanel P24 = new JPanel();                            //To create part of the window 
P24.setLayout(null);                                  //To To set size according to user

JLabel L1 = new JLabel("BANKING SYSTEM");            //To add the text in the pannel
L1.setBounds(550,50,550,70);                       //Size of the label 600 coloumn 60 line 400 breadth 70 length
L1.setFont(new Font("Unispace",Font.PLAIN,50));   // To set the font of the label
L1.setForeground(Color.BLACK);                   //To set the color of the text
P24.add(L1);                                      //To add the label in the panel

JButton B1 = new JButton("Signup");               //To create button inthe panel
B1.setBounds(600,240,320,50);                 //Size of the button 600 coloumn 60 line 400 breadth 70 length
B1.setFont(new Font("Arial",Font.PLAIN,30));  //To set the font of the button text
B1.setForeground(Color.BLACK);                //To set the color of the text of the box
P24.add(B1);

JButton B2 = new JButton("Login");               //To create button inthe panel
B2.setBounds(600,350,320,50);                 //Size of the button 600 coloumn 60 line 400 breadth 70 length
B2.setFont(new Font("Arial",Font.PLAIN,30));  //To set the font of the button text
B2.setForeground(Color.BLACK);                //To set the color of the text of the box
P24.add(B2);
 

B1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	Signup(J24);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);

B2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	login(J24);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);


J24.setContentPane(P24);
J24.setVisible(true);
}
public void Menu(JFrame F)
{
JFrame J2 = new JFrame("BANK");
J2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J2.setSize(1000,600);  //Size of the window
J2.setLocationRelativeTo(F);
JPanel P2 = new JPanel();   //Part of the window
P2.setLayout(null);      //layout acc to ourself
J2.setContentPane(P2);    //To get panel content
J2.setVisible(true);      //To show window

JLabel LB1 = new JLabel("MENU");       //To print text to plane
LB1.setBounds(430,50,550,70);            //600 coloumn 60 line 400 breadth 70 length     200
LB1.setFont(new Font("Unispace",Font.PLAIN,50));  //Set the font Style and Size
LB1.setForeground(Color.BLACK);       //Set colour of Font
P2.add(LB1);                       // To add  upper content


JButton B2 = new JButton(" New Account ");
B2.setBounds(330,170,320,30);            //600 coloumn 60 line 400 breadth 70 length      600
B2.setFont(new Font("Arial",Font.PLAIN,25));
B2.setForeground(Color.BLACK);
P2.add(B2);	

JButton B3 = new JButton(" Deposit ");
B3.setBounds(330,240,320,30);
B3.setFont(new Font("Arial",Font.PLAIN,25));
B3.setForeground(Color.BLACK);
P2.add(B3);	

JButton B4 = new JButton(" Withdraw ");
B4.setBounds(330,310,320,30);            //600 coloumn 60 line 400 breadth 70 length
B4.setFont(new Font("Arial",Font.PLAIN,25));
B4.setForeground(Color.BLACK);
P2.add(B4);	

JButton B5 = new JButton(" List ");
B5.setBounds(330,380,320,30);
B5.setFont(new Font("Arial",Font.PLAIN,25));
B5.setForeground(Color.BLACK);
P2.add(B5);	

JButton B22 = new JButton("  MiniStatement ");
B22.setBounds(330,450,320,30);
B22.setFont(new Font("Arial",Font.PLAIN,25));
B22.setForeground(Color.BLACK);
P2.add(B22);

JButton B15 = new JButton(" Close ");
B15.setBounds(680,450,110,30);
B15.setFont(new Font("Arial",Font.PLAIN,25));
B15.setForeground(Color.WHITE);
P2.add(B15);	
B15.setBackground(Color.RED);
B15.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	J2.setVisible(false);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);


B2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	Accopen(J2);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);

B3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
    Deposite(J2);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);
	
	
	
B5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
    List(J2);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);

B22.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
    MiniStatement(J2);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);
B4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
    Withdraw(J2);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);
	J2.setContentPane(P2);
    J2.setVisible(true);
}

public void MiniStatement(JFrame P)
{
JFrame J22 = new JFrame("BANK");
J22.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J22.setSize(1000,600);
J22.setLocationRelativeTo(P);
JPanel P7 = new JPanel();
P7.setLayout(null);

JLabel LB1 = new JLabel("MiniStatement");
LB1.setBounds(300,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
LB1.setFont(new Font("Unispace",Font.PLAIN,50));
LB1.setForeground(Color.BLACK);
P7.add(LB1);

JLabel LB2 = new JLabel("Account No. ");
LB2.setBounds(230,150,400,30);            
LB2.setFont(new Font("Arial",Font.PLAIN,30));
LB2.setForeground(Color.BLACK);
P7.add(LB2);

JTextField T2 = new JTextField();
T2.setBounds(420,150,250,30);            //600 coloumn 60 line 400 breadth 70 length
T2.setFont(new Font("Arial",Font.PLAIN,20));
T2.setForeground(Color.BLUE);
P7.add(T2);

JButton B7 = new JButton(" Search ");
B7.setBounds(700,150,150,30);            //600 coloumn 60 line 400 breadth 70 length     680,480,85,30
B7.setFont(new Font("Arial",Font.PLAIN,25));
B7.setForeground(Color.BLACK);
P7.add(B7);	


T2.addFocusListener(new FocusListener()
{
	public void focusGained(FocusEvent E)
	{
	}
		public void focusLost(FocusEvent E)
		{
			String ano=T2.getText();
			
String [] Heading = {"Account No.","Date","Amount","Balance"};
DefaultTableModel TM = new DefaultTableModel(Heading,0);
TM.setRowCount(0);        //for defalut valeu record count starts from zero
JTable TB = new JTable (TM);	

TB.setFont(new Font("Unispace",Font.PLAIN,15));
TB.setForeground(Color.BLUE);
TB.getTableHeader().setBackground(Color.YELLOW);
//TB.setBackground(Color.RED);
TB.setRowHeight(30);
JTableHeader TH = TB.getTableHeader();
TH.setFont(new Font("Unispace",Font.PLAIN,20));
TH.setPreferredSize(new Dimension(TH.getWidth(),40));
JScrollPane SP = new JScrollPane(TB);
SP.setBounds(150,200,700,250);
P7.add(SP);     

		
	try
	{
		String d;	
		FileReader R= new FileReader("depowith.txt");
		BufferedReader Br = new BufferedReader(R);
		List<String []> RecordList = new ArrayList<>();        //Type Casting : To put data from one file to another
		int f=0;
		
		while((d=Br.readLine())!=null)
		{
			
			String []Parts = d.split("  ");
			//JOptionPane.showMessageDialog(null, "ano="+ano+"    parts[0]="+Parts[0]);         //to check the data of ano and Parts[0]
			//if(ano.equals("")){   break;}
			if(ano.equals(Parts[0]))
			{
				f=1;
							
		    RecordList.add(Parts);
			
			}
		}
		
		if(f==0)
		{
			JOptionPane.showMessageDialog(null,"Account Not Find"+"\nAccount No. : "+ano);
		}
		
	for(String [] R1 :RecordList)
			{
				TM.addRow(R1);
			}
				
	
	}
	
	catch(IOException e)
	{
	System.out.print("Error");
	}
}
}
);
J22.setContentPane(P7);
J22.setVisible(true);	
}
public void Accopen(JFrame G)
{
JFrame J3 = new JFrame("BANK");
J3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J3.setSize(1000,600);
J3.setLocationRelativeTo(G);
JPanel P3 = new JPanel();
P3.setLayout(null);

JLabel LB1 = new JLabel("ACCOUNT OPENING");
LB1.setBounds(250,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
LB1.setFont(new Font("Unispace",Font.PLAIN,50));
LB1.setForeground(Color.BLACK);
P3.add(LB1);

JLabel LB2 = new JLabel("Account No. ");
LB2.setBounds(230,200,400,30);            
LB2.setFont(new Font("Arial",Font.PLAIN,30));
LB2.setForeground(Color.BLACK);
P3.add(LB2);

JTextField T2 = new JTextField();
T2.setBounds(420,200,350,30);            //600 coloumn 60 line 400 breadth 70 length
T2.setFont(new Font("Arial",Font.PLAIN,20));
T2.setForeground(Color.BLUE);
P3.add(T2);

JLabel L3 = new JLabel("Name  ");
L3.setBounds(230,270,400,30);            
L3.setFont(new Font("Arial",Font.PLAIN,30));
L3.setForeground(Color.BLACK);
P3.add(L3);

JTextField T5 = new JTextField();
T5.setBounds(420,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
T5.setFont(new Font("Arial",Font.PLAIN,20));
T5.setForeground(Color.BLUE);
P3.add(T5);

JLabel L4 = new JLabel("Amount  ");
L4.setBounds(230,340,400,30);            
L4.setFont(new Font("Arial",Font.PLAIN,30));
L4.setForeground(Color.BLACK);
P3.add(L4);

JTextField T4 = new JTextField();
T4.setBounds(420,340,350,30);            //600 coloumn 60 line 400 breadth 70 length
T4.setFont(new Font("Arial",Font.PLAIN,20));
T4.setForeground(Color.BLUE);
P3.add(T4);

JLabel L5 = new JLabel("Type ");
L5.setBounds(230,410,400,30);            
L5.setFont(new Font("Arial",Font.PLAIN,30));
L5.setForeground(Color.BLACK);
P3.add(L5);

JTextField T3 = new JTextField();
T3.setBounds(420,410,350,30);            //600 coloumn 60 line 400 breadth 70 length
T3.setFont(new Font("Arial",Font.PLAIN,20));
T3.setForeground(Color.BLUE);
P3.add(T3);


JButton B6 = new JButton(" OK ");
B6.setBounds(540,480,95,30);            //600 coloumn 60 line 400 breadth 70 length       680
B6.setFont(new Font("Arial",Font.PLAIN,25));
B6.setForeground(Color.BLACK);
P3.add(B6);	

JButton B16 = new JButton(" Close ");
B16.setBounds(660,480,110,30);            //600 coloumn 60 line 400 breadth 70 length
B16.setFont(new Font("Arial",Font.PLAIN,25));
B16.setForeground(Color.BLACK);
P3.add(B16);

B16.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	J3.setVisible(false);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);	

B6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	String Accno=T2.getText();
	String Name=T5.getText();
	String Amount=T4.getText();
	String TYPE=T3.getText();
	

JOptionPane.showMessageDialog(null,Accno+"\n"+Name+"\n"+Amount+"\n"+TYPE);

try
	{
		FileWriter W= new FileWriter("BankCustomerw.text",true);
		W.write(Accno+"  "+Name+"  "+Amount+"  "+TYPE);
		W.write(System.lineSeparator());
		W.close();
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
}
}
);

J3.setContentPane(P3);
J3.setVisible(true);
}

public void Deposite(JFrame H)
{
	
JFrame J4 = new JFrame("BANK");
J4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J4.setSize(1000,600);
J4.setLocationRelativeTo(H);
JPanel P4 = new JPanel();
P4.setLayout(null);

JLabel LB6 = new JLabel("Deposit");
LB6.setBounds(350,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
LB6.setFont(new Font("Unispace",Font.PLAIN,50));
LB6.setForeground(Color.BLACK);
P4.add(LB6);

JLabel LB7 = new JLabel("Account No. ");
LB7.setBounds(230,200,400,30);            
LB7.setFont(new Font("Arial",Font.PLAIN,30));
LB7.setForeground(Color.BLACK);
P4.add(LB7);

JTextField T2 = new JTextField();
T2.setBounds(480,200,300,30);            //600 coloumn 60 line 400 breadth 70 length
T2.setFont(new Font("Arial",Font.PLAIN,20));
T2.setForeground(Color.BLUE);
P4.add(T2);

JLabel LB8 = new JLabel("Date  ");
LB8.setBounds(230,270,400,30);            
LB8.setFont(new Font("Arial",Font.PLAIN,30));
LB8.setForeground(Color.BLACK);
P4.add(LB8);

JTextField T5 = new JTextField();
T5.setBounds(480,270,300,30);            //600 coloumn 60 line 400 breadth 70 length
T5.setFont(new Font("Arial",Font.PLAIN,20));
T5.setForeground(Color.BLACK);
T5.setText((LocalDate.now()).toString());
P4.add(T5);

JLabel LB9 = new JLabel("Deposit Amount  ");
LB9.setBounds(230,340,400,30);            
LB9.setFont(new Font("Arial",Font.PLAIN,30));
LB9.setForeground(Color.BLACK);
P4.add(LB9);

JTextField T4 = new JTextField();
T4.setBounds(480,340,300,30);            //600 coloumn 60 line 400 breadth 70 length
T4.setFont(new Font("Arial",Font.PLAIN,20));
T4.setForeground(Color.BLACK);
P4.add(T4);

JLabel LB10 = new JLabel("Balance ");
LB10.setBounds(230,410,400,30);            
LB10.setFont(new Font("Arial",Font.PLAIN,30));
LB10.setForeground(Color.BLACK);
P4.add(LB10);

JTextField T3 = new JTextField();
T3.setBounds(480,410,300,30);            //600 coloumn 60 line 400 breadth 70 length
T3.setFont(new Font("Arial",Font.PLAIN,20));
T3.setForeground(Color.BLUE);
P4.add(T3);


JButton B7 = new JButton(" OK ");
B7.setBounds(540,480,95,30);            //600 coloumn 60 line 400 breadth 70 length     680,480,85,30
B7.setFont(new Font("Arial",Font.PLAIN,25));
B7.setForeground(Color.BLACK);
P4.add(B7);	

JButton B17 = new JButton(" Close ");
B17.setBounds(660,480,110,30);            //600 coloumn 60 line 400 breadth 70 length
B17.setFont(new Font("Arial",Font.PLAIN,25));
B17.setForeground(Color.BLACK);
P4.add(B17);


T2.addFocusListener(new FocusListener()
{
	public void focusGained(FocusEvent E)
	{
	}
		public void focusLost(FocusEvent E)
		{
			String ano=T2.getText();
						
			
		
	try
	{
		String d;
		
		FileReader R= new FileReader("BankCustomerw.text");
		BufferedReader Br = new BufferedReader(R);
		
		while((d=Br.readLine())!=null)
		{
			if(ano.equals("")){   break;}
			String []Parts = d.split("  ");
			if(ano.equals(Parts[0]))
			{
			T3.setText(Parts[2]);
			break;
			}
		}
			
		if(d==null )
		{
			if(ano!="  ")
			JOptionPane.showMessageDialog(null,"Account Not Find"+d+ano);
		}
	}
	
	catch(IOException e)
	{
	System.out.print("Error");
	}
		}
}
		);

T4.addFocusListener(new FocusListener()
{
	public void focusGained(FocusEvent E)
	{
	}
		public void focusLost(FocusEvent E)
		{
			int  ans;
			ans = Integer.parseInt(T4.getText())+Integer.parseInt(T3.getText());
			T3.setText(""+ans);
		}
		
}
);
B17.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	J4.setVisible(false);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);	
B7.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	String Acno=T2.getText();
	String date=T5.getText();
	String dAmount=T4.getText();
	String bal=T3.getText();
	

JOptionPane.showMessageDialog(null,"Account no. : "+Acno+"\nDate : "+date+"\nDeposit : "+dAmount+"\nBalance : "+bal);

try
	{
		FileWriter W= new FileWriter("depowith.txt",true);
		W.write(Acno+"  "+date+"  "+dAmount+"  "+bal);
		W.write(System.lineSeparator());
		W.close();
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
	
	
	
}
}
);


B7.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	String ano=T2.getText();

try
	{
		String d,Record;
		ArrayList<String> RecordList = new ArrayList<>();
		FileReader R= new FileReader("BankCustomerw.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			
			String []Parts = d.split("  ");
			if(ano.equals(Parts[0]))
			{
				Parts [2] = T3.getText();
			}
			Record=Parts[0]+"  "+Parts[1]+"  " +Parts[2]+"  "+Parts[3];
			RecordList.add(Record);
		}
		Br.close();
	
		
		FileWriter w = new FileWriter ("BankCustomerw.text");
		BufferedWriter Bw = new BufferedWriter(w);
		for(String  line : RecordList)
			{
				Bw.write(line);
				Bw.newLine();
			}
			Bw.close();
	    JOptionPane.showMessageDialog(null,"Balance Updated Successfully");
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
}
}
);   

J4.setContentPane(P4);
J4.setVisible(true);
}


public void List(JFrame I)
{
	String d;
JFrame J5 = new JFrame("BANK");
J5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J5.setSize(1000,600);
J5.setLocationRelativeTo(I);
JPanel P5 = new JPanel();
P5.setLayout(null);

JLabel LB1 = new JLabel("Accounts List");
LB1.setBounds(300,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
LB1.setFont(new Font("Unispace",Font.PLAIN,50));
LB1.setForeground(Color.BLACK);
P5.add(LB1);

String [] Heading = {"Account No.","Name","Amount","Account Type"};
DefaultTableModel TM = new DefaultTableModel(Heading,0);
TM.setRowCount(0);        //for defalut valeu record count starts from zero
JTable TB = new JTable (TM);

TB.setFont(new Font("Unispace",Font.PLAIN,15));
TB.setForeground(Color.BLUE);
TB.getTableHeader().setBackground(Color.YELLOW);
//TB.setBackground(Color.RED);
TB.setRowHeight(30);
JTableHeader TH = TB.getTableHeader();
TH.setFont(new Font("Unispace",Font.PLAIN,20));
TH.setPreferredSize(new Dimension(TH.getWidth(),40));
JScrollPane SP = new JScrollPane(TB);
SP.setBounds(150,150,700,250);
P5.add(SP);



JButton B13 = new JButton("Save Changes");
B13.setBounds(410,450,200,30);            //600 coloumn 60 line 400 breadth 70 length
B13.setFont(new Font("Arial",Font.PLAIN,20));
B13.setForeground(Color.BLACK);
P5.add(B13);


List<String []> RecordList = new ArrayList<>();        //Type Casting : To put data from one file to another
	try
	{
		
		FileReader R= new FileReader("BankCustomerw.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			
			
		String []Parts = d.split("  ");
		
		RecordList.add(Parts);
		}
			for(String [] R1 :RecordList)
			{
				TM.addRow(R1);
					
		
		}
	}		
catch(IOException e)
{
System.out.println("Error");	

}

B13.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	try
	{
		FileWriter W= new FileWriter("BankCustomerw.text",false);
		
		for(int i=0;i<TM.getRowCount();i++)
		{
			
			String an=TM.getValueAt(i,0).toString();
			String nam=TM.getValueAt(i,1).toString();
			String amt=TM.getValueAt(i,2).toString();
			String typ=TM.getValueAt(i,3).toString();
				
		
		W.write(an+"  "+nam+"  "+amt+"  "+typ);
		W.write(System.lineSeparator());
			
		}
		
		W.close();
JOptionPane.showMessageDialog(null,("Changes Successfully"));
	}
	catch(IOException X)
	{
		System.out.println("Error in data saving");
	}
}	
}
);

JButton B18 = new JButton("Delete");
B18.setBounds(620,450,110,30);            //600 coloumn 60 line 400 breadth 70 length
B18.setFont(new Font("Arial",Font.PLAIN,20));
B18.setForeground(Color.BLACK);
P5.add(B18);

B18.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{

int SelectedRow = TB.getSelectedRow();
if(SelectedRow==-1)
{
	JOptionPane.showMessageDialog(null,"No Row Selected");
}
	else{
		TM.removeRow(SelectedRow);
		try
	{
		FileWriter W= new FileWriter("BankCustomerw.text",false);
		
		for(int i=0;i<TM.getRowCount();i++)
		{
			
			String an=TM.getValueAt(i,0).toString();
			String nam=TM.getValueAt(i,1).toString();
			String amt=TM.getValueAt(i,2).toString();
			String typ=TM.getValueAt(i,3).toString();
				
		
		W.write(an+"  "+nam+"  "+amt+"  "+typ);
		W.write(System.lineSeparator());
			
		}
		
		W.close();
JOptionPane.showMessageDialog(null,("Changes Successfully"));
	}
	
	catch(IOException X)
	{
		System.out.println("Error in data saving");
	}
	}
}	
}
);

JButton B19 = new JButton("Close");
B19.setBounds(740,450,110,30);            //600 coloumn 60 line 400 breadth 70 length
B19.setFont(new Font("Arial",Font.PLAIN,20));
B19.setForeground(Color.BLACK);
P5.add(B19);

B19.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	J5.setVisible(false);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);	
		
J5.setContentPane(P5);
J5.setVisible(true);
	
}	
	

public void Withdraw(JFrame J)
{
	
	
JFrame J6 = new JFrame("BANK");
J6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J6.setSize(1000,600);
J6.setLocationRelativeTo(J);
JPanel P6 = new JPanel();
P6.setLayout(null);

JLabel LB6 = new JLabel("Withdraw");
LB6.setBounds(350,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
LB6.setFont(new Font("Unispace",Font.PLAIN,50));
LB6.setForeground(Color.BLACK);
P6.add(LB6);

JLabel LB7 = new JLabel("Account No. ");
LB7.setBounds(230,200,400,30);            
LB7.setFont(new Font("Arial",Font.PLAIN,30));
LB7.setForeground(Color.BLACK);
P6.add(LB7);

JTextField T2 = new JTextField();
T2.setBounds(480,200,320,30);            //600 coloumn 60 line 400 breadth 70 length
T2.setFont(new Font("Arial",Font.PLAIN,20));
T2.setForeground(Color.BLACK);
P6.add(T2);

JLabel LB9 = new JLabel("Date  ");
LB9.setBounds(230,270,400,30);            
LB9.setFont(new Font("Arial",Font.PLAIN,30));
LB9.setForeground(Color.BLACK);
P6.add(LB9);

JTextField T5 = new JTextField();
T5.setBounds(480,270,300,30);            //600 coloumn 60 line 400 breadth 70 length
T5.setFont(new Font("Arial",Font.PLAIN,20));
T5.setForeground(Color.BLACK);
T5.setText((LocalDate.now()).toString());
P6.add(T5);

JLabel LB8 = new JLabel("Withdraw Amount  ");
LB8.setBounds(230,340,400,30);            
LB8.setFont(new Font("Arial",Font.PLAIN,30));
LB8.setForeground(Color.BLACK);
P6.add(LB8);

JTextField T4 = new JTextField();
T4.setBounds(480,340,320,30);            //600 coloumn 60 line 400 breadth 70 length
T4.setFont(new Font("Arial",Font.PLAIN,20));
T4.setForeground(Color.BLACK);
P6.add(T4);

JLabel LB10 = new JLabel("Balance ");
LB10.setBounds(230,410,400,30);            
LB10.setFont(new Font("Arial",Font.PLAIN,30));
LB10.setForeground(Color.BLACK);
P6.add(LB10);

JTextField T3 = new JTextField();
T3.setBounds(480,410,320,30);            //600 coloumn 60 line 400 breadth 70 length
T3.setFont(new Font("Arial",Font.PLAIN,20));
T3.setForeground(Color.BLUE);
P6.add(T3);


JButton B8 = new JButton(" OK ");
B8.setBounds(570,480,95,30);            //600 coloumn 60 line 400 breadth 70 length
B8.setFont(new Font("Arial",Font.PLAIN,25));
B8.setForeground(Color.BLACK);
P6.add(B8);	

JButton B18 = new JButton(" Close ");
B18.setBounds(690,480,110,30);            //600 coloumn 60 line 400 breadth 70 length
B18.setFont(new Font("Arial",Font.PLAIN,25));
B18.setForeground(Color.BLACK);
P6.add(B18);

B18.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	             // String UN=T1.getText();
	            // String P=new String(PF.getPassword());
	J6.setVisible(false);
               //JOptionPane.showMessageDialog(null,UN+"\n"+P);
}
}
);	


T2.addFocusListener(new FocusListener()
{
	public void focusGained(FocusEvent E)
	{
	}
		public void focusLost(FocusEvent E)
		{
			String ano=T2.getText();
						
			
		
	try
	{
		String d;
		
		FileReader R= new FileReader("BankCustomerw.text");
		BufferedReader Br = new BufferedReader(R);
		
		while((d=Br.readLine())!=null)
		{
			if(ano.equals("")){   break;}
			String []Parts = d.split("  ");
			if(ano.equals(Parts[0]))
			{
			T3.setText(Parts[2]);
			break;
			}
		}
			
		if(d==null )
		{
			if(ano!="  ")
			JOptionPane.showMessageDialog(null,"Account Not Find"+d+ano);
		}
	}
	
	catch(IOException e)
	{
	System.out.print("Error");
	}
		}
}
		);

B8.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	String Acno=T2.getText();
	String date=T5.getText();
	String wAmount=T4.getText();
	String bal=T3.getText();
	

JOptionPane.showMessageDialog(null,"Account No. : "+Acno+"\nDate : "+date+"\nWithdraw : "+wAmount+"\nBalance : "+bal);

try
	{
		FileWriter W= new FileWriter("depowith.txt",true);
		W.write(Acno+"  "+date+"  "+wAmount+"  "+bal);
		W.write(System.lineSeparator());
		W.close();
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
}
}
);


T4.addFocusListener(new FocusListener()
{
	public void focusGained(FocusEvent E)
	{
	}
		public void focusLost(FocusEvent E)
		{
			int  ans;
			ans = Integer.parseInt(T3.getText())-Integer.parseInt(T4.getText());
			T3.setText(""+ans);
		}
		
}
);

B8.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent E)
{
	String ano=T2.getText();

try
	{
		String d,Record;
		ArrayList<String> RecordList = new ArrayList<>();
		FileReader R= new FileReader("BankCustomerw.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			
			String []Parts = d.split("  ");
			if(ano.equals(Parts[0]))
			{
				Parts [2] = T3.getText();
			}
			Record=Parts[0]+"  "+Parts[1]+"  " +Parts[2]+"  "+Parts[3];
			RecordList.add(Record);
		}
		Br.close();
	
		
		FileWriter w = new FileWriter ("BankCustomerw.text");
		BufferedWriter Bw = new BufferedWriter(w);
		for(String  line : RecordList)
			{
				Bw.write(line);
				Bw.newLine();
			}
			Bw.close();
	    JOptionPane.showMessageDialog(null,"Balance Updated Successfully");
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
}
}
);  

J6.setContentPane(P6);
J6.setVisible(true);

}
public static void main(String Args[])
{
	Bank3 BN1 = new Bank3();
	//BN1.login();
	//BN1.Signup();
	BN1.logsign();
	//BN1.Accopen();
	
}
} 
