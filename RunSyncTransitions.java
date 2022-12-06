public class RunSyncTransitions {

    public static void main(String args[]) {

	String[] transitions = {"X", "Y", "Z"};

       	Controller c = new Controller(transitions);

	for(String transition : transitions) {
	    new SyncTransition(transition, c).start();
	}
    }
}
