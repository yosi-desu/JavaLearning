
package PictureBookOfJava.Class;

class Classroom{
  public static void main(String[] args) {
    Student taro=new Student(12,"taro",3);
    taro.test[0].setPoint("国語",95);
    taro.test[1].setPoint("算数",51);
    taro.test[2].setPoint("理科",78);
    taro.printScore();

    Student jiro =new Student(9,"jiro",3);
    jiro.test[0].setPoint("国語",55);
    jiro.test[1].setPoint("算数",55);
    jiro.test[2].setPoint("理科",55);
    jiro.printScore();
  }
}
 class Test {
  String subject;
  int point;

  void setPoint(String s,int p){
    subject=s;
    point=p;
  }

  String getPoint(){
    return subject+ ":"+point;
  }
}

class Student{
  int id;
  String name;
  int subnum;//教科数
  Test[] test;

  //コンストラクタ
  Student(int i,String n,int s ){
    id=i;
    name=n;
    subnum=s;
    test=new Test[s];
    for (int j=0; j<s;j++){
      test[j]=new Test();
    }
  }

  String getName(){
    return id + ":"+name;
  }

  //総合得点を知るメソッド
  int getGrade(){
    int sum =0;
    for(int i =0; i<subnum;i++){
      sum+=test[i].point;
    }
    return sum;
  }

  //評価を得るメソッド
  int getGrade(int a){
    int base =100*subnum/a;
    int rank = getGrade()/base+1;
    return (rank>a)?a:rank;
  }

  void printScore(){
    System.out.println(getName());
    for (int i=0;i<subnum;i ++){
      System.out.print(test[i].getPoint()+" ");
    }
    System.out.println();
    System.out.println("総合点"+getGrade());
    int rank=5;
    System.out.println(rank+"段階評価"+getGrade(rank));
    System.out.println();
  }
}

