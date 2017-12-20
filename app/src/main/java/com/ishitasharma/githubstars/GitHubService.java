package com.ishitasharma.githubstars;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by ishita sharma on 12/20/2017.
 */

public interface GitHubService {
    @GET("users/{user}/starred")
    Observable<List<GitHubRepo>> getStarredRepositories(@Path("user") String userName);
}
