class Main extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String args[]){
        for(int i=1;i<=20;i++){
            Main t= new Main();
            t.start();
        }
        for(int j=0;j<=20;j++){
            System.out.println(j+" ");
        }
    }
}