void setup()
{
  size(500, 500);
  background(119, 000, 170);
}

void draw()
{
  fill(255, 102, 000);
  ellipse(250, 250, 400, 360);
  fill(255, 255, 000);
  triangle(100, 250, 200, 250, 150, 180);
  triangle(300, 250, 400, 250, 350, 180);
  arc(250, 300, 280, 180, 0 , PI, CHORD);
  triangle(250, 250, 225, 275, 275, 275);
  fill(119, 221, 000);
  rect(233, 40, 30, 60);
  textSize(50);
  text("Happy Halloween!", 40, 480);
}
