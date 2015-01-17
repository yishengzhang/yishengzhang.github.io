// The "TextFileAppender" class.
// Created by Yisheng (Jerry) Zhang
// Created in June 12, 2012
import java.awt.*;
import hsa.Console;
import javax.swing.*;
import java.io.*;
// child class inherits from parent JFrame class
public class TextFileAppender extends JFrame
{
	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
	// list of exceptions: http://www.tutorialspoint.com/java/java_builtin_exceptions.htm
    public static void main (String[] args) throws IOException
    {
	int res = 1;
	String input;
	while (res != 4)
	{
	    input = JOptionPane.showInputDialog (null, "Enter Menu Selection-->\n0. Create OR append Student Name File\n1. Create  OR append Test1 File \n2. Create OR append Test2 File\n3. Create OR append Test3 File\n4. Create OR append Exam File\n5. Calculate Final Mark\n6. Exit System");
	    // continue as one big string for menu options
	    if (input.equals ("0"))
		file0 (); // goes to student name file
	    else if (input.equals ("1"))
		file1 (); //goes to test 1 file
	    else if (input.equals ("2"))
		file2 (); //goes to test 2 file
	    else if (input.equals ("3"))
		file3 (); //goes to test 3 file
	    else if (input.equals ("4"))
		file4 (); //goes to exam file
	    else if (input.equals ("5"))
		calculate (); //goes to final mark file
	    else
		System.exit (0); //allows user to exit system
	    input = JOptionPane.showInputDialog (null, "Wish to continue?\n enter 1.\n Enter 0 to exit");
	    res = Integer.parseInt (input);
	}
	// Place your program here.  'c' is the output console
    } // main method

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    public static void file0 () throws IOException
    {
	int add;
	String num;
	BufferedReader inputBR1;
	FileReader inputFR1;
	PrintWriter outputPW;
	FileWriter outputFW;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	JOptionPane.showMessageDialog (null, "Would you like to append or re-write file?");
	JOptionPane.showMessageDialog (null, "Enter (A)ppend for append or (N)ew for a new file:");
	String ans = JOptionPane.showInputDialog (null, ""); //takes in string input
	if ((ans.equalsIgnoreCase ("append")) || (ans.equalsIgnoreCase ("a"))) //appending the file
	{
	    outputFW = new FileWriter ("file0.txt", true);
	    outputPW = new PrintWriter (outputFW);
	    inputFR1 = new FileReader ("namefilesize.txt");
	    inputBR1 = new BufferedReader (inputFR1);
	    int sizeOfFile = Integer.parseInt (inputBR1.readLine ());
	    outputFW1 = new FileWriter ("namefilesize.txt");
	    outputPW1 = new PrintWriter (outputFW1);
	    JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	    do
	    {
		num = JOptionPane.showInputDialog (null, "");
		add = Integer.parseInt (num);
	    }
	    while (add < 1);//bulletproofs for amount of lines entered
	    int valuereturn= add + sizeOfFile;
	    String feedback=(""+valuereturn);
	    outputPW1.println (feedback);
	    outputFW1.close ();
	    outputPW1.close ();
	    String line = null;
	    JOptionPane.showMessageDialog (null, "Enter the name(s) :");
	    int count;
	    for (count = 1 ; count <= add ; count++)
	    {
		line = JOptionPane.showInputDialog (null, "");
		outputPW.println (line);
	    }
	    JOptionPane.showMessageDialog (null, "Those lines were written to file0.txt.");
	    outputFW.close ();
	    outputPW.close ();

	}
	else
	    new0 (); //goes to create new file for file0.txt
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void new0 () throws IOException
    {
	int add;
	String num, input;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("file0.txt"); //creates file0.txt
	outputPW = new PrintWriter (outputFW);
	outputFW1 = new FileWriter ("namefilesize.txt");
	outputPW1 = new PrintWriter (outputFW1);
	JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	do
	{
	    num = JOptionPane.showInputDialog (null, "");
	    add = Integer.parseInt (num);
	}
	while (add < 1);//bulletproofs for amount of lines entered
	outputPW1.println (num);
	outputFW1.close ();
	outputPW1.close ();
	String line = null;
	JOptionPane.showMessageDialog (null, "Enter the name(s):");
	int count;
	for (count = 1 ; count <= add ; count++)
	{
	    line = JOptionPane.showInputDialog (null, "");
	    outputPW.println (line);
	}
	JOptionPane.showMessageDialog (null, "Those lines were written to written to file0.txt.");
	outputFW.close ();
	outputPW.close ();
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void new1 () throws IOException
    {
	int numb, count, add;
	String input, line, num;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("file1.txt"); //creates file1.txt
	outputPW = new PrintWriter (outputFW);
	outputFW1 = new FileWriter ("filesize1.txt");
	outputPW1 = new PrintWriter (outputFW1);
	JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	do
	{
	    num = JOptionPane.showInputDialog (null, "");
	    add = Integer.parseInt (num);
	}
	while (add < 1);//bulletproofs for amount of lines entered
	outputPW1.println (num);
	outputFW1.close ();
	outputPW1.close ();
	line = null;
	JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	for (count = 1 ; count <= add ; count++)
	{
	    do
	    {
		input = JOptionPane.showInputDialog (null, "Enter the mark");
		numb = Integer.parseInt (input);
	    }
	    while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
	    outputPW.println (input);
	}
	JOptionPane.showMessageDialog (null, "Those lines were written to file1.txt.");
	outputFW.close ();
	outputPW.close ();
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    public static void file1 () throws IOException
    {
	int add, numb;
	String num, input;
	BufferedReader inputBR1;
	FileReader inputFR1;
	PrintWriter outputPW;
	FileWriter outputFW;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	JOptionPane.showMessageDialog (null, "Would you like to append or re-write file?");
	JOptionPane.showMessageDialog (null, "Enter (A)ppend for append or (N)ew for a new file:");
	String ans = JOptionPane.showInputDialog (null, ""); //takes in string input
	if ((ans.equalsIgnoreCase ("append")) || (ans.equalsIgnoreCase ("a"))) //appending the file
	{
	    outputFW = new FileWriter ("file1.txt", true);
	    outputPW = new PrintWriter (outputFW);
	    inputFR1 = new FileReader ("filesize1.txt");
	    inputBR1 = new BufferedReader (inputFR1);
	    int sizeOfFile = Integer.parseInt (inputBR1.readLine ());
	    outputFW1 = new FileWriter ("filesize1.txt");
	    outputPW1 = new PrintWriter (outputFW1);
	    JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	    do
	    {
		num = JOptionPane.showInputDialog (null, "");
		add = Integer.parseInt (num);
	    }
	    while (add < 1);//bulletproofs for amount of lines entered
	    int valuereturn= add + sizeOfFile;
	    String feedback=(""+valuereturn);
	    outputPW1.println (feedback);
	    outputFW1.close ();
	    outputPW1.close ();
	    String line = null;
	    JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	    int count;
	    for (count = 1 ; count <= add ; count++)
	    {
		do
		{
		    input = JOptionPane.showInputDialog (null, "Enter the mark:");
		    numb = Integer.parseInt (input);
		}
		while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
		outputPW.println (input);
	    }
	    outputFW.close ();
	    outputPW.close ();
	    JOptionPane.showMessageDialog (null, "Those lines were written to file1.txt.");
	}
	else
	    new1 (); //goes to method which creates new file for file1.txt

    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void new2 () throws IOException
    {
	int numb, count, add;
	String input, line, num;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("file2.txt"); //creates file0.txt
	outputPW = new PrintWriter (outputFW);
	outputFW1 = new FileWriter ("filesize2.txt");
	outputPW1 = new PrintWriter (outputFW1);
	JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	do
	{
	    num = JOptionPane.showInputDialog (null, "");
	    add = Integer.parseInt (num);
	}
	while (add < 1);//bulletproofs for amount of lines entered
	outputPW1.println (num);
	outputFW1.close ();
	outputPW1.close ();
	line = null;
	JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	for (count = 1 ; count <= add ; count++)
	{
	    do
	    {
		input = JOptionPane.showInputDialog (null, "Enter the mark");
		numb = Integer.parseInt (input);
	    }
	    while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
	    outputPW.println (input);
	}
	JOptionPane.showMessageDialog (null, "Those lines were written to file2.txt.");
	outputFW.close ();
	outputPW.close ();
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    public static void file2 () throws IOException
    {
	int add, numb;
	String num, input;
	BufferedReader inputBR1;
	FileReader inputFR1;
	PrintWriter outputPW;
	FileWriter outputFW;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	JOptionPane.showMessageDialog (null, "Would you like to append or re-write file?");
	JOptionPane.showMessageDialog (null, "Enter (A)ppend for append or (N)ew for a new file:");
	String ans = JOptionPane.showInputDialog (null, ""); //takes in string input
	if ((ans.equalsIgnoreCase ("append")) || (ans.equalsIgnoreCase ("a"))) //appending the file
	{
	    outputFW = new FileWriter ("file2.txt", true);
	    outputPW = new PrintWriter (outputFW);
	    inputFR1 = new FileReader ("filesize2.txt");
	    inputBR1 = new BufferedReader (inputFR1);
	    int sizeOfFile = Integer.parseInt (inputBR1.readLine ());
	    outputFW1 = new FileWriter ("filesize2.txt");
	    outputPW1 = new PrintWriter (outputFW1);
	    JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	    do
	    {
		num = JOptionPane.showInputDialog (null, "");
		add = Integer.parseInt (num);
	    }
	    while (add < 1);//bulletproofs for amount of lines entered
	    int valuereturn= add + sizeOfFile;
	    String feedback=(""+valuereturn);
	    outputPW1.println (feedback);
	    outputFW1.close ();
	    outputPW1.close ();
	    String line = null;
	    JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	    int count;
	    for (count = 1 ; count <= add ; count++)
	    {
		do
		{
		    input = JOptionPane.showInputDialog (null, "Enter the mark:");
		    numb = Integer.parseInt (input);
		}
		while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
		outputPW.println (input);
	    }
	    outputFW.close ();
	    outputPW.close ();
	    JOptionPane.showMessageDialog (null, "Those lines were written to file1.txt.");
	}
	else
	    new2 (); //goes to method which creates new file for file2.txt
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void new3 () throws IOException
    {
	int numb, count, add;
	String input, line, num;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("file3.txt"); //creates file0.txt
	outputPW = new PrintWriter (outputFW);
	outputFW1 = new FileWriter ("filesize3.txt");
	outputPW1 = new PrintWriter (outputFW1);
	JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	do
	{
	    num = JOptionPane.showInputDialog (null, "");
	    add = Integer.parseInt (num);
	}
	while (add < 1);//bulletproofs for amount of lines entered
	outputPW1.println (num);
	outputFW1.close ();
	outputPW1.close ();
	line = null;
	JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	for (count = 1 ; count <= add ; count++)
	{
	    do
	    {
		input = JOptionPane.showInputDialog (null, "Enter the mark");
		numb = Integer.parseInt (input);
	    }
	    while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
	    outputPW.println (input);
	}
	JOptionPane.showMessageDialog (null, "Those lines were written to file2.txt.");
	outputFW.close ();
	outputPW.close ();
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    public static void file3 () throws IOException
    {
	int add, numb;
	String num, input;
	BufferedReader inputBR1;
	FileReader inputFR1;
	PrintWriter outputPW;
	FileWriter outputFW;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	JOptionPane.showMessageDialog (null, "Would you like to append or re-write file?");
	JOptionPane.showMessageDialog (null, "Enter (A)ppend for append or (N)ew for a new file:");
	String ans = JOptionPane.showInputDialog (null, ""); //takes in string input
	if ((ans.equalsIgnoreCase ("append")) || (ans.equalsIgnoreCase ("a"))) //appending the file
	{
	    outputFW = new FileWriter ("file3.txt", true);
	    outputPW = new PrintWriter (outputFW);
	    inputFR1 = new FileReader ("filesize3.txt");
	    inputBR1 = new BufferedReader (inputFR1);
	    int sizeOfFile = Integer.parseInt (inputBR1.readLine ());
	    outputFW1 = new FileWriter ("filesize3.txt");
	    outputPW1 = new PrintWriter (outputFW1);
	    JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	    do
	    {
		num = JOptionPane.showInputDialog (null, "");
		add = Integer.parseInt (num);
	    }
	    while (add < 1);//bulletproofs for amount of lines entered
	    int valuereturn= add + sizeOfFile;
	    String feedback=(""+valuereturn);
	    outputPW1.println (num);
	    outputFW1.close ();
	    outputPW1.close ();
	    String line = null;
	    JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	    int count;
	    for (count = 1 ; count <= add ; count++)
	    {
		do
		{
		    input = JOptionPane.showInputDialog (null, "Enter the mark:");
		    numb = Integer.parseInt (input);
		}
		while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
		outputPW.println (input);
	    }
	    outputFW.close ();
	    outputPW.close ();
	    JOptionPane.showMessageDialog (null, "Those lines were written to file3.txt.");
	}
	else
	    new3 ();     //goes to method which creates new file for file3.txt
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void new4 () throws IOException
    {
	int numb, count, add;
	String input, line, num;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("exam.txt"); //creates file0.txt
	outputPW = new PrintWriter (outputFW);
	outputFW1 = new FileWriter ("examsize.txt");
	outputPW1 = new PrintWriter (outputFW1);
	JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	do
	{
	    num = JOptionPane.showInputDialog (null, "");
	    add = Integer.parseInt (num);
	}
	while (add < 1);//bulletproofs for amount of lines entered
	outputPW1.println (num);
	outputFW1.close ();
	outputPW1.close ();
	line = null;
	JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	for (count = 1 ; count <= add ; count++)
	{
	    do
	    {
		input = JOptionPane.showInputDialog (null, "Enter the mark");
		numb = Integer.parseInt (input);
	    }
	    while (numb < 0 || numb > 100);//bulletproofing in order to ensure range
	    outputPW.println (input);
	}
	JOptionPane.showMessageDialog (null, "Those lines were written to file4.txt.");
	outputFW.close ();
	outputPW.close ();
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void file4 () throws IOException
    {
	int add, numb;
	String num, input;
	BufferedReader inputBR1;
	FileReader inputFR1;
	PrintWriter outputPW;
	FileWriter outputFW;
	PrintWriter outputPW1;
	FileWriter outputFW1;
	JOptionPane.showMessageDialog (null, "Would you like to append or re-write file?");
	JOptionPane.showMessageDialog (null, "Enter (A)ppend for append or (N)ew for a new file:");
	String ans = JOptionPane.showInputDialog (null, ""); //takes in string input
	if ((ans.equalsIgnoreCase ("append")) || (ans.equalsIgnoreCase ("a"))) //appending the file
	{
	    outputFW = new FileWriter ("exam.txt", true);
	    outputPW = new PrintWriter (outputFW);
	    inputFR1 = new FileReader ("examsize.txt");
	    inputBR1 = new BufferedReader (inputFR1);
	    int sizeOfFile = Integer.parseInt (inputBR1.readLine ());
	    outputFW1 = new FileWriter ("examsize.txt");
	    outputPW1 = new PrintWriter (outputFW1);
	    JOptionPane.showMessageDialog (null, "Enter the  number of lines of text required:");
	    do
	    {
		num = JOptionPane.showInputDialog (null, "");
		add = Integer.parseInt (num);
	    }
	    while (add < 1);//bulletproofs for amount of lines entered
	    int valuereturn= add + sizeOfFile;
	    String feedback=(""+valuereturn);
	    outputPW1.println (num);
	    outputFW1.close ();
	    outputPW1.close ();
	    String line = null;
	    JOptionPane.showMessageDialog (null, "We are now entering the marks :");
	    int count;
	    for (count = 1 ; count <= add ; count++)
	    {
		do
		{
		    input = JOptionPane.showInputDialog (null, "Enter the mark:");
		    numb = Integer.parseInt (input);
		}
		while (numb < 0 || numb > 100);//bulletproofs for range of mark
		outputPW.println (input);
	    }
	    outputFW.close ();
	    outputPW.close ();
	    JOptionPane.showMessageDialog (null, "Those lines were written to exam.txt.");
	}
	else
	    new4 ();    //goes to method which creates new file for exam.txt
    }


    public static int getMinValue (int a, int b, int c, int d, int e)
    {
	int numbers[] = {a, b, c, d, e};//all file sizes are in this array
	int minValue = numbers [0];
	for (int i = 1 ; i < numbers.length ; i++)
	{
	    if (numbers [i] < minValue)//this method helps find the smallest of the filesize values
	    {
		minValue = numbers [i];
	    }
	}
	return minValue;//this returns the minimum value into calculate
    }

	// required to handle 
	// throws IOException is need for System.in.read() or a Buffereader object.readLine
    // because main is static then all classes that main will try to access becomes static
    static void calculate () throws IOException
    {
	int i;
	String line0;
	String line1;
	String line2;
	String line3;
	String line4;
	BufferedReader inputBR0;
	FileReader inputFR0;
	BufferedReader inputBR1;
	FileReader inputFR1;
	BufferedReader inputBR2;
	FileReader inputFR2;
	BufferedReader inputBR3;
	FileReader inputFR3;
	BufferedReader inputBR4;
	FileReader inputFR4;
	BufferedReader inputBR5;
	FileReader inputFR5;
	BufferedReader inputBR6;
	FileReader inputFR6;
	BufferedReader inputBR7;
	FileReader inputFR7;
	BufferedReader inputBR8;
	FileReader inputFR8;
	BufferedReader inputBR9;
	FileReader inputFR9;
	// the BufferedReader and FileReader are classess from java.io
	inputFR0 = new FileReader ("file0.txt");
	inputBR0 = new BufferedReader (inputFR0);
	inputFR1 = new FileReader ("file1.txt");
	inputBR1 = new BufferedReader (inputFR1);
	inputFR2 = new FileReader ("file2.txt");
	inputBR2 = new BufferedReader (inputFR2);
	inputFR3 = new FileReader ("file3.txt");
	inputBR3 = new BufferedReader (inputFR3);
	inputFR4 = new FileReader ("exam.txt");
	inputBR4 = new BufferedReader (inputFR4);
	inputFR5 = new FileReader ("namefilesize.txt");
	inputBR5 = new BufferedReader (inputFR5);
	inputFR6 = new FileReader ("filesize1.txt");
	inputBR6 = new BufferedReader (inputFR6);
	inputFR7 = new FileReader ("filesize2.txt");
	inputBR7 = new BufferedReader (inputFR7);
	inputFR8 = new FileReader ("filesize3.txt");
	inputBR8 = new BufferedReader (inputFR8);
	inputFR9 = new FileReader ("examsize.txt");
	inputBR9 = new BufferedReader (inputFR9);

	// NOTE ALL text files are READ BACK LINE BY LINE!
	int sizeOfFile0 = Integer.parseInt (inputBR5.readLine ());//reading in file size from namefilesize.txt
	String name[] = new String [sizeOfFile0];
	for (i = 0 ; i < sizeOfFile0 ; i++)
	{
	    line0 = inputBR0.readLine ();
	    name [i] = line0;
	}
	int sizeOfFile1 = Integer.parseInt (inputBR6.readLine ());//reading in file size from filesize1.txt
	int test1[] = new int [sizeOfFile1];
	for (i = 0 ; i < sizeOfFile1 ; i++)
	{
	    line1 = inputBR1.readLine ();
	    test1 [i] = Integer.parseInt (line1);
	}
	int sizeOfFile2 = Integer.parseInt (inputBR7.readLine ());//reading in file size from filesize2.txt
	int test2[] = new int [sizeOfFile2];
	for (i = 0 ; i < sizeOfFile2 ; i++)
	{
	    line2 = inputBR2.readLine ();
	    test2 [i] = Integer.parseInt (line2);
	}
	int sizeOfFile3 = Integer.parseInt (inputBR8.readLine ());//reading in file size from filesize3.txt
	int test3[] = new int [sizeOfFile3];
	for (i = 0 ; i < sizeOfFile3 ; i++)
	{
	    line3 = inputBR3.readLine ();
	    test3 [i] = Integer.parseInt (line3);
	}
	int sizeOfFile4 = Integer.parseInt (inputBR9.readLine ());//reading in file size from exam.txt
	int exam[] = new int [sizeOfFile4];
	for (i = 0 ; i < sizeOfFile4 ; i++)
	{
	    line4 = inputBR4.readLine ();
	    exam [i] = Integer.parseInt (line4);
	}
	int finalcount = getMinValue (sizeOfFile0, sizeOfFile1, sizeOfFile2, sizeOfFile3, sizeOfFile4);
	for (i = 0 ; i < finalcount ; i++)
	{
	    int m1 = test1 [i];
	    int m2 = test2 [i];
	    int m3 = test3 [i];
	    int m4 = exam [i];
	    double avg = 0.15 * m1 + 0.2 * m2 + 0.25 * m3 + 0.4 * m4;
	    double roundedavg= Math.round(avg);
	    JOptionPane.showMessageDialog (null, "Student           Test1            Test2            Test3             Exam            Average\n"+name [i] + "                  " + m1 + "                  " + m2 + "                  " + m3 + "                 " + m4+"                  "+roundedavg);//outputed message
	}
    }
}
