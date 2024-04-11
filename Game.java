import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game{

  // String newGame = "да";
  // String out = "нет";
  boolean input = "да";


// 1. Делаем выбор
  
  public boolean action(boolean input){
    if(input = true){
      System.out.println("Новая игра");
    } else{
      System.out.println("Выход из игры");
    }
  }


  // 2. Делаем список слов
  
  List<String> listWords = new ArrayList<>();
        listWords.add("человек");
        listWords.add("день");
        listWords.add("место");
        // Добавьте остальные слова в список
 //List<String> list = List.of("элемент1", "элемент2", "элемент3", "элемент4", "элемент5");

// 3. Делаем рандомную выборку

Random random = new Random();
//Strig randomWord = listWords.get(random.nextInt(list.size()));

int randomIndex = random.nextInt(myList.size());  // Случайный индекс элемента в списке
        int randomElement = myList.get(randomIndex);  // Случайный элемент

// 4. "сохраняем" выбранное слово, которое будем разгадывать 
// Преобазуем слово по букве и записывам в массив:

List<Integer> wordsArray = new ArrayList<>();  // Пустой массив для записи элементов
 for (int i = 0; i < randomElementString.length(); i++) {
            int digit = Character.digit(randomElementString.charAt(i), 10);
            myArray.add(digit);
        }

//5. "Введите букву" - начинаем считывать то, что вводит человек

Scanner scanner = new Scanner (System.in);
System.out.print("Введите букву: ");
String input = scanner.nextLine();  // Считываем строку с консоли
// int value = scanner.nextInt();

// 6. Сравниваем значения
// if (array[index] == value) {
//             System.out.println("Элемент под индексом " + index + " равен " + value);
//         } else {
//             System.out.println("Элемент под индексом " + index + " не равен " + value);
//         }

 boolean found = false;  // Флаг для отслеживания нахождения значения в массиве

for(i > 0; i < array.length, i++){
  if (array[i] == value){
    foung = true;
    break;
  }
}

if(found){
  System.out.println("Буква найдена верно " + input);
} else{
  System.out.println("Ошибка");
}



// ИНФО:
// Сделать рандомную выборку слова при "новой игре"

        // // Примеры операций со списком
        // System.out.println(words.get(0)); // Выводит первое слово в списке
        // System.out.println(words.size()); // Выводит размер списка (количество слов)

        // Другие операции, такие как удаление элементов, обновление и т.д., также доступны для списка.

        // // Вывод всех слов в списке
        // for (String word : words) {
        //     System.out.println(word);
        // }
  
  
}
