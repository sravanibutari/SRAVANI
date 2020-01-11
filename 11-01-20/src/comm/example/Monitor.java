package comm.example;

import java.util.Date;

public class Monitor {
    
    static Date datum=null;
    boolean lock=false;
  
    
    public synchronized Date get(){
        while(lock==false){
            try{
                wait();
            } catch (InterruptedException e){
            }
        }
        lock=false;
        notify();
        return datum;
    }
    
    public synchronized void put(Date n){
        datum=n;
        while(lock==true){
            
            try{
                wait();
            } catch (InterruptedException e){
            }
        }
        
        lock=true;
       
        notify();
    }
}
