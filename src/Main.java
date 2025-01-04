
public class Main {



    public static void main(String[] args) {

        /**
         * ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
         */


        int age1, age2, age3, age4;   // занимает 4 байта памяти, сокращенная запись (т.е. задаем сразу несколько переменных)
        int a = 55;  // т.е. можно сразу задать переменную и присвоить ей значение (для экономии места)
        int b = a*7;   // TODO: добавить "World"
        int c = (a-b) * (a+b);

        Short myShort = 32767;  // has a minimum value of  -32,768 and a maximum value of 32,767
        long myLong = 12346465;  // 64-битное число
        double myDouble = 45478787.454;   // вещественное число (по умолчанию)
        float myFloat = -73653.78f;     // в конце ставим букву "f", чтобы компилятор знал, что это float
        char с = 'a';  // символьный тип
        boolean n = true;
        byte t = 127;             // 8-битный тип от -127 до 127
        System.out.println("Hello world!");


        /**
         * ССЫЛОЧНЫЕ ТИПЫ ДАННЫХ
         */
        String name;   // задекларировали переменную. Инициализация переменной - это присвоение ей к.-л. значения
        String name2 = "";  // создали пустую строку. String - это тоже класс, поэтому он пишется с заглавной буквы
        String city = "Yarolavl" + "city";   // это называется склеить строки
        String str1 = "Амиго" + a;  // получится строка "Амиго55"
                                     // str1 - это, по сути, ссылка на объект ("Амиго")
        System.out.println(str1);
        System.out.println("Это " + str1);

        Car car1 = new Car();
        car1.color = "blue";
        System.out.println("ЦВет автомобиля Car1: " + car1.color);

        Nalog nalog1 = new Nalog();  // слева от "nalog1" указан тип переменной (т.е. "Nalog")
        double vashNalog = nalog1.calcNalog(30000,"USN");
        System.out.println("Ваш налог составляет " + vashNalog + " руб.");

    }
}

/*-
* комментарий к коду
 */

