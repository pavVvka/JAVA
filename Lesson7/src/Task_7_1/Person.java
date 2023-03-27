package Task_7_1;// Задача №1
//
//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName,
// метод возвращает имя с префиксом “Mr. ” если пол указан
// как мужской и префикс “Mrs. ” если женский.

public class Person {
    String name;
    int age;
    String gender;

    String getName(){
        String firstLetter = "m";
        String g = gender.toLowerCase();
        if(name == null){
            return "no one";
        }
        if(g.indexOf("m") == 0){
            return "Mr. " + name;
        } else {return "Mrs. " + name;}

}}
