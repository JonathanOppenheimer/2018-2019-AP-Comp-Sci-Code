import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class DuckHunt extends JPanel
{
	//duck
	int x = 50;
    int y = 50;
    int vy = 1;
    int vx = 1;
    int bounces = 0;
    //mouse
	int check = 1;
	static int xc = 0;
	static int yc = 0;
	//cross hair 
	int hairX = 0;
	int hairY = 0;
	//images
	static BufferedImage image;
	static BufferedImage image2;
	static BufferedImage image3;
	static BufferedImage image4;
	static BufferedImage image5;
	static BufferedImage image6;
	static BufferedImage image7;
	//animation
	int counter = 0;
	
    public static void main(String[]args) throws InterruptedException
    {
    	
        JFrame frame = new JFrame("DuckHunt");
        
        DuckHunt game = new DuckHunt();
        try
        {
         image = ImageIO.read(new File("duck.jpg"));
        }
        catch(IOException e)
        {
        }
        try
        {
         image2 = ImageIO.read(new File("reticle.png"));
        }
        catch(IOException e)
        {
        }
        try
        {
         image3 = ImageIO.read(new File("duckleft.png"));
        }
        catch(IOException e)
        {
        }
        try
        {
         image4 = ImageIO.read(new File("duckright.png"));
        }
        catch(IOException e)
        {
        }
        try
        {
         image5 = ImageIO.read(new File("duckfright.png"));
        }
        catch(IOException e)
        {
        }
        try
        {
         image6 = ImageIO.read(new File("duckfall.png"));
        }
        catch(IOException e)
        {
        }
        try
        {
         image7 = ImageIO.read(new File("background.png"));
        }
        catch(IOException e)
        {
        }
        frame.setCursor(frame.getToolkit().createCustomCursor(image2, new Point((image2.getWidth() / 2) - 1, (image2.getHeight() / 2) - 1), "Reticle"));
        frame.add(game);
        frame.setSize(1024,640);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true)
        {
        	game.moveDucks();
        	game.Tracking();
            game.repaint();
            Thread.sleep(4);
        }
    }
    public DuckHunt()
	{
		//mouse implementation
		MouseListener listener = new myMouseListener();
		addMouseListener(listener);
		setFocusable(true);
		
	}
    public void Tracking()
	{
		PointerInfo y = MouseInfo.getPointerInfo();
		Point z = y.getLocation();
		int qx = (int)z.getX();
		int qy = (int)z.getY();
		hairX = qx;
    	hairY = qy;
    	
	}
    public class myMouseListener implements MouseListener
	{
    	public void mouseClicked(MouseEvent e)
    	{
    		PointerInfo a = MouseInfo.getPointerInfo();
    		Point b = a.getLocation();
    		xc = (int)b.getX();
    		yc = (int)b.getX();
    		Collosion();

    	}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
    private void moveDucks() 
    { 
    	if(check==1) 
    	{
    		if(bounces<5)
    		{
    			if(x+90>=getWidth()|| x <= 0)
    			{
    				vx=-vx;
    				bounces++;
    			}
    			if(y+150>=getHeight()|| y <= 0 )
    			{
    				vy=-vy;
    				bounces++;
    			}
    		}
    		x=x+vx;
    		y=y+vy;
    		int random = (int)(Math.random()*250);
            if(random==25)
            {
            	vx=-vx;
            }
    	}
    	else if(check==3)
    	{
    		x=x+0;
    		y=y+1;
    	}
    	
    }
    public void Cosshair()
    {
    	
    }
    public void Collosion()
    {
    	if((hairX-5 >= x && hairX-5 <= x + 100  && hairY-50 >= y && hairY-50 <= y+80))
    	{
    		check=3;
    	}
    	System.out.println(check);
    	System.out.println(x+20 + "    "  + hairX + "  " +  (y + 70) + "    "  + hairY );
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(0, 191, 255));
        g2d.fillRect(0, 0, 1368, 768);
        g2d.setColor(Color.BLACK);
        
        if(check != 3)
        {
        	if(vx==-1)
        	{
        		g.drawImage(image3, x, y, 100, 80, this);	
        	}
        	if(vx==1) 
        	{
        		g.drawImage(image4, x, y, 100, 80, this);
        	}
        }
        if(check == 3)
        {
        	g.drawImage(image5, x, y, 100, 80, this);
        	//insert some sort of pause between here
        	g.drawImage(image6, x, y, 100, 80, this);
        }
        //g.drawImage(image2, hairX-25, hairY-70, 50, 50, this);
        g.drawImage(image7, 0, 0, 1024, 640, this);
    }
}