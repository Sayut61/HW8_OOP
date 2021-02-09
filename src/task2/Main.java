package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        int work = 5;
        for (int i = 0; i < work; i++) {
            System.out.println("Введите фамилию, должность: ");
            Worker worker = new Worker(in.next(),in.next());
            workers.add(worker);
            try {
                System.out.println("Введите год: ");
                Worker worker1 = new Worker(in.nextInt());
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }finally {
                workers.add(worker);
            }
        }
        workers.sort(Comparator.comparing(Worker::getSurname));
        System.out.println(workers.toString());


    }

}
