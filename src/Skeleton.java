public class Skeleton extends Boss{
    int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }
    public String info(){
        return super.printinfo() + " Arrows: " + this.arrow;
    }
}
