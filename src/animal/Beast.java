package animal;

public class Beast {
    public static void main(String[] args) {
         class Animal {
            // Метод, который могут переопределить подклассы
            public void makeSound() {
                System.out.println("Some generic animal sound");
            }
        }

        class Dog extends Animal {
            // Переопределение метода makeSound базового класса
            @Override
            public void makeSound() {
                System.out.println("Woof woof");
            }
        }

         class Main {
            public void main(String[] args) {
                Animal myDog = new Dog();
                myDog.makeSound(); // Выведет "Woof woof" благодаря переопределению
            }
        }
    }
}
