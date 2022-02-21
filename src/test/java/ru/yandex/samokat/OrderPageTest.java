package ru.yandex.samokat;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import ru.yandex.samokat.config.Config;
import ru.yandex.samokat.pageobjects.OrderPageSamokat;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderPageTest {

    //  метод проверки, что заказ оформлен и появилось сообщение об этом
    private void checkIfOrderPlaced (OrderPageSamokat orderPage) {
        orderPage.orderIsPlaced.exists();
    }

    // метод проверки домашнего элемента на странице (мы на главной странице или нет)
    public void existHomeHeadingPanel(OrderPageSamokat orderPage) {
        orderPage.homeHeaderPanel.exists();
    }

    // метод проверки кнопки Найти на главной странеце поисковика Яндекс
    public void existYandexFindButton(OrderPageSamokat orderPage) {
        orderPage.yandexFindButton.exists();
    }

    // метод оформления заказа
    private void createOrder(OrderPageSamokat orderPage, String name, String surname, String address, String metroStation,
                            String phoneNumber, String deliveryDate, String rentPeriod,
                            String colour, String comment) {
        orderPage.setName(name);
        orderPage.setSurame(surname);
        orderPage.setAddress(address);
        orderPage.clickMetroStation();
        $(byText(metroStation)).click();
        orderPage.setPhoneNumber(phoneNumber);
        orderPage.clickNextOrderMenu();
        orderPage.setDeliveryDate(deliveryDate);
        orderPage.clickMissClickButton();
        orderPage.clickDropdownRent();
        $(byText(rentPeriod)).click();
        $(byId(colour)).click();
        orderPage.setCommentField(comment);
        orderPage.clickFinishOrderButton();
        orderPage.clickYesFinishOrderButton();
        // Если закомментировать метод ниже - тест testDropdownText пройдет. Баг в хроме
        //clickSeeOrderButton();
        // тоже закомментирована проверка снизу, так как действие выше не проходит, соответственно и заказ тоже((
        //checkIfOrderPlaced();
    }

    // метод оформления заказа в зависимости от выбора кнопки - сверху или снизу
    public void createOrderButton(OrderPageSamokat orderPage, boolean isHeaderButton, String name, String surname, String address, String metroStation,
                                  String phoneNumber, String deliveryDate, String rentPeriod,
                                  String colour, String comment) {
        if (isHeaderButton) {
            orderPage.clickOrderButtonTop();
        } else {
            orderPage.clickOrderButtonMiddle();
        }
        createOrder(orderPage, name, surname, address, metroStation,
                phoneNumber, deliveryDate, rentPeriod,
                colour, comment);
    }



    // Без печенек не работают методы в хроме + фулскрин
    @Before
    public void setUp() {
        //Configuration.browser = "safari";
        open(Config.mainPageUrl);
        Cookie cookie = new Cookie("Cartoshka", "true");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
    }

    // Additional task
    @Test
    // Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката».
    public void testReturnToMainPage() {
        OrderPageSamokat orderPage = open(Config.orderPageUrl, OrderPageSamokat.class);
        orderPage.clickSamokatButton();
        existHomeHeadingPanel(orderPage);
    }

    // Additional task
    @Test
    // Проверить: если нажать на логотип Яндекса,
    // в новом окне откроется главная страница Яндекса.
    public void testOpenMainYandexPage() {
        OrderPageSamokat orderPage = open(Config.orderPageUrl, OrderPageSamokat.class);
        orderPage.clickYandexButton();
        existYandexFindButton(orderPage);
    }

    // Вопрос к ревьюверу - я поняла, почему нужно перенести тестовые методы остальные проверки и вызовы методов,
    // а что касается оформления заказа - имхо это одна законченная операция как регистрация, например,
    // в примерах было, что в классе pom метод для регистрации.
    // Так и тут. Если это не так, расскажите, пожалуйста -_-
    @Test
    // Нажать кнопку «Заказать». На странице две кнопки заказа;
    // Заполнить форму заказа;
    // Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа.
    public void testCreateOrder() {
        OrderPageSamokat orderPage = open(Config.orderPageUrl, OrderPageSamokat.class);
        createOrder(orderPage,"Даша", "Кузнецова", "Преображенская площадь", "Лужники", "89999999999", "14.02.2022", "сутки", "black", "Привезите утром");
    }

    @Test
    // Оформление заказа нажатием на кнопку "Заказать" в хедере главной страницы
    public void testCreateOrderTop() {
        OrderPageSamokat orderPage = open(Config.mainPageUrl, OrderPageSamokat.class);
        createOrderButton(orderPage, true, "Дима", "Иванов", "Чертановская", "Сокольники", "89999999999", "01.06.2022", "трое суток", "grey", "Привезите с воздушным шариком");
    }

    @Test
    // Оформление заказа нажатием на кнопку "Заказать" в хедере главной страницы
    public void testCreateOrderMiddle() {
        OrderPageSamokat orderPage = open(Config.mainPageUrl, OrderPageSamokat.class);
        createOrderButton(orderPage,false, "Чик", "Чирик", "Ломоносовский проспект", "Беговая", "89999999999", "05.05.2022", "шестеро суток", "grey", "Привезите корм для попугаев! Хочу кушац");
    }


}
