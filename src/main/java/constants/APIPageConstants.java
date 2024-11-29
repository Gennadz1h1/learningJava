package constants;

import java.util.List;

public class APIPageConstants {
    public String searchPageName = "Weather API";
    public List<String> sections = List.of(new String[]{"Current & Forecast weather data collection", "Solar Irradiance & Energy Prediction service", "Historical weather data collection", "Maps collection", "Other weather API's collection"});
    public String apiPageURL = "https://openweathermap.org/api";
    public String solarEnergyPageURL = "https://openweathermap.org/price#solar_energy";

}