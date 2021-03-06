
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class statisticCalculator extends JFrame implements ActionListener {
		
		JLabel label1;
		JLabel label2;
		JLabel label3;
		JLabel labelp;
		JLabel labelt;
		JLabel labelc;
		JLabel label5;
		JLabel label6;
		JLabel labelmoves;
		JLabel labelb;
		JLabel label4;
		JLabel var;
		
		
		
		static JTextField textfield1;
		static JTextField textfield2;
		static JTextField textfield3;
		static JTextField textfield4;
		static JTextField textfield5;
		static JTextField textfield6;
		
		static JTextField textvalues;
		
		

		JButton button1;
		JButton button2;
		JButton button3;
		JButton button4;
		JButton button5;
		JButton button6;
		JButton button7;
		
		static JTextArea textarea1;
		
		 JPanel main;
		 JPanel panel1;
		 JPanel panel2;
		 ///These are the sub JPanels for Panel2
		 JPanel subpl1;
		 JPanel subpl2;
		 JPanel subpl3;
		 ///These are sub JPanels for subpl3
		 JPanel subpanel1;
		     JPanel supanelmoc;
		 JPanel subpanel4;
		 JPanel subpanel2;
		     JPanel supanelm;
		 JPanel subpanel3;
		 
		 
		 JPanel panel3;
		 ///This is the sub JPanel for panel3
		 JPanel subpanel;
	     JPanel  subp;
		 
		 
		 
	     //JFrame results;
	     static JScrollPane scrollPane;
		
	  
		  

	     static String[] strValues;
	     static int[] intValues;
	     static  String values;
	  
	   ///Global data types
	    static int sum=0;
	    static  double average;
		   
public statisticCalculator(){///*****************************************************************
		
		setSize(750,380); ///750, 350
		setTitle("Statistics");
		
		
		main = new JPanel(new BorderLayout());
		panel1 = new JPanel();
		panel2 = new JPanel(new BorderLayout());
		///These are the sub JPanels for Panel2
		subpl1 = new JPanel();
		subpl2 = new JPanel();
		subpl3 = new JPanel();
		///These are the sub JPanels for subpl3
		subpanel1 = new JPanel(new GridLayout(2,1));//Measures of Center
		supanelmoc = new JPanel(new GridLayout(0,2));//////
		subpanel2 = new JPanel(new GridLayout(3,1));///Standard Deviation
		supanelm = new JPanel(new GridLayout(0,2));////////
		subpanel3 = new JPanel(new GridLayout(3,1));
		subpanel4= new  JPanel(new GridLayout(2,1));
		
		panel3 = new JPanel(new BorderLayout());
		///This is the sub JPanel for panel3 
		subpanel = new JPanel();
		subp = new JPanel();
		
		
		
		label1 = new JLabel("Measures of Center:",JLabel.CENTER);
		label1.setFont(new Font("Serif", Font.BOLD,13));
		
		
		/////Measures of Center
		label2 = new JLabel("Mean",JLabel.CENTER);
		label2.setFont(new Font("Serif", Font.BOLD,13));
		label4 = new JLabel("Median",JLabel.CENTER);
		label4.setFont(new Font("Serif", Font.BOLD,13));
		label5 = new JLabel("Mode",JLabel.CENTER);
		label5.setFont(new Font("Serif", Font.BOLD,13));
		label6 =  new JLabel("Range",JLabel.CENTER);
		label6.setFont(new Font("Serif", Font.BOLD,13));
        ///////////////		
		
		
		
		label3 = new JLabel("Standard Deviation:",JLabel.CENTER);
		label3.setFont(new Font("Serif", Font.BOLD,13));
		labelt = new JLabel("Measures of Center",JLabel.CENTER);
		labelt.setFont(new Font("Serif", Font.BOLD,20));
		labelt.setForeground(Color.white);
		labelc= new JLabel("Type Numbers:");
		labelc.setFont(new Font("Serif", Font.BOLD,13));
		labelc.setForeground(Color.white);
		textvalues = new JTextField(17);
		 textfield1 = new JTextField(6);
		 
		 
		 ///Measures of Center data
		 textfield2 = new JTextField(6);
		 textfield3 = new JTextField(6);
		 textfield4 = new JTextField(6);
		 textfield5 = new JTextField(6);
		
		 
		 ///JTextArea
		 textarea1=new JTextArea(20,40);
		 textarea1.setLineWrap(true);
	     scrollPane = new JScrollPane(textarea1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	     scrollPane.setPreferredSize(new Dimension(650, 350));
		 scrollPane.setVisible(false);
		 
		 button1 = new JButton("Exit");
		 button1.addActionListener(this);
		 
	     button2 = new JButton("Show Measures of Center");//******************
		 button2.addActionListener(this);
		 button3 = new JButton("Display All #s");
		 button3.addActionListener(this);
		 button4 = new JButton("Clear");
		 button4.addActionListener(this);
		 button5 = new JButton("Add Numbers");
		 button5.addActionListener(this);
		 
		 //Standard Deviation
		 button6 = new JButton("Show STDs");
		 button6.addActionListener(this);
		 var  = new JLabel("Variance STD:",JLabel.CENTER);
		var.setFont(new Font("Serif", Font.BOLD,13));
		textfield6  = new JTextField(6);
 
	

		
		///////////////////////////////////////////////////////////////////
		 /*
		  * Main JPanels
		  */
		 main.add(panel1, BorderLayout.NORTH);
		 main.add(panel2, BorderLayout.CENTER);
		 main.add(panel3, BorderLayout.SOUTH);
		 add(main);
		 panel1.setBackground(Color.darkGray);///blue
		  panel2.setBackground(Color.darkGray); ///gray
		  panel3.setBackground(Color.darkGray); //Green
		  ///////////////////////////////////////////////////////////
		  
		    /*
			 * Added variables for Panel1
			 */
			panel1.add(labelt);

				
			/*
			 * Added variables to JPanel2
			 */
			subpl1.add(labelc);
			subpl1.add(textvalues);
			subpl1.add(button5);
			subpl2.add(button2);

			
			  /*
			   * Added sub JPanels to Panel2
			   */
			  panel2.add(subpl1, BorderLayout.NORTH);////
			  subpl1.setBackground(Color.darkGray);///Orange
			  panel2.add(subpl2, BorderLayout.CENTER);////
			  subpl2.setBackground(Color.darkGray);///yellow
			  panel2.add(subpl3, BorderLayout.SOUTH);/////
			  subpl3.setBackground(Color.darkGray);///pink
			  /*
			   * Added sub JPanels to subpl3
			   */
			  ////Measures of Center
			  subpl3.add(subpanel1);/////// subpanel 1
			  subpanel1.add(label1);
			 subpanel1.add(supanelmoc);
			 supanelmoc.add(label2);
			 supanelmoc.add( textfield2);
			 supanelmoc.add(label4);
			 supanelmoc.add(textfield3);
			 supanelmoc.add(label5);
			 supanelmoc.add(textfield4);
			 supanelmoc.add(label6);
			 supanelmoc.add(textfield5);
			  
			  

			  subpl3.add(subpanel4);///////subpanel 4
			
			  subpl3.add(subpanel2);///////// subpanel 2
			  ///subpanel Standard Deviation
			  subpanel2.add(label3);
			  subpanel2.add(supanelm);
			  supanelm.add(button6);
			  supanelm.add(textfield1);
			  supanelm.add(var);
			  supanelm.add(textfield6);
			 
			  
			  
			 /*
			  * Added variables to JPanel3
			  */
	         panel3.add(subp, BorderLayout.NORTH);
	         subp.add(button3);
			 subp.add(button4);
			 subp.add(button1);
		     panel3.add(subpanel, BorderLayout.SOUTH);
		     subpanel.add(scrollPane);
			 
		      setVisible(true);
}


/*
 * Main Method
 */
	public static void main(String [] args){
		System.out.println("Measures of Center");
		 new statisticCalculator(); 
	}
	
	
/*
 * Array insertion point
 */
public static void insertArray(){
	
	// Gets the inserted values of the text field and uses a comma to separate them.
	 values = textvalues.getText().replaceAll("\\s","");

	 
	 // Then the values are returned as a string array
	  strValues = values.split(",");// String Array[]

	 // Initialize the int array
	  intValues = new int[strValues.length];/// Int Array[]
	
	
	  // Converts each string value to an integer value and then inserts into the integer array
	 for(int i = 0; i < strValues.length; i++) {
	     try {
	        intValues[i] = Integer.parseInt(strValues[i]);
	        textarea1.append(Integer.toString(intValues[i])+" "+'\n');
	     } catch (NumberFormatException nfe) {
	        // The string does not contain a parsable integer.
	    	 textvalues.setForeground(Color.RED);
	    	 textvalues.setText("No Interger Value Found");
	     }
	     
	     
	 }
	 ///This for loop, finds the total sum of the array
	 for (int i2 = 0; i2 < intValues.length; i2++) {
         sum = intValues[i2] + sum;
     }
	 textarea1.append("Total Values of the Array"+" "+sum);	 
}


/*
 * SoftWare Requirements- debugging
 * 
 *1. Decimal placement slightly off
 *2. Currently only finds one mode in within the numbers
 * 
 * 
 */



/*
 * Finding the Mean
 */
public static void findMean(){

	average = sum / intValues.length;
	 String avg =average+"";
	 textfield2.setText(avg);
	 System.out.println("Finding the Mean"+" "+avg);	
	 
}


/*
 * Finding the Median
 */
public static void findMedian(){

	System.out.println("Finding the Median");	

	Arrays.sort(intValues);
	double median;
	if (intValues.length % 2 == 0)
	    median = ((double)intValues[intValues.length/2] + (double)intValues[intValues.length/2 - 1])/2;
	else
	    median = (double) intValues[intValues.length/2];
	
	String med = median+"";
	textfield3.setText(med);
}


/*
 * Finding the Mode
 */
public static void findMode(){

	int maxValue = 0, maxCount = 0;

	    for (int i = 0; i < intValues.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < intValues.length; ++j) {
	            if (intValues[j] == intValues[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue =intValues[i];
	        }
	        String mode = maxValue+"";
	    	textfield4.setText(mode);
	    }	
}


/*
 * Finding the Standard Deviation & Variance (Standard Deviation)
 */
public static void findStds(){
	double std = 0;

	try{
	for (int i=0; i<intValues.length;i++)
	{
	    std = std + (intValues[i]-average)*(intValues[i]-average);
	}
	double variance = std/ (intValues.length-1);
	System.out.println("Variance:" +" "+ variance);
	String vari = variance+"";
	textfield6.setText(vari);/////This JTextField shows the Variance 
	double SD = Math.sqrt(variance);
	DecimalFormat df = new DecimalFormat("#.000");
	String standard =df.format(SD)+"";
	textfield1.setText(standard);///This JTextField shows the Standard Deviation
	
	}catch(NullPointerException fg){
		 textfield6.setForeground(Color.RED);
		 textfield6.setText("Error");
		 scrollPane.setVisible(false);
		 textfield1.setForeground(Color.RED);
		 textfield1.setText("Error");
		 scrollPane.setVisible(false); 
	}	
}


/*
 * Finding the Range
 */
public static void findRange(){
	
	Arrays.sort(intValues);
	
	int min = intValues[0];
	int max = intValues[intValues.length - 1];
	int difference = 0;
	for (int i=0; i<intValues.length; i++){
	 difference =max - min;
	}
	String rng =difference+"";
	textfield5.setText(rng); 
	
}

@Override
public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("at Action Performed");
		Object source=e.getSource();
			if(source==button5){/////////button5 adds the numbers to the array/calculates the array
				System.out.println("Add Numbers");
				insertArray();
			}if(source==button2){
				System.out.println("Show Measures of Center");
				try{
				findMean();
				findMedian();
				findMode();
				findRange();
				scrollPane.setVisible(true);
				 setSize(750,690);
				}catch(NullPointerException bg){
					textfield2.setForeground(Color.RED);
					 textfield2.setText("Error");
					 scrollPane.setVisible(false);
					 textfield3.setForeground(Color.RED);
						textfield3.setText("Error");
						 textfield4.setForeground(Color.RED);
						 textfield4.setText("Error");
						 textfield6.setForeground(Color.RED);
						 textfield6.setText("Error");
						 scrollPane.setVisible(false);
						 textfield1.setForeground(Color.RED);
						 textfield1.setText("Error");
						 textfield5.setForeground(Color.RED);
						 textfield5.setText("Error");
				} catch(ArithmeticException rtf){
						 textfield2.setForeground(Color.RED);
						 textfield2.setText("Error");
						 scrollPane.setVisible(false);
						 textfield3.setForeground(Color.RED);
						textfield3.setText("Error");
						 textfield4.setForeground(Color.RED);
						 textfield4.setText("Error");
						 textfield6.setForeground(Color.RED);
						 textfield6.setText("Error");
						 scrollPane.setVisible(false);
						 textfield1.setForeground(Color.RED);
						 textfield1.setText("Error");
						 textfield5.setForeground(Color.RED);
						 textfield5.setText("Error");
				    }
		
			}if(source== button3){
				System.out.println("Display All #s");
				scrollPane.setVisible(true);
				 setSize(750,690);
			}if(source==button6){
				System.out.println("Show Standard Deviation");
				findStds();
			}
			if(source==button4){
				System.out.println("at Clear Button");
				scrollPane.setVisible(false);
				setSize(750,380); //750, 350
				textarea1.setText("");
				textfield1.setText("");
				textfield1.setForeground(Color.BLACK);
				textfield2.setText("");
				textfield2.setForeground(Color.BLACK);
				textfield3.setText("");
				textfield3.setForeground(Color.BLACK);
				textfield4.setText("");
				textfield4.setForeground(Color.BLACK);
				textfield5.setText("");
				textfield5.setForeground(Color.BLACK);
				textfield6.setText("");
				textfield6.setForeground(Color.BLACK);
				textvalues.setText("");
				textvalues.setForeground(Color.BLACK);
				 strValues = new String [0];
				  intValues = new int[0];
			}if(source==button1){
				System.out.println("Exit Java Program");
				setVisible(false);
			}
	}
}
	
	
	
	


