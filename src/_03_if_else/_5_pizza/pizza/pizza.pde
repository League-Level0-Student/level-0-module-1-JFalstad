
PImage sausage;
void setup() {
size(500, 500);
noStroke();
fill(234, 217, 159);
ellipse (250, 250, 325, 325);
fill(255, 3, 3);
ellipse(250, 250, 280, 280);
fill(237, 226, 0);
ellipse (250, 250, 260, 260);
sausage = loadImage ("sausage.png");
sausage.resize(100, 100);
image(sausage, 250, 250);


}
void draw() {
    
}
