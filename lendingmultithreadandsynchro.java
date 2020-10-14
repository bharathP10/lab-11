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
import java.util.Scanner;


class library
{
    int id;
    public void getid()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER the ID of BOOK to check--->");
        id=obj.nextInt();
    }
    public int get1id()
    {
        return id;
    }
}
public class lendingmultithreadandsynchro implements Runnable {
    
    library lib=new library();
    public static void main(String[] a) 
    {
       
        lendingmultithreadandsynchro B=new lendingmultithreadandsynchro();
        //library lb=new library();
        Thread one =new Thread(B);
        //one.start();
        one.start();
       
    }
    public void run()
    {
        
        int i=100;
        lib.getid();
        verify(i);
        
    }

    public synchronized void verify(int id)
    {
        if(lib.get1id()==id)
        {
            System.out.println("The BOOK is PRESENT you can LEND it !!!....");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                
            }
        }
        else
        {
            System.out.println("The BOOK is NOT AVAILABLE !!!...");
        }
    }
}


