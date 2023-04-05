package com.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch extends FormTestBase {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("/selenide/selenide");
        $("#repository-container-header").shouldHave(text("selenide\n" + "/\n" + "selenide"));
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));


    }
}
