package ru.yandex.samokat;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import ru.yandex.samokat.config.Config;
import ru.yandex.samokat.pageobjects.MainPageSamokat;
import ru.yandex.samokat.pageobjects.OrderPageSamokat;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    // метод для проверки ответа 1
    private void checkAnswerOne(MainPageSamokat mainPage) {
        mainPage.answerOne.shouldHave(Condition.exactText(mainPage.faqAnswer1));
    }

    // метод для проверки ответа 2
    private void checkAnswerTwo(MainPageSamokat mainPage) {
        mainPage.answerTwo.shouldHave(Condition.exactText(mainPage.faqAnswer2));
    }

    // метод для проверки ответа 3
    private void checkAnswerThree(MainPageSamokat mainPage) {
        mainPage.answerThree.shouldHave(Condition.exactText(mainPage.faqAnswer3));
    }

    // метод для проверки ответа 4
    private void checkAnswerFour(MainPageSamokat mainPage) {
        mainPage.answerFour.shouldHave(Condition.exactText(mainPage.faqAnswer4));
    }

    // метод для проверки ответа 5
    private void checkAnswerFive(MainPageSamokat mainPage) {
        mainPage.answerFive.shouldHave(Condition.exactText(mainPage.faqAnswer5));
    }

    // метод для проверки ответа 6
    private void checkAnswerSix(MainPageSamokat mainPage) {
        mainPage.answerSix.shouldHave(Condition.exactText(mainPage.faqAnswer6));
    }

    // метод для проверки ответа 7
    private void checkAnswerSeven(MainPageSamokat mainPage) {
        mainPage.answerSeven.shouldHave(Condition.exactText(mainPage.faqAnswer7));
    }

    // метод для проверки ответа 8
    private void checkAnswerEight(MainPageSamokat mainPage) {
        mainPage.answerEight.shouldHave(Condition.exactText(mainPage.faqAnswer8));
    }

    // Без печенек не работают методы в хроме + фулскрин
    @Before
    public void setUp(){
        open(Config.mainPageUrl);
        Cookie cookie = new Cookie("Cartoshka", "true");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
    }

    // Проверка в выпадающем меню FAQ ответов на вопросы

    // Вопрос - Сколько это стоит? И как оплатить?
    // Ответ - Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    @Test
    public void testFaqQuestionOne(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionOne();
        checkAnswerOne(mainPage);
    }

    // Вопрос - Хочу сразу несколько самокатов! Так можно?
    // Ответ - Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    @Test
    public void testFaqQuestionTwo(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionTwo();
        checkAnswerTwo(mainPage);
    }

    // Вопрос - Как рассчитывается время аренды?
    // Ответ - Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    @Test
    public void testFaqQuestionThree(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionThree();
        checkAnswerThree(mainPage);
    }

    // Вопрос - Можно ли заказать самокат прямо на сегодня?
    // Ответ - Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    @Test
    public void testFaqQuestionFour(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionFour();
        checkAnswerFour(mainPage);
    }
    // Вопрос - Можно ли продлить заказ или вернуть самокат раньше?
    // Ответ - Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    @Test
    public void testFaqQuestionFive(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionFive();
        checkAnswerFive(mainPage);
    }

    // Вопрос - Вы привозите зарядку вместе с самокатом?
    // Ответ - Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    @Test
    public void testFaqQuestionSix(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionSix();
        checkAnswerSix(mainPage);
    }

    // Вопрос - Можно ли отменить заказ?
    // Ответ - Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    @Test
    public void testFaqQuestionSeven(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionSeven();
        checkAnswerSeven(mainPage);
    }

    // Вопрос - Я жизу за МКАДом, привезёте?
    // Ответ - Да, обязательно. Всем самокатов! И Москве, и Московской области.
    @Test
    public void testFaqQuestionEight(){
        MainPageSamokat mainPage =
                open(Config.mainPageUrl,
                        MainPageSamokat.class);
        mainPage.clickQuestionEight();
        checkAnswerEight(mainPage);
    }
}
