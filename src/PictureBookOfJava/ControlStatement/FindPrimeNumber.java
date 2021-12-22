package PictureBookOfJava.ControlStatement;

public class FindPrimeNumber {
  public static void main(String[] args) {
    int max =100;
    boolean[] a = new boolean[max];
    for(int i=0;i<max;i++)
      a[i]=true;
     for(int i=2;i<max;i++){
       if (a[i-1]){
         for (int j=2;i*j<=max;j++)
           a[i*j-1]=false;
         }
       }

       for (int i =1;i<max;i++){
         if (a[i])
           System.out.println((i+1)+" ");
       }
       System.out.println();
     }
    }
