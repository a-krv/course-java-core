package com.rakovets.course.java.core.practice.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.Season;
import org.w3c.dom.ls.LSOutput;

public class DemoEnum {
    Season seasons;

    public DemoEnum(Season seasons) {
        this.seasons = seasons;
    }

    public void ShowSeason() {
        switch (seasons) {
            case AUTUMN:
                System.out.println("Осень");
                break;

            case SPRING:
                System.out.println("Весна");
                break;

            case SUMMER:
                System.out.println("Лето");
                break;

            case WINTER:
                System.out.println();
                break;
        }
    }

    public void showAllSeasons() {
        for (Seasons season : Seasons.values()) {
            System.out.println(season + ": " + season.getDescription() + " " + season.getDescription());
        }
    }

    public static void main(String[] args) {
        Seasons season;
        season = Seasons.AUTUMN;
        System.out.println(season);

        DemoEnum demoEnum = new DemoEnum(Season.AUTUMN);
        demoEnum.ShowSeason();

        System.out.println(Seasons.WINTER.getDescription());

        demoEnum.showAllSeasons();



    }

    }
