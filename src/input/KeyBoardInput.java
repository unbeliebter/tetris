package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class KeyBoardInput implements KeyListener {

    private static final byte MASK_PRESSED = 0x1;
    private static final byte MASK_MULTIPLE_TIMES = 0x2;

    private final Map<Integer, Byte> states = new HashMap<>();

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
        return states.containsKey(keyCode) && (states.get(keyCode) & MASK_PRESSED) != 0;
    }

    private boolean keyDownOnce(int keyCode) {
        return states.containsKey(keyCode) && (states.get(keyCode) & MASK_MULTIPLE_TIMES) == 0;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        states.compute(keyEvent.getKeyCode(), (key, currentValue) -> {
            if (currentValue == null) return MASK_PRESSED;

            byte value = currentValue;
            if ((value & MASK_PRESSED) != 0) {
                value |= MASK_MULTIPLE_TIMES;
            }

            value |= MASK_PRESSED;
            return value;
        });
    }

    @Override
    public void keyReleased(KeyEvent e) {
        states.remove(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}

