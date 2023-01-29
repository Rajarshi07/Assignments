package day6_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator implements ActionListener {
	JFrame f;// =new JFrame();
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bdiv, bmul, bdec, beq, bdel, bclr;
	static String b="",o="";
	

	public MyCalculator() {
		// TODO Auto-generated constructor stub
		f = new JFrame("Rajarshi Calculator");
		
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(20, 20, 290, 500);
		f.setResizable(false);
		Font fo = new Font("Arial", Font.BOLD, 20);
		t = new JTextField();
		t.setFont(fo);
		t.setBackground(Color.BLUE);
		t.setForeground(Color.WHITE);
		t.setBounds(20, 20, 230, 60);
		t.setText("0");
		f.add(t);
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bdec = new JButton(".");
		beq = new JButton("=");
		bdel = new JButton("DEL");
		bclr = new JButton("CLR");
		b7.setBounds(20, 120, 50, 50);
		b8.setBounds(80, 120, 50, 50);
		b9.setBounds(140, 120, 50, 50);
		bdiv.setBounds(200, 120, 50, 50);
		b4.setBounds(20, 180, 50, 50);
		b5.setBounds(80, 180, 50, 50);
		b6.setBounds(140, 180, 50, 50);
		bmul.setBounds(200, 180, 50, 50);
		b1.setBounds(20, 240, 50, 50);
		b2.setBounds(80, 240, 50, 50);
		b3.setBounds(140, 240, 50, 50);
		bsub.setBounds(200, 240, 50, 50);
		b0.setBounds(20, 300, 50, 50);
		bdec.setBounds(80, 300, 50, 50);
		badd.setBounds(140, 300, 50, 50);
		beq.setBounds(200, 300, 50, 50);
		bdel.setBounds(20, 360, 110, 50);
		bclr.setBounds(140, 360, 110, 50);
		
		
		

		b7.setVisible(true);
		b8.setVisible(true);
		b9.setVisible(true);
		bdiv.setVisible(true);
		b4.setVisible(true);
		b5.setVisible(true);
		b6.setVisible(true);
		bmul.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		bsub.setVisible(true);
		b0.setVisible(true);
		bdec.setVisible(true);
		badd.setVisible(true);
		beq.setVisible(true);
		bdel.setVisible(true);
		bclr.setVisible(true);
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdiv.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bmul.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		bsub.addActionListener(this);
		b0.addActionListener(this);
		bdec.addActionListener(this);
		badd.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);

		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
		f.add(bdiv);
		f.add(bdec);
		f.add(beq);
		f.add(bdel);
		f.add(bclr);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("1"));
			return;
		}
		if(e.getSource()==b2) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("2"));
			return;
		}
		if(e.getSource()==b3) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("3"));
			return;
		}
		if(e.getSource()==b4) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("4"));
			return;
		}
		if(e.getSource()==b5) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("5"));
			return;
		}
		if(e.getSource()==b6) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("6"));
			return;
		}
		if(e.getSource()==b7) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("7"));
			return;
		}
		if(e.getSource()==b8) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("8"));
			return;
		}
		if(e.getSource()==b9) {
			String x = t.getText();
			if(x.isEmpty()||x.matches("0"))x="";
			t.setText(x.concat("9"));
			return;
		}
		if(e.getSource()==b0) {
			String x = t.getText();
			if(x.matches("0"))return;
			t.setText(x.concat("0"));
			return;
		}
		if(e.getSource()==bdec) {
			String x = t.getText();
			if(x.contains("."))
				return;
			if(x.isEmpty())x="0";
			t.setText(x.concat("."));
			return;
		}
		if(e.getSource()==badd) {
			o="+";
			if(b.isBlank()) {
				b=t.getText();
				t.setText("0");
				return;
			}else {
				calcEql();
				return;
			}
		}
		if(e.getSource()==bsub) {
			o="-";
			if(b.isBlank()) {
				b=t.getText();
				t.setText("0");
				return;
			}else {
				calcEql();
				return;
			}
		}
		if(e.getSource()==bmul) {
			o="*";
			if(b.isBlank()) {
				b=t.getText();
				t.setText("0");
				return;
			}else {
				calcEql();
				return;
			}
		}
		if(e.getSource()==bdiv) {
			o="/";
			if(b.isBlank()) {
				b=t.getText();
				t.setText("0");
				return;
			}else {
				calcEql();
				return;
			}
		}
		if(e.getSource()==bdel) {
			String x = t.getText();
			if(x.matches("0"))return;
			if(x.isBlank())x="0";
			x=x.substring(0, x.length() -1);
			t.setText(x);
			return;
		}
		if(e.getSource()==bclr) {
			t.setText("0");
			b="";
			o="";
			return;
		}
		if(e.getSource()==beq) {
			calcEql();
			return;
		}
		
	}
	public void calcEql() {
		if(o.isBlank())return;
		String x=t.getText();
		double d1=Double.parseDouble(x);
		double d2=Double.parseDouble(b);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(o);
		Double res=0d;
		try {
			if(o.equals("+")) res=d2+d1;
			else if(o.equals("-"))res=d2-d1;
			else if(o.equals("*"))res=d2*d1;
			else if(o.equals("/"))res=d2/d1;
			t.setText(res.toString());
			b="";
			o="";
		}catch(ArithmeticException e) {
			t.setText("Error");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator c = new MyCalculator();
	}
}
