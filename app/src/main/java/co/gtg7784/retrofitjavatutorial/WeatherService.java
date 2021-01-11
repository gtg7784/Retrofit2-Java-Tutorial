package co.gtg7784.retrofitjavatutorial;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/weather")
    Call<WeatherResponse> getWeatherData(
            @Query("q") String city,
            @Query("appid") String appId
    );
}
