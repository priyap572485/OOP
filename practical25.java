import java.util.*;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
class ThreadOne extends Thread {
    Table t;

    ThreadOne(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}
class ThreadTwo extends Thread {
    Table t;

    ThreadTwo(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}
public class Main {
    public static void main(String[] args) {
        Table obj = new Table();

        ThreadOne t1 = new ThreadOne(obj);
        ThreadTwo t2 = new ThreadTwo(obj);

        t1.start();
        t2.start();
    }
}