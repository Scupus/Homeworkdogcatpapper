public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(papper);
        System.out.println("_____________________________________________________________________________");
        System.out.println("Новое задание");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("_____________________________________________________________________________");
        System.out.println("Новое задание");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("_____________________________________________________________________________");
        System.out.println("Новое задание");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + summaryWeight + " кг");
        var diffWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе " + diffWeight + " кг");
        var diffWeight2 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе " + diffWeight2 + " кг");
        System.out.println("_____________________________________________________________________________");
        var allTime = 640;
        var oneWorkerTime = 8;
        var companyPersonal = allTime / oneWorkerTime;
        System.out.println("Всего работников в компании - " + companyPersonal + " человек");
        System.out.println("_____________________________________________________________________________");
        var companyPersonal1 = companyPersonal + 94;
        var oneWorkertime2 = allTime / 94;
        var allTime2 = oneWorkertime2 * 94;
        System.out.println("Если в компании работает " + companyPersonal1 + " человек," + "то всего");
        System.out.println(allTime2 + " часов работы может быть поделено между сотрудниками");



    }
}