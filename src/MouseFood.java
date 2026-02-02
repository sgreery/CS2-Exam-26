public class MouseFood {
    private int servings;
    private int smellFactor;
    public MouseFood(int servings, int smellFactor){
        this.servings=servings;
        this.smellFactor=smellFactor;
    }
    public int getServings(){
        return servings;
    }
    public int getSmellFactor(){
        return smellFactor;
    }
    public void setServings(){
        this.servings=servings;
    }
    public void setSmellFactor(){
        this.smellFactor=smellFactor;
    }
    public void printInfo(){
        System.out.println("There are "+servings+" servings. The smell factor is "+smellFactor+".");
    }
}
