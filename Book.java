import java.util.Scanner;

class Book implements item{
    protected String name;
    protected String author;
    protected String publication;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Name :");
        name=sc.nextLine();
        System.out.print("Enter Author Name :");
        author=sc.nextLine();
        System.out.print("Enter Publication :");
        publication=sc.nextLine();
    }
    public void show(){
        System.out.print("Book Name :"+name);
        System.out.print("Author :"+author);
        System.out.print("Publication :"+publication);
    }
}
