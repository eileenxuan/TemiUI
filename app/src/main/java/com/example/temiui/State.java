package com.example.temiui;

import java.util.ArrayList;

public class State {
    public String stateName;
    public String time;
    public ArrayList<String> blocks;

    public State (){

    }

    public State(String stateName, String time, ArrayList<String> blocks){
        this.stateName = stateName;
        this.time = time;
        this.blocks = blocks;
    }

    public String getStateName() {
        return stateName;
    }

    public String getTime() {
        return time;
    }

    public ArrayList<String> getBlocks(){
        return blocks;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setBlocks(ArrayList<String> blocks) {
        this.blocks = blocks;
    }
}
