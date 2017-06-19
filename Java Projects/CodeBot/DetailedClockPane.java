import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class DetailedClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;

	// Clock pane's width and height
	private double w = 250, h = 250;

	/** Construct a default clock with the current time */
	public DetailedClockPane() {
		setCurrentTime();
	}

	/** Construct a clock with specified hour, minute, and second */
	public DetailedClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}

	/** Return hour */
	public int getHour() {
		return hour;
	}

	/** Set a new hour */
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	/** Return minute */
	public int getMinute() {
		return minute;
	}

	/** Set a new minute */
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	/** Return second */
	public int getSecond() {
		return second;
	}

	/** Set a new second */
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	/** Return clock pane's width */
	public double getW() {
		return w;
	}

	/** Set clock pane's width */
	public void setW(double w) {
		this.w = w;
		paintClock();
	}

	/** Return clock pane's height */
	public double getH() {
		return h;
	}

	/** Set clock pane's height */
	public void setH(double h) {
		this.h = h;
		paintClock();
	}

	/* Set the current time for the clock */
	public void setCurrentTime() {
		// Construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();

		// Set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);

		paintClock(); // Repaint the clock
	}

	/** Paint the clock */
	private void paintClock() {
		// Initialize clock parameters
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;
		double angle;
		
		// Draw second hand
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);
		

		// Draw minute hand
		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);
		

		// Draw hour hand
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		/*double rNumbers = (int)Math.round(80*clockRadius/100);*/
		
		// Draw circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		getChildren().addAll(circle,hLine,mLine,sLine);
		
		//Draw tick marks for each second
		for ( int i=1; i<= 60; i++){
			int len = 5;
			if ( i % 5 == 0 ){
				len = 10;
			}
			double di = (double)i; // tick num as double for easier math
			double angleFrom12 = di/60.0*2.0*Math.PI;
			double angleFrom3 = Math.PI/2.0-angleFrom12;
			float x1 = (float)(centerX+Math.cos(angleFrom3)* clockRadius);
			float y1 = (float)(centerY-Math.sin(angleFrom3)* clockRadius);
			float x2 = (float)(centerX+Math.cos(angleFrom3)*(clockRadius - len));
			float y2 = (float)(centerY-Math.sin(angleFrom3)*(clockRadius - len));
			Line tLine = new Line(x1, y1, x2, y2);
			tLine.setStroke(Color.BLACK); 
			getChildren().addAll(tLine);
		} 
		for ( int i=1; i<=12; i++){
			String numStr = ""+i; 
			double di = (double)i; // number as double for easier math
			double angleFrom12 = di/12.0*2.0*Math.PI;
			double angleFrom3 = Math.PI/2.0-angleFrom12;
			int tx = (int)(Math.cos(angleFrom3)*(clockRadius - 20));
			int ty = (int)(-Math.sin(angleFrom3)*(clockRadius - 20));
			getChildren().addAll(new Text(tx + clockRadius + 20, ty + clockRadius + 30, numStr));
		}
	}
}