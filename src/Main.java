import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double  tinhTongTien(Book[] book){
        double sum = 0;
        for (int i = 0; i < book.length; i ++) {
            sum += book[i].getAmount();
        }
        return sum;
    }

    public static int demSoSach(Book[] book){
        int count = 0;
        for (int i = 0; i < book.length; i ++) {
            if(book[i].getLanguage().equals("Java")){
                count++;
            }

        }
        return count;
    }

    public static int min(Book[] book) {
        int min = book[0].getPrice();
        for (int i = 1; i < book.length; i++) {
            if (book[i].getPrice() < min) {
                min = book[i].getPrice();
            }

        }
        return min;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TinhToan opp = new TinhToan.getInsBook();
        opp.books[0] = new Book("anh", "ting anh", 10000, 2, "cong dien van", "tieng anh", "i dont known");
        opp.books[1] = new Book("anh", "ting anh", 20000, 2, "cong dien van", "tieng anh", "i dont known");
//        System.out.println(opp.books[2].getAmount());

        Book[] book = new Book[4];
        for(int i = 0; i < book.length;i++){
            book[i] = new Book();
            System.out.printf("nhap doi tuong thu %d \n",i+1);
            System.out.printf("nhap bookcode %d \n",i+1);
            book[i].setBookCode(scanner.next());
            System.out.printf("nhap name book %d \n",i+1);
            book[i].setName(scanner.next());
            System.out.printf("nhap price %d \n",i+1);
            book[i].setPrice(scanner.nextInt());
            System.out.printf("nhap number %d \n",i+1);
            book[i].setNumber(scanner.nextInt());
            System.out.printf("nhap author %d \n",i+1);
            book[i].setAuthor(scanner.next());
            System.out.printf("nhap language %d \n",i+1);
            book[i].setLanguage(scanner.next());
            System.out.printf("nhap framework %d \n",i+1);
            book[i].setFramework(scanner.next());
        }
        System.out.println(tinhTongTien(book));
        System.out.println(demSoSach(book));
        System.out.println(min(book));


    }
}
