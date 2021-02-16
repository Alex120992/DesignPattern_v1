package boilerplate_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class СoffeeHook extends CaffeineBeverageWithHook {

    @Override
    protected void addCondiments() {
        System.out.println("Milk");
    }

    @Override
    protected void brew() {
        System.out.println("filter");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) return true;
        else return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like addition (y/n)");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = r.readLine();
        } catch (IOException e) {
            return "no";
        }
        return answer;
    }
}
