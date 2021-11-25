package com.globema;

import javafx.application.Application;
import javafx.beans.binding.*;
import javafx.beans.property.*;
import javafx.stage.Stage;

public class BindingsExample extends Application {
    public static void main(String[] args) {
        //launch(args);
        bindings();
    }

    public static void bindings() {
        DoubleProperty a = new SimpleDoubleProperty(3.0);
        IntegerProperty b = new SimpleIntegerProperty(4);

        NumberBinding result = a.add(b);
        System.out.println("Wynik dodawania: " + result.intValue());

        DoubleBinding resDiv = a.divide(b);
        System.out.println("Wynik dzielenia: " + resDiv.doubleValue());

        NumberBinding resSubstr = a.subtract(b);
        System.out.println("Wynik odejmowania: " + resSubstr.intValue());

        NumberBinding resMultiply = a.multiply(b);
        System.out.println("Wynik mnożenia: " + resMultiply.intValue());

        NumberBinding resNegate = a.negate();
        System.out.println("Wynik negacji a: " + resNegate.intValue());

        System.out.println();
        System.out.println("WARUNKI");

        BooleanBinding warunek = a.isEqualTo(b);
        System.out.println("Czy a równa się b?: " + warunek.get());
        System.out.println("Czy a jest większa niż b?: " + a.greaterThan(b).get());
        System.out.println("Czy a jest równa lub większa niż b?: " + a.greaterThanOrEqualTo(b).get());
        System.out.println("Czy a jest mniejsza niż b?: " + a.lessThan(b).get());
        System.out.println("Czy a jest równa lub mniejsza niż b?: " + a.lessThanOrEqualTo(b).get());

        System.out.println();
        System.out.println("DZIAŁANIA NA STRINGACH");
        StringProperty s1 = new SimpleStringProperty("To jest");
        StringProperty s2 = new SimpleStringProperty(" fajny");
        StringProperty s3 = new SimpleStringProperty(" kurs JavaFX");
        StringExpression strExpr = s1.concat(s2).concat(s3);
        System.out.println(strExpr.get());
        StringBinding stringBindingRes = new When(a.lessThan(b)).then("mniejsza").otherwise("większa");
        System.out.println(stringBindingRes.get());

        BooleanBinding boolRes = new When(a.lessThan(b)).then(true).otherwise(false);
        System.out.println(boolRes.get());

        System.out.println();
        System.out.println("FORMATER");

        DoubleProperty longDouble = new SimpleDoubleProperty(2.1344563563563456);
        StringExpression out = Bindings.format("Formatuj string: (%.3f)", longDouble);
        System.out.println(out.get());



    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
    }



}
