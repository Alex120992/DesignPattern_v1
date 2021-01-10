package deputypattern;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {


    }
    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
