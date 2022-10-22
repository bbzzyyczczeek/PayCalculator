public class Loop {

    public  static void loop(){
        System.out.println("Podaj liczbe przepracowanych godzin w tym miesiacu");
        double hour=CalcApp.sc.nextDouble();
        System.out.println("Podaj stawke godzinowa");
        double hourlyRate=CalcApp.sc.nextDouble();
        System.out.println("Podaj stawke godzinowa");
        ContractType contractType ;
       contractType=ContractType.createInt(CalcApp.sc.nextInt());


            switch (contractType){

                case UMOWA_O_PRACE :
                    Calc.payCalculator();
            }
        }

    private static void printContractType(){
        for (ContractType typ:ContractType.values()
             ) {
            System.out.println(typ);

        }
    }
}
