// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook(4, 128, "linux", "white");
        Notebook notebook2 = new Notebook(8, 256, "windows", "white");
        Notebook notebook3 = new Notebook(8, 256, "linux", "white");
        Notebook notebook4 = new Notebook(8, 256, "linux", "black");
        Notebook notebook5 = new Notebook(4, 128, "windows", "black");
        Notebook notebook6 = new Notebook(16, 512, "windows", "grey");
        Notebook notebook7 = new Notebook(16, 512, "linux", "grey");
        Notebook notebook8 = new Notebook(16, 512, "linux", "grey");
        Notebook notebook9 = new Notebook(16, 256, "windows", "black");

        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в NotebookMarket!");
        System.out.println(
                "Пожалуйста, выберите интересующий параметр выбора: '1' - ОП, '2' - жёсткий диск,'3' - ОС,'4' - цвет");
        Integer selection = scan.nextInt();
        if (selection==1){
            System.out.println("Введите интересующий объём ОП ('1' - 4ГБ ;'2' - 8Гб ;'3' - 16ГБ): ");
            Integer select_op = scan.nextInt();
             
        }
        if (selection==2){
            System.out.println("Введите интересующий объём жёсткого диска ('1' - 128ГБ;'2' - 256ГБ;'3' - 512ГБ): ");
            Integer select_op = scan.nextInt();

        }
        if (selection==3){
            System.out.println("Введите интересующую ОС ('1' - windows;'2' - linux): ");
            String select_op = scan.nextLine();


        }
        if (selection==4){
            System.out.println("Введите интересующий цвет ('1' - белый;'2' - чёрный;'3' - серый): ");
            String select_op = scan.nextLine();

        }
        

        // System.out.println(notebook1.get_ram_memory());

        scan.close();
    }

}
