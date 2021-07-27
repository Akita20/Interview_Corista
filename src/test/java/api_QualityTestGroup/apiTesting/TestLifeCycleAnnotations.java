package api_QualityTestGroup.apiTesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Life Cycle Annotions")
public class TestLifeCycleAnnotations {
    @BeforeAll
    public static void init(){
        System.out.println("Before all is running");
    }
    @AfterAll
    public static void close(){
        System.out.println("After all is running");
    }


}
