public class House {
    public String message = "A7#q 9mA$%2mn!!8my@4mt^6mh&1mi*3mn(0mgZ9m 4wfymt@7mh# 5ma$2mt!8m mmma%3mk^4me&6ms*1m Q12mm &2-me#7m mc$9mu!5mt@8m 6hM.mt^4mh&6me *3m R7mc@2mh#9me$5me!832ms^4me&6m.";
    MouseFood[] mousePantry = new MouseFood[18];
    public static void main(String[] args) {
        House app = new House();

    }
    public House(){
        System.out.println("Hello, mouse! Get out of my house!");
        for(int x=0;x<mousePantry.length;x++){
            mousePantry[x]=new MouseFood((int)(Math.random()*200+1),(int)(Math.random()*491+10));
        }
        displayMousePantry();
        checkServings();
        System.out.println("It is "+checkServings()+" that at least two servings values in the mousePantry are equal.");
        decipher(message);
        System.out.println("Deciphered message: "+decipher(message));
        makeSmells();
        displayMousePantry();

    }
    public void displayMousePantry(){
        for(int x=0;x< mousePantry.length;x++){
            mousePantry[x].printInfo();
        }
    }
    public boolean checkServings(){
        boolean check = false;
        for(int x=0;x<mousePantry.length;x++){
            for(int y=0;y< mousePantry.length;y++){
                if(y!=x && mousePantry[y].getServings()==mousePantry[x].getServings()){
                    check = true;
                }
            }
        }
        return check;
    }
    public String decipher(String coded){
        int index = 0;
        String decoded = "";
        while (index < coded.length()-1){
            coded.charAt(index);
            if (coded.charAt(index)=='m'){

                decoded+=coded.charAt(index+1);
            }
            index++;
        }

        return decoded;

    }
    public void makeSmells(){
        for(int x=1; x<mousePantry.length;x++){
            while(mousePantry[x].getSmellFactor()==mousePantry[x-1].getSmellFactor()){
                mousePantry[x]=new MouseFood(mousePantry[x].getServings(),(int)Math.random()*491+10);
            }
        }
    }
}
