package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	    String shape = in.next();
	    if (shape.equals("ellipse")) {
	    	int [] color= {in.nextInt(), in.nextInt(),in.nextInt()};
	    	boolean filled=in.nextBoolean();
	    if (filled) {
	    	double x = in.nextDouble();
			double y = in. nextDouble();
			double halflength = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.setPenColor(color[0],color[1],color[2]);
			StdDraw.filledEllipse(x,y,halflength,halfHeight);
	    	}
	    else {
	    double x = in.nextDouble();
		double y = in. nextDouble();
		double halflength = in.nextDouble();
		double halfHeight = in.nextDouble();
		StdDraw.ellipse(x,y,halflength,halfHeight);
	    }
	    }
	    if (shape.equals("rectangle")) {
	    	int [] color= {in.nextInt(), in.nextInt(),in.nextInt()};
	    	boolean filled=in.nextBoolean();
	    if (filled) {
	    	double x = in.nextDouble();
			double y = in. nextDouble();
			double halflength = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.setPenColor(color[0],color[1],color[2]);
			StdDraw.filledRectangle(x,y,halflength,halfHeight);
	    	}
	    else {
	    double x = in.nextDouble();
		double y = in. nextDouble();
		double halflength = in.nextDouble();
		double halfHeight = in.nextDouble();
		StdDraw.rectangle(x,y,halflength,halfHeight);
	    }
	    	
	    }
	if (shape.equals("triangle")) {
		int [] color= {in.nextInt(), in.nextInt(),in.nextInt()};
    	boolean filled=in.nextBoolean();
    	if (filled) {
	    	double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in. nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] xCoordinates= {x1,x2,x3};
			double[] yCoordinates= {y1,y2,y3};
			StdDraw.setPenColor(color[0],color[1],color[2]);
			StdDraw.filledPolygon(xCoordinates,yCoordinates);
	    	}
    	else {
    	double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in. nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double[] xCoordinates= {x1,x2,x3};
		double[] yCoordinates= {y1,y2,y3};
		StdDraw.polygon(xCoordinates,yCoordinates);
    	}
	}
	    }

}
