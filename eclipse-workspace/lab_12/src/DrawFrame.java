
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02 Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;

    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the
     * panel.
     * 
     * @param title
     *            String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);

        int width = 800;
        int height = 600;

        // TODO: draw a dog:

        // Base head:
        Circle base = new Circle(new Point(400, 300), 350, Color.WHITE, true);
        // Ears:
        RightTriangle earL = new RightTriangle(new Point(540, 230), -30, -120, Color.WHITE, true);
        RightTriangle earR = new RightTriangle(new Point(537, 230), -15, -100, Color.PINK, true);
        RightTriangle earLInner = new RightTriangle(new Point(255, 230), 30, -120, Color.WHITE, true);
        RightTriangle earRInner = new RightTriangle(new Point(258, 230), 15, -100, Color.PINK, true);
        // Eyes:
        Oval eyeL = new Oval(new Point(480, 235), 40, 60, Color.WHITE, true);
        Oval eyeR = new Oval(new Point(320, 235), 40, 60, Color.WHITE, true);
        Oval eyeLInner = new Oval(new Point(480, 235), 30, 50, Color.BLACK, true);
        Oval eyeRInner = new Oval(new Point(320, 235), 30, 50, Color.BLACK, true);
        // tongue:
        Oval tongue = new Oval(new Point(440, 400), 50, 80, Color.RED, true);
        // Nose:
        Circle nose = new Circle(new Point(400, 290), 40, Color.BLACK, true);
        // Collar:
        Oval collar = new Oval(new Point(400, 475), 350, 40, Color.BLUE, true);
        // Square & Circle around the dog:
        Square square = new Square(new Point(400, 300), 500, Color.MAGENTA, false);
        Circle circle = new Circle(new Point(400, 300), 708, Color.BLACK, false);
        // Mouth :
        PolyLine pLine1 = new PolyLine(new Point(300, 325), new Point(400, 355), 55, Color.BLACK, true);
        PolyLine pLine2 = new PolyLine(new Point(400, 355), new Point(500, 325), 55, Color.BLACK, true);
        // Collar Button
        Circle collarBase = new Circle(new Point(400, 475), 70, Color.RED, true);
        Circle collarLine = new Circle(new Point(400, 475), 50, Color.BLUE, false);
        // MOHAWK:
        Rectangle mohawk = new Rectangle(new Point(400,150), 50, 90, Color.BLACK, true);
        
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();

        // TODO: add shapes to the panel:
        
        drawPanel.addShape(base);
        drawPanel.addShape(eyeL);
        drawPanel.addShape(eyeR);
        drawPanel.addShape(eyeLInner);
        drawPanel.addShape(eyeRInner);
        drawPanel.addShape(earL);
        drawPanel.addShape(earR);
        drawPanel.addShape(earLInner);
        drawPanel.addShape(earRInner);
        drawPanel.addShape(nose);
        drawPanel.addShape(collar);
        drawPanel.addShape(square);
        drawPanel.addShape(circle);
        drawPanel.addShape(pLine1);
        drawPanel.addShape(pLine2);
        drawPanel.addShape(tongue);
        drawPanel.addShape(mohawk);

        drawPanel.addShape(collarBase);
        drawPanel.addShape(collarLine);

        // set background color
        drawPanel.setBackground(Color.YELLOW);

        // add panel to frame
        this.add(drawPanel);

        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args
     *            Command line arguments.
     */
    public static void main(String[] args) {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
