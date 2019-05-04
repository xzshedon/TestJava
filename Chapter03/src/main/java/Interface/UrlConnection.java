package Interface;

import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnection {
    public static HttpURLConnection getConnection(String url){
        HttpURLConnection connection = null;
        try{
            // 打开和URL之间的连接
            URL postUrl = new URL(url);
            connection = (HttpURLConnection)postUrl.openConnection();
            // 设置通用的请求属性
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(30000);
            connection.setReadTimeout(30000);
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            connection.setRequestProperty("connection","keep-alive");
            connection.setRequestProperty("Accept-Charset","UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
