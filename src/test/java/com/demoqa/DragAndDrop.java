package com.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {
    @Test
    void  productSearch() {
        // Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Проверка верного открытия страницы
        $(".example").shouldHave(text(("Drag and Drop")));
        $("#column-a").shouldHave(exactText("A"));
        $("#column-b").shouldHave(exactText("B"));

        //$("#column-b").hover();
        //actions().clickAndHold().moveByOffset(-200, 0).release().perform();
        //$("#column-a").shouldHave(exactText("B"));

        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(exactText("B"));
        $("#column-b").shouldHave(exactText("A"));
    }

}
