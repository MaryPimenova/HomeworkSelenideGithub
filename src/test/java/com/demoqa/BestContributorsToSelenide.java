package com.demoqa;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class BestContributorsToSelenide extends FormTestBase {
    @Test
    void  andreiSolntsev() {
        open("/selenide/selenide");
        $("div.Layout-sidebar").find(byText("Contributors"))
                .ancestor("div").$$("ul li").first().hover();
        sleep(5000);
        // check: the popup window has text Andrei Solntsev
        $$(".Popover").findBy(visible).shouldHave(text(("Andrei Solntsev")));
        sleep(5000);
    }
}
