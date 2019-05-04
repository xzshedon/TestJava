package Interface;


import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * Json解析
 * JsonValue 返回JsonString中JsonId对应的Value
 * **/

public class Commom {
    public static String getJsonValue(String JsonString, String JsonId){
        String JsonValue = "";
        if(JsonString==null || JsonString.trim().length()<1){
            return null;
        }
        try{
            JSONObject obj1 = new JSONObject(JsonString);
            JsonValue = (String) obj1.getString(JsonId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return JsonValue;
    }
}
