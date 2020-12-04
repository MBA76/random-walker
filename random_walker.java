float x, y;
float xspeed, yspeed;

float z, m;
float zspeed, mspeed;

float v, c;
float vspeed, cspeed;

void setup(){
  size(800,800);
  background(#1a1c20);

  x = width*.25;
  y = height/2;
  
  z = width*.50;
  m = height/2;
  
  v = width*.75;
  c = height/2;
  frameRate(1000);
}

void draw(){
  
  xspeed = x += random(-3, 3);
  yspeed = y += random(-3, 3);
  
  zspeed = z += random(-3, 3);
  mspeed = m += random(-3, 3);
  
  vspeed = v += random(-3, 3);
  cspeed = c += random(-3, 3);

  stroke(230);
  strokeWeight(2);
  point(x,y);
  
  stroke(#ee6f57);
  strokeWeight(2);
  point(z,m);
  
  stroke(#794c74);
  strokeWeight(2);
  point(v,c);
  
  if(x>width || x<0){
    x = random(600);
  }
    
  if(y>height || y<0){
    y = random(600);
  }
  
  if(z>width || z<0){
    z = random(600);
  }
  
  if(m>height || m<0){
    m = random(600);
  }
  
  if(v>width || v<0){
    v = random(600);
  }
  if(c>height || c<0){
    c = random(600);
  }
  
}
