import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    int a = 5;
    int b = 5;

    @Epic("Арифметика")
    @Feature("Математические операции")
    @Story("Успешно выполненные математические операции")
    @Description("Успешное сложение")
    @Issue("ISSUE-1234")
    @Link("https://alexgyver.ru/lessons/compute/")
    @Owner("kate.kate@example.com")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void successfulAdditionOperation() {
        int c = a + b;
        assertEquals(10, c);
    }

    @Epic("Арифметика")
    @Feature("Математические операции")
    @Story("Успешно выполненные математические операции")
    @Description("Успешное вычитание")
    @Issue("ISSUE-2345")
    @Link("https://alexgyver.ru/lessons/compute/")
    @Owner("kate.kate@example.com")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void successfulSubtractionOperation() {
        int c = a - b;
        assertEquals(0, c);
    }

    @Epic("Арифметика")
    @Feature("Математические операции")
    @Story("Невалидные выполненные математические операции")
    @Description("Неверное сложение")
    @Issue("ISSUE-12345")
    @Link("https://alexgyver.ru/lessons/compute/")
    @Owner("kate.kate@example.com")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void invalidAdditionOperation() {
        int c = a + b;
        assertEquals(20, c);
    }

    @Epic("Арифметика")
    @Feature("Математические операции")
    @Story("Невалидные выполненные математические операции")
    @Description("Неверное вычитание")
    @Issue("ISSUE-23456")
    @Link("https://alexgyver.ru/lessons/compute/")
    @Owner("kate.kate@example.com")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void invalidSubtractionOperation() {
        int c = a - b;
        assertEquals(10, c);
    }

    @Epic("Геометрия")
    @Feature("Площадь")
    @Story("Успешно посчитанная площадь прямоугольника")
    @Description("Успешно посчитанная площадь прямоугольника при данных сторонах")
    @Issue("ISSUE-3456")
    @Link("https://skysmart.ru/articles/mathematic/kak-nayti-ploshchad'-pryamougol'nika")
    @Owner("kate@example.com")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void successfulCalculatedAreaOfRectangle() {
        int area = a * b;
        assertEquals(25, area);
    }

    @Epic("Геометрия")
    @Feature("Площадь")
    @Story("Некорректно посчитанная площадь прямоугольника")
    @Description("Некорректно посчитанная площадь прямоугольника при данных сторонах")
    @Issue("ISSUE-34567")
    @Link("https://skysmart.ru/articles/mathematic/kak-nayti-ploshchad'-pryamougol'nika")
    @Owner("kate@example.com")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void invalidCalculatedAreaOfRectangle() {
        int area = a * b;
        assertEquals(0, area);
    }
}
