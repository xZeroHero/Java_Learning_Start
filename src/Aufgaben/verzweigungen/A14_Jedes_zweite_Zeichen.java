package aufgaben.verzweigungen;

import java.io.OutputStream;

public class A14_Jedes_zweite_Zeichen {

    public static void main(String[] args) {

        String s = "mgajyk rtth eu isoopu racyev nbzet twqi tfhc eyaowue";
        String output = "";

        for (int i = 0; i < s.length(); i += 2){
            output += s.charAt(i);
        }

        System.out.println(output);

    }

}
