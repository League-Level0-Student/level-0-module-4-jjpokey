
void setup() {
  background(255,0,255);
  size(200,200);
}

void draw() {
  int x = mouseX;
  int y = mouseY;
  background(255,0,255);
  noFill();
  rect(36,93,25,15);
 if(mousePressed) {
   println(x + "," + y);
 }
 if(y < 93) {
   y = 93;
 }
 if(x < 36) {
   x = 36;
 }
 if(y > 108) {
   y = 108;
 }
 if(x > 62) {
   x = 62;
 }
  fill(255,255,255);
  ellipse(50,100,35,25);
  ellipse(100,100,35,25);
  fill(0,0,0);
  ellipse(x,y,8,8);
  ellipse(x + 50,y,8,8);
  
}