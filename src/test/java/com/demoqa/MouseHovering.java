package com.demoqa;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class MouseHovering {
    @Test
    void  productSearch() {
        open("https://www.cat.com/ru_RU.html");
        $("[class ='aem-Grid aem-Grid--12 aem-Grid--default--12 ']").shouldHave(text(("ВДОХНОВЛЯЯ СВОЕЙ РАБОТОЙ")));
        $("div [class='container container--mega-nav']").find(byText("Продукты")).hover();
        //sleep(5000);
        $("div[class='mega--content open'] div div.col-lg-7 ul").$("li:nth-child(22)").shouldHave(text(("Экскаваторы")));
    }
}