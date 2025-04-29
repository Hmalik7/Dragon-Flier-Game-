/**
 * Malik Harsh 
 * CSS 143
 * Message Box Class
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.util.StringTokenizer;


public class MessageBox extends DragonGameShape 
/**
 * I created a new class called MessageBox which will extends the DragonGameShape class
 */

{
    private int heit;
    private int wid; 
    /**
     * the side count for this which is private int will be 4
     */
    
    private String msg; 
    private int sec;
    private int instructionDisplay;
    /**
     * setting my instance varibales to private to ensure privacy leaks 
     * I adding time in secs and also my guidebook display 
     */
    
    private Dragon d;
    private Color Bordcolor;
    private Color Inncolor;
   
    
     int secondsUntilMessageAppears = 10;
     /**
      * this is setting the time frame for my message that will pop when i will press I
      */
    String ts;
    boolean flag2; 
    Timer timerUntilMessageAppears; 
   
    
   
    public void CountDownTimer()
    /**
     * this method will be used for the timer used in the dragontimer 
     */
    {
        timerUntilMessageAppears = new Timer(1000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                sec--;
           
            
                if(sec == 0)
                {
                    timerUntilMessageAppears.stop();
                }
                
            }

        });
    }
    
     
    @Override
    public void draw(Graphics graph) 
    /**
     * this method is all about my mesaage box such as customizing it in color size and adding the guidebook in it. 
     */
    {
        
        if(instructionDisplay % 2 == 0)
        {
            if (this.sec >= 0 || instructionDisplay % 2 == 0 )
            {
           
                int x, y;
                
                if (d.isFacingRight() != true)
                {
                    x = (int) this.loc.x;
                    y = (int) this.loc.y;
                }
                else 
                {
                    x = (int) this.loc.x;
                    x = x + 735;
                    y = (int) this.loc.y;
                    /**
                     * when the game runs, this will show the timer of the live game
                     */
                }
                
            
               
                graph.setColor(this.Bordcolor); 
                graph.fillRect(x, y, this.wid, this.heit); 
                
                 /**
             * setting the graphics in color and customizing the height and width 
             */
                
                
            
                graph.setColor(this.Inncolor); 
                /**s
                 * this will set our inner color to Yellow
                 */
                graph.fillRect(x+5, y+5, this.wid-10, this.heit-10);
                graph.setColor(Color.YELLOW);
           

            
            int fontSize = 16;
                String ts = " Instruction Timer  : " + this.sec; 
                graph.setFont(new Font("New Times Roman", Font.PLAIN, fontSize)); 
                graph.drawString(ts, x+10, y+50);  
                StringTokenizer tokenizer = new StringTokenizer(msg, " ");
                int y1 = y+100;
                String temp_str;
                while(tokenizer.hasMoreTokens())
                {
                
                temp_str = "";
                temp_str = tokenizer.nextToken();
                    
                    /**
                     * in the possibility of another token we have this down below.
                     */
                    if(tokenizer.hasMoreTokens())
                    {
                        temp_str = temp_str +" "+ tokenizer.nextToken();
                    }
                    /** 
                     * we have another third token then we convert it into string.
                     */
                    if(tokenizer.hasMoreTokens())
                    {
                        temp_str = temp_str +" "+ tokenizer.nextToken();
                    }
                    if(tokenizer.hasMoreTokens())
                    {
                        temp_str = temp_str +" "+ tokenizer.nextToken();
                    }
                    if(tokenizer.hasMoreTokens())
                    {
                        temp_str = temp_str +" "+ tokenizer.nextToken();
                    }
                    if(tokenizer.hasMoreTokens())
                    {
                        temp_str = temp_str +" "+ tokenizer.nextToken();
                    }
                    if(tokenizer.hasMoreTokens())
                    {
                        temp_str = temp_str +" "+ tokenizer.nextToken();
                    }
          
                    /**
                     * setting our font size and our font is New Times roman.
                     */
                    graph.setFont(new Font("New Times Roman", Font.PLAIN, fontSize)); 
                    graph.drawString(temp_str, x + 50, y1);
                    y1 = y1+20;
                }
                
            }
        
        
        
        }
        
  
    } 
    
     public MessageBox(Dragon d1, int newheit, int newwidh, Color Bordcolor, Color Innercolor,  int initialA, int initialB, String msg, int flag) 
    /**
     * this is my constructor of MessageBox class
     */
    {
        super();
        this.heit = newheit;
        this.wid = newwidh;
        this.Bordcolor = Bordcolor;
        this.Inncolor = Innercolor;
        this.d = d1; 
        this.loc.x = initialA;
        this.loc.y = initialB;
        this.msg = msg; 
        this.sec = 15;
        this.ts = "";
        CountDownTimer();
        timerUntilMessageAppears.start();
        this.instructionDisplay = 0;
        
    }
    
    public MessageBox() 
    {
        super();
        System.out.println("This is my constructor which is a child");
    
        
        this.heit = 0;
        this.wid = 0;
        this.Bordcolor = Color.YELLOW;
        this.Inncolor = Color.BLACK;
        /**
         * declaring the color of the border column
         */
        this.loc.x = 0;
        this.loc.y = 0;
        this.msg = "";
    }

  
  
      public void setInstructionFlag()
      /**
       * using this to display the instructions when user pressed I to view the game rules.
       */
    {
        this.instructionDisplay = this.instructionDisplay +1;
    } 
    @Override
    public void move() {
       
    }
}

