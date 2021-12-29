package PictureBookOfJava.FileAndStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TransWord {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new FileReader("mydic.txt"));
      String a = args[0];

      String eword, jword = null;
      while ((eword=in.readLine()) !=null){
        if (a.equals(eword)){
          jword = in.readLine();
          break;
        }
      }
      if (jword == null)
        System.out.println(a+"はありませんでした。");
        else
        System.out.println(jword);
        in.close();
    }catch (FileNotFoundException e){
      System.out.println("ファイルがありません");
    }catch (Exception e){
      System.out.println("コマンド引数がありません");
    }
  }
}
