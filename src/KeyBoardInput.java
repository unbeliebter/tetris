import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class KeyBoardInput implements KeyListener {
    private final Map<Integer, Boolean> currentStates = new ConcurrentHashMap<Integer, Boolean>();

    public KeyBoardInput() {
        currentStates.put(KeyEvent.VK_W, Boolean.FALSE);
        currentStates.put(KeyEvent.VK_A, Boolean.FALSE);
        currentStates.put(KeyEvent.VK_S, Boolean.FALSE);
        currentStates.put(KeyEvent.VK_D, Boolean.FALSE);
    }

    public boolean left() {
        return keyDown(KeyEvent.VK_A);
    }

    public boolean right() {
        return keyDown(KeyEvent.VK_D);
    }

    public boolean drop() {
        return keyDown(KeyEvent.VK_S);
    }

    public boolean rotate() {
        return keyDown(KeyEvent.VK_W);
    }

    private boolean keyDown(int keyCode) {
        return currentStates.put(keyCode, Boolean.FALSE);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (currentStates.containsKey(keyEvent.getKeyCode())) {
            currentStates.put(keyEvent.getKeyCode(), Boolean.TRUE);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

