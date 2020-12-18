import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class DivisionExample extends Frame implements ActionListener {
	String msg;
	TextField num1, num2, res;
	Label l1, l2, l3;
	Button div;

	public DivisionExample() {
		setLayout(new FlowLayout());
		l1 = new Label("Dividend");
		l2 = new Label("Divisor");
		l3 = new Label("Result");
		num1 = new TextField(10);
		num2 = new TextField(10);
		res = new TextField(10);
		div = new Button("Click");

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
		double num1 = 0, num2 = 0;
		if (arg.equals("Click")) {
			if (this.num1.getText().isEmpty() && this.num2.getText().isEmpty()) {
				msg = "Enter the valid numbers!";
				repaint();
			} else {
				try {
					num1 = Double.parseDouble(this.num1.getText());
					num2 = Double.parseDouble(this.num2.getText());

                     try{
						 if(num2==0)
						 {
							 int a=12/0;
						 }
					double num3 = num1 / num2;

					res.setText(String.valueOf(num3));
					msg = "Operation Succesfull!!!";
					repaint();
					 }catch (ArithmeticException e) {
					System.out.println("Can't be divided by Zero" + e);
					res.setText("");
					msg = "Can't be divided by Zero";
					repaint();
					 }

				}
				catch (NumberFormatException ex) {
					System.out.println(ex);
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
