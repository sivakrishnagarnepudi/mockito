package electricitybill;

public class ElectracityBill {

        int previousUnits;
        int currentUnits;




    public ElectracityBill(int previousUnits, int currentUnits) {
        this.previousUnits = previousUnits;
        this.currentUnits = currentUnits;
    }
    public int calculateBill(){
        int unitsConsumed = currentUnits - previousUnits;
        int billAmount = 0;
        if (unitsConsumed < 100) {

            billAmount = unitsConsumed * 2;
        } else if (unitsConsumed < 150) {

            billAmount = 100 * 2 + (unitsConsumed - 100) * 3;
        } else {

            billAmount = 100 * 2 + 50 * 3 + (unitsConsumed - 150) * 4;
        }

        return billAmount;

    }

    @Override
    public String toString() {
        return "ElectracityBill{" +
                "previousUnits=" + previousUnits +
                ", currentUnits=" + currentUnits +
                '}';
    }
}
