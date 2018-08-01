/*
PImage donkey;
PImage tail;
int x = 0;
int y = 0;

int Mx = 0;
int My = 0;
boolean m = false;
void setup() {
  donkey = loadImage("donkey.jpg");      
tail = loadImage("tail.png");
tail.resize(200,300);
size(800, 685);
}

void draw() {
  background (donkey);
image(tail, mouseX - 100, mouseY);
rect(0, 0, 30, 30);
rect(200, 200, 40, 40);
if(dist(x, y, mouseX, mouseY) < 30) {
  background(donkey);
}
else{
  background(255,255,255);
}
if(mousePressed) {
m = true;
  Mx = mouseX;
  My = mouseY;
  
}
if(m) {
  if(dist(200, 200, Mx, My) < 200) {
  background(donkey);
    image(tail, Mx - 100, My);

}
}

}
*/

