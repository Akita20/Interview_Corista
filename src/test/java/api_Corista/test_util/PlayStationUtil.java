package api_Corista.test_util;

import api_Corista.pojo.PlayStation;
import com.github.javafaker.Faker;

import java.util.LinkedHashMap;
import java.util.Map;

public class PlayStationUtil {
    private static Faker faker = new Faker();
    /**
     * Used to get valid Map object to represent post body for POST /id Request
     * @return Map object with Random name , gender , phone(5_000_000_000L - 10_000_000_000L)
     */
    public static Map<String, Object> getRandomPlayStationMap(){
       Map<String, Object> bodyMap= new LinkedHashMap<>();
       bodyMap.put("name", faker.name().firstName() );
       bodyMap.put("character_id", faker.idNumber().invalid() );
       bodyMap.put("gender", faker.demographic().sex() );
       bodyMap.put("phone", faker.number().numberBetween(5_000_000_000L, 10_000_000_000L) );

        return bodyMap;
    }
    /**
     * Create playStation object with random field value
     * @return playStation object with  Random name , gender , phone(5_000_000_000L - 10_000_000_000L)
     */
    public static PlayStation getRandomPlayStationPOJO(){
        PlayStation ps=new PlayStation();
        ps.setName(faker.name().firstName());

        ps.setGender(faker.demographic().sex());
        return ps;
    }
}
