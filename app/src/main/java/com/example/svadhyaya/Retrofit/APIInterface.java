package com.example.svadhyaya.Retrofit;

import com.example.svadhyaya.RetrofitModel.ChanePassword;
import com.example.svadhyaya.RetrofitModel.ContactUs;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.GetProfile;
import com.example.svadhyaya.RetrofitModel.GetSubjects;
import com.example.svadhyaya.RetrofitModel.LiveClassRoom;
import com.example.svadhyaya.RetrofitModel.LogOut;
import com.example.svadhyaya.RetrofitModel.News;
import com.example.svadhyaya.RetrofitModel.PakagesDetails;
import com.example.svadhyaya.RetrofitModel.RegisterModel;
import com.example.svadhyaya.RetrofitModel.StudyMaterial;
import com.example.svadhyaya.RetrofitModel.Test_Index;
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

public interface APIInterface {
    //Step 1
    @POST("auth/register")
    Call<RegisterModel> createUser(@Body RegisterModel registerModel);
    //Step 2
    @POST("auth/login")
    Call<UserLogin> userlogin(@Body UserLogin registerModel);
    //Step 3
    @POST("packages/")
    Call<GetAllPackages> getpackages(@Body GetAllPackages pkdetails);
    //Step 4
    @POST("auth/getPackageDetails")
    Call<PakagesDetails> PackDetails(@Body PakagesDetails details);
    //Step 5
    @POST("auth/logout")
    Call<LogOut> Logout(@Body LogOut logOut);
    // Step 7
    @POST("auth/change_password")
    Call<ChanePassword> changepass(@Body ChanePassword chanePassword);
    // Step 8
    @POST("news")
    Call<News> NEWS_CALL(@Body News news);
    // Step 9
    @POST("study_material")
    Call<StudyMaterial> STUDY_MATERIAL_CALL(@Body StudyMaterial studyMaterial);
    // Step 10
    @POST("study_material/classroom")
    Call<LiveClassRoom> LIVE_CLASS_ROOM_CALL(@Body LiveClassRoom liveClassRoom);
    //step 11
    @POST("auth/getProfile")
    Call<GetProfile> getprofile(@Body GetProfile liveClassRoom);
    //Step 12
    @POST("forntend/contactus")
    Call<ContactUs> contactnow(@Body ContactUs contactnow);
    //Step 13
    @POST("bookmarks/getSubjects")
    Call<GetSubjects> getSubjects(@Body GetSubjects getSubjects);
    //Step 14
    @POST("test/index")
    Call<Test_Index> TEST_INDEX_CALL(@Body Test_Index test_index);










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
