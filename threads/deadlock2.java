class test{
    static String firstName="sanjay";
    static String lastName="Kumar";
    static class Thread1 extends Thread{
        public void run(){
            synchronized(firstName){
                System.out.println("first Name by t1 is: "+firstName);
            }

            synchronized(lastName){
                System.out.println("last Name by t1 is: "+lastName);
            }
        }
    }
    static class Thread2 extends Thread{
        public void run(){
            synchronized(lastName){
                System.out.println("Last Name by t1 is: "+lastName);
            }

            synchronized(firstName){
                System.out.println("first Name by t1 is: "+firstName);
            }

        }
    }

    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.run();
        t2.run();
    }
}