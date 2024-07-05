import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener{
	TextField T1,T2,T3;
	Label Lb1,Lb2,Lb3;
	Button b1,b2,b3,b4;
	Calculator(){
		setLayout(null);
		T1=new TextField(10);
		T2=new TextField(10);
		T3=new TextField(10);
 
		Lb1 =new Label("First number:");
		Lb2 =new Label("Second Number:");
		Lb3 =new Label("Result:");
		
		
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		b4 = new Button("DIV");
		
		Lb1.setBounds(100,100,60,20);
		add(Lb1);
		T1.setBounds(200,100,100,20);
		add(T1);
		Lb2.setBounds(100,130,60,20);
		add(Lb2);
		T1.setBounds(200,130,100,20);
		add(T2);
		b1.setBounds(80,180,50,20);
		add(b1);
		b1.addActionListener(this);
		b2.setBounds(160,180,50,20);
		add(b2);
		b2.addActionListener(this);
		b3.setBounds(240,180,50,20);
		add(b3);
		b3.addActionListener(this);
		b4.setBounds(320,180,50,20);
		add(b4);
		b4.addActionListener(this);
		Lb3.setBounds(100,230,60,20);
		add(Lb3);
		add(T3);
		T3.setBounds(200,230,100,20);
		add(T3);
		}
		public void actionPerformed(ActionEvent ae){
		int a,b,ans=0;
		String result;
		
			a=Integer.parseInt(T1.getText());
			b=Integer.parseInt(T2.getText());

		if (ae.getSource()==b1)
		     ans=a+b;
		else if (ae.getSource()==b2)
		     ans=a-b;
		else if (ae.getSource()==b3)
		     ans=a*b;
		else if(ae.getSource()==b4)
		{
		  if(b==0)
		   T3.setText("Division Not Possible!");
		  else{
		    ans=a/b;
		   }
                }
                result=String.valueOf(ans);
                T3.setText(result); 
		  
	}
	public static void main(String arg[]){
		Calculator ob=new Calculator();
		ob.setTitle("CALCULATOR");
		ob.setSize(200,300);
		ob.setVisible(true);
	}
}
	
	
        

 
