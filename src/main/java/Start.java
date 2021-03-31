/*
* Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
* Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
* Метод makeNoise, например, может выводить на консоль "Такое-то животное мурчит".
* Dog, Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse,
* характеризующие только этих животных.
* Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
* Пусть этот метод распечатывает food и location пришедшего на прием животного.
* В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
* В цикле отправляйте их на прием к ветеринару.
* 8) Вызвать из конструктора с тремя параметрами конструктор с двумя // думается мне, что опечатка?
* */

public class Start {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Мясо", "в будке");
        animals[1] = new Cat("Рыба","на коленках");
        animals[2] = new Horse("Овёс", "в стойле");

        for(Animal a : animals) {
            new Veterinarian().treatAnimal(a);
        }
    }
}
