import com.google.gson.Gson;
import model.Comment;
import model.Media;
import model.MediaData;
import model.Request;

public class main {

    public static void main(String[] args) {
//        String[] members = {"Mahmud","Ujang","Jalu"};
//        Integer[] ages = {12, 17, 17};
//        Double[] gaji = {1.3, 1.5, 2.0};
//
//        showData(members);
//        showData(gaji);
//        showData(ages);

        ApiManager apiManager = new ApiManager();

        Media media = new Media();
        media.setToken("1232131");
        media.setDevice_id("1231231123");

        MediaData mediaData = new MediaData();
        mediaData.setTitle("News 1");
        mediaData.setContent("content of news 1");
        mediaData.setImg("http://.....");
        media.setData(mediaData);

        Request<Integer> mediaDataRequest = new Request<>();

        Request<Comment> commentRequest = new Request();
        commentRequest.setToken("adada");
        commentRequest.setDevice_id("12313123");

        Comment comment = new Comment();
        comment.setComment_id(1);
        comment.setComment("Good!");
        commentRequest.setData(comment);

        apiManager.postMedia(media);
        apiManager.postComment(commentRequest);

        TransactionDetail transactionDetail = new TransactionDetail();
        addData(transactionDetail);

        addDataGeneric(new Request<Transaction>());

        Transaction transaction = new Transaction();

        payment(transaction);
        payment2(transaction);
        payment3(transaction);
        payment4(transactionDetail);
    }

    static void addPayment2(Request<? super TransactionDetail> data){}
    static void addPayment(Request<? extends Transaction> data){}

    static <T extends Transaction & TransactionInterface> void payment4(T data){ }

    static <T extends PaymentInterface> void payment3(T data){ }

    static <T extends TransactionInterface> void payment2(T data){ }

    static <T extends Transaction> void payment(T data){ }

    static <T, K> void pay(T data1, K data2){ }

    public static void addData(Transaction transaction){ }

    public static void addDataGeneric(Request<Transaction> transaction){ }

    public static <T> void showData(T[] data){
        System.out.println("\n== Print Data Generic");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }

    public static void showData(String[] data){
        System.out.println("== Print Data String");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }

//    public static void showData(int[] data){
//        System.out.println("== Print Data int");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + ", ");
//        }
//    }
}
