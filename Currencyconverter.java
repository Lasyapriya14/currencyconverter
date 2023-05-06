import javax.swing.*;    
import java.awt.event.*;

public class CurrencyConverter 
{    
	JFrame f; 
	JLabel l1,l2;
	JTextField t1;
	
	public CurrencyConverter()
	{    
	    f=new JFrame("Currency Converter");   
	    f.setResizable(false);
	    l1=new JLabel("Enter Amount");  
	    l1.setBounds(50,50, 300,30); 
	    t1=new JTextField(20);
	    t1.setBounds(250,50, 300,30);
	    
	    String currencies[]={"INR","USD","EURO","POUND"};  
	    
	    
	    JComboBox<String> cb1 = new JComboBox<>(currencies); 
	    cb1.setBounds(50,100, 100,30); 
	
	   
	    JComboBox<String> cb2 = new JComboBox<>(currencies);  
	    cb2.setBounds(50,150, 100,30); 
	    
	    JButton b=new JButton("Show");  
	    b.setBounds(50,200, 100,30);
	    
	    
	    l2=new JLabel("");  
	    l2.setBounds(50,250, 300,30); 
	      
	    b.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              double v;
              if(t1.getText().length()==0)
              {
                   JOptionPane.showMessageDialog(b,"Sorry , Enter Amount");
              }
              else if(cb1.getSelectedItem()==cb2.getSelectedItem())
              {
                      JOptionPane.showMessageDialog(b,"Sorry..from & to should be different");
              }
              
              if(cb1.getSelectedItem()=="INR")
              {
                     if(cb2.getSelectedItem()=="USD")
                     {
                         v = 0.012 * Double.parseDouble(t1.getText());                         v = Math.round(v*100)/100.0;
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="EURO")
                     {
                         v = 0.011 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="POUND")
                     {
                        
                         v = 0.0098 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
              else if(cb1.getSelectedItem()=="USD")
              {
                     if(cb2.getSelectedItem()=="INR")
                     {
                         v = 82.11 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="EURO")
                     {
                        
                         v = 0.93 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="POUND")
                     {
                         
                         v = 0.81 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
              
              else if(cb1.getSelectedItem()=="EURO")
              {
                     if(cb2.getSelectedItem()=="USD")
                     {
                         v = 1.08 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="INR")
                     {
                         v = 88.85 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="POUND")
                     {
                        
                         v = 0.88 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
              
              else if(cb1.getSelectedItem()=="POUND")
              {
                     if(cb2.getSelectedItem()=="INR")
                     {
                         v = 101.09 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="USD")
                     {
                         v = 1.23 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="EURO")
                     { 
                         v = 1.14 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
          }
      });
      
    f.add(cb1);     
    f.add(cb2); 
    f.add(l1); 
    f.add(t1);
    f.add(b);  
    f.add(l2);
    
    f.setDefaultCloseOperation(3);
    f.setSize(700,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}
  
public static void main(String[] args) {    
    new CurrencyConverter();         
}    
}    
