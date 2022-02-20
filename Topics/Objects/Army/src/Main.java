class Army {

    public static void createArmy() {
        // Create all objects here
        Unit unit1 = new Unit("Elvedin");
        Unit unit2 = new Unit("Amar");
        Unit unit3 = new Unit("Smajlo");
        Unit unit4 = new Unit("Alen");
        Unit unit5 = new Unit("Aljo");

        Knight knight1 = new Knight("Kristian");
        Knight knight2 = new Knight("Weldin");
        Knight knight3 = new Knight("Minty");

        General generale = new General("Marco");

        Doctor doca = new Doctor("Mirso");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}