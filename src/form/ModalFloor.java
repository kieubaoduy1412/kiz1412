/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author zcmgyu
 */
public class ModalFloor {
    private int id;
    private String floor;;
    
    public ModalFloor() {
    }
    public ModalFloor(int id, String floor) {
        this.id = id;
        this.floor = floor;
    }
    @Override
    public String toString() {
        return floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    

}
