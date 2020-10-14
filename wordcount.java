/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

/**
 *
 * @author BHARATH sharan
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordcount extends Thread
{
    
 String[] words=null;
    String s;
    int c1=0;
 FileReader f=new FileReader("C:\\Users\\BHARATH sharan\\Documents\\address.txt");
 BufferedReader b1=new BufferedReader(f);
    wordcount(String f) throws Exception
    {
      
        this.start();
    }
    public void run()
    {
        int i=0;
         while(i!=-1)
        {
            try
            {
                 while((s=b1.readLine())!=null)           
                 words=s.split(" ");
                 c1=c1+words.length;
                 System.out.println("address.txt:"+c1);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try
            {
                b1.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
     
     FileReader f1=new FileReader("C:\\Users\\BHARATH sharan\\Documents\\HOMEWORK.java");
     FileReader f2=new FileReader("C:\\Users\\BHARATH sharan\\Documents\\report.txt");
     int c1=0,c2=0,c3=0;
     String[] words=null;
     int n=0;
     BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
     BufferedReader b2=new BufferedReader(f1);
     BufferedReader b3=new BufferedReader(f2);
     String s;
   
 
     try
     {
         n=Integer.parseInt(b1.readLine());
     }
     catch(Exception e)
     {
         
     }
     while((s=b2.readLine())!=null)
             {
                 words=s.split(" ");
                 c2=c2+words.length;
             }
     f1.close();
     while((s=b3.readLine())!=null)
             {
                 words=s.split(" ");
                 c3=c3+words.length;
             }
     f2.close();
 
     System.out.println("HOMEWORK.java="+c2);
     System.out.println("REPORT.txt="+c3);
    }
    
}
