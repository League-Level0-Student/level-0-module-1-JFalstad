PImage face;
void setup() {
face = loadImage("face.png");
size(500, 500);
face.resize(350, 350);
image(face, 75, 75);
}
void draw() {
if (mousePressed) {
println(" X " + mouseX + " Y " + mouseY);
}

  fill(mouseX - 3, mouseY / 2 , mouseX + 35);
  ellipse(153, 270, 75, 75);
  fill(0, 0, 0);
  ellipse(151, 266, 10, 10);
  fill(mouseY + 59, mouseX - 210, mouseX * 4);
  ellipse(283, 261, 100, 100);
  fill(0, 0, 0);
  ellipse(283, 258, 15, 15);
  
}
