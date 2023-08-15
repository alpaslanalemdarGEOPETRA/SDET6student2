package Utlity;

public class MyFunc {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


  //  public static  void wait(int sec){
  //
  //      try {
  //          Thread.sleep((sec*1000));
  //
  //      }catch (InterruptedException e){
  //          throw new RuntimeException((e));
  //      }
  //  }

}
