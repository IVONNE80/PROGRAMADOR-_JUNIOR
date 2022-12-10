
import calculator.PoliceListen;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PoliceListen policeListen = new PoliceListen();
        Win win = new Win();
        win.setComputerListener(policeListen);
    }
}