public class SyncTransition extends Transition implements Runnable {

    // constructor

    public SyncTransition(String t, Controller c) {

	super(t, c);
    }

    public void run() {

	synchronized(controller) {

	    controller.inorder(transition);
	}
    }
}
