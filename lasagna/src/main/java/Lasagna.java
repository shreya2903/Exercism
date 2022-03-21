public class Lasagna {
    int min = 0;
    int remMin = 0;
    int prepMin =0;
    int totalMin = 0;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        min=40;
        return min;
    }
    public int remainingMinutesInOven(int n){
        min=40;
        remMin = min - n;
        return remMin;
    }
    public int preparationTimeInMinutes(int N){
        prepMin = N*2;
        return prepMin;
    }
    public int totalTimeInMinutes(int N, int n){
        totalMin = N*2 + n;
        return totalMin;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
