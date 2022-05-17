package utils;

import model.OperationTypeEnum;
import model.Posting;
import model.RealestateTypeEnum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PostingService {

    public  static void show(){
        List<Posting> post=new ArrayList<>();
        post.addAll(PostingUtils.getPostings());

        for (int i=0; i<post.size(); i++){
            System.out.println(post.get(i));
        }
    }

    public static   void showAllPosting() {
        Collection<Posting> postings = PostingUtils.getPostings();
        for (Posting post : postings) {
            System.out.println(post);
        }
    }

    public static void eliminatePosting(){
        Collection<Posting> allPosting=PostingUtils.getPostings();
        Collection<Posting> postingsToDelete=PostingUtils.getPostingsToRemove();

        for (Posting postingDelete: postingsToDelete){
            allPosting.remove(postingDelete);
        }

        for (Posting post:allPosting){
            System.out.println(post);
        }
    }


    public static List<Posting> showPostingByParameters(OperationTypeEnum operationType, RealestateTypeEnum postingType){
        Collection<Posting> allPosting = PostingUtils.getPostings();
        List<Posting> postFiltered = new ArrayList<>();
        for (Posting post:allPosting){
            if (post.getOperationType().equals(operationType) && post.getRealestateType().equals(postingType)){
                postFiltered.add(post);
            }
        }
        return postFiltered;
    }

}
