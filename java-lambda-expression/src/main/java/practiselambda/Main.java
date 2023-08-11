package practiselambda;

//Functional Interface = its Has only one Abstract method , by its default either userdefined..
//Use @FunctionalInterface annotation to Explicity we say..
// If the Interface has only method is called as FunctinalInterface and use with Lambda Expression
//Functonal Inteface has only Single Method
public class Main {
    public static void main(String[] args) {
        System.out.println("HIP HOP Zindabad!..");
//        HipHop hop = new HipHopImpl();
//        hop.rapper();
//        HipHop hop1 = new HipHop() {
//            @Override
//            public void rapper() {
//                System.out.println("This is First HIP HOP class..");
//            }
//        };
//        hop1.rapper();
//        HipHop hop2 = new HipHop() {
//            @Override
//            public void rapper() {
//                System.out.println("This is  Second HIP HOP Class..");
//            }
//        };
//        hop2.rapper();
        //Lambda only use for Functional Interface
        HipHop hop1 = () -> System.out.println("This is my First Lambda Expression..");
        hop1.rapper();
        HipHop hop2 = () -> System.out.println("This is my Second Lambda Expresson..");
        hop2.rapper();
        SumInter sumInter = (a, b) -> a + b;
        System.out.println(sumInter.sum(12, 13));
        System.out.println(sumInter.sum(67, 23));
        LengthInter lengthInter = str -> str.length();
        System.out.println("Length of the String is " + lengthInter.getLength("Chandrakant Jatav"));
    }
}


