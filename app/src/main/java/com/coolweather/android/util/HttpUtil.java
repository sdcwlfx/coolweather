package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * Created by asus on 2017-03-26.
 */
//与服务器交互，注册回调处理服务器响应，返回JSON格式数据
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
