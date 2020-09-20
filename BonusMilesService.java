package BonusMilesService;

public class BonusMilesService {
    public int calculate(int cost) {
        int spentRubles = 20;
        int accrualMiles = 1;
        int price = 10_000;
        int miles = price / spentRubles * accrualMiles;
        {
            return miles;
        }
    }
}