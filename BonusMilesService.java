package BonusMilesService;

public class BonusMilesService {
    public int calculate(int cost) {
        int spentRubles = 20;
        int accrualMiles = 1;
        int miles = cost / spentRubles * accrualMiles;

            return miles;

    }
}