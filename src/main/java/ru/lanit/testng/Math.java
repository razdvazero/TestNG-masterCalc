package ru.lanit.testng;

public class Math {

    public Object sumTest(Object two, Object tree) {
        System.out.println("Складываем "+ two + " и " + tree);
        Double i = (Double)two + (Double)tree;
        return i;
    }

    public Object subTest(Object two, Object tree) {
        System.out.println("Вычитаем "+ two + " и " + tree);
        Double i = (Double)two - (Double)tree;
        return i;
    }
    public Object multTest(Object two, Object tree) {
        System.out.println("Умножаем "+ two + " и " + tree);
        Double i = (Double)two * (Double)tree;
        return i;
    }
    public Object divTest(Object two, Object tree) {
        System.out.println("Делим "+ two + " и " + tree);
        Double i = (Double)two / (Double)tree;
        return i;
    }
}
