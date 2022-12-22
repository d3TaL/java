import java.util.Objects;

public class Ball {
    private String color;
    private int diameter;
    private String structure;
    
    public Ball(String clr, int dim, String struct){
        color = clr;
        diameter = dim;
        structure = struct;
    }
    public Ball(String unknow, int dim){
        if (Objects.equals(unknow, "White") || Objects.equals(unknow, "Black") || Objects.equals(unknow, "Red") || Objects.equals(unknow, "Orange") || Objects.equals(unknow, "Yellow") || Objects.equals(unknow, "Green") || Objects.equals(unknow, "Blue") || Objects.equals(unknow, "Indigo") || Objects.equals(unknow, "Violet")){
            color = unknow;
            structure = "Rubber";
        } else {
            color = "White";
            structure = unknow;
        }
        diameter = dim;
    }
    public Ball(String clr, String struct){
        color = clr;
        diameter = 10;
        structure = struct;
    }
    public Ball(int dim){
        color = "White";
        diameter = dim;
        structure = "Rubber";
    }
    public Ball(String unknow){
        if (Objects.equals(unknow, "White") || Objects.equals(unknow, "Black") || Objects.equals(unknow, "Red") || Objects.equals(unknow, "Orange") || Objects.equals(unknow, "Yellow") || Objects.equals(unknow, "Green") || Objects.equals(unknow, "Blue") || Objects.equals(unknow, "Indigo") || Objects.equals(unknow, "Violet")){
        color = unknow;
        structure = "Rubber";
        }
        else {
            color = "White";
            structure = unknow;
        }
        diameter = 10;
    }
    public Ball(){
        color = "White";
        diameter = 10;
        structure = "Rubber";
    }
    public void setColor(String clr){
        color = clr;
    }
    public void setDiameter(int dim){
        diameter = dim;
    }
    public void setStructure(String struct){
        structure = struct;
    }
    public String getColor(){
        return color;
    }
    public int getDiameter(){
        return diameter;
    }
    public String getStructure(){
        return structure;
    }
    public String toString(){
        return "Color "+ this.color + ", Diameter " + this.diameter + ", Structure "+this.structure;
    }
}
