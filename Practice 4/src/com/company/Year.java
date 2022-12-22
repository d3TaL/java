package com.company;


public class Year {


    public enum yearTime{
        Winter (-5, "Winter is cold season in year."),
        Spring (10, "Spring is beautiful and flourishing season in year."),
        Summer (25, "Summer is hot season in year."),
        Autumn (9, "Autumn is rainy season in year.");


        private final int temp;
        private final String description;
        yearTime(int temp, String description) {
            this.temp = temp;
            this.description = description;
        }
        public int getTemp(){
            return this.temp;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return description + " Temp = " + temp;
        }
    }


    public Year(yearTime Seasons){
        switch(Seasons){
            case Autumn -> System.out.println("I like Autumn. Temperature = " + Seasons.getTemp() + "°C");
            case Spring -> System.out.println("I like Spring. Temperature = " + Seasons.getTemp() + "°C");
            case Winter -> System.out.println("I like Winter. Temperature = " + Seasons.getTemp() + "°C");
            case Summer -> System.out.println("I like Summer. Temperature = " + Seasons.getTemp() + "°C");
        }
    }
    public String getDescription(yearTime Season){
        if (Season == yearTime.Winter)
            return "Холодное время года";
        if (Season == yearTime.Summer)
            return "Теплое время года";
        return null;
    }

    public static void main(String[] args) {
        yearTime my_favorite_time_of_year = yearTime.Winter;
        yearTime Season = yearTime.Autumn;
        Year year = new Year(Season);
        for (yearTime level : yearTime.values()) {
            System.out.println(level.toString());
        }
    }

}
