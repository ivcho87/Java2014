package mygarrage;
public class MyGarrage {
    public static void main(String[] args) {
        Person ivan = new Person("Иван", "Иванов", 25, "продавач-консултант");
        Person peter = new Person("Петър", "Петров", 32, "търговски представител"); //неизползван, само за проба за брояча
        Person georgi = new Person("Георги", "Георгиев", 28, "IT специалист");
        Person petq = new Person("Петя", "Петкова", 23, "сервитьорка");
        Garrage golf = new Garrage("Volkswagen", "Golf", "сив", 1990);
        Garrage merc = new Garrage("Mercedes", "124 Coupe", "черен", 1993);
        Garrage bmw = new Garrage("BMW", "523i", "тъмно син", 2004);
        Garrage seat = new Garrage("Seat", "Toledo", "син", 1992);
        Garrage nissan = new Garrage("Nissan", "Patrol", "бял", 1996);
        
        System.out.println("Здравейте, аз съм " + ivan.getName() + " " + ivan.getFamily() + ". На " + ivan.getAge() + " години съм и работя като " + ivan.getOccupation() + ". \nПритежавам два автомобила, единият е " + golf.getBrand() + " " + golf.getModel() + ". Той е " + golf.getColour() + " на цвят и е произведен през " + golf.getYear() + " година. \nВторият е " + nissan.getBrand() + " " + nissan.getModel() + ". Той е " + nissan.getColour() + " на цвят и е произведен през " + nissan.getYear() + " година.\n" );
        System.out.println("Добър ден, казвам се " + georgi.getName() + " " + georgi.getFamily() + ". Аз съм " + georgi.getAge() + " годишен и работя като " + georgi.getOccupation() + ". \nПритежавам два автомобила, единият е " + merc.getBrand() + " " + merc.getModel() + ". Той е " + merc.getColour() + " на цвят и е произведен през " + merc.getYear() + " година. \nВторият е " + bmw.getBrand() + " " + bmw.getModel() + ". Той е " + bmw.getColour() + " на цвят и е произведен през " + bmw.getYear() + " година.\n" );
        System.out.println("Здрасти, името ми е " + petq.getName() + " " + petq.getFamily() + ". Аз съм на " + petq.getAge() + " години и работя като " + petq.getOccupation() + ". \nПритежавам един автомобил, той е " + seat.getBrand() + " " + seat.getModel() + ". Той е " + seat.getColour() + " на цвят и е произведен през " + seat.getYear() + " година. \n");
        System.out.println("Ние сме "   + ivan.getName() + ", " + georgi.getName() + " и "+ petq.getName() + ". Ние всъщност сме \nбезмозъчни ботове, които дори не знаят какво е да имат автомобил,\nсамо служим за пример. Довиждане от нас!\n" );
        System.out.println("Generated objects in class Person: " + Person.countPersons);
        System.out.println("Generated objects in class Garrage: " + Garrage.countGarrage);
    }
    
}
