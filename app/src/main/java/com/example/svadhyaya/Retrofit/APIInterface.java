package com.example.svadhyaya.Retrofit;

import com.example.svadhyaya.RetrofitModel.PackMoreDetails;
import com.example.svadhyaya.RetrofitModel.PakagesDetails;
import com.example.svadhyaya.RetrofitModel.RegisterModel;
import com.example.svadhyaya.RetrofitModel.UserLogin;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    @POST("auth/register")
    Call<RegisterModel> createUser(@Body RegisterModel registerModel);
    @POST("auth/login")
    Call<UserLogin> userlogin(@Body UserLogin registerModel);

    @POST("auth/getPackageDetails")
    Call<PakagesDetails> PackDetails(@Body PakagesDetails details);

    @FormUrlEncoded
    @POST("auth/getPackageDetails")
    Call<PakagesDetails> setdetails(@Field("authkey") String key);






    @FormUrlEncoded
    @POST("auth/login")
    public void insertuser(
            @Field("username") String username,
            @Field("password") String password,
            @Field("device_id") String deviceid,
            Callback<Response> callback);

















    @GET("/retrofit/getuser.php")
    public void getUsersList(
            Callback<List<RegisterModel>> callback);



    @FormUrlEncoded
    @POST("/RetrofitExample/insert.php")
    public void insertUser(
            @Field("name") String name,
            @Field("username") String username,
            @Field("password") String password,
            @Field("email") String email,
            Callback<Response> callback);
}
