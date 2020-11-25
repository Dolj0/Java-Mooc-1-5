/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Timer {
    
    private int seconds;
    private int hunSeconds;
    
    public Timer(){
        this.seconds=0;
        this.hunSeconds=0;
    }
    
    public String toString(){
        if (this.seconds<10){
            if (this.hunSeconds<10){
                return "0"+seconds+":"+"0"+hunSeconds;
            } else {
                return "0"+seconds+":"+hunSeconds;
            }
        } else if (this.hunSeconds<10){   
        return seconds+":0"+hunSeconds;
        } else{
            return seconds+":"+hunSeconds;
        }
    }
    
    public void advance(){
        this.hunSeconds=this.hunSeconds+1;
        
        if(this.hunSeconds >= 100){
            this.hunSeconds = 0;
            this.seconds = this.seconds +1;   
        }
        
        if(this.seconds >= 100){
            this.seconds = 0;
        }
    }
}
