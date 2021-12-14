import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	smooth();
  float susX = 300;
  float susY = 300;
  float scale = 200;
  float legDistanceY = (float) (scale * 1.5);
  float legSlightMove = scale / 8;
  float backpackDistanceX = scale / 5;
  float backpackDistanceY = scale / 4;
  float maskDistanceY = scale / 3;

	//among us #1
	noStroke();
	fill(199,16,18);
	//body
	rect(susX, susY, scale, (float) (scale * 1.5));
	//round head
	ellipse((float) (susX + scale/2), susY, scale, (float) (scale * 0.5));
	//legs
	ellipse((float) (susX + legSlightMove), susY + legDistanceY, scale / 4, scale / 2);
	ellipse((float) (susX - legSlightMove)+ scale, susY + legDistanceY, scale / 4, scale / 2);
	//backpack
	rect(susX - backpackDistanceX , susY + backpackDistanceY, scale, scale);
	//mask
	stroke(0);
	strokeWeight(scale / 50);
	fill(149,202,220);
	ellipse(susX + scale, susY + maskDistanceY, (float) (scale * 0.75), (float) (scale * 0.5));
  }
  
  // define other methods down here.
}