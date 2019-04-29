package kebunit.corelib;

/**
 * @author Sabituddin Bigbang
 * @since 2019
 */


class ThreadExtends extends Thread{
    private Thread myThread;
    private String namaThread;

    public ThreadExtends(String nama) {
        namaThread = nama;
        myThread = new Thread(this, this.namaThread);
        myThread.start();
        System.out.println(namaThread + " lahir ke dunia");
    }

    public Thread getMyThread() {
        return myThread;
    }

    public void runInThread() {
        boolean isTransactionSuccess = false;
        int i = 0;
        System.out.println("proses kehidupan " + namaThread);
        try {
            while(!isTransactionSuccess) {
                System.out.println("umur "  + namaThread + " sekarang adalah " + i + " tahun");
                Thread.sleep(500);
                i=i+20;
                if (i >= 100) {
                    isTransactionSuccess = true;
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  namaThread + " interrupted.");
        }
        System.out.println(namaThread + " meninggal dunia di usia " + i);
    }

    public void run() {
        this.runInThread();
    }
}

// cara 2 implement Runnable interface
class ThreadRunnable implements Runnable {
    private Thread myThread;
    private String namaThread;

    public ThreadRunnable(String nama) {
        namaThread = nama;
        myThread = new Thread(this, this.namaThread);
//		myThread.start();
    }


    public Thread getMyThread() {
        return myThread;
    }

    public void runInThread() {
        System.out.println("Thread started : " + namaThread);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread " +  namaThread + " interrupted.");
        }
        System.out.println("Thread ended : " + namaThread);
    }

    @Override
    public void run() {
        this.runInThread();
    }

}

// Run  Thread
public class ThreadExample {
    public void runThread() {
        ThreadExtends TE = new ThreadExtends("aku");
        ThreadRunnable TR = new ThreadRunnable("kamu");
        TR.getMyThread().start();
        try {
            while(TE.getMyThread().isAlive() || TR.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );

        System.out.println("==========================[JOIN]===================" );
        ThreadRunnable T1 = new ThreadRunnable("Without join 1");
        ThreadRunnable T2 = new ThreadRunnable("Without join 2");
        T1.getMyThread().start();
        T2.getMyThread().start();

        // TE2 dieksekusi setelah TE1 selesai dieksekusi
        ThreadRunnable TR1 = new ThreadRunnable("with join 1");
        TR1.getMyThread().start();
        try {
            TR1.getMyThread().join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        ThreadRunnable TR2 = new ThreadRunnable("with join 2");
        TR2.getMyThread().start();
        try {
            TR2.getMyThread().join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    // Main Application
    public static void main(String[] args) {
        ThreadExample TEx = new ThreadExample();
        TEx.runThread();
    }
}

