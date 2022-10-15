public class Main {
    public static void main(String[] args) {

   //задание 1
   System.out.println("Задание 1!");
   int age = 13;
   if (age >= 18) {System.out.println("Поздравляем Вас с совершеннолетием!");}
   else { if (age < 18) System.out.println("Вы еще не достигли совершеннолетия!");}

   //задание 2
   System.out.println("Задание 2!");
   int age1 = 36;
   if (age1 >= 7 && age1 < 18) {System.out.println("Ребёнок ходит в школу!");}
   else { if (age1 >= 18 && age1 < 24) System.out.println("Человек уже закончил школу и может отправляться в университет!");
   else  {System.out.println("Человек закончил университет университет и ему пора искать работу!");}}

   //задание 3
   System.out.println("Задание 3!");
   int people = 103;
   if (people < 60) {System.out.println("Есть сидячие места!");}
   else { if (people < 102) System.out.println("Есть только стояниче места!");
   else System.out.println("МЕСТ НЕТ!");}

   //задание 4
   System.out.println("Задание 4!");
   int age2 = 9;
   boolean school = age2 >= 7 && age2 < 18;
   boolean university = age2 >= 18 && age2 < 24;
   if (age2 >= 2 && age2 <= 6) {System.out.println("Если возвраст человека равен " +age2+ " лет (года), то ему нужно ходить в детский сад!");}
   else { if (school) System.out.println("Если возвраст человека равен " +age2+ " лет, то ему нужно ходить в школу!");
   else { if (university) System.out.println("Если возвраст человека равен " +age2+ " лет, то он ходит в университет!");
   else {System.out.println("Если возвраст человека равен " +age2+ " лет, то он закончил университет и ему пора искать работу!");}}}

   //задание 5
   System.out.println("Задание 5!");
   int age3 = 13;
   if (age3 < 5) {System.out.println("Ребенку меньше 5 лет, он не может кататься на аттракционах!");}
   else { if (age3 >= 5 && age3 < 14) System.out.println("Ребенку можно кататься на аттракционах, но с сопровождением взрослого!");
   else {System.out.println("Ребенку можно кататься на аттракционах без сопровождения взрослого!");}}

   //задание 6
   System.out.println("Задание 6!");
   int one = 4353453;
   int two = 123123123;
   int three = 879347887;
   if (one>two && one>three) {
      System.out.println(one);
   } else if (two>one && two>three){
      System.out.println(two);
   } else if (three>one && three>two) {
      System.out.println(three);
   }

    }
}