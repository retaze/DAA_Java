package Game;

public class Objekte {

    public static void goldsee() {
        System.out.println("Vor dir liegt der Goldsee und du hast kein Boot. Benutze lieber einen anderen Weg.");

    }

    public static void gebirge() {
        System.out.println("Das Stallach Gebirge versperrt dir den Weg");
    }

    public static void brief() {
        System.out.println("\"" + Main.name + "!");
        System.out.println("Bitte helfe mir. Der fiese Zaratul hat mich in seiner Burg gefangen genommen.");
        System.out.println("Du weißt schon, die Burg am Ostufer des Goldsees. Hol mich bitte schnell hier raus, bevor er mir irgentwas schlimmes antun kann...");
        System.out.println("\b");
        System.out.println("Deine Prinzessin Anabia\"");
    }

    public static void hoehle() {
        System.out.println("Hier scheint die Höhle zuende zu sein. Ich sollte es in eine andere Richtung probieren.");
    }

    public static void ebeneEnde() {
        System.out.println("Unter dir erstreckt sich ein dunkler Wald. Den Abhang möchtest du aber nicht herunter rutschen. Probier einen anderen Weg.");
    }

    public static void waldEnde() {
        System.out.println("Hinter den letzten Bäumen siehst du einen sehr Steilen Anstieg. Nimm lieber einen anderen Weg. Das ist zu steil.");
    }

    public static void burgEnde() {
        System.out.println("Hier sind alle Türen verschlossen. Vielleicht geht es in einer anderen Richtung weiter.");
    }

    public static void umschauen1() {
        System.out.println("Du befindest dich auf einer alten Handelsstraße.");
        System.out.println("Diese Straße führt weiter Richtung Norden. Im Osten liegt der Goldsee, am anderen Ufer kannst du die Umrisse einer Burg erkennen.");
        System.out.println("Der Westen und Süden ist durch das Stallach Gebirge begrenzt.");
    }

    public static void umschauen2() {
        System.out.println("Du befindest dich auf einer alten Handelsstraße.");
        System.out.println("Am Wegesrand liegen drei Leichen neben einem Handkarren. Warscheinlich waren es Kaufleute, die überfallen wurden.");
        if (Main.schwert == 0) {
            System.out.println("Unter dem Handkarren siehst du ein Schwert liegen.");
        }
        System.out.println("\b");
        System.out.println("Im Norden führt die Straße weiter in eine Weggabelung. Nach Süden geht es weiter auf der Handelsstraße zum Anfang deines Abenteuers.");
        System.out.println("Im Osten liegt der Goldsee und im Westen begrenzt das Stallach Gebirge deinen Weg.");
    }

    public static void umschauen3() {
        System.out.println("In Richtung Norden geht es einen steilen Hang zu einer Hoch-Ebene hinauf.");
        System.out.println("Nach Süden geht es zur alten Handelsstraße mit den Leichen.");
        System.out.println("Im Osten erstreckt sich ein dichter Wald und im Westen das Stallach Gebirge");
    }

    public static void umschauen4() {
        System.out.println("Im Norden kannst du ganz schwach einen alten zugewachsenen Pfad erkennen. Vielleicht lohnt es sich, dass mal genau anzuschauen");
        System.out.println("Nach Osten geht es die Ebene weiter.");
        System.out.println("Im Süden liegt die Weggabelung der alten Handelsstraße und im Westen das Stallach Gebirge");
    }

    public static void umschauen5() {
        System.out.println("Im Norden und Westen kommst du nicht weiter. Hier fangen gleich die steilen Wände des Stallach Gebirges an");
        System.out.println("Im Osten siehst du einen dunklen Fleck in der Gebirgewand. Was sich da wohl befindet?");
        System.out.println("Auf die Hochebene kommst du Richtung Süden.");
    }

    public static void umschauen6() {
        System.out.println("Die Höhle ist erfrischend kühl, aber sehr dunkel.");
        if (Feld6.truhe == 1) {
            System.out.println("In der hinteren Ecke kannst du eine kleine Truhe erspähen.");
        }
    }

    public static void umschauen7() {
        System.out.println("Im Norden siehst du die Felswände des Stallach Gebirges.");
        System.out.println("Im Osten und Westen geht es weiter auf der Hoch-Ebene.");
        System.out.println("Im Süden geht ein steiler Abhang in einen dichten Wald über.");
    }

    public static void umschauen8() {
        System.out.println("Der Wald ist sehr dicht und dämmerig. Trotzdem kannst du deutlich einen Pfad im Osten und Westen erkennen.");
        System.out.println("Im Norden und Süden wird der Wald langsam lichter.");
    }

    public static void umschauen9() {
        System.out.println("Der Wald ist sehr dicht und dämmerig. Trotzdem kannst du deutlich einen Pfad im Osten und Westen erkennen.");
        System.out.println("Im Norden und Süden wird der Wald langsam lichter.");
    }

    public static void umschauen10() {
        System.out.println("Im Norden siehst du die Felswände des Stallach Gebirges.");
        System.out.println("Im Osten und Westen geht es weiter auf der Hoch-Ebene.");
        System.out.println("Im Süden geht ein steiler Abhang in einen dichten Wald über.");
    }

    public static void umschauen11() {
        System.out.println("Im Osten und Norden begrenzt das Gebirge den Weg.");
        System.out.println("In Richtung Süden schlängelt sich ein Pfad die Ebene runter.");
        System.out.println("Im Westen geht es auf der Ebene weiter.");
    }

    public static void umschauen12() {
        System.out.println("Im Norden schlängelt sich ein Pfad die Hoch-Ebene hinauf.");
        System.out.println("Im Süden ragt die mächtige Burg von Zaratul am Horizont herauf.");
        System.out.println("Ein Wald liegt im Osten");
    }

    public static void umschauen13() {
        System.out.println("In der Burg ist es unangenehm stickig.");
        System.out.println("Im Norden befindet sich die Eingangstür.");
    }

    public static void umschauen14() {
        System.out.println("Auf der linken Seite sind die Kerkerzellen. In der zweiten Zelle siehst du Prinzessin Anabia.");
    }

    public static void credits() {
        System.out.println("Du hast das Spiel beendet. Herzlichen Glückwunsch!");


    }


}
