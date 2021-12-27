package PictureBookOfJava.ClassInheritance;

public class Payment {
  public static void main(String[] args) {
    Drink coffee = new Drink("コーヒー", 200, 3);
    Drink tea = new Drink("お茶", 150, 2);
    Alcohol wine = new Alcohol("ワイン", 300, 2, 15.0f);

    Drink.printTitle();
    coffee.printData();
    tea.printData();
    System.out.println();

    Alcohol.printTitle();
    wine.printData();
    int sum = coffee.getTotalPrice() + tea.getTotalPrice() + wine.getTotalPrice();
    System.out.println("合計金額" + sum + "円");
  }
}

class Drink {
  String name;
  int price;
  int count;

  //コントラクター
  Drink(String n, int p, int c) {
    name = n;
    price = p;
    count = c;
  }

  int getTotalPrice() {
    return count * price;
  }

  static void printTitle() {
    System.out.println("商品名   単価  数量  金額");
  }

  void printData() {
    System.out.println(name + "  " + price + "  " + count + "  " + getTotalPrice());
  }
}

class Alcohol extends Drink {
  float alper;

  Alcohol(String n, int p, int c, float a) {
    super(n, p, c);
    alper = a;
  }

  static void printTitle() {
    System.out.println("商品名(度数[%])  単価  数量  金額");
  }

  void printData() {
    System.out.println(
        name + "(" + alper + ")" + " " + price + " " + count + " " + getTotalPrice());
  }
}
