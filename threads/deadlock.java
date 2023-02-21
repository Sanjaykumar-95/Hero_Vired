public class Deadlock{
    static String name="Sanjay Kumar";
    static class ThreadDemo1 extends Thread{
        public void run(){
            try{
                System.out.println(name);
            }catch(Exception e){
                System.out.println("This resource is already occupied");
            }
        }
    }
    class ThreadDemo2 extends Thread{
        public void run(){
            try{
                    System.out.println(name);
                }catch(Exception e){
                    System.out.println("This resource is already occupied");
            }    
        }
    }

    public static void main(String args[]){
        ThreadDemo1 t1=new ThreadDemo1();
        ThreadDemo2 t2=new ThreadDemo2();
    }
}