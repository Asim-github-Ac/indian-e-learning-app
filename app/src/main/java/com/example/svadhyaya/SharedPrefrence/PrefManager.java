package com.example.svadhyaya.SharedPrefrence;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final String IS_USER_LOGIN_EARLIER = "isUserLoginEarlier";
    private static final String IS_FIRST_TIME = "firstTime";
    private static final String PREF_NAME = "saleArt";
    private static final String USER_NAME = "name";
    private static final String USER_EMAIL = "email";
    private static final String CATEGORY = "cate";
    private static final String PROFILE = "profile";
    private static final String DESCRIPTION = "description";
    private static final String LIKES = "likes";
    private static final String RATE = "rate";
    private static final String chooseClass = "class";
    private static final String IS_SELLER = "isSeller";
    private static final String IS_ORDER_FIRST_TIME = "isOrderFirstTime";
    private static final String Total_coins = "total_coins";
    private static final String Save_Email_InFo = "Email_info";
    private static final String user_name_info = "User_info";
    private static final String User_id = "User_id";
    private static final String List_size = "List_size";
    private static final String Video_id = "Video_id";
    private static final String User_pic = "User_pic";
    private static final String Device_id = "Device_id";
    private static final String Sub_videoid = "Sub_videoid";
    private static final String Web_time = "webtime";
    private static final String Web_Coin = "Web_coin";
    private static final String Web_url = "Web_url";
    private static final String id_user = "id_user";
    private static final String authKey = "authkey";
    private Context context;

    public PrefManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREF_NAME,context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setIsUserLoginEarlier(Boolean loginEarlier){
        editor.putBoolean(IS_USER_LOGIN_EARLIER,loginEarlier);
        editor.commit();
    }

    public String getTotal_coins() {
        return sharedPreferences.getString(Total_coins,"0");
    }
    public void setTotal_coins(String coins){
        editor.putString(Total_coins,coins);
        editor.apply();
    }
    public  String getSave_Email_InFo() {
        return sharedPreferences.getString(Save_Email_InFo,"0");
    }
    public void setSave_Email_InFo(String email){
        String res= sharedPreferences.getString(Save_Email_InFo,"0" );
       editor.putString(Save_Email_InFo,email);
      editor.apply();
    }
    public  String getUserName() {
        return sharedPreferences.getString(USER_NAME,"0");
    }
    public void setUserName(String email){
        String res= sharedPreferences.getString(USER_NAME,"0" );
        editor.putString(USER_NAME,email);
        editor.apply();
    }
    public  String getUserEmail() {
        return sharedPreferences.getString(USER_EMAIL,"0");
    }
    public void setUserEmail(String email){
        String res= sharedPreferences.getString(USER_EMAIL,"0" );
        editor.putString(USER_EMAIL,email);
        editor.apply();
    }

    public String  getUser_name_info() {
       return sharedPreferences.getString(user_name_info,"0");

    }
    public void setUser_name_info(String email){
        String res= sharedPreferences.getString(user_name_info,"0" );
        editor.putString(user_name_info,email);
        editor.apply();
    }

    public  String getUser_id() {
        return sharedPreferences.getString(User_id,"0");
    }
    public void setUser_id(String id){

        editor.putString(User_id,id);
        editor.apply();
    }



    public  void setList_size (String size)
    {
        editor.putString(List_size,size);
        editor.apply();

    }
    public  String getList_size() {
        return sharedPreferences.getString(List_size,"0");
    }

    public  String getVideo_id() {
        return sharedPreferences.getString(Video_id,"0");
    }
    public  void setVideo_id(String id)
    {
        editor.putString(Video_id,id);
        editor.apply();

    }

    public  String getUser_pic() {
        return sharedPreferences.getString(User_pic,"0");
    }
    public  void setUser_pic(String pic)
    {
        editor.putString(User_pic,pic);
        editor.apply();

    }

    public  void setDevice_id(String Deiv_Id)
    {
        editor.putString(Device_id,Deiv_Id);
        editor.apply();

    }
    public  String getDevice_id() {

            return sharedPreferences.getString(Device_id,"0");
    }
    public  void setChooseClass(String chooseClass)
    {
        editor.putString(chooseClass,chooseClass);
        editor.apply();

    }
    public  String getChooseClass() {

        return sharedPreferences.getString(chooseClass,"0");
    }
    public  void setWeb_time(String webtime)
    {
        editor.putString(Web_time,webtime);
        editor.apply();

    }
    public  String getWeb_time() {

        return sharedPreferences.getString(Web_time,"0");
    }
    public  void setWeb_Coin(String web_Coin)
    {
        editor.putString(Web_Coin,web_Coin);
        editor.apply();

    }
    public  String getWeb_Coin() {

        return sharedPreferences.getString(Web_Coin,"0");
    }
    public  void setWeb_url(String web_url)
    {
        editor.putString(Web_url,web_url);
        editor.apply();

    }
    public  String getWeb_url() {

        return sharedPreferences.getString(Web_url,"0");
    }
    public  void setId_user(String id_user)
    {
        editor.putString(id_user,id_user);
        editor.apply();

    }
    public  String getId_user() {

        return sharedPreferences.getString(id_user,"0");
    }

    public  void setAuthKey(String key)
    {
        editor.putString(authKey,key);
        editor.apply();

    }
    public  String getAuthKey() {

        return sharedPreferences.getString(authKey,"0");
    }

}

