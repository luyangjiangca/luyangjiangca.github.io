package ap_cs.teach.unit10_recursive;

public class Question2 {
    public static void main(String[] args) {
        Textbook bio2015 = new Textbook(1, "Biology", 9.99);
        Textbook bio2017 = new Textbook(2, "Biology", 9.97);
        System.out.print(bio2017.canSubstitutefor(bio2015));
    }
}
public class Book{
        private String title;
        private double price;
        public Book(String bookTitle, double bookPrice){
            title = bookTitle;
            price = bookPrice;
        }
        public String getTitle(){
            return title;
        }
        public String getBookInfo(){
            return title + " - " + price;
        }
    }
    public class Textbook extends Book{
        private int edition;
        public Textbook(int edition, String bookTitle, double bookPrice){
            super(bookTitle, bookPrice);
            this.edition = edition;
        }
        public int getEdition(){
            return edition;
        }
        public boolean canSubstitutefor(Textbook tbook){
                return(tbook.getTitle() == this.getTitle() && tbook.getEdition()<this.getEdition());
        }
    }