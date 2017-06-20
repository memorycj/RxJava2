package wn.rx20.retrofit.api;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * author : wn
 * e-mail : memory_cjj@163.com
 * time   : 2017-06-08
 */


public interface GankApi {
    @GET("search/query/listview/category/categoryName/count/maxCount/page/pageIndex")
    Observable<String> getGankMz(@Path("categoryName")String categoryName,@Path("maxCount")int maxCount,@Path("pageIndex") int pageIndex);

}
