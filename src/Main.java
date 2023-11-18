public class Main {
    public static void main(String[] args) {;
    // Задача № 1:
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println( "Задача № 1:\n\tdog = " + dog + "\n\tcat = " + cat + "\n\tpaper = " + paper + "\n");
    // Задача № 2:
    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;
    System.out.println("Задача № 2:\n\tdog = " + dog + "\n\tcat = " + cat + "\n\tpaper = " + paper + "\n");
    // Задача № 3:
    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println("Задача № 3:\n\tdog = " + dog + "\n\tcat = " + cat + "\n\tpaper = " + paper + "\n");
    // Задача № 4:
    var friend = 19;
    System.out.println("Задача № 4:\n\tfriend = " + friend);
    friend = friend + 2;
    System.out.println("\tСумма = " + friend);
    friend = friend / 7;
    System.out.println("\tЧастное = " + friend + "\n");
    // Задача № 5:
    var frog = 3.5;
    System.out.println("Задача № 5:\n\tfrog = " + frog);
    frog = frog * 10;
    System.out.println("\tПроизведение = " + frog);
    frog = frog / 3.5;
    System.out.println("\tЧастное = " + frog);
    frog = frog + 4;
    System.out.println("\tСумма = " + frog + "\n");
    // Задача № 6:
    var boxerOneWight = 78.5;
    var boxerTwoWight = 82.7;
    var totalWeightBoxers = boxerOneWight + boxerTwoWight;
    var massDifference = boxerTwoWight - boxerOneWight;
    System.out.println("Задача № 6:\n\tВес первого боксёра = " + boxerOneWight + " кг\n\tВес второго бовсёра = " +
            boxerTwoWight + " кг\n\tОбщий вес боксёров = " + totalWeightBoxers +
            " кг\n\tРазница в весе = " + massDifference + " кг\n");
    // Задача № 7:
    var massDifference_1 = boxerTwoWight - boxerOneWight;
    var quotient = boxerTwoWight % boxerOneWight;
    System.out.println("Задача № 7:\n\tРазница = " + massDifference_1 + "\n\tОстаток от деления = " + quotient + "\n");
    // Задача № 8:
    var openingHours = 640;
    var openingHoursEmployees = 8;
    var employees = openingHours / openingHoursEmployees;
    System.out.println("Задача № 8:\n\tВсего работников в компании - " + employees + " человек");
    employees = employees + 94;
    openingHoursEmployees = openingHours / employees;
    System.out.println("\tЕсли в компании работает " + employees + " человек, то всего " + openingHoursEmployees +
            " часов работы может быть поделено между сотрудниками");
    }
}