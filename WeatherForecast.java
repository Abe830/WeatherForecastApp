import java.time.LocalDateTime;

public class WeatherForecast {
    private final LocalDateTime dateTime;
    private final String weather;

    public WeatherForecast(LocalDateTime dateTime, String weather) {
        this.dateTime = dateTime;
        this.weather = weather;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getWeather() {
        return weather;
    }
}
