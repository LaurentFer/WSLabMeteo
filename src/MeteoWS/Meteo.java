package MeteoWS;

import com.cdyne.ws.weatherws.*;

public class Meteo {

	public static void main(String[] args) {

		 Weather myMeteo = new Weather();
		 WeatherSoap myMeteoCity = myMeteo.getWeatherSoap();
		 System.out.println(myMeteoCity.getCityWeatherByZIP("22741").getCity());		 
		 System.out.println(myMeteoCity.getCityWeatherByZIP("22741").getDescription());
		 System.out.println(myMeteoCity.getCityWeatherByZIP("22741").getTemperature());		 
		 System.out.println(myMeteoCity.getCityWeatherByZIP("22741").getVisibility()); 
	}

}
