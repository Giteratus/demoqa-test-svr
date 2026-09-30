package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FrontTextBox {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fieldFormTest() {

        open("/text-box");
        $("#userName").setValue("Serg");
        $("#userEmail").setValue("qa@yyf.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Sn.Petesburg");
        $("#submit").click();

        $("#output").$("#name").shouldHave(text("Serg"));
        $("#output").$("#email").shouldHave(text("qa@yyf.ru"));
        $("#output").$("#currentAddress").shouldHave(text("Moscow"));
        $("#output").$("#permanentAddress").shouldHave(text("Sn.Petesburg"));

    }
}
