package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 420;
        float expectedEuro = 6;
        float expectedDollar = 7;
        float outEuro = Converter.rubleToEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("420 rubles are 6 euro. Test result : " + passedEuro);
        System.out.println("420 rubles are 7 dollar. Test result : " + passedDollar);

    }
}

