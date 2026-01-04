class Solution {
    private int val;
    private String roman(int x){
        if(x>=1000){
            val=x-1000;
            return "M";
        }
        if (x>=900 && x<1000){
            val=x+100;
            return "C";
        }
        if (x>=500 && x<=899){
            val=x-500;
            return "D";
        }
        if (x>=400 && x<500){
            val=x+100;
            return "C";
        }
        if (x>=100 && x<=399){
            val=x-100;
            return "C";
        }
        if (x>=90 && x<100){
            val=x+10;
            return "X";
        }
        if (x>=50 && x <=89){
            val=x-50;
            return "L";
        }
        if (x>=40 && x<50){
            val=x+10;
            return "X";
        }
        if (x>=10 && x<40){
            val=x-10;
            return "X";
        }
        if (x==9){
            val=x+1;
            return "I";
        }
        if (x>=5 && x<9){
            val=x-5;
            return "V";
        }
        if (x==4){
            val=x+1;
            return "I";
        }
        if (x>=1 && x<=3){
            val=x-1;
            return "I";
        }
        return "";

    }
    
    public String intToRoman(int num) {
        StringBuilder sb= new StringBuilder ();
        val=num;
        while (val>0){
            sb.append(roman(val));

        }

        return sb.toString();
        
    }
}


