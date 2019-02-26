import ddf.minim.*;
PImage pictureOfRecord;
  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
int spin=0;
void setup(){   
  size(600,600);  
  pictureOfRecord= loadImage("record.jpg");  
  pictureOfRecord.resize(400,400);
  minim = new Minim(this);  
  song = minim.loadFile("The Coconut Song.mp3", 512);//in the setup method
}
void draw(){
  rotateImage(pictureOfRecord, spin);
  if(mousePressed){
  image(pictureOfRecord, 100, 100); 
song.play();
  }
  spin+=10;
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}