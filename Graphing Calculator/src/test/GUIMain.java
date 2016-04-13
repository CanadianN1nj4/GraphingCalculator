package test;

public class GUIMain {

	public static Thread guiThread;
	
    public static void main(String[] args) {
        
        guiThread = new Thread(new GUIThread());
        guiThread.start();
}
}
