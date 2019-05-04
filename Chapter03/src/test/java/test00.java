
import Interface.Commom;
import Interface.GetCityWeather;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.alibaba.fastjson.JSONObject;

public class test00 {
    public String httpResult=null, weatherinfo=null, city=null, exp_city=null;
    public static String cityCode="";
    public static GetCityWeather weather = new GetCityWeather();

    @Test(groups = {"BaseCase"})
    public void getShenzhen_Succ(){
        exp_city="深圳";
        cityCode="101280601";
        Reporter.log("【正常用例】：获取"+exp_city+"天气成功!");
        try {
            httpResult=weather.getHttpRespone(cityCode);
            System.out.println(httpResult);
            Reporter.log("请求地址："+weather.getUrl());
            Reporter.log("返回结果："+httpResult);
            weatherinfo= Commom.getJsonValue(httpResult,"weatherinfo");
            city = Commom.getJsonValue(weatherinfo,"city");
            Assert.assertEquals(city,exp_city);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
