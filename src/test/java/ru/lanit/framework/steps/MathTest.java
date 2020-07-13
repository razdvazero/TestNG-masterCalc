package ru.lanit.framework.steps;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.lanit.testng.Math;

public class MathTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Подготовка перед тестами");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Подчищаем после тестов");
    }
    //----------------------------------------------------------------------сложение
    @DataProvider
    public Object[][] testSumEquals() {
        return new Object[][]{
                {4.5, 2.25, 2.25},
                {0.0, 0.0, 0.0},
                {0.0, -4.0, 4.0},
                {-1.0, 0.0, -1.0},
                {Double.MAX_VALUE, 1.7976931348623157E+308, 0.0}
        };
    }
    //сложение правильное
    @Test(dataProvider = "testSumEquals")
    public void testSumEquals(Object one, Double two, Double tree) {
        Assert.assertEquals(one, new Math().sumTest(two,tree),"Значения не равны!");
    }


    @DataProvider
    public Object[][] testSumNotEquals() {
        return new Object[][]{
                {5.5, 2.25, 2.25},
                {Double.MAX_VALUE, 1.79769, -11.0},
                {1.0, 4.0, 4.0},
                {-1.0, 4.0, -1.0},
                {4.0, -1.0, -5.3}
        };
    }
    //сложение с ошибкой
    @Test(dataProvider = "testSumNotEquals")
    public void testSumNotEquals(Object one, Double two, Double tree) {
        Assert.assertNotEquals(one, new Math().sumTest(two,tree),"Значения не равны!");
    }
//----------------------------------------------------------------------вычитание
@DataProvider
public Object[][] testSubEquals() {
    return new Object[][]{
            {0.0, 1.0, 1.0},
            {0.0, 0.0, 0.0},
            {0.0, 4.0, 4.0},
            {1.0, 0.0, -1.0},
            {-3.0, -4.0, -1.0},
    };
}
    //вычитание правильное
    @Test(dataProvider = "testSubEquals")
    public void testSubEquals(Object one, Double two, Double tree) {
        Assert.assertEquals(one, new Math().subTest(two,tree), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testSubNotEquals() {
        return new Object[][]{
                {0.0, 4.0, 1.0},
                {4.0, -1.2, 1.0},
                {1.3, 4.0, 4.0},
                {-1.0, 4.0, -1.0},
                {-1.0, 8.4, 4.0},
        };
    }
    //вычитание с ошибкой
    @Test(dataProvider = "testSubNotEquals")
    public void testSubNotEquals(Object one, Double two, Double tree) {
        Assert.assertNotEquals(one, new Math().subTest(two,tree), "Значения не равны!");
    }
    //----------------------------------------------------------------------умножение
    @DataProvider
    public Object[][] testMultEquals() {
        return new Object[][]{
                {0.0, 0.0, 0.0},
                {2.0, 1.0, 2.0},
                {-160.0, -40.0, 4.0},
                {20.0, -5.0, -4.0},
                {1.0, -1.0, -1.0},
        };
    }
    //умножение правильное
    @Test(dataProvider = "testMultEquals")
    public void testMultEquals(Object one, Double two, Double tree) {
        Assert.assertEquals(one, new Math().multTest(two,tree), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testMultNotEquals() {
        return new Object[][]{
                {"five", 2, 2},
                {1, -1, "one"},
                {100, "four", 4},
                {"seven", "0", -1},
                {3, "zero", 3}
        };
    }
    //умножение с ошибкой
    @Test(dataProvider = "testMultNotEquals", expectedExceptions = {ClassCastException.class})
    public void testMultNotEquals(Object one, Object two, Object tree) {
        Assert.assertNotEquals(one, new Math().multTest(two,tree), "Значения не равны!");
    }
    //----------------------------------------------------------------------деление
    @DataProvider
    public Object[][] testDivEquals() {
        return new Object[][]{
                {6.0, 18.0, 3.0},
                {-3.0, 9.0, -3.0},
                {1.0, -4.0, -4.0},
                {1024.0, 2048.0, 2.0},
                {-11.0, -99.0, 9.0},
        };
    }
    //деление правильное
    @Test(dataProvider = "testDivEquals")
    public void testDivEquals(Object one, Double two, Double tree) {
        Assert.assertEquals(one, new Math().divTest(two,tree), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testDivNotEquals() {
        return new Object[][]{
                {0.0, 0.0, 0.0},
                {4.0, 6.0, 0.0},
                {55.0, 6.0, 4.0},
                {-4.0, -20.0, -5.0},
                {Double.MAX_VALUE, Double.MAX_VALUE, -1.0},
        };
    }
    //деление с ошибкой
    @Test(dataProvider = "testDivNotEquals")
    public void testDivNotEquals(Object one, Double two, Double tree) {
        Assert.assertNotEquals(one, new Math().divTest(two,tree), "Значения не равны!");
    }

}
