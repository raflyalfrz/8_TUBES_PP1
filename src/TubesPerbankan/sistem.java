package TubesPerbankan;

public class sistem {
    private cabang vertexList[];
    private int adjMat[][];
    private int nVerts;
    
    public sistem(int maxVerts) {
        vertexList = new cabang[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;
        
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }
    
    public void addVertex(String lab) {
        vertexList[nVerts++] = new cabang(lab);
    }
    
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void displayAdjacencyMatrix() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void displayVertices() {
        for (int i = 0; i < nVerts; i++) {
            System.out.println((i + 1) + ": " + vertexList[i].getLabel());
        }
    }

    public int getNVerts() {
        return nVerts;
    }

    public int[][] getAdjMat() {
        return adjMat;
    }

    public void setAdjMat(int[][] adjMat) {
        this.adjMat = adjMat;
    }
}