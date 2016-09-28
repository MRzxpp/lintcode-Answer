/**
 * Created by Zhongsz on 2016/9/12.
 */
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // 创建第二个新线程
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // 开始线程
    }

    // 第二个线程入口
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // 暂停线程
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class NewThread2 implements Runnable {
    Thread t;

    NewThread2() {
        t = new Thread(this, "ChildChild");
        System.out.println("ChildChild: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("ChildChild Thread: " + i);
                // 暂停线程
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting childchild thread.");
    }
}

public class TestThread {
    public static void main(String args[]) {
        new NewThread(); // 创建一个新线程
        new NewThread2();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}