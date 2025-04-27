
package university.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JLabel l0,l1,l2,l3,l4;
    JTextField textField,passwordField,answer,namefield;
    JButton b1,b2;
    Choice Question;
    
    Signup(){
         setBackground(new Color(255, 255, 204));	
         setBounds(300, 200, 700, 400);
       
         
         
        JPanel p1 = new JPanel();
	p1.setBackground(Color.WHITE);
	setContentPane(p1);
	p1.setLayout(null);
        
        l0=new JLabel("Name:");
        l0.setBounds(124,55,95,24);
        p1.add(l0);
        
        namefield=new JTextField();
        namefield.setBounds(220,60,157,18);
        p1.add(namefield);
        
        l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 24);
	p1.add(l1);
        
        
        l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 24);
	p1.add(l2);

	textField = new JTextField();
	textField.setBounds(220, 93, 157, 18);
	p1.add(textField); 
        
        passwordField = new JTextField();
	passwordField.setBounds(220, 128, 157, 18);
	p1.add(passwordField); 
        
        l3= new JLabel("Security Question");
        l3.setBounds(124, 159, 95, 24);
        p1.add(l3);
        
        Question=new Choice();
        Question.add("Favorite Person name");
        Question.add("name of your first teacher");
        Question.add("name of your pet");
        Question.add("name of Favourite Cricketer");
        Question.setBounds(220,163,157,18);
        p1.add(Question);
    
        
        l4 = new JLabel("Answer : ");
	l4.setBounds(124, 194, 95, 24);
	p1.add(l4);

	answer = new JTextField();
	answer.setBounds(220, 195, 157, 18);
	p1.add(answer); 
        
        
        b1= new JButton("Create");
        b1.setBounds(150,250,90,18);
        b1.addActionListener(this);
        p1.add(b1);
        
        
          
        b2= new JButton("Back");
        b2.setBounds(300,250,90,18);
        b2.addActionListener(this);
        p1.add(b2);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/Signupnew.png"));
        Image i1 = c1.getImage().getScaledInstance(200, 190,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l5 = new JLabel(i2);
        l5.setBounds(480, 70, 150, 150);
        add(l5);
        
        
         setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            String name=namefield.getText();
            String username=textField.getText();
            String pass= passwordField.getText();
            String ques=Question.getSelectedItem();
            String ans=answer.getText();
            try {
                
                Conn c1= new Conn();
               
                String query = "insert into accounts(name,username, pass, ques, ans) values('"+name+"','" + username + "', '" + pass + "', '" + ques + "', '" + ans + "')";
                c1.s.executeUpdate(query);  
                
                
                JOptionPane.showMessageDialog(null, "Account Created Succesfully");
                setVisible(false);
            }catch(Exception n){
                n.printStackTrace();
            }
        }else{
            
            new Login();
            setVisible(false);
        }
    } 
    
    
    
     public static void main(String[] args){
         new Signup();
     }
    
}
