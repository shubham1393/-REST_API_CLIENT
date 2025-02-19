import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApp {

    private static final String API_KEY = "your_api_key_here"; // Replace with your API key from OpenWeatherMap
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
        // Take the city name as input
        String city = "London"; // Replace with the city of your choice
        String apiUrl = String.format(BASE_URL, city, API_KEY);
        
        try {
            // Make HTTP request to OpenWeatherMap API
            String jsonResponse = getWeatherData(apiUrl);
            
            // Parse and display weather data
            displayWeatherData(jsonResponse);
        } catch (ExceJSONObject jsonObject = new JSONObject(jsonResponse);ption e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Function to make an HTTP request and fetch the weather data
    private static String getWeatherData(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return response.toString();
    }

    // Function to parse JSON response and display weather information
    private static void displayWeatherData(String jsonResponse) {
        // Parse the JSON response using org.json.JSONObject
        JSONObject jsonObject = new JSONObject(jsonResponse);
        
        // Get and display weather details
        String cityName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        double temperature = main.getDouble("temp");
        int humidity = main.getInt("humidity");
        
        // Get weather description
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        String description = weather.getString("description");
        
        // Print the weather details
        System.out.println("Weather Data for: " + cityName);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Weather Description: " + description);
    }
}
import org.json.JSONObject;

public class WeatherApp {

    private static final String API_KEY = "your_api_key_here"; // Replace with your API key from OpenWeatherMap
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
        // Take the city name as input
        String city = "London"; // Replace with the city of your choice
        String apiUrl = String.format(BASE_URL, city, API_KEY);
        
        try {
            // Make HTTP request to OpenWeatherMap API
            String jsonResponse = getWeatherData(apiUrl);
            
            // Parse and display weather data
            displayWeatherData(jsonResponse);
        } catch (ExceJSONObject jsonObject = new JSONObject(jsonResponse);ption e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Function to make an HTTP request and fetch the weather data
    private static String getWeatherData(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return response.toString();
    }

    // Function to parse JSON response and display weather information
    private static void displayWeatherData(String jsonResponse) {
        // Parse the JSON response using org.json.JSONObject
        JSONObject jsonObject = new JSONObject(jsonResponse);
        
        // Get and display weather details
        String cityName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        double temperature = main.getDouble("temp");
        int humidity = main.getInt("humidity");
        
        // Get weather description
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        String description = weather.getString("description");
        
        // Print the weather details
        System.out.println("Weather Data for: " + cityName);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Weather Description: " + description);
    }
}import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApp {

    private static final String API_KEY = "your_api_key_here"; // Replace with your API key from OpenWeatherMap
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
        // Take the city name as input
        String city = "London"; // Replace with the city of your choice
        String apiUrl = String.format(BASE_URL, city, API_KEY);
        
        try {
            // Make HTTP request to OpenWeatherMap API
            String jsonResponse = getWeatherData(apiUrl);
            
            // Parse and display weather data
            displayWeatherData(jsonResponse);
        } catch (ExceJSONObject jsonObject = new JSONObject(jsonResponse);ption e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Function to make an HTTP request and fetch the weather data
    private static String getWeatherData(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return response.toString();
    }

    // Function to parse JSON response and display weather information
    private static void displayWeatherData(String jsonResponse) {
        // Parse the JSON response using org.json.JSONObject
        JSONObject jsonObject = new JSONObject(jsonResponse);
        
        // Get and display weather details
        String cityName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        double temperature = main.getDouble("temp");
        int humidity = main.getInt("humidity");
        
        // Get weather description
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        String description = weather.getString("description");
        
        // Print the weather details
        System.out.println("Weather Data for: " + cityName);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Weather Description: " + description);
    }
}import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApp {

    private static final String API_KEY = "your_api_key_here"; // Replace with your API key from OpenWeatherMap
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
        // Take the city name as input
        String city = "London"; // Replace with the city of your choice
        String apiUrl = String.format(BASE_URL, city, API_KEY);
        
        try {
            // Make HTTP request to OpenWeatherMap API
            String jsonResponse = getWeatherData(apiUrl);
            
            // Parse and display weather data
            displayWeatherData(jsonResponse);
        } catch (ExceJSONObject jsonObject = new JSONObject(jsonResponse);ption e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Function to make an HTTP request and fetch the weather data
    private static String getWeatherData(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();    
        return response.toString();
    }

    // Function to parse JSON response and display weather information
    private static void displayWeatherData(String jsonResponse) {
        // Parse the JSON response using org.json.JSONObject
        JSONObject jsonObject = new JSONObject(jsonResponse);
        
        // Get and display weather details
        String cityName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        double temperature = main.getDouble("temp");
        int humidity = main.getInt("humidity");
        
        // Get weather description
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        String description = weather.getString("description");
        
        // Print the weather details
        System.out.println("Weather Data for: " + cityName);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Weather Description: " + description);
    }
}
