public class Hoegaarden extends Beer {

    String  flaver;
    int ABV = 6;

    Hoegaarden(String model, String flaver){
            super("밀맥주", model);
            this. model = model;
            this.flaver = flaver;
    }
    Hoegaarden(String model, String flaver, int ABV){
        super("밀맥주", model);
        this.model = model;
        this.flaver = flaver;
        this.ABV = ABV;
    }

    public void flaverdrink(){
        System.out.println(model + "맥주의" + flaver + "맛을 마십니다");
    }
    public String getFlaver(){
        return flaver;
    }
    public int getABV(){
        return ABV;
    }
}
