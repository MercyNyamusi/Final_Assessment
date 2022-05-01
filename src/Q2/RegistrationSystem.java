package Q2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class RegistrationSystem implements ActionListener {
	private static final String Conn = null;
	private static final Statement Stmt = null;
	private static Statement queryResult = null;
	static JFrame signin, signup, status,register,courseDisplay,PAdm,PCompSci,PBiz,PGlobal;
	static JPanel text,credentials,intro, Fintro,titleText,alt1,alt2,firstname,midname,lastname;	
	static JTextField name,fnameText,mnameText,lnameText,markText,signame;
	static JLabel title, label, nameText, Mess,passwordText,altText1,altText2,fname,mname,lname;
	static String result = "", course="", state="",query,dbname,dbpass,signupPass, loginName,signupName,FName,loginPass,MName,LName,GradeMark,place,Snum,Sname;
	static JButton signButton,submit,login,alt1Button,alt2Button,logout,courses,Adm,CompSci,Biz,Global;
	static JPasswordField signpass,password;
	static JLabel comp,busi,globe;
	int rollno,dbid;
	int count=-1;
	int check=0;
	ResultSet ans,prod,tmp;
	String srollno,stored;
	
	
	
	public static void main(String[] args) {
		new RegistrationSystem("SIGN UP");
		
		
		
	}
	
	public void CCompSci() {
		PCompSci = new JFrame("COMPUTER SCIENCE");
		PCompSci.setLayout(null);
		PCompSci.setBounds(500, 100, 500, 500);
		
		
		comp= new JLabel();
		comp.setBounds(100, 60, 400, 40);
		comp.setText("WELCOME TO ALU REGISTRATION SYSTEM");
		
		Adm= new JButton();
		Adm.setBounds(20, 50, 110, 30);
		Adm.setText("MY STATUS");
		Adm.addActionListener(this);
		
		CompSci= new JButton();
		CompSci.setBounds(130, 50, 110, 30);
		CompSci.setText("COMPUTER");
		CompSci.addActionListener(this);
		
		
		Global= new JButton();
		Global.setBounds(240, 50, 110, 30);
		Global.setText("GLOBAL.C");
		Global.addActionListener(this);
		
		Biz= new JButton();
		Biz.setBounds(350, 50, 110, 30);
		Biz.setText("BUSINESS");
		Biz.addActionListener(this);
		
		PCompSci.add(comp);
		PCompSci.add(Adm);
		PCompSci.add(Global);
		PCompSci.add(CompSci);
		PCompSci.add(Biz);
		
		PCompSci.setVisible(true);
		
	}
	public void CBiz() {
		PBiz = new JFrame("BUSINESS STUDIES");
		PBiz.setLayout(null);
		PBiz.setBounds(500, 100, 500, 500);
		
		busi= new JLabel();
		busi.setBounds(100, 60, 400, 40);
		busi.setText("WELCOME TO ALU REGISTRATION SYSTEM");
		
		Adm= new JButton();
		Adm.setBounds(20, 50, 110, 30);
		Adm.setText("MY STATUS");
		Adm.addActionListener(this);
		
		CompSci= new JButton();
		CompSci.setBounds(130, 50, 110, 30);
		CompSci.setText("COMPUTER");
		CompSci.addActionListener(this);
		
		
		Global= new JButton();
		Global.setBounds(240, 50, 110, 30);
		Global.setText("GLOBAL.C");
		Global.addActionListener(this);
		
		Biz= new JButton();
		Biz.setBounds(350, 50, 110, 30);
		Biz.setText("BUSINESS");
		Biz.addActionListener(this);
		
		
		
		PBiz.add(busi);
		PBiz.add(Adm);
		PBiz.add(Global);
		PBiz.add(CompSci);
		PBiz.add(Biz);
		
		PBiz.setVisible(true);
		
	}
	public void CGlobal() {
		PGlobal = new JFrame("GLOBAL CHALLENGES");
		PGlobal.setLayout(null);
		PGlobal.setBounds(500, 100, 500, 500);
		
		globe= new JLabel();
		globe.setBounds(100, 60, 400, 40);
		globe.setText("WELCOME TO ALU REGISTRATION SYSTEM");
		
		Adm= new JButton();
		Adm.setBounds(20, 50, 110, 30);
		Adm.setText("MY STATUS");
		Adm.addActionListener(this);
		
		CompSci= new JButton();
		CompSci.setBounds(130, 50, 110, 30);
		CompSci.setText("COMPUTER");
		CompSci.addActionListener(this);
		
		
		Global= new JButton();
		Global.setBounds(240, 50, 110, 30);
		Global.setText("GLOBAL.C");
		Global.addActionListener(this);
		
		Biz= new JButton();
		Biz.setBounds(350, 50, 110, 30);
		Biz.setText("BUSINESS");
		Biz.addActionListener(this);
		
		PGlobal.add(globe);
		PGlobal.add(Adm);
		PGlobal.add(Global);
		PGlobal.add(CompSci);
		PGlobal.add(Biz);
		PGlobal.setVisible(true);
	}
	
	public void signIn(String Mess2){
		signin = new JFrame("SIGN IN");
		signin.setLayout(null);
		signin.setBounds(500, 100, 500, 500);
		
		//intro title
		intro = new JPanel();
		intro.setBounds(40, 40, 400, 40);
		
		
		title= new JLabel();
		title.setBounds(100, 60, 400, 40);
		title.setText("WELCOME TO ALU REGISTRATION SYSTEM");
		
		//SIGNIN Title
		titleText= new JPanel();
		titleText.setBounds(80, 90, 300, 40);
		
		label= new JLabel();
		label.setBounds(80, 90, 300, 40);
		label.setText(Mess2);
		
		//name
		text = new JPanel();
		text.setLayout(null);
		text.setBounds(40, 150, 400, 40);
		
		nameText=new JLabel();
		nameText.setLayout(null);
		nameText.setBounds(40, 0, 100, 30);
		nameText.setText("Username/Email");
		
		
		name=new JTextField();		
		name.setLayout(null);		
		name.setBounds(150, 0, 200, 30);
		
		//password
		credentials = new JPanel();
		credentials.setLayout(null);		
		credentials.setBounds(40, 200, 400, 40);
		
		passwordText = new JLabel();		
		passwordText.setLayout(null);
		passwordText.setBounds(40, 0, 100, 30);			
		passwordText.setText("Password");
		
		
		password=new JPasswordField();
		password.setLayout(null);
		password.setBounds(150, 0, 200, 30);	
		
		// try again button
		login=new JButton("SIGN IN");
		login.setBounds(200, 260, 100, 30);
		login.addActionListener(this);

		alt1 = new JPanel();
		alt1.setLayout(null);
		alt1.setBounds(80, 320, 400, 40);
		
		altText1=new JLabel();
		altText1.setLayout(null);
		altText1.setBounds(80,0, 400, 40);
		altText1.setText("Don't have an account?");

		alt1Button=new JButton("SIGN UP");
		alt1Button.setBounds(215, 10, 80, 20);
		alt1Button.addActionListener(this);
		
		intro.add(title);
		titleText.add(label);
		text.add(nameText);
		text.add(name);		
		credentials.add(passwordText);
		credentials.add(password);
		alt1.add(altText1);
		alt1.add(alt1Button);
		
		signin.add(intro);
		signin.add(titleText);	
		signin.add(text);	
		signin.add(credentials);
		signin.add(login);
		signin.add(alt1);
		signin.setVisible(true);
		
		
		
		
	}
	public RegistrationSystem(String Mess1){
		//title of the frame
		signup = new JFrame("SIGN UP");
		signup.setLayout(null);
		signup.setBounds(500, 100, 500, 500);
		
		//title panel
		intro = new JPanel();
		intro.setBounds(40, 40, 400, 40);
		
		//title panel text
		title= new JLabel();
		title.setBounds(100, 60, 400, 40);
		title.setText("WELCOME TO ALU REGISTRATION SYSTEM");
		
		//Signup Subtitle panel
		titleText= new JPanel();
		titleText.setBounds(80, 90, 300, 40);
		
		//Signup Subtitle text
		label= new JLabel();
		label.setBounds(80, 90, 300, 40);
		label.setText(Mess1);
		
		//Username panel
		text = new JPanel();
		text.setLayout(null);
		text.setBounds(40, 150, 400, 40);
		
		//Username label
		nameText=new JLabel();
		nameText.setLayout(null);
		nameText.setBounds(40, 0, 100, 30);
		nameText.setText("Username/Email");
		
		//Username field
		signame=new JTextField();		
		signame.setLayout(null);		
		signame.setBounds(150, 0, 200, 30);
		
		//password panel
		credentials = new JPanel();
		credentials.setLayout(null);		
		credentials.setBounds(40, 200, 400, 40);
		
		//password label
		passwordText = new JLabel();		
		passwordText.setLayout(null);
		passwordText.setBounds(40, 0, 100, 30);			
		passwordText.setText("Password");
		
		//password field
		signpass=new JPasswordField();
		signpass.setLayout(null);
		signpass.setBounds(150, 0, 200, 30);	
		
		//SignUp/Register Button
		signButton=new JButton("REGISTER");
		signButton.setBounds(200, 260, 100, 30);		
		signButton.addActionListener(this);
		
		//signin panel
		alt2 = new JPanel();
		alt2.setLayout(null);
		alt2.setBounds(80, 320, 400, 40);
		
		//signin label
		altText2=new JLabel();
		altText2.setLayout(null);
		altText2.setBounds(80,0, 400, 40);
		altText2.setText("Already have an account?");
		
		//signin button
		alt2Button=new JButton("LOGIN");
		alt2Button.setBounds(230, 10, 70, 20);
		alt2Button.addActionListener(this);
		
		//adding components to panel
		intro.add(title);
		titleText.add(label);
		text.add(nameText);
		text.add(signame);		
		credentials.add(passwordText);
		credentials.add(signpass);
		alt2.add(altText2);
		alt2.add(alt2Button);
		
		//adding panels to frame
		signup.add(intro);
		signup.add(titleText);	
		signup.add(text);	
		signup.add(credentials);
		signup.add(signButton);
		signup.add(alt2);
		signup.setVisible(true);
		
		
	}
	public void register(){
		register = new JFrame("REGISTRATION");
		register.setLayout(null);
		register.setBounds(500, 100, 500, 500);
		
		//intro title
		intro = new JPanel();
		intro.setBounds(40, 40, 400, 40);
		
		
		title= new JLabel();
		title.setBounds(100, 60, 400, 40);
		title.setText("Please enter your details below");
		
	
		
		//First name
		firstname = new JPanel();
		firstname.setLayout(null);
		firstname.setBounds(40, 110, 400, 40);
		
		fname=new JLabel();
		fname.setLayout(null);
		fname.setBounds(40, 0, 100, 30);
		fname.setText("First Name");
		
		
		fnameText=new JTextField();		
		fnameText.setLayout(null);		
		fnameText.setBounds(150, 0, 200, 30);
		
		//Middle name
		midname = new JPanel();
		midname.setLayout(null);
		midname.setBounds(40, 160, 400, 40);
		
		mname=new JLabel();
		mname.setLayout(null);
		mname.setBounds(40, 0, 100, 30);
		mname.setText("Middle Name");
		
		
		mnameText=new JTextField();		
		mnameText.setLayout(null);		
		mnameText.setBounds(150, 0, 200, 30);
		
		
		// Last name
		lastname = new JPanel();
		lastname.setLayout(null);
		lastname.setBounds(40, 210, 400, 40);
		
		lname=new JLabel();
		lname.setLayout(null);
		lname.setBounds(40, 0, 100, 30);
		lname.setText("Surname");
		
		
		lnameText=new JTextField();		
		lnameText.setLayout(null);		
		lnameText.setBounds(150, 0, 200, 30);
		
		//Grade
		credentials = new JPanel();
		credentials.setLayout(null);		
		credentials.setBounds(40, 260, 400, 40);
		
		passwordText = new JLabel();		
		passwordText.setLayout(null);
		passwordText.setBounds(40, 0, 100, 30);			
		passwordText.setText("Mark");
		
		
		markText=new JTextField();
		markText.setLayout(null);
		markText.setBounds(150, 0, 200, 30);	
		
		// try again button
		submit=new JButton("SUBMIT");
		submit.setBounds(200, 340, 100, 30);
		submit.addActionListener(this);

		

		
		intro.add(title);
		firstname.add(fname);
		firstname.add(fnameText);
		midname.add(mname);
		midname.add(mnameText);
		lastname.add(lname);
		lastname.add(lnameText);			
		credentials.add(passwordText);
		credentials.add(markText);
		
		register.add(intro);
		register.add(firstname);	
		register.add(midname);
		register.add(lastname);
		register.add(credentials);
		register.add(submit);
		register.setVisible(true);
		
		
		
	}
	public void placer(String SName, String SRoll,String SMark, String SCourse){
		status = new JFrame("ADMISSION STATUS");
		status.setLayout(null);
		status.setBounds(50, 100, 500, 500);
		
		
		
		
		Adm= new JButton();
		Adm.setBounds(20, 50, 110, 30);
		Adm.setText("MY STATUS");
		Adm.addActionListener(this);
		
		CompSci= new JButton();
		CompSci.setBounds(130, 50, 110, 30);
		CompSci.setText("COMPUTER");
		CompSci.addActionListener(this);
		
		
		Global= new JButton();
		Global.setBounds(240, 50, 110, 30);
		Global.setText("GLOBAL.C");
		Global.addActionListener(this);
		
		Biz= new JButton();
		Biz.setBounds(350, 50, 110, 30);
		Biz.setText("BUSINESS");
		Biz.addActionListener(this);
		
		//Name
		firstname = new JPanel();
		firstname.setLayout(null);
		firstname.setBounds(40, 110, 500, 40);
		
		fname=new JLabel();
		fname.setLayout(null);
		fname.setBounds(40, 0,500, 30);
		String sname = "Student Name: " +SName;
		fname.setText(sname);		
		
		//Roll NO
		midname = new JPanel();
		midname.setLayout(null);
		midname.setBounds(40, 160, 500, 40);
		
		mname=new JLabel();
		mname.setLayout(null);
		mname.setBounds(40, 0, 500, 30);
		String sno = "Roll No: " +SRoll;
		mname.setText(sno);	
		
		
		
		// Grade
		lastname = new JPanel();
		lastname.setLayout(null);
		lastname.setBounds(40, 210, 500, 40);
		
		lname=new JLabel();
		lname.setLayout(null);
		lname.setBounds(40, 0, 500, 30);
		String smark = "Mark: " +SMark;
		lname.setText(smark);
		
		
		
		
		//Course
		credentials = new JPanel();
		credentials.setLayout(null);		
		credentials.setBounds(40, 260, 500, 40);
		
		passwordText = new JLabel();		
		passwordText.setLayout(null);
		passwordText.setBounds(40, 0, 500, 30);
		String scourse = "Course: " +SCourse;
		passwordText.setText(scourse);
		
	
		
		logout=new JButton("LOGOUT");
		logout.setBounds(200, 340, 100, 30);
		logout.addActionListener(this);

		
		firstname.add(fname);
		midname.add(mname);
		lastname.add(lname);
		credentials.add(passwordText);
		
		status.add(firstname);
		status.add(midname);
		status.add(lastname);
		status.add(credentials);
		status.add(Adm);
		status.add(Global);
		status.add(CompSci);
		status.add(Biz);
		status.add(logout);
		
		status.setVisible(true);
		
	}
	
	public ResultSet connect(String query){
		try {
			Connection Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registartionsystem_javasummative", "root", "");
			
						
			java.sql.Statement Stmt= Conn.createStatement();

			ResultSet res= Stmt.executeQuery(query);
			return res;	
			
		} catch (SQLException e) {
			
			System.err.println("connect" + e.getMessage());
		
			return null;
		}
		
	}
	public int saveLogin(String username, String password){
		int find_entry = check_entry(username);
		if(find_entry == 0) {		
						
			query ="INSERT INTO login_details(UserName, Password)VALUES ('"+username+"', '"+password+"')";	
			count= store(query);
			if (count>=0) {		
				ResultSet confirm= connect("SELECT UserName FROM login_details WHERE UserName = '"+username+"' and Password ='"+password+"'");
				
				if (confirm!=null) 
					return 0;
				
				else 
					return -1;
			}
			else 
				return -1;
		}
		else 
			return -1;
		
	}
		
	public int store(String query){
		try {
			Connection Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registartionsystem_javasummative", "root", "");
			if (Conn!=null){
				java.sql.Statement Stmt= Conn.createStatement();
				int res= Stmt.executeUpdate(query);
				
				return res;
			}
			else {
				return -1;
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.err.println("Unsuccessful SignUp Upload");
		
		}
		return -1;
		
	}
	
	public int check_entry(String username){
		query = "SELECT UserName FROM login_details WHERE UserName='"+username+"'";
		
		ans = connect(query);
		
		try {
			while(ans.next()) {
				dbname= ans.getString("UserName");
	
			}
			if (dbname == null) {
				return 0;
			}
			else {
				signup.dispose();
				new RegistrationSystem("UserName Taken. Please try Again");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Problem here: "+e.getMessage());
		}
		return -1;
	}
	
	
	public int verification(String username, String password){
		query = "SELECT * FROM login_details WHERE UserName='"+username+"' and Password ='"+password+"'";
		
		ans = connect(query);
		
		try {
			while(ans.next()) {
				dbname= ans.getString("UserName");
				dbpass=ans.getString("Password");
				dbid=ans.getInt("ID");
			}
			if (dbname != null && dbpass !=null) {
				return dbid;
			}
			else if(dbname == null){
				signin.dispose();
				signIn("Incorrect Username. Please Try again.");
				return -1;
			}
			else {
				signin.dispose();
				signIn("Incorrect Password. Please Try again.");
				return -1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Login Issue: "+e.getMessage());
		}
		return -1;
	}
	
	public void saveDetails(int ID,String firstname, String middlename, String lastname, String grade,String Course){
		query ="INSERT INTO student_details(ID,FirstName, MiddleName, LastName, Mark, Course)VALUES ('"+ID+"','"+firstname+"', '"+middlename+"', '"+lastname+"', '"+grade+"','"+Course+"')";
		int count =store(query);
	}
	public ResultSet getDetails(int ID){
		query = "select * from student_details WHERE ID='"+ID+"'";
		ans = connect(query);		
		return ans;
						
	}
	public void showDetails(ResultSet value){
		
		try {
			while(value.next()) {
				rollno = value.getInt("ID");				
				FName = value.getString("FirstName");
				MName = value.getString("MiddleName");
				LName= value.getString("LastName");
				GradeMark=value.getString("Mark");
				place=value.getString("Course");
			}		
			srollno ="2022/0"+ Integer.toString(rollno);
			Snum=srollno;			
			Sname =FName+" "+ MName +" "+LName;
			
			
			placer(Sname,srollno,GradeMark,place);
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.err.println("Unsuccessful Details Capture");
			}
	}
	
 	public String classifier(int mark) {
		if (mark>=18 && mark <=20) 
			course= "Computer Science";
		
		else if (mark>=15 && mark <=17) 
			course= "Global Challenges";
		
		else if (mark>=12 && mark <=14)
			course= "Business Studies";
		
		else 
			course= "Sorry! Your mark score is below admission requirements.";
		
		return course;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Choosing Sign up
		if (e.getSource()== alt1Button) {
			signin.dispose();
			new RegistrationSystem("SIGN UP");
		}
		//Choosing Sign IN
		if (e.getSource()== alt2Button) {
			signup.dispose();
			signIn("SIGN IN");
		}
		//Logging in
		if (e.getSource()== login) {
			loginName= name.getText();
			loginPass= String.valueOf(password.getPassword());
			int state = verification(loginName,loginPass);
			if (state > -1) {
				signin.dispose();
				prod = getDetails(dbid);				
				try {		
					
					while(prod.next()) {
						stored = prod.getString("FirstName");
						if(stored!=null) {
						check++;	
						break;
						}
					}							
					if(check==0) {
					register();
					}
					else {
						tmp= getDetails(dbid);
						showDetails(tmp);
					}
										
				}
				catch (SQLException e1) {
						// TODO Auto-generated catch block
					System.err.println("prod" +e1.getMessage());
				}		
											
			}
		}		
			
		
		//Signing up button
		if (e.getSource()== signButton) {
			signupName= signame.getText();//UserName input
			signupPass= String.valueOf(signpass.getPassword());

			
			int res = saveLogin(signupName,signupPass);//inserts new info in database
			if (res>=0) {
				signup.dispose();
				signIn("SIGN IN");
			}
			
			
		}
		//logging out
		if (e.getSource()== logout) {
			status.dispose();
			new RegistrationSystem("SIGN UP");
		}
		
		
		//registering courses
		if (e.getSource()== submit) {
			FName = fnameText.getText();
			MName = mnameText.getText();
			LName= lnameText.getText();
			GradeMark=markText.getText();
			int newMark=Integer.valueOf(GradeMark);
			place = classifier(newMark);			
			saveDetails(dbid, FName,MName,LName,GradeMark,place);
			register.dispose();
			
			ans= getDetails(dbid);
			showDetails(ans);
			
		}
		if (e.getSource()== Adm) {
			if(CompSci.isShowing()==true)
				PCompSci.dispose();
			else if(Biz.isShowing()==true)
				PBiz.dispose();
			else if(Global.isShowing()==true)
				PGlobal.dispose();
			else if(Adm.isShowing()==true)
				status.dispose();
			placer(Sname,srollno,GradeMark,place);
		}
		if (e.getSource()== Biz) {
			if(CompSci.isShowing()==true)
				PCompSci.dispose();
			else if(Biz.isShowing()==true)
				PBiz.dispose();
			else if(Global.isShowing()==true)
				PGlobal.dispose();
			else if(Adm.isShowing()==true)
				status.dispose();
			CBiz();
		}
		
		if (e.getSource()== Global) {
			if(CompSci.isShowing()==true)
				PCompSci.dispose();
			else if(Biz.isShowing()==true)
				PBiz.dispose();
			else if(Global.isShowing()==true)
				PGlobal.dispose();
			else if(Adm.isShowing()==true)
				status.dispose();
			CGlobal();
		}
		if (e.getSource()== CompSci) {
			if(CompSci.isShowing()==true)
				PCompSci.dispose();
			else if(Biz.isShowing()==true)
				PBiz.dispose();
			else if(Global.isShowing()==true)
				PGlobal.dispose();
			else if(Adm.isShowing()==true)
				status.dispose();
			CCompSci();
		}
	}
}

	
