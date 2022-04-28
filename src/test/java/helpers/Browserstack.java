package helpers;

import config.Data;

import static io.restassured.RestAssured.given;

public class Browserstack {
    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic(Data.getUserName(), Data.getPassword())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}