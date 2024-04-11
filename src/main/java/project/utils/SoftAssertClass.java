package project.utils;

import net.serenitybdd.core.Serenity;
import org.assertj.core.api.SoftAssertions;

public class SoftAssertClass {

    public static SoftAssertions softAssertions = new SoftAssertions();

    public static SoftAssertions getSoftAssertions() {
        return softAssertions;
    }

    public static void softAssertEquals(int expected, int actual, String message) {
        softAssertions.assertThat(actual)
                .as((String) Serenity.getCurrentSession()
                        .get("TEST CASE NUMBER") + " - " + message).isEqualTo(expected);
    }

    public static void softAssertEquals(String expected, String actual, String message) {
        softAssertions.assertThat(actual)
                .as((String) Serenity.getCurrentSession()
                        .get("TEST CASE NUMBER") + " - " + message).isEqualTo(expected);
    }

    public static void softAssertEquals(boolean expected, boolean actual, String message) {
        softAssertions.assertThat(actual)
                .as((String) Serenity.getCurrentSession()
                        .get("TEST CASE NUMBER") + " - " + message).isEqualTo(expected);
    }

    public static void softAssertThat(int expected, int actual, String message) {
        softAssertions.assertThat(actual >= expected).as((String) Serenity.getCurrentSession()
                .get("TEST CASE NUMBER") + " - " + message);
    }

    public static void softAssertContains(String expected, String actual, String message) {
        softAssertions.assertThat(actual.contains(expected))
                .as((String) Serenity.getCurrentSession()
                        .get("TEST CASE NUMBER") + " - " + message);
    }

}
