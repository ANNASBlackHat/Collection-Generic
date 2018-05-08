import com.google.gson.Gson;
import model.Comment;
import model.Media;
import model.Request;

public class ApiManager {

    public void postMedia(Media media){
        //ngirim data ke server....
        String json = new Gson().toJson(media);
        System.out.println("JSON : "+json);
    }

    public void postComment(Request<Comment> data){
        String json = new Gson().toJson(data);
        System.out.println("JSON : "+json);
    }
}
