package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    private Passport passport;
    private Address address;

    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        // Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
        // Отчество, разделённые пробелом.
        if (passport.getName() != null && passport.getSurName() != null && passport.getMiddleName() != null) {
            return (" " + passport.getName() + " " + passport.getSurName() + " " + passport.getMiddleName());

            // Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
            // Первую букву второго имени, и Фамилию, разделённые пробелом. После
            // Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
        } else if (passport.getSecondName() != null) {
            return (" " + passport.getName() + " " + passport.getSecondName().substring(0, 1) + "." + " " + passport.getMiddleName());

            // Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
            // Фамилия, то возвращает их, разделённые пробелом.
        } else if (passport.getName() != null && passport.getMiddleName() != null) {
            return (" " + passport.getName() + " " + passport.getMiddleName());
        }
        return null;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной регистрации человека,
     * согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.FullAddress();
    }
}
