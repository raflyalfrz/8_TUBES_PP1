package TubesPerbankan;

public class cabang {
    private String label;
    private boolean wasVisited;
    
    public cabang(String lab) {
        label = lab;
        wasVisited = false;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
    
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
    
    public boolean getWasVisited() {
        return wasVisited;
    }
}