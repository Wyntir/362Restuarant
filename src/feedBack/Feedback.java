import java.util.Date;

class Feedback {
    private int feedbackID;
    private int customerID;
    private String comments;
    private int rating; // rating out of 5
    private Date date;

    public Feedback(int feedbackID, int customerID, String comments, int rating) {
        this.feedbackID = feedbackID;
        this.customerID = customerID;
        this.comments = comments;
        this.rating = rating;
        this.date = new Date();
    }

    public int getFeedbackID() { return feedbackID; }
    public int getCustomerID() { return customerID; }
    public String getComments() { return comments; }
    public int getRating() { return rating; }
    public Date getDate() { return date; }
    
    public void printFeedback() {
        System.out.println("Feedback ID: " + feedbackID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Comments: " + comments);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Date: " + date);
    }
}

