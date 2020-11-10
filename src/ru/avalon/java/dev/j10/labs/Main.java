package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void Main(String[] args) {

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         */
        Person ivanov = new Person(new Passport(), new Address());
        /* 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        Person smith = new Person(new Passport(), new Address());
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         */
        Passport ivanovPassport = new Passport();
        ivanovPassport.setPassportSeries("4008");
        ivanovPassport.setPassportNumber(456789);
        ivanovPassport.setName("Иван");
        ivanovPassport.setSurName("Иванович");
        ivanovPassport.setMiddleName("Иванов");
        ivanovPassport.setSecondName("");
        ivanovPassport.setDateBirthday("10.04.1980");
        ivanovPassport.setDateOfIssue("07.04.1994");
        ivanovPassport.setTheIssuingAuthority("МВД России по СПб и Лен.обл.");
        /* 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        Passport smithPassport = new Passport();
        smithPassport.setPassportSeries("PG");
        smithPassport.setPassportNumber(8743409);
        smithPassport.setName("John");
        smithPassport.setSurName(" ");
        smithPassport.setMiddleName("Smith");
        smithPassport.setSecondName("Edvard");
        smithPassport.setDateBirthday("31.01.2000");
        smithPassport.setDateOfIssue("25.01.2014");
        smithPassport.setTheIssuingAuthority("United States Department of State");
        /* 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         */
        Address ivanovAddress = new Address();
        ivanovAddress.setCity("Санкт-Петербург");
        ivanovAddress.setDistrict("Кировский");
        ivanovAddress.setStreet("Канонерский остров");
        ivanovAddress.setHouseNumber(11);
        ivanovAddress.setApartmentNumber(228);
        ivanovAddress.setRegistrationDate("15.01.2000");
        /* 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        Address smithAddress = new Address();
        smithAddress.setCountry("U.S.A.");
        smithAddress.setState("CALIFORNIA");
        smithAddress.setCity("Sacramento");
        smithAddress.setStreet("McKinley Blvd");
        smithAddress.setHouseNumber(3533);
        smithAddress.setRegistrationDate("01.06.2001");
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        ivanov = new Person(ivanovPassport, ivanovAddress);
        smith = new Person(smithPassport, smithAddress);
        System.out.println(ivanov.getFullName());
        System.out.println(ivanov.getAddress());
        System.out.println(smith.getFullName());
        System.out.println(smith.getAddress());
        System.out.println(ivanov);
        System.out.println(smith);
    }
}
