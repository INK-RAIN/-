package Ê±¼ä×ª»»Æ÷;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.*;
 
public class RealTime extends JFrame {
	static boolean  flag = false;
	private final JLabel label = new JLabel("\u5317\u4EAC\u65F6\u95F4\uFF1A");
	private final JLabel label_1 = new JLabel("\u7F8E\u56FD\u4E1C\u90E8\u65F6\u95F4\uFF1A");
	private final JLabel label_2 = new JLabel("\u6B27\u6D32\u65F6\u95F4\uFF1A");
	private final JLabel label_3 = new JLabel("\u592A\u5E73\u6D0B\u65F6\u95F4");
	private final JLabel lblBeijing = new JLabel("beijing");
	private final JLabel lblMeiguo = new JLabel("meiguo");
	private final JLabel lblOuzhou = new JLabel("ouzhou");
	private final JLabel lblGelin = new JLabel("gelin");
	public RealTime(){
		super("title");
		this.setBounds(300,300,600,300);
		getContentPane().setLayout(null);
		label.setBounds(0, 13, 105, 18);
		
		getContentPane().add(label);
		label_1.setBounds(0, 67, 105, 18);
		
		getContentPane().add(label_1);
		label_2.setBounds(0, 140, 105, 18);
		
		getContentPane().add(label_2);
		label_3.setBounds(0, 201, 115, 18);
		
		getContentPane().add(label_3);
		lblBeijing.setBounds(148, 13, 420, 18);
		
		getContentPane().add(lblBeijing);
		lblMeiguo.setBounds(148, 67, 420, 18);
		
		getContentPane().add(lblMeiguo);
		lblOuzhou.setBounds(148, 140, 420, 18);
		
		getContentPane().add(lblOuzhou);
		lblGelin.setBounds(148, 201, 420, 18);
		
		getContentPane().add(lblGelin);
		this.setVisible(true);
		while(true)
		{
			lblBeijing.setText(getChinaTime());
			lblMeiguo.setText(getmeiguoTime());
			lblOuzhou.setText(getouzhouTime());
			lblGelin.setText(getgelinnizhiTime());
			try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            e.printStackTrace(); 
	        }
			
		}
	}
	public static String getChinaTime() {
		TimeZone timeZone = TimeZone.getTimeZone("GMT+8:00");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		simpleDateFormat.setTimeZone(timeZone);
		return simpleDateFormat.format(new Date());
		}
	public static String getmeiguoTime() {
		TimeZone timeZone = TimeZone.getTimeZone("GMT+5:00");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		simpleDateFormat.setTimeZone(timeZone);
		return simpleDateFormat.format(new Date());
		}
	public static String getouzhouTime() {
		TimeZone timeZone = TimeZone.getTimeZone("GMT+1:00");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		simpleDateFormat.setTimeZone(timeZone);
		return simpleDateFormat.format(new Date());
		}
	public static String getgelinnizhiTime() {
		TimeZone timeZone = TimeZone.getTimeZone("GMT-15:00");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		simpleDateFormat.setTimeZone(timeZone);
		return simpleDateFormat.format(new Date());
		}
	public static void main(String[] args){
		new RealTime();
	}
}