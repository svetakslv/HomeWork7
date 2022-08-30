import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///Задачи №1,2
        {
            String firstName = "Ivan ";
            String middleName = "Ivanovich ";
            String lastName = "Ivanov ";
            String foolName = lastName + firstName + middleName;
            System.out.println("Ф.И.О. сотрудника " + foolName);
            String foolName2 = "Ivanov Ivan Ivanovich";
            System.out.println(foolName2.toUpperCase());
        }
        ///Задача №3
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String foolName = lastName + firstName + middleName;
        String foolName2 = foolName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + foolName2);

    }
}
