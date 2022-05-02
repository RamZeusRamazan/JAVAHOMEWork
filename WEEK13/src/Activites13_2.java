public class Activites13_2 {
    public static void main(String[] args) {
        String a ="ABC";
        String b ="QWE";
        Thread t1 =new Thread(){
            public void run(){
                synchronized (a){
                    System.out.println("A is synchronized from Thread1 ");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println("B is synchronized from Thread1 ");
                    }
                }
            }
        };
        Thread t2 =new Thread(){
            public void run(){
                synchronized (b){
                    System.out.println("B is synchronized from Thread2");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println("B is synchronized from Thread2 ");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
