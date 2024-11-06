class MyThread implements Runnable{
  String tname;
  public MyThread(String name){
    this.tname=name;
  }
  public void run(){
    System.out.println("Thread "+tname+" has sarted");
    try{
      Thread.sleep(500);
    }
    catch(Exception e){
      System.out.println(tname+" interrupted");
    }
    System.out.println("Thread "+tname+" has ended");
  }
}

public class CreateThread{
  public static void main(String[] args){
    Runnable r1 = new MyThread("Run");
    Runnable r2 = new MyThread("Debug");
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();

    try{
      t1.join();
      t2.join();
    }
    catch(Exception e){
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread ended");
  }
}