package MiniProject;

public class Main {

    static class MyThread extends Thread{
        String role1 ="cook";
        String role2 = "customer";

        int numberOfCustomer = 100 , capacity = 50;

        @Override
        public void run(){
            
        }
    }




    public static void main(String[] args) {
        Thread customer = new Thread();
        customer.start();

        Thread cook = new Thread();
        cook.start();
        
    }
}