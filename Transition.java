public class Transition implements Runnable {

    // attributes

    protected String transition;
    protected Thread thread;
    protected Controller controller;
    
    // constructor

    public Transition(String t, Controller c) {

	transition = t;
	controller = c;
    }

    // methods

    public void start() {

	thread = new Thread(this);
	thread.start(); // start the thread
    }

    public void run() {

	controller.unsync(transition);
    }
}
