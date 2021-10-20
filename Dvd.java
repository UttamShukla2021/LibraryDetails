import java.util.Scanner;

class Dvd implements item{
    protected String title;
    protected String director;
    protected String category;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Title :");
        title=sc.nextLine();
        System.out.print("Enter Director Name :");
        director=sc.nextLine();
        System.out.print("Enter Category :");
        category=sc.nextLine();
    }
    public void show(){
        System.out.print("Title :"+title);
        System.out.print("Director :"+director);
        System.out.print("Category :"+category);
    }
}
