import java.io.*;		//importing java.io to use the methods in the class 	

public class FileCopyDemo {			//main class of the program	
		
	public static void main(String[] args)	//main method of the program
    {	
    	FileInputStream instream = null;          //creation of object of input stream
	FileOutputStream outstream = null;		//creation of object of output stream
 
    	try{																		//try block
    	    File infile =new File("/Users/bibekjyotinath/Desktop/DEMO.txt");		//file path is given when creation of the file is done (input)
    	    File outfile =new File("/Users/bibekjyotinath/Desktop/DEMO1.txt");	//file path is given when creation of the file is done (output)
 
    	    instream = new FileInputStream(infile);								//
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];										//creating byte array of size 1024
 
    	    int length;															//declaration of integer type variable
 
    	    while ((length = instream.read(buffer)) > 0){     					//while loop checks until the file length is less than 0
    	    	outstream.write(buffer, 0, length);									//writes the content into the new file
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");					//displaying of message on the console
 
    	}catch(IOException ioe){												//catch statement if any error is thrown it will catch the error
    		ioe.printStackTrace();											//printStackTrace method will be called with the object ioe
    	 }
    }

}
