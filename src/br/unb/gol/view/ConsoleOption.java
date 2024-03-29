/**
 * Game of Life
 * @author zidenis
 * @author jeffvfa
 * @author tbfreitas
 * @version 1.0
 * @since dec/2014
*/
package br.unb.gol.view;

/**
 * Console UI component
 * @version 1.0
 * @author zidenis
 * @author jeffvfa
 * @author tbfreitas
 */
public enum ConsoleOption {
    
    CREATE_CELL(1, "Create Cell"),
    PLAY(2, "Play"),
    NEXT_GENERATION(3, "Next Generation"),
    CLEAR(4, "Clear"),
    RESET(5, "Reset");

    private final int value;
    private final String label;

    ConsoleOption(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return label;
    }
    
    public static ConsoleOption fromValue(int i) {
        for (ConsoleOption option: ConsoleOption.values()) {
            if (option.getValue() == i) {
                return option;   
            }
        }
        return null;
    }
}
