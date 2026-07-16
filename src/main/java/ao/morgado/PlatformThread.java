package ao.morgado;

public class PlatformThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Running-plataform-thread: " + Thread.currentThread().getName());
    }
}