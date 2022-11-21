public class Main {
    public static void main(String[] args) {
        String phoneNumber = "-978-876 48-36";
        phoneNumber = phoneNumber.replace("-", ""); //replace заменяет в строке символы
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("+", "");
        if (phoneNumber.length() == 10) {
            phoneNumber = "7" + phoneNumber;
        } else if (phoneNumber.length() > 11) {
            throw new RuntimeException("Phone number is too long."); //стоп программы, бросает ошибку
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Phone number is too short.");
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') { // метод .charAt() позволяет обратиться к строке как к массиву в элементном разрезе; одинарные кавычки при сравнении обязательны - сравнение только одного символа
            throw new RuntimeException("Not out of current country.");
        }
        System.out.println("phone = " + phoneNumber);
        String expectedPhoneNumber = "79788764836";
        if (phoneNumber.equals(expectedPhoneNumber)) { //сравнение строк происходит с помощью метода .equals()
            System.out.println("Success.");
        } else {
            System.out.println("Fault.");
        }

        int[] arrays_0 = new int[7];

    }
}