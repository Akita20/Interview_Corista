package api_QualityTestGroup.pojo;
//character_id , name , occupation , nickname , appearance


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayStation {
    @JsonProperty("char_id")
    private String character_id ;
    private String name ;
    private String gender ;
    private List<String> occupation ;
    private String nickname ;
    private List<Integer> appearance ;


}
