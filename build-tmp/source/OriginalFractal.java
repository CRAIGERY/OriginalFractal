import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	size(425,425);
}
public void draw()
{
	freakinGeometry1(10, 10, 3200);
	freakinGeometry2(10, 10, 3200);
	freakinGeometry3(10, 10, 3200);
	freakinGeometry4(10, 10, 3200);
	freakinGeometry5(10, 10, 3200);
	freakinGeometry6(10, 10, 3200);
	freakinGeometry7(10, 10, 3200);
	freakinGeometry8(10, 10, 3200);
}
public void freakinGeometry1(int x, int y, int rad)
{
	if(rad <= 13)
	{
		fill(0, 255, 0);
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x, y, rad/2);
		freakinGeometry1(x+50, y+50, rad/2);
	}
}
public void freakinGeometry2(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+50, y, rad/2);
		freakinGeometry1(x+100, y+50, rad/2);
	}
}
public void freakinGeometry3(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+100, y, rad/2);
		freakinGeometry1(x+150, y+50, rad/2);
	}
}
public void freakinGeometry4(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+150, y, rad/2);
		freakinGeometry1(x+200, y+50, rad/2);
	}
}
public void freakinGeometry5(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+200, y, rad/2);
		freakinGeometry1(x+250, y+50, rad/2);
	}
}
public void freakinGeometry6(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+250, y, rad/2);
		freakinGeometry1(x+300, y+50, rad/2);
	}
}
public void freakinGeometry7(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+300, y, rad/2);
		freakinGeometry1(x+350, y+50, rad/2);
	}
}
public void freakinGeometry8(int x, int y, int rad)
{
	if(rad <= 13)
	{
		strokeWeight(.1f);
		ellipse(x, y, rad, rad);
	}
	else
	{
		freakinGeometry1(x+350, y, rad/2);
		freakinGeometry1(x+400, y+50, rad/2);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
