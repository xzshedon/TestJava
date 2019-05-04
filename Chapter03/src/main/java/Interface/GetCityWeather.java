package Interface;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class GetCityWeather {
    private String url="";

    public String getUrl(){
        return url;
    }

    public String getHttpRespone(String cityCode){
        StringBuilder result = new StringBuilder();
        BufferedReader in = null;
        String form_url = ("http://www.weather.com.cn/data/cityinfo/"+cityCode+".html");
        try {
            URL url = new URL(form_url);
            URLConnection httpConnect = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection)httpConnect;
            httpURLConnection.connect();
            int responsercode = httpURLConnection.getResponseCode();
            InputStream inputStream = null;
            if (responsercode == 200){
                inputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            }else {
                inputStream = new BufferedInputStream(httpURLConnection.getErrorStream());
            }
            in = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
            String line;
            while ((line = in.readLine()) != null){
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if(in != null){
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result.toString();
    }
}
