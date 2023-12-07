class childThread1 extends Thread{
    private int n1;
    public childThread1(int n1){
        this.n1=n1;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("ChildThread1_" + n1 + "x" + i + "=" + (n1*i));
            try{
                Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
            }
    }
}
}
class ChildThread2 extends Thread{
    private int n2;
    private Thread childThread1;
    public ChildThread2(int n2, Thread childThread1){
        this.n2 = n2;
        this.childThread1 = childThread1;
    }
    @Override
    public void run(){
        try{
            childThread1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=1;i<=10;i++){
            System.out.println("ChildThread2_" + n2 + "x" + i + "=" + (n2*i));
            try{
                Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
            }
        }
    }
}

public class MainThreadExample{
    public static void main(String[] args){
        int n1=5;
        int n2= 7;
        int n3 =9;

        Thread childThread1 = new childThread1(n1);
        Thread childThread2 = new ChildThread2(n2, childThread1);
        childThread1.start();
        childThread2.start();
        try{
            childThread1.join();
            childThread2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=1; i<=10;i++){
            System.out.println("Main Thread -" + n3 + "x" + i + "=" + (n3*i));
            try{
                Thread.sleep(500);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

