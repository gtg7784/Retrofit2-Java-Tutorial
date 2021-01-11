package co.gtg7784.retrofitjavatutorial;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResponse {
    @SerializedName("coord") public final Coordinate coord;
    @SerializedName("weather") public final List<Weather> weather;
    @SerializedName("base") public final String base;
    @SerializedName("main") public final Main main;
    @SerializedName("visibility") public final Integer visibility;
    @SerializedName("wind") public final Wind wind;
    @SerializedName("clouds") public final Clouds clouds;
    @SerializedName("dt") public final Integer datetime;
    @SerializedName("sys") public final System system;
    @SerializedName("id") public final Integer id;
    @SerializedName("name") public final String name;
    @SerializedName("cod") public final Integer status;

    public WeatherResponse(
            Coordinate coord, List<Weather> weather, String base, Main main, Integer visibility,
            Wind wind, Clouds clouds, Integer datetime, System system, Integer id,
            String name, Integer status) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.datetime = datetime;
        this.system = system;
        this.id = id;
        this.name = name;
        this.status = status;
    }
}

class Coordinate{
    @SerializedName("lat") public final Float lat;
    @SerializedName("lon") public final Float lon;

    Coordinate(Float lat, Float lon) {
        this.lat = lat;
        this.lon = lon;
    }
}

class Weather{
    @SerializedName("id") public final Integer id;
    @SerializedName("main") public final String main;
    @SerializedName("description") public final String description;
    @SerializedName("icon") public final String icon;

    Weather(Integer id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
}

class Main{
    @SerializedName("temp") public final Float temp;
    @SerializedName("pressure") public final Integer pressure;
    @SerializedName("humidity") public final Integer humidity;
    @SerializedName("temp_min") public final Float tempMin;
    @SerializedName("temp_max") public final Float tempMax;

    Main(Float temp, Integer pressure, Integer humidity, Float tempMin, Float tempMax) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }
}

class Wind{
    @SerializedName("speed") public final Float speed;
    @SerializedName("deg") public final Integer degree;

    Wind(Float speed, Integer degree) {
        this.speed = speed;
        this.degree = degree;
    }
}

class Clouds{
    @SerializedName("all") public final Integer all;

    Clouds(Integer all) {
        this.all = all;
    }
}

class System{
    @SerializedName("type") public final Integer type;
    @SerializedName("id") public final Integer id;
    @SerializedName("message") public final Float message;
    @SerializedName("country") public final String country;
    @SerializedName("sunrise") public final Integer sunrise;
    @SerializedName("sunset") public final Integer sunset;

    System(Integer type, Integer id, Float message, String country, Integer sunrise, Integer sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
}