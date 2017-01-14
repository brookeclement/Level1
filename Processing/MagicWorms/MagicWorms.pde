int wormCount = 0;

void setup()
{
  size(1000, 1000);
  background(000, 238, 221);
}

void draw()
{
  for(int i = 0; i < wormCount; i ++)
  {
    makeWorm(i*1000);
  }
}

void makeWorm(int num)
{
 
  int r = (int)random(255);
  int g = (int)random(255);
  int b = (int)random(255);
  fill(r, g, b);
  ellipse(getWormX(num), getWormY(num), 100, 100);
  makeMagical();
}
float frequency = .03;
float noiseInterval = 7; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

void mouseClicked()
{
  wormCount++;
}
