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
        $("#wiki-pages-box").shouldHave(text("    Show 2 more pages…"));
        $("[class = 'f6 Link--muted js-wiki-more-pages-link btn-link mx-auto']").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

        // Далее оба вариант рабочие
        // $("#wiki-pages-filter").setValue("SoftAssertions");
        // $("[class = 'm-0 p-0 list-style-none filterable-active']").$(byText("SoftAssertions")).click();

        $("a[href = '/selenide/selenide/wiki/SoftAssertions']").click();
        $("#wiki-body").shouldHave(text("JUnit5 extension"));



       // $$(".internal.present").find(href("/selenide/selenide/wiki/SoftAssertions")).click();




    }
}
