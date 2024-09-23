public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 4;
        int intProduct = 8;
        int intDifference = 16;
        int intQuotient = 32;
        int intModulo = 64;

        double doubleOperandA = 1.1;
        double doubleOperandB = 1.2;
        double doubleSum = 1.3;
        double doubleProduct = 1.4;
        double doubleDifference = 1.5;
        double doubleQuotient = 1.6;

        intSum = intOperandA+intOperandB;
        intProduct = intOperandA*intOperandB;
        intDifference = intOperandA-intOperandB;
        intQuotient = intOperandA/intOperandB;
        intModulo = intOperandA%intOperandB;

        System.out.println("The sum of "+intOperandA+" + "+intOperandB+" is "+intSum);
        System.out.println("The product of "+intOperandA+" * "+intOperandB+" is "+intProduct);
        System.out.println("The difference of "+intOperandA+" - "+intOperandB+" is "+intDifference);
        System.out.println("The quotient of "+intOperandA+" / "+intOperandB+" is "+intQuotient+" and the remainder is "+intModulo);

        doubleSum = doubleOperandA+doubleOperandB;
        doubleProduct = doubleOperandA*doubleOperandB;
        doubleDifference = doubleOperandA-doubleOperandB;
        doubleQuotient = doubleOperandA/doubleOperandB;

        System.out.println("");
        System.out.println("The sum of "+doubleOperandA+" + "+doubleOperandB+" is "+doubleSum);
        System.out.println("The product of "+doubleOperandA+" * "+doubleOperandB+" is "+doubleProduct);
        System.out.println("The difference of "+doubleOperandA+" - "+doubleOperandB+" is "+doubleDifference);
        System.out.println("The quotient of "+doubleOperandA+" / "+doubleOperandB+" is "+doubleQuotient);
    }

}