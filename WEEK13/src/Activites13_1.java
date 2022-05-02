public class Activites13_1 {
    public static void main(String[] args) throws InterruptedException {
        JThread6 jThread6 =new JThread6();
        Thread thread1 =new Thread(jThread6);
        thread1.start();

        Thread thread2 =new Thread(jThread6);
        thread2.start();

        Thread.sleep(1);
        System.out.println(jThread6.getX());

        JThread7 jThread7 =new JThread7();
        Thread thread3 =new Thread(jThread7);
        thread3.start();

        Thread thread4 =new Thread(jThread7);
        thread4.start();

        Thread.sleep(1);
        System.out.println(jThread7.getX());
    }
}
class JThread6 extends Thread{
    int x=0;
    public  void run(){

        for(int i=0;i<10000;i++){
            int temp=x;
            temp++;
            x=temp;
        }
    }
    public int getX(){
        return this.x;
    }
}
class JThread7 extends Thread{
    int x=0;
    public synchronized void run(){

        for(int i=0;i<10000;i++){
            int temp=x;
            temp++;
            x=temp;
        }
    }
    public int getX(){
        return this.x;
    }
}
