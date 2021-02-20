package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class KeyBoardInput implements KeyListener {
    private final Map<Integer, Boolean> currentStates = new ConcurrentHashMap<Integer, Boolean>();

    public KeyBoardInput() {
        currentStates.put(KeyEvent.VK_W, false);
        currentStates.put(KeyEvent.VK_A, false);
        currentStates.put(KeyEvent.VK_S, false);
        currentStates.put(KeyEvent.VK_D, false);
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
        return currentStates.put(keyCode, false);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (currentStates.containsKey(keyEvent.getKeyCode())) {
            currentStates.put(keyEvent.getKeyCode(), true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

