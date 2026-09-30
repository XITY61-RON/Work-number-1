package SeminarFour;

import java.util.Scanner;

enum InSeasons {
        SPRING("Весна", "март, апрель, май", "Пробуждение природы, тепло", +10),
        SUMMER("Лето", "июнь, июль, август", "Солнце, каникулы, море", +25){
            @Override 
            public String getDescription() {
            return "Теплое время года";
        }
        },
        AUTUMN("Осень", "сентябрь, октябрь, ноябрь", "Золотые листья, уют", +8),
        WINTER("Зима", "декабрь, январь, февраль", "Снег, праздники, Новый год", -10) ; 
    private final String name; 
    private final String months;
    private final String commit;
    private final int temperaturs;
    InSeasons(String name, String months, String commit, int temperaturs){
        this.name = name;
        this.months = months;
        this.commit = commit;
        this.temperaturs = temperaturs;
    }
    public int getTemperaturs() {
        return temperaturs;
    }

    public String getDescription() {
        return "Холодное время года";
    }
    public void printInfo(){
        System.out.println("Время года: " + name +"|"+ "Месяцы: "+ months + "|"+ commit +"|"+"Температура: " + temperaturs);
    }
    }
public class Seasons {
    public static void main(String[] args){
        Scanner seas = new Scanner(System.in);
        InSeasons loveSeason = InSeasons.SPRING;
        System.out.println("Мое любимое время года ");
        loveSeason.printInfo();
        System.out.println("Введите интересующий вас месяц:\nSPRING\nSUMMER\nAUTUMN\nWINTER");
        String scanning = seas.nextLine();
        try{InSeasons chek = InSeasons.valueOf(scanning); printLove(chek);}catch(IllegalArgumentException e){
            System.out.println("Новое время года? Не слышал о таком.");
        }

        System.out.println("Все времена года");
        for (InSeasons s : InSeasons.values()) {
            System.out.printf("%-7s | t = %+4d°C | %s%n",
                    s, s.getTemperaturs(), s.getDescription());
        }
        seas.close();
    }
    public static void printLove(InSeasons seasons){
        switch (seasons) {
            case SPRING:
                System.out.println("Я люблю Весну");
                break;
             case SUMMER:
                System.out.println("Я люблю Лето");
                break;
             case AUTUMN:
                System.out.println("Я люблю Осень");
                break;
             case WINTER:
                System.out.println("Я люблю Зиму");
                break;
            default:
                break;
        }
    }
}
