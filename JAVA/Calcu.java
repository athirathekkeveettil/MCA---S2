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
		
		add(Lb1);
		add(T1);
		add(Lb2);
		add(T2);
		add(b1)
		add(b2);
		add(b3);
		add(b4);
		add(Lb3);
		add(T3);
		T1.setText("");
		T2.setText("");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae){
		int a,b,c;
		if (ae.getSource()==b1){
		
			a=Integer.parseInt(T1.getText());
			b=Integer.parseInt(T2.getText());
			T3.setText(String.valueOf(a+b));
		}
		if (ae.getSource()==b2){
		
			a=Integer.parseInt(T1.getText());
			b=Integer.parseInt(T2.getText());
			T3.setText(String.valueOf(a-b));
		}
		if (ae.getSource()==b3){
		
			a=Integer.parseInt(T1.getText());
			b=Integer.parseInt(T2.getText());
			T3.setText(String.valueOf(a*b));
		}
		if (ae.getSource()==b4){
		
			a=Integer.parseInt(T1.getText());
			b=Integer.parseInt(T2.getText());
		  if(b>0)
		   {
		    c.setText(String.valueOf(a/b));
		   }
		   else
		   {
		    c.setText(String.valueOf("Not Possible"))
		   }
		
		}
	}
	public static void main(String arg[]){
		Calculator ob=new Calculator();
		ob.setTitle("CALCULATOR");
		ob.setSize(200,300);
		ob.setVisible(true);
	}
}
	
	
        

 
