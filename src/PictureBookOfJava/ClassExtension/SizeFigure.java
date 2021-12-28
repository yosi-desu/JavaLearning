package PictureBookOfJava.ClassExtension;

public class SizeFigure {
  public static void main(String[] args) {
    Figure fig1 = new Square(2.5);
    Figure fig2 = new Square(2.3, 3.7);
    Figure fig3 = new Circle(3.6);
    fig1.measure();
    fig2.measure();
    fig3.measure();
  }
}

abstract class Figure {
  abstract void area();  //面積

  abstract void around();//外周

  void measure() {
    area();
    around();
    System.out.println();
  }
}

class Square extends Figure {
  double side;
  double height;

  Square(double s) {
    side = height = s;
  }

  Square(double s, double h) {
    side = s;
    height = h;
  }

  @Override
  void area() {
    System.out.println("四角形の面積:" + (side * height));
  }

  @Override
  void around() {
    System.out.println("四角形の外周:" + (2 * (side + height)));
  }
}

class Circle extends Figure {
  final double pi = 3.14;
  double radius;

  Circle(double r) {
    radius = r;
  }

  @Override
  void area() {
    System.out.println("円の面積:" + (radius * radius * pi));
  }

  @Override
  void around() {
    System.out.println("円の外周:" + 2 * radius * pi);
  }
}

