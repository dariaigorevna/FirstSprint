package ru.yandex.samokat.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class MainPageSamokat {

    // локатор для картинки-логотипа самоката
    SelenideElement logoSamokatPicture = $(byCssSelector("[src='/assets/scooter.svg']"));

    // локатор для логотипа "Яндекс"
    SelenideElement logoYandex = $(byCssSelector("[alt='Yandex']"));

    //локатор для логотипа "Самокат"
    SelenideElement logoSamokat = $(byCssSelector("[alt='Scooter']"));

    // локатор для логотипа "Учебный тренажер"
    SelenideElement logoStudyTrainee = $(byClassName(".Header_Disclaimer__3VEni"));

    // локатор для  App Cookie Consent
    SelenideElement appCookieConsent = $(byClassName("App_CookieText__1sbqp"));

    // локатор для текста App Cookie Consent "И здесь куки! В общем, мы их используем."
    SelenideElement textAppCookieConsent = $(byCssSelector("div.App_CookieText__1sbqp"));

    // локтор для кнопки "да все привыкли"
    SelenideElement buttonItsOk = $(byClassName("App_CookieButton__3cvqF"));

    // локатор для заголовка "Самокат на пару дней"
    SelenideElement headerSamokatForCoupleDays = $(byXpath(".//div[text() = 'Самокат ']"));

    // локатор для  подзаголовка "Привезём его прямо к вашей двери,
    // а когда накатаетесь — заберём
    SelenideElement privezemKogdaNakataetes = $(byXpath(".//div[text() = 'Привезём его прямо к вашей двери,']"));

    // локатор для подзаголовка "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    SelenideElement heIsLightAndWithPowerful = $(byXpath(".//div[text() = 'Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']"));

    // локатор для кнопки "Заказать" в хедере страницы
    SelenideElement orderButtonTop = $(byClassName("Button_Button__ra12g"));

    // локатор для элемента "Статус заказа" в хедере страницы
    SelenideElement orderStatusButton = $(byClassName("Header_Link__1TAG7"));

    // локатор для поля ввода номера заказа - Появляется после клака по кнопке "Статус заказа"
    SelenideElement orderNumberField = $(byClassName("Input_Input__1iN_Z Header_Input__xIoUq"));

    // локатор для кнопки "Go" - Появляется после клака по кнопке "Статус заказа"
    SelenideElement goButton = $(byText("Go!"));

    // локатор для картинки "Самокат".
    SelenideElement pictureSamokat = $(byCssSelector("[src='/assets/scooter.png']"));

    // локатор для  элемент-блока с параметрами самоката (скорость, расстояние, вес).
    SelenideElement blockSamokatInfo = $(byClassName("Home_Table__2kPxP"));

    // локатор Модель Toxic PRO
    SelenideElement toxicPro = $(byText(" Модель Toxic PRO"));

    //локатор Максимальная скорость
    SelenideElement maxSpeed = $(byText("Максимальная скорость"));

    //локатор 40 км/ч
    SelenideElement fortySpeed = $(byText("40 км/ч"));

    // локатор Проедет без подзарядки
    SelenideElement withoutCharge = $(byText("Проедет без поздарядки"));

    // локатор 80 км
    SelenideElement distantWithoutCharge = $(byText("80 км"));

    // локатор Выдерживает вес
    SelenideElement availibleWeight = $(byText("Выдерживает вес"));

    // локатор 120 кг
    SelenideElement maxWeight = $(byText("120 кг"));

    // локатор Подзаголовок "Как это работает"
    SelenideElement howItWorks = $(byText("Как это работает"));

    // локатор Элемент "Кружок с цифрой 1 внутри"
    SelenideElement circleOne = $(byXpath(".//div[text()='1']"));

    // локатор Элемент "Кружок с цифрой 2 внутри".
    SelenideElement circleTwo = $(byXpath(".//div[text()='2']"));

    // локатор Элемент "Кружок с цифрой 3 внутри".
    SelenideElement circleThree = $(byXpath(".//div[text()='3']"));

    // локатор Элемент "Кружок с цифрой 4 внутри".
    SelenideElement circleFour = $(byXpath(".//div[text()='4']"));

    // локатор Шаг 1 "Заказываете самокат"
    SelenideElement stepOne = $(byText("Заказываете самокат"));

    // локатор Описание Шага 1 "Выбираете, когда и куда привезти".
    SelenideElement stepOneDescription = $$(byClassName("Home_StatusDescription__3WGl5")).get(0);

    // локатор Шаг 2 "Курьер привозит самокат".
    SelenideElement stepTwo = $(byText("Курьер привозит самокат"));

    // локатор Описание Шага 2 "А вы — оплачиваете аренду"
    SelenideElement stepTwoDescription = $$(byClassName("Home_StatusDescription__3WGl5")).get(1);

    // локатор Шаг 3 "Катаетесь".
    SelenideElement stepThree = $(byXpath(".//div[text()='Катаетесь']"));

    // локатор Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    SelenideElement stepThreeDescription = $$(byClassName("Home_StatusDescription__3WGl5")).get(2);

    // локатор  Шаг 4 "Курьер забирает самокат".
    SelenideElement stepFour = $(byText("Курьер привозит самокат"));

    // локатор Описание Шага 4 "Когда аренда заканчивается".
    SelenideElement stepFourDescription = $$(byClassName("Home_StatusDescription__3WGl5")).get(3);

    // локатор Кнопка "Заказать" в нижней части страницы.
    SelenideElement orderButtonMiddle = $(byCssSelector("div.Home_FinishButton__1_cWm > button"));

    // локатор Вопросы о важном
    SelenideElement importantQuestions = $(byText("Вопросы о важном"));

    // локатор  Блок вопросов:
    SelenideElement faqBlock = $(byClassName("Home_FAQ__3uVm4"));

    // локатор для "Сколько это стоит? И как оплатить?"
    SelenideElement questionOne = $(byText("Сколько это стоит? И как оплатить?"));

    // локатор для "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    public SelenideElement answerOne = $(byText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));

    // локатор для "Хочу сразу несколько самокатов! Так можно?"
    SelenideElement questionTwo = $(byText("Хочу сразу несколько самокатов! Так можно?"));

    // локатор для "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    public SelenideElement answerTwo = $(byText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));

    // локатор для "Как рассчитывается время аренды?"
    SelenideElement questionThree = $(byText("Как рассчитывается время аренды?"));

    // локатор для "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    public SelenideElement answerThree = $(byText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));

    // локатор для "Можно ли заказать самокат прямо на сегодня?"
    SelenideElement questionFour = $(byText("Можно ли заказать самокат прямо на сегодня?"));

    // локатор для "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    public SelenideElement answerFour = $(byText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));

    // локатор для "Можно ли продлить заказ или вернуть самокат раньше?"
    SelenideElement questionFive = $(byText("Можно ли продлить заказ или вернуть самокат раньше?"));

    // локатор для "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    public SelenideElement answerFive = $(byText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));

    // локатор для "Вы привозите зарядку вместе с самокатом?"
    SelenideElement questionSix = $(byText("Вы привозите зарядку вместе с самокатом?"));

    // локатор для "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    public SelenideElement answerSix = $(byText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));

    // локатор для "Можно ли отменить заказ?"
    SelenideElement questionSeven = $(byText("Можно ли отменить заказ?"));

    // локатор для "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    public SelenideElement answerSeven = $(byText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));

    // локатор для "Я жизу за МКАДом, привезёте?"
    SelenideElement questionEight = $(byText("Я жизу за МКАДом, привезёте?"));

    // локатор для "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    public SelenideElement answerEight = $(byText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));

    // Далее перечисление всех ответов на вопросы с главной страницы
    public String faqAnswer1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String faqAnswer2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String faqAnswer3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String faqAnswer4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String faqAnswer5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String faqAnswer6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String faqAnswer7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String faqAnswer8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    // метод для нажатия на вопрос 1
    public void clickQuestionOne() {
        questionOne.click();
    }

    // метод для нажатия на вопрос 2
    public void clickQuestionTwo() {
        questionTwo.click();
    }

    // метод для нажатия на вопрос 3
    public void clickQuestionThree() {
        questionThree.click();
    }

    // метод для нажатия на вопрос 4
    public void clickQuestionFour() {
        questionFour.click();
    }

    // метод для нажатия на вопрос 5
    public void clickQuestionFive() {
        questionFive.click();
    }

    // метод для нажатия на вопрос 6
    public void clickQuestionSix() {
        questionSix.click();
    }

    // метод для нажатия на вопрос 7
    public void clickQuestionSeven() {
        questionSeven.click();
    }

    // метод для нажатия на вопрос 8
    public void clickQuestionEight() {
        questionEight.click();
    }



}
