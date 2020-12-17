class cse extends Thread{
  public void run(){
    while (true){
      System.out.println("CSE");
      try {
        Thread.sleep(2000);
      }catch (Exception e){}
    }
  }
}
class clathreads{
  public static void main(String[] args) {
    cse c = new cse();
    c.start();
    while (true){
      System.out.println("BMS COLLEGE OF ENGINEERING");
      try {
        Thread.sleep(10000);
      }catch (Exception e){}
    }
  }
}
