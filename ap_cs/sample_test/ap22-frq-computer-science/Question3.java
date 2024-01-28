package ap_cs.teach.unit10_recursive;
import java.util.ArrayList;
public class Question3 {
    public static void main(String[] args) {
        ReviewAnalysis analysis = new ReviewAnalysis();
        System.out.println(analysis.getAverageRating());
        System.out.println(analysis.collectComments());
    }
}
public class Review{
    private int rating;
    private String comment;
    public Review(int r, String c){
        this.rating = r;
        this.comment = c;
    }
    public int getRating(){
        return this.rating;
    }
    public String getComment(){
        return this.comment;
    }
}
public class ReviewAnalysis{
    
    Review review1 = new Review(5, "w!ow great");
    Review review2 = new Review(1, "");
    Review review3 = new Review(3, "honestly meh");
    Review review4 = new Review(4, "wow great!");
    Review review5 = new Review(2, "honestly meh!");
    Review review6 = new Review(0, "honestly meh.");
    private Review[] allReviews = {review1,review2,review3,review4,review5,review6};
    private int totalReview=0;
    private int index;
    private ArrayList<String> output = new ArrayList<String>();
    public ArrayList<String> ReviewanAnalysis(){
        return this.output;
    }
    // public void addReview(Review review, int index){
    //     this.allReviews[index] = review;
    // }
    public double getAverageRating(){
        for(Review i:this.allReviews){
            this.totalReview+=i.getRating();
        }
        return((1.0)*this.totalReview/this.allReviews.length);
    }
    public ArrayList<String> collectComments(){
        for (Review i:this.allReviews){
            if(i.getComment().contains("!")){
                this.index = 0;
                for(Review x:this.allReviews){
                    if (x==i){
                        break;
                    }
                    else{
                        this.index+=1;
                    }
                }
                if (i.getComment().substring(i.getComment().length()-1).contains("!")||i.getComment().substring(i.getComment().length()-1).contains(".")){
                this.output.add((this.allReviews[this.index].getRating())+"-"+i.getComment());
                }else{
                this.output.add((this.allReviews[this.index].getRating())+"-"+i.getComment()+".");                
            }
            }
        }
        // if (this.output.get(this.output.size()-1).toString().substring(this.output.get(this.output.size()-1).length())!="." && this.output.get(this.output.size()-1).toString().substring(this.output.get(this.output.size()-1).toString().length())!="1"){
        //     this.output.set(this.output.size(), this.output.get(this.output.size())+".");
        // }
        
        return this.output;
    }
}