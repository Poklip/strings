public class Homework {
    public static void main(String[] args) {
        //Задача №1.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задача №2.
        System.out.println(fullName.toUpperCase());

        //Задача №3.
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace(" ", "; "));

        //Задача №4.
        String fullNameCourier = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullNameCourier.replace("ё", "е"));

        //Задача №4 со методами split и contains
        String[] fullNameCourierArr = fullNameCourier.split(" ");
        System.out.print("Данные ФИО сотрудника - ");
        for (String Name : fullNameCourierArr) {
            if (Name.contains("ё")) {
                Name = Name.replace("ё", "е");
            }
            System.out.print(Name + " ");
        }

        //Задача №5.
        int[] pointsArray = {0, 0, 0, 0};
        String[] fullNameArray = new String[3];
        pointsArray[1] = fullName.indexOf(' ');
        pointsArray[2] = fullName.lastIndexOf(' ');
        pointsArray[3] = fullName.length();
        for (int i = 0; i < 3; i ++) {
            fullNameArray[i] = fullName.substring(pointsArray[i], pointsArray[i + 1]);
        }
        firstName = fullNameArray[1];
        middleName = fullNameArray[2];
        lastName = fullNameArray[0];
        System.out.println("\nИмя сотрудника - " + firstName + "\nФамилия сотрудника - " + lastName + "\nОтчество сотрудника - " + middleName);

        //Задача №6.
        fullName = fullName.toLowerCase();
        fullNameArray = fullName.split(" ");
        for (int name = 0; name < fullNameArray.length; name ++) {
            String firstLetter = Character.toString(fullNameArray[name].charAt(0));
            fullNameArray[name] = firstLetter.toUpperCase() + fullNameArray[name].substring(1);
        }
        System.out.print("Верное написание Ф.И.О. сотрудника с заглавных букв - ");
        for (String name : fullNameArray) {
            System.out.print(name + " ");
        }

        //Задача №7.
        String sevenTask_0 = "135";
        String sevenTask_1 = "246";
        StringBuilder sevenTaskFinal = new StringBuilder(sevenTask_0);
        sevenTaskFinal.append(sevenTask_1);
        sevenTaskFinal.insert(1, sevenTaskFinal.charAt(3));
        sevenTaskFinal.deleteCharAt(4);
        sevenTaskFinal.insert(3, sevenTaskFinal.charAt(4));
        sevenTaskFinal.deleteCharAt(5);
        System.out.println("\n" + new String(sevenTaskFinal));

        //Задача №8.
        String letters = "aabccddefgghiijjkk";
        StringBuilder soMuchLetters = new StringBuilder();
        for (int letter = 0; letter < letters.length(); letter ++) {
            char currentLetter = letters.charAt(letter);
            if (letters.lastIndexOf(currentLetter) != letters.indexOf(currentLetter) && (new String(soMuchLetters).indexOf(currentLetter) == -1)) {
                soMuchLetters.append(currentLetter);
            }
        }
        System.out.println(new String(soMuchLetters));



    }
}
