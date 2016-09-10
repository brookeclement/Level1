import ddf.minim.*;

Minim minim;        //as a member variable
AudioPlayer song;  
PImage pictureOfRecord;  
int imageAngle;

void setup()
{
  pictureOfRecord= loadImage("record.png");
  size(500, 484);  
  minim = new Minim(this);  
  song = minim.loadFile("Spoopy.mp3", 512);
}

void draw()
{
  imageAngle= imageAngle+100;
 if(mousePressed)
  {
    song.play();
    rotateImage(pictureOfRecord, imageAngle);
  }
  else
  {
    song.pause();
  }
  image(pictureOfRecord, 0, 0);
}

void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}