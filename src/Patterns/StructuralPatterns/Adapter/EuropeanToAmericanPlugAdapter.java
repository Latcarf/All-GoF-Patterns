package Patterns.StructuralPatterns.Adapter;

public class EuropeanToAmericanPlugAdapter extends AmericanPlug {
    private EuropeanPlug europeanPlug;

    public EuropeanToAmericanPlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void insertIntoAmericanSocket() {
        europeanPlug.insertIntoEuropeanSocket();
        System.out.println("Using an adapter, the plug is adapted to an American socket.");
    }
}
