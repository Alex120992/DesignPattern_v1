package deputypattern;

import java.rmi.Naming;

public class MachineTest {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachineRemote = new GumbalMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
