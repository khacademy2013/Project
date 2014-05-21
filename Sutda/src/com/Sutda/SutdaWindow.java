package com.Sutda;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;



public class SutdaWindow extends JFrame implements ActionListener
{	static Frame frame = new Frame("섯다"); //SutdaCardDrawing 클래스에서 프레임 크기를 참조하기 위해 정적 frame 생성
	private static final long serialVersionUID = -7263726447090216870L;
	Image binBG = Toolkit.getDefaultToolkit().getImage("src\\images\\binBG.png"); // 그림읽기
	static final Button startBt=new Button("Start");
	static final Button reStartBt=new Button("Restart");
	static final Button comSizeUpBt=new Button("+");
	static final Button comSizeDownBt=new Button("-");
	static final Button callBt = new Button("Call");;
	static boolean getCallBt = false;
	static boolean getReStartBt = false;
	static final Panel startPn=new Panel();
	static JTextField tf;
	static boolean call ;
	static Label uMoney = new Label();
	SutdaCardList scl = new SutdaCardList();
	public SutdaWindow() 
	{	scl.userMoney=10000;
		frame.setSize(700, 550);
		frame.setResizable(false);
		frame.setBounds(100, 100, 900, 750);
		frame.setMinimumSize(new Dimension(700, 550));
		setLayout(null);
		SutdaCardDrawing scd = new SutdaCardDrawing(); // 자신의 객체를 생성
		System.out.println();
		Label label = new Label();
		label.setText("Regulate To Players");
		label.setFont(new Font("궁서체",20, 30));  //폰트 설정
		uMoney.setBackground(new Color(150, 180, 130));
		uMoney.setFont(new Font("궁서체",15, 15));  //폰트 설정
		uMoney.setAlignment(uMoney.RIGHT);
		uMoney.setForeground(new Color(50, 80, 20));
		startPn.add(label);
		startBt.setBackground(new Color(150, 180, 130));
		frame.add(startBt);
		reStartBt.setBackground(new Color(150, 180, 130));
		frame.add(reStartBt);
		comSizeUpBt.setBackground(new Color(150, 180, 130));
		frame.add(comSizeUpBt);
		comSizeDownBt.setBackground(new Color(150, 180, 130));
		frame.add(comSizeDownBt);
		callBt.setBackground(new Color(150, 180, 130));
		frame.add(callBt);
		startBt.addActionListener(new ActionListener() 
		{	@Override
			public void actionPerformed(ActionEvent e)
			{	scl.getCard();
				new SutdaRule().result();
				String str = tf.getText();
				scl.comSize = str.charAt(0)-'0';
				frame.remove(startBt);
				frame.remove(startPn);
				frame.remove(comSizeUpBt);
				frame.remove(comSizeDownBt);
				getCallBt = true;
				frame.setResizable(true);
			}
		});
		reStartBt.addActionListener(new ActionListener() 
		{	@Override
			public void actionPerformed(ActionEvent e)
			{	scl.getCard();	
				new SutdaRule().result();
				call=false;
				getReStartBt = false;
			}
		});
		callBt.addActionListener(new ActionListener() 
		{	@Override
			public void actionPerformed(ActionEvent e)
			{	call = true;
				getReStartBt = true;
			}
		});
		comSizeUpBt.addActionListener(new ActionListener() 
		{	@Override
			public void actionPerformed(ActionEvent e)
			{	String str = tf.getText();
				int i = str.charAt(0)-'0';
				if(i<9)i+=1;
				tf.setText(""+i);
			}
		});
		comSizeDownBt.addActionListener(new ActionListener() 
		{	@Override
			public void actionPerformed(ActionEvent e)
			{	String str = tf.getText();
				int i = str.charAt(0)-'0';
				if(i>1)i-=1;
				tf.setText(""+i);
			}
		});
		tf = new JTextField(1);
		tf.setEditable(false); //편집불가능하게
		tf.setBackground(new Color(150, 180, 130));
		tf.setFont(new Font("궁서체",Font.BOLD,80));
		tf.setText("1");
		startPn.add(tf);
		startPn.setBounds(frame.getWidth()/16*5, frame.getHeight()/16*5,frame.getWidth()/16*6,frame.getHeight()/16*6);
		startPn.setBackground(new Color(150, 180, 130));
		frame.add(uMoney);
		frame.add(startPn);
		frame.add(scd);
		frame.setVisible(true);
		tf.requestFocus(); //커서를 입력창으로 
		frame.addWindowListener(new WindowAdapter() 
		{	public void windowClosing(WindowEvent arg0) 
			{	System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	}
	public static void main(String[] args) 
	{	new SutdaWindow();	tf.requestFocus(); //커서를 입력창으로 
	}
}
