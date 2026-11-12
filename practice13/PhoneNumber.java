package practice13;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number=number;
    }

    public String getFormattedNumber() {
        String code;
        String digits;

        if(number.startsWith("+")&&number.length()>=12) {
            code=number.substring(1,number.length()-10);
            digits=number.substring(number.length()-10);
        } else if(number.startsWith("8")&&number.length()==11) {
            code="7";
            digits=number.substring(1);
        } else {
            return "некорректный номер";
        }

        for(int i=0;i<number.length();i++) {
            char symbol=number.charAt(i);
            if(!Character.isDigit(symbol)&&!(i==0&&symbol=='+')) {
                return "некорректный номер";
            }
        }

        return "+"+code+digits.substring(0,3)+"-"+digits.substring(3,6)+"-"+digits.substring(6);
    }
}