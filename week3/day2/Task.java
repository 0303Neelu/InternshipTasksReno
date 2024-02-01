class Library{

    public String[] avail=new String[100];
    public String[] issued=new String[100]; 
    public int i=0;
    public int j=0;

    public void addBook(String s){
        avail[i]=s;
        i++;
    }

    public void returnBook(String a){
        int temp=0;
        boolean flag=false;
        for(int h=0;issued[h]!=null;h++){
            if(issued[h].equals(a)){
                temp=h;
                flag=true;
                avail[i]=a;
                i++;
                System.out.println("book returned");
            }
        }
        if(flag){
            for(int h=temp;h<issued.length-1;h++){
                issued[h]=issued[h+1];
            }
        }
        else{
            System.out.println("The book is not found in the list of Issued books.");
        }
    }

    public void issueBook(String s){
        int temp=0;
        boolean flag=false;
        for(int h=0;avail[h]!=null;h++){
            if(avail[h].equals(s)){
                temp=h;
                flag=true;
                issued[j]=s;
                j++;
                System.out.println("book issued");
            }
        }
        if(flag){
            for(int h=temp;h<avail.length-1;h++){
                avail[h]=avail[h+1];
            }
        }
        else{
            System.out.println("the book you are trying to issue is not available.");
        }
    }

    public void showAvailableBooks(){
        System.out.println("\nList of Available Books: ");
        for(int h=0;avail[h]!=null;h++){
            System.out.println(avail[h]+" ");
        }
    }
}

public class Task {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("hello introduction");
        l.addBook("java programming");
        l.addBook("hi");
        l.showAvailableBooks();
        l.issueBook("hello introduction");
        l.issueBook("hi introduction");
        l.returnBook("hello introduction");
        l.returnBook("hey");
    }
}
