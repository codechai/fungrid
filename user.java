package fungrid;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class user extends ButtonGrid implements Runnable,MouseListener {
   //public Thread t;
    boolean isRunning=true;
    int xpos,ypos;
    int x,y;
    boolean mouseEntered;
    int score;
    public user(int w,int l)
    {
       super(w,l);
       score=0;
    }
    public void run(){
        //code here
        while(isRunning){
        }
    }
   public void kill()
   {
       isRunning=false;
   }

    @Override
    public void mouseClicked (MouseEvent me) {

  // Save the coordinates of the click lke this. 
  xpos = me.getX(); 
  ypos = me.getY();

  // Check if the click was inside the rectangle area. 
  x=xpos/10;
  y=ypos/10;
  if(grid[x][y].getBackground()==Color.red)
      score++;

 }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        mouseEntered=true;
    }

    @Override
    public void mouseExited(MouseEvent me) {
        mouseEntered=false;
    }
       public user getScore()
       {
           return this;
       }

}
   
     
                    