package com.example.androidshaper.retrofitdownloadfile;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OurRetrofitClient {

    @GET("{id}")
    Call<ResponseBody> getImageBit(@Path("id") String id);
}
