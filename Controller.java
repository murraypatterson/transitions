import java.util.Random;

// a thread "controller"

public class Controller {

    // attributes

    private String[] transitions;
    private int i = 0;
    private Random generator;
    private int pause = 1000; // milliseconds

    // constructor

    public Controller(String[] ts) {

	transitions = ts;
	generator = new Random();
    }

    // methods

    public void unsync(String t) {

	try {
	    Thread.sleep(generator.nextInt(pause));
	}
	catch(Exception e) {}

	System.out.println(t);
    }

    public void inorder(String t) {

	while(t != transitions[i]) {

	    try {
		wait();
	    }
	    catch(Exception e) {}
	}

	unsync(t);
	i++; // advance index
	notifyAll();
    }
}
