public class DerivativeCalc
{
    public double exponent1;
    public double exponent2;
    public double exponent3;
    public double coefficient1;
    public double coefficient2;
    public double coefficient3;
    public String operation;
    public String equation;
    public DerivativeCalc(double co1, double e1){
        coefficient1=co1;
        exponent1=e1;
        if(co1==1)
        equation = "x^"+e1;
        else
        equation = co1+"x^"+e1;
    }
        public String firstDerivOfOneTerm(double co1, double e1){
        double newCo = co1*e1;
        double newEx = e1-1;
        String firstDeriv;
        if(newEx==1 && newCo ==1)
        firstDeriv = "x";
        else if(newCo==1)
        firstDeriv = "x^"+newEx;
        else if(newEx==1)
        firstDeriv = newCo+"x";
        else
        firstDeriv = newCo+"x^"+newEx;
        return firstDeriv;
    }
    public DerivativeCalc(double co1, double co2, double e1, double e2, String o){
        coefficient1 = co1;
        coefficient2 = co2;
        exponent1 = e1;
        exponent2 = e2;
        operation = o;
        if(co1 == 1&&co2==1&&e1==1&&e2==1)
        equation="x"+o+"x";
        else if(co1==1&&co2==1&&e1==1)
        equation="x"+o+"x^"+e2;
        else if(co1==1&&e1==1&&e2==1)
        equation="x"+o+co2+"x";
        else if(co1==1&&co2==1)
        equation="x^"+e1+o+"x^"+e2;
        else if(co1==1&&e1==1)
        equation="x"+o+co2+"x^"+e2;
        else if(co1==1)
        equation="x^"+e1+o+co2+"x^"+e2;
        else if(e1==1&&e2==1)
        equation=co1+"x"+o+co2+"x";
        else if(e1==1)
        equation=co1+"x"+o+co2+"x^"+e2;
        else
        equation=co1+"x^"+e1+o+co2+"x^"+e2;
    }
    public String firstDerivOfTwoTerm(double co1, double co2, double e1, double e2, String o){
        double newCo1 = co1*e1;
        double newCo2 = co2*e2;
        double newE1 = e1-1;
        double newE2 = e2-1;
        String firstDeriv;
        //firstDeriv = newCo1+"x^"+newE1+o+newCo2+"x^"+newE2;
        if(newCo1 == 1&&newCo2==1&&newE1==1&&newE2==1)
        firstDeriv="x"+o+"x";
        else if(newCo1==1&&newCo2==1&&newE1==1)
        firstDeriv="x"+o+"x^"+newE2;
        else if(newCo1==1&&e1==1&&newE2==1)
        firstDeriv="x"+o+newCo2+"x";
        else if(newCo1==1&&newCo2==1)
        firstDeriv="x^"+newE1+o+"x^"+newE2;
        else if(newCo1==1&&newE1==1)
        firstDeriv="x"+o+newCo2+"x^"+newE2;
        else if(newCo1==1)
        firstDeriv="x^"+newE1+o+newCo2+"x^"+newE2;
        else if(newE1==1&&newE2==1)
        firstDeriv=newCo1+"x"+o+newCo2+"x";
        else if(newE1==1)
        firstDeriv=newCo1+"x"+o+newCo2+"x^"+newE2;
        else
        firstDeriv=newCo1+"x^"+newE1+o+newCo2+"x^"+newE2;
        return firstDeriv;
    }
    public static void main(String[] args){
        System.out.println("How many terms?");
        int numTerms=2;
        if(numTerms==1){
            DerivativeCalc oneterm = new DerivativeCalc(1,1.0/3);
            System.out.println(oneterm.equation);
            System.out.println(oneterm.firstDerivOfOneTerm(oneterm.coefficient1,oneterm.exponent1));
        }
        else if(numTerms==2){
            DerivativeCalc twoterm = new DerivativeCalc(1, 1, 1, 1,"+");
            if(twoterm.operation.equals("/")){
                //quotient rule
            }
            else if(twoterm.operation.equals("*")){
                //product rule
            }
            System.out.println(twoterm.equation);
            System.out.println(twoterm.firstDerivOfTwoTerm(twoterm.coefficient1,twoterm.coefficient2,twoterm.exponent1,twoterm.exponent2,twoterm.operation));
        }
    }
}
