package com.yellowsoft.subhankar.whichmovie;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by subhankar on 8/6/2016.
 */
public interface OmdbApiInterface {

    @GET("/")
    Observable<SearchResults> getSearchResults(@Query("s") String query,
                                               @Query("plot") String plot,
                                               @Query("type") String type,
                                               @Query("r") String format);

    @GET("/")
    Observable<Movie> getMovie(@Query("t") String title,
                               @Query("plot") String plot,
                               @Query("type") String type,
                               @Query("r") String format);

}