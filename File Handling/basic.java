import java.util.*;
class sample{
    public static void main(String args[]){
        String[] arr={
            "India is a strong nation",
            "India is a democratic soil",
            "AP is a great state",
            "This is Sanjay"
        };

        
        try{
            File myObj = new File("test.text");
            myObj.createNewFile();
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        Scanner sc=new Scanner(System.in);
    }
}