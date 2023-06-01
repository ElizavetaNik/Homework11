package homework1;


public class Main {
    public static void main(String[] args) {

//        1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.

        // Product -> HotDrink -> HotTea, HotCoffee, HotChocolate

//        2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
//          и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//          выдающий продукт соответствующий имени, объёму и температуре

//        3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
//          и воспроизвести логику, заложенную в программе

//        4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

        HotDrink hotTeaSmall = new HotTea("Tee", 50, 300, 90);
        HotDrink hotCoffeeMedium = new HotCoffee("Maccoffee", 147, 300, 90);
        HotDrink hotChocolateLarge = new HotChocolate("Моджиана", 350, 300, 90);

        VendingMachine hotDrinksVending = new HotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Tee"));
        System.out.println(hotDrinksVending.getProduct("Maccoffee"));
        System.out.println(hotDrinksVending.getProduct("Моджиана", 300, 90));
    }
}