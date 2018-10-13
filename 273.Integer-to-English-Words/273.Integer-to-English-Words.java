class Solution {
    private final String[] numBelowTen = new String[]{"","One","Two","Three","Four","Five",
                                         "Six","Seven","Eight","Nine"};
    private final String[] numBelowTwenty = new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen",
                                            "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] numBelowHundred = new String[]{"","Ten","Twenty","Thirty","Forty","Fifty",
                                             "Sixty","Seventy","Eighty","Ninety"};
    
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        else return toWords(num);
    }
    
    public String toWords(int num){
        if(num<10) return numBelowTen[num];
        else if(num<20) return numBelowTwenty[num-10];
        else if(num<100){
            String space = num % 10 > 0 ? " ":"";
            return numBelowHundred[num/10] + space + toWords(num%10);
        }
        else if(num<1000){
            String space = num % 100 > 0 ? " ":"";
            return toWords(num/100) + " Hundred" + space + toWords(num%100);
        }
        else if(num<1000000){
            String space = num % 1000 > 0 ? " ":"";
            return toWords(num/1000) + " Thousand"+ space + toWords(num%1000);
        }
        else if(num<1000000000){
            String space = num % 1000000 > 0 ? " ":"";
            return toWords(num/1000000) + " Million" + space + toWords(num%1000000);
        }
        else{
            String space = num % 1000000000 > 0 ? " ":"";
            return toWords(num/1000000000) + " Billion" + space + toWords(num%1000000000);
        }
    }
}