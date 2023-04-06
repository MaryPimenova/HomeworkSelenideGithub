package com.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch extends FormTestBase {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("/selenide/selenide");
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));

       /* Не могу разобраться, как работает обращение к ссылке через href
        $("a").$("[class = 'internal present']").$("[href = '/selenide/selenide/wiki/SoftAssertions']").click();
        $("a[href = '/selenide/selenide/wiki/SoftAssertions']").click();*/

        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("[class = 'm-0 p-0 list-style-none filterable-active']").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}
