
public class Car {
    private String regNr = "";

    public Car() {
        regNr = "ABC123";
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }
public void printRandomPlatte (){
        int letter1 =65 + (int)(Math.random()* (90-65));
    int letter2 =65 + (int)(Math.random()* (90-65));
    int letter3 =65 + (int)(Math.random()* (90-65));

    int number1 = (int)(Math.random()* (10));
    int number2 = (int)(Math.random()* (10));
    int number3 = (int)(Math.random()* (10));
    setRegNr("" + (char)(letter1)+ ((char)(letter2)+ ((char)(letter3))+ "" + number1 + number2 +number3));
}

}


