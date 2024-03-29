/**
 * Game of Life
 * @author zidenis
 * @author jeffvfa
 * @author tbfreitas
 * @version 1.0
 * @since dec/2014
*/
package br.unb.gol.model;

/**
 * Game Statistics
 * @version 2.0
 * @author rbonifacio (v1)
 * @author zidenis (v2)
 */
public class Statistics {

    private int createdCells;
    private int generatedCells;
    private int killedCells;
    private int alivedCells;
    private int numOfGenerations;

    public Statistics() {
        createdCells = 0;
        generatedCells = 0;
        killedCells = 0;
        alivedCells = 0;
        numOfGenerations = 0;
    }

    public Statistics(int createdCells, int generatedCells, int killedCells, int alivedCells, int generations) {
        this.createdCells = createdCells;
        this.generatedCells = generatedCells;
        this.killedCells = killedCells;
        this.alivedCells = alivedCells;
        this.numOfGenerations = generations;
    }

    public int getCreatedCells() {
        return createdCells;
    }

    protected void incCreatedCells() {
        createdCells++;
        alivedCells++;
    }
    
    public int getGeneratedCells() {
        return generatedCells;
    }

    protected void incGeneratedCells() {
        generatedCells++;
        alivedCells++;
    }

    public int getKilledCells() {
        return killedCells;
    }

    protected void incKilledCells() {
        killedCells++;
        alivedCells--;
    }

    /**
     * Retorna o numero de celulas vivas no ambiente.
     * @return numero de celulas vivas.
     */
    public int getAlivedCells() {
        return alivedCells;
    }

    public int getNumOfGenerations() {
        return numOfGenerations;
    }
    
    protected void incNumOfGenerations() {
        numOfGenerations++;
    }
}
