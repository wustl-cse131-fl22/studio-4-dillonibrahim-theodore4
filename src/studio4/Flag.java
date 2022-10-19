package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
			StdDraw.clear();
			StdDraw.setPenColor(StdDraw.PINK);
			StdDraw.filledRectangle(22, 16, 22, 16);
			
			StdDraw.setXscale(0, 22);
			StdDraw.setYscale(0, 16);
		
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledCircle( 2,  2,  1);
			
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledCircle( 19,  13,  1);
			
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledCircle( 19,  2,  1);
			
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledCircle( 2,  13,  1);
			
			
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(11, 8, 11, 1);
			StdDraw.filledRectangle(11, 8, 1, 16);


		
			
		}
}

		
