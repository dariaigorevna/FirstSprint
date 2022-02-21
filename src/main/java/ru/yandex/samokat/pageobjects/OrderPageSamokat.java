package ru.yandex.samokat.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderPageSamokat {

    // локатор для поля ввода имени
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[2]/div[1]/input")
    private SelenideElement nameField;

    // локатор для поля ввода фамилии
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[2]/div[2]/input")
    private SelenideElement surnameField;

    // локатор для поля ввода адреса
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[2]/div[3]/input")
    private SelenideElement addressField;

    // локатор для поля ввода телефона
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[2]/div[5]/input")
    private SelenideElement phoneNumberField;

    // локатор для кнопки выбора станции метро
    @FindBy(how = How.CLASS_NAME, using = "select-search")
    private SelenideElement metroStationButton;

    // локатор для кнопки далее при оформлении заказа
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[3]/button")
    private SelenideElement nextOrderMenuButton;

    //локатор для каледаря
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/input")
    private SelenideElement calendarField;

    // локатор для мисклика (закрыть календарь) PS: через скрин js не получилось
    @FindBy(how = How.CLASS_NAME, using = "Order_Header__BZXOb")
    private SelenideElement missClickButton;

    // локатор для нажатия выпадашки срока аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-control")
    private SelenideElement dropDownButton;

    // локатор для поля ввода комментария
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[2]/div[4]/input")
    private SelenideElement commentField;

    // локатор для кнопки заказать финальной
    @FindBy(how = How.CSS, using = "#root  div.Order_Buttons__1xGrp > button:nth-child(2)")
    private SelenideElement finishOrderButton;

    // локатор кнопки "ДА" подтверждения заказа
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]")
    private SelenideElement yesFinishOrderButton;

    // локатор для кнопки "Посмотреть статус", которая появляется на поле после создания заказа
    @FindBy(how = How.CSS, using = "#root > div > div.Order_Content__bmtHS > div.Order_Modal__YZ-d3 > div.Order_NextButton__1_rCA > button")
    private SelenideElement seeOrderButton;

    // локатор для кнопки "Самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement samokatButton;

    // локатор для Home Header'a
    @FindBy(how = How.CLASS_NAME, using = "Home_Header__iJKdX")
    public SelenideElement homeHeaderPanel;

    // локатор для кнопки перехода в поисковик Яндекс
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexButton;

    // локатор для кнопки Найти на главной странице Яндекса
    @FindBy(how = How.CLASS_NAME, using = "button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited")
    public SelenideElement yandexFindButton;

    // локатор для кнопки "Заказать" в хедере страницы
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement orderButtonTop;

    // локатор для кнопки "Заказать" снизу
    @FindBy(how = How.CSS, using = "div.Home_FinishButton__1_cWm > button")
    private SelenideElement orderButtonMiddle;

    // локатор для поля, информирующем об успешном выполнении заказа
    public SelenideElement orderIsPlaced  = $(byText("Заказ оформлен"));

    // метод заполняет поля ввода имени
    public void setName(String name) {
        nameField.setValue(name);
    }

    // метод заполняет поля ввода фамилии
    public void setSurame(String surname) {
        surnameField.setValue(surname);
    }

    // метод заполняет поля ввода адреса
    public void setAddress(String address) {
        addressField.setValue(address);
    }

    // метод нажимает на кпоку выбора станции метро
    public void clickMetroStation() {
        metroStationButton.click();
    }

    // метод заполняет поля ввода номера
    public void setPhoneNumber(String phoneNumber) {
        phoneNumberField.setValue(phoneNumber);
    }

    // метод нажимает на кнопку далее для продолжения ввода параметров заказа
    public void clickNextOrderMenu() {
        nextOrderMenuButton.click();
    }

    // метод устанавливает значение даты в поле календаря
    public void setDeliveryDate(String deliveryDate) {
        calendarField.setValue(deliveryDate);
    }

    // метод мисклика, чтобы закрыть календарь
    public void clickMissClickButton() {
        missClickButton.click();
    }

    // метод нажимает на выпадающее меню для выбора срока аренды
    public void clickDropdownRent() {
        dropDownButton.click();
    }

    // метод для ввода в поле комменатрий
    public void setCommentField(String comment) {
        commentField.setValue(comment);
    }

    // метод нажатия на кпопку заказать для оформления заказа
    public void clickFinishOrderButton() {
        finishOrderButton.click();
    }

    // метод нажатия на кнопку "ДА" для подтверждения заказа
    public void clickYesFinishOrderButton() {
        yesFinishOrderButton.click();
    }

    // метод нажатия на кнопку "Посмотреть заказ" после успешного его оформления
    public void clickSeeOrderButton() {
        seeOrderButton.click();
    }

    // метод нажатия на кнопку "Самокат" для возврата в главное меню
    public void clickSamokatButton() {
        samokatButton.click();
    }

    // метод нажатия на кнопку Яндекс
    public void clickYandexButton() {
        yandexButton.click();
    }

    // метод нажатия на кнопку Заказать сверху
    public void clickOrderButtonTop() {
        orderButtonTop.click();
    }

    // метод нажатия на кнопку Заказать снизу
    public void clickOrderButtonMiddle() {
        orderButtonMiddle.click();
    }

}
