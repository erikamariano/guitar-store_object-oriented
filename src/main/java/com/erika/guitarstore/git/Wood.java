package com.erika.guitarstore.git;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, ALDER, CEDAR, MAPLE;
    
    public String toString(){
        switch(this){
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
            case ALDER: return "Alder";
            case CEDAR: return "Cedar";
            case MAPLE: return "Maple";
            default: return "None of these woods";
        }
    }
}
