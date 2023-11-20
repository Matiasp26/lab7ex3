package com.company;
import java.util.ArrayList;

interface Drawable{
    public void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Circle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Square");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Triangle");
    }
}

public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Square mySquare = new Square();
        Triangle myTriangle = new Triangle();
        ArrayList<Drawable> forme = new ArrayList<Drawable>();
        forme.add(myCircle);
        forme.add(mySquare);
        forme.add(myTriangle);
        for(Drawable forma: forme){
            forma.draw();
        }
    }
}
