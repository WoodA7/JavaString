package com.grosu;

public class Main {

    public static void main(String[] args) {

        String catName = "Marsik";
        catName += ".";  //or
        catName = catName.concat("."); // для всех методов класса string объект надо переназначить
        catName = catName.toUpperCase(); //в верхний регистр
        catName = catName.toLowerCase(); // в нижний регистр

        LoremIpsum li = new LoremIpsum("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        System.out.println(li.lengh());
        System.out.println(li.countOfWords());
        System.out.println(li.changeS());

        arrayOfString arr = new arrayOfString();
        arr.init();

    }

}