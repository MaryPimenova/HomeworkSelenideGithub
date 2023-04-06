package com.demoqa;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
public class DivDiv {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("http://suninjuly.github.io/cats.html");

        System.out.println("Поиск Bullet cat, расположенного в ПЕРВОМ одноименном классе");
        var catBulletVariant1 = $("div.col-sm-4 img#bullet");
        System.out.println("Найденный на странице элемент Bullet cat через $(\"div img\"):\n" + catBulletVariant1);

        var catBulletVariant2 = $("div.col-sm-4").$("img#bullet");
        System.out.println("Найденный на странице элемент Bullet cat через $(\"div\").$(\"img\"):\n" + catBulletVariant2);


        System.out.println("Поиск Lenin cat, расположенного НЕ в ПЕРВОМ одноименном классе");
        var cat = $("div.col-sm-4 p#politic");
        System.out.println("Найденный на странице элемент Lenin cat через $(\"div p\"):\n" + cat);
        var nothing = $("div.col-sm-4").$("p#politic");
        System.out.println("Признак ошибки поиска элемента через $(\"div\").$(\"p\"):\n" + nothing);


    }
}
