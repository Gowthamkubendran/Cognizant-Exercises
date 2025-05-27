public class ThreadExamp{
    public static void main(String[] args){
        Runnable task1=new MyRunnable("Thread 1");
        Runnable task2=new MyRunnable("Thread 2");
        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
class MyRunnable implements Runnable{
    private String threadName;
    public MyRunnable(String name){
        this.threadName=name;
    }
    @Override
    public void run(){
        for (int i=1;i<=5;i++) {
            System.out.println(threadName+" - Message "+i);
            try {
                Thread.sleep(500); 
            }
            catch(InterruptedException e){
                System.out.println(threadName + "was interrupted");
            }
        }
    }
}
