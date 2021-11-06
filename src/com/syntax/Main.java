package com.syntax;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.Sun = 1;
        andromeda.planet = 2;
        andromeda.moon = 4;

        featureSun mikesun = new featureSun();
        mikesun.color = "Red";
        mikesun.heat = "611115158812132";
        mikesun.temp = "60000016518484132";
        mikesun.radius = "9000000000000km";
        mikesun.maritalStatus = "in love with Asghar";
    }
}
