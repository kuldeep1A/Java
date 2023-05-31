public class Main8 {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkTodo(true);
        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.setKitchenState(true, true, true);

        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
//        kitchen.doKitchenWork();
    }
}
