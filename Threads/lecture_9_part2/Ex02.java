package lecture_9_part2;

import java.util.Set;

class ThreadWait1 extends Thread{
	Ex02 ex02;
	
	public ThreadWait1(Ex02 ex02) {
		this.ex02=ex02;
	}
	
	public void run() {
		synchronized(ex02) {
			System.out.println("Starting the execution of wait thread 01");
			try {
				ex02.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" = "+i);
			}
		}
	}
}

class ThreadWait2 extends Thread{
	Ex02 ex02;
	
	public ThreadWait2(Ex02 ex02) {
		this.ex02=ex02;
	}
	
	public void run() {
		synchronized(ex02) {
			System.out.println("Starting the execution of wait thread 02 ");
			try {
				ex02.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" = "+i);
			}
		}
	}
}


class ThreadNotify extends Thread{
	Ex02 ex02;
	
	public ThreadNotify(Ex02 ex02) {
		this.ex02=ex02;
	}
	
	public void run() {
		synchronized(ex02) {
			System.out.println("Starting the execution of notify thread execution");
			ex02.notifyAll();
			System.out.println("After notifying Thread");
		
		}
	}
}

public class Ex02 {

    public static void main(String[] args) {
        Ex02 ex02=new Ex02();
        ThreadWait1 t1=new ThreadWait1(ex02);
        t1.setName("wait Thread 01");
        t1.setPriority(Thread.MAX_PRIORITY);
        
        ThreadWait2 t2=new ThreadWait2(ex02);
        t2.setName("wait Thread 02");
        t2.setPriority(Thread.MAX_PRIORITY);
        
        ThreadNotify t3=new ThreadNotify(ex02);//need to use same object as the threadwait
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}