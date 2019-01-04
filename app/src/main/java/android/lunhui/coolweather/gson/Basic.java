package android.lunhui.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String name;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public String cityName;

    public class Update{
        @SerializedName("loc")
          public String updateTime;
    }
}
