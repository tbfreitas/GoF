/**
 * Game of Life
 * @author zidenis
 * @author jeffvfa
 * @author tbfreitas
 * @version 1.0
 * @since dec/2014
*/
package br.unb.gol;

import br.unb.gol.controller.GameController;
import br.unb.gol.model.GameEngine;
import br.unb.gol.model.Statistics;
import br.unb.gol.view.GameViewConsole;
import br.unb.gol.view.GameViewSwing;

public class Main {
    public static final int GRID_WIDTH = 25;
    public static final int GRID_HEIGHT = 25;
    
    public static void main(String args[]) {
        GameController controller = new GameController(new GameEngine(GRID_HEIGHT, GRID_WIDTH, new Statistics()));
        controller.setView(new GameViewSwing(controller));
        controller.setView(new GameViewConsole(controller));
    }
}
