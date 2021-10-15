package com.example.svadhyaya.Retrofit;

import android.util.Log;

import com.example.svadhyaya.RetrofitModel.ChanePassword;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.LiveClassRoom;
import com.example.svadhyaya.RetrofitModel.LogOut;
import com.example.svadhyaya.RetrofitModel.News;
import com.example.svadhyaya.RetrofitModel.PackMoreDetails;
import com.example.svadhyaya.RetrofitModel.PakagesDetails;
import com.example.svadhyaya.RetrofitModel.RegisterModel;
import com.example.svadhyaya.RetrofitModel.StudyMaterial;
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
    //Step One
    @POST("auth/register")
    Call<RegisterModel> createUser(@Body RegisterModel registerModel);
    //Step two
    @POST("auth/login")
    Call<UserLogin> userlogin(@Body UserLogin registerModel);
    //Step three
    @POST("packages/")
    Call<GetAllPackages> getpackages(@Body GetAllPackages pkdetails);
    //Step four
    @POST("auth/getPackageDetails")
    Call<PakagesDetails> PackDetails(@Body PakagesDetails details);
    //Step five
    @POST("auth/logout")
    Call<LogOut> Logout(@Body LogOut logOut);
    // Step Seven
    @POST("auth/change_password")
    Call<ChanePassword> changepass(@Body ChanePassword chanePassword);
    // Step Eight
    @POST("news")
    Call<News> NEWS_CALL(@Body News news);
    // Step Nine
    @POST("study_material")
    Call<StudyMaterial> STUDY_MATERIAL_CALL(@Body StudyMaterial studyMaterial);
    // Step ten
    @POST("study_material/classroom")
    Call<LiveClassRoom> LIVE_CLASS_ROOM_CALL(@Body LiveClassRoom liveClassRoom);











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
