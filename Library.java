import java.util.Scanner;

public class Library
{
    public static void main(String []args){
       item []arr=new item[5];;
    
       char x;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=4;i++){
            System.out.print("Book or DVD <b/d> ");
            x=sc.next().charAt(0);
            if(x=='b'){
                arr[i]=new Book();
                
               
            }
           else  if(x=='d'){
                arr[i]=new Dvd();           
            }
 
           try{

            arr[i].read();

 }         catch(Exception e){

          System.out.println("Please Enter Correct Details");
}
}
        for(int i=0;i<=4;i++)
         arr[i].show();
        
    }
}
