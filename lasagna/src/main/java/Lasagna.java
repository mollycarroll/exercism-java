public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int minutes) {
        return Lasagna.preparationTimeInMinutes(layers) + minutes;
    }
}