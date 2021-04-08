public class TinhToan {
    private static Book books[];

    public static Book[] getBooks(){
        return books;
    };
    public static void setBooks(Book[] books){
        TinhToan.books = books;
    }

    public TinhToan() {

    };
    public int getSumAmount() {
        int sum = 0;
        for(Book ob : books){
            sum += ob.getAmount();
        }
        return  sum;
    };

    public int countBookByLanguage(String language) {
        int count  = 0;
        for(Book ob : books) {
            if(ob.getLanguage().equals(language)){
                count ++;
            }
        }
        return count;
    };

    public Book[] searchBookByPrice(int price){
        Book[] books1 = new Book[10];
        int count = 0;
        for(int i = 0; i < books.length; i ++) {
            if(books[i].getPrice() < price){
                books1[count] = books[i];
                count++;
            }
        }
        return books1;
    }


}
