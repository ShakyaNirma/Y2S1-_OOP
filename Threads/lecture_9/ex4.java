package lecture_9;


class Example {//this is another method 
	//this is synchronized block method
    static void display(Example example ) { // Make the method synchronized
    	 synchronized (example) {
    	 for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}

public class ex4 implements Runnable {
   Example example;

    public ex4(Example example) {
        this.example = example;
    }

    public static void main(String[] args) {
        Example example = new Example();
       
        Thread thread3= new Thread(new ex4(example)); // Correct the class name to ex4
        thread3.start();
        Thread thread4 = new Thread(new ex4(example)); // Correct the class name to ex4
        thread4.start();
    }

    public void run() {
        example.display(example);
    }
}
