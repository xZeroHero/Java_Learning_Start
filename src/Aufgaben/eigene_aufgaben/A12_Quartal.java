package aufgaben.eigene_aufgaben;

public class A12_Quartal {

    public static void main(String[] args) {

        String month = "dezember";
        String monthLowerCase = month.toLowerCase();
        int monthInt = 0;

        switch (monthLowerCase){
            case "januar":
                monthInt = 1;
                break;
            case "februar":
                monthInt = 2;
                break;
            case "märz":
                monthInt = 3;
                break;
            case "april":
                monthInt = 4;
                break;
            case "mai":
                monthInt = 5;
                break;
            case "juni":
                monthInt = 6;
                break;
            case "juli":
                monthInt = 7;
                break;
            case "august":
                monthInt = 8;
                break;
            case "september":
                monthInt = 9;
                break;
            case "oktober":
                monthInt = 10;
                break;
            case "november":
                monthInt = 11;
                break;
            case "dezember":
                monthInt = 12;
                break;
        }

        int output = (int) Math.ceil(monthInt / 3.0);
        System.out.println(output);

    }

}
