public class TinhToan {
    public Book[] books = new Book[10];
    private TinhToan(){
    };

    private static TinhToan insBook;


    public static TinhToan getInsBook(){
        int sum = 0;
        if(insBook == null) {
            synchronized (Book.class) {
                if (insBook == null) {
                    insBook = new TinhToan();
                }
            }
        }
        return insBook;
    }




    public static class getInsBook extends TinhToan {


    }
}
