import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class DivisionExample extends Frame implements ActionListener {
	String msg;
	TextField num1, num2, res;
	Label l1, l2, l3;
	Button div;

	public DivisionExample() {
		setLayout(new FlowLayout());
		l1 = new Label("number1");
		l2 = new Label("number2");
		l3 = new Label("Result");
		num1 = new TextField(10);
		num2 = new TextField(10);
		res = new TextField(10);
		div = new Button("divide");

		add(l1);
		add(num1);
		add(l2);
		add(num2);
		add(l3);
		add(res);
		add(div);
		div.addActionListener(this);

		 addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent we){
                 System.exit(0);
             }
         });
	}

	public void actionPerformed(ActionEvent ae) {
		String arg = ae.getActionCommand();
		int num1 = 0, num2 = 0;
		if (arg.equals("divide")) {
			if (this.num1.getText().isEmpty() && this.num2.getText().isEmpty()) {
				msg = "Enter the valid numbers!";
				repaint();
			} else {
				try {
					num1 = Integer.parseInt(this.num1.getText());
					num2 = Integer.parseInt(this.num2.getText());

                     try{
						 if(num2==0)
						 {
							 int a=12/0;
						 }
					int num3 = num1 / num2;

					res.setText(String.valueOf(num3));
					msg = "operation done";
					repaint();
					 }catch (ArithmeticException e) {
					 JOptionPane.showMessageDialog(null, " ArithmeticException   Division by zero not defined.");
					res.setText("");
					msg = "Can't be divided by Zero";
					repaint();
					 }

				}
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "NumberFormatException - Non-numeric");
					res.setText("");
					msg = "NumberFormatException - Non-numeric";
					repaint();
				}
			}
		}
	}

	public void paint(Graphics g) {
		g.drawString(msg, 30, 70);
	}

	public static void main(String args[])
	{
		DivisionExample appwin =new DivisionExample();
		appwin.setSize(new Dimension(250,150));
         appwin.setTitle("DIVISION PORTAL");
         appwin.setVisible(true);
	}
}
