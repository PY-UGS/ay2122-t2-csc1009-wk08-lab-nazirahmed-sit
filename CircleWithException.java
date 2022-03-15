public class CircleWithException{

    private static final double PI = Math.PI;
    private double radius;


    public CircleWithException(){
        this.radius = 0;

    }
    public CircleWithException(double radius){
        this.radius = radius;
    }


    public void setRadius(double radius) throws Exception{
        if(radius<0){
            this.radius = 0;
            throw new IllegalArgumentException("less than 0");
            
        }

        if(radius>1000){
            this.radius = 0;
            throw new Exception("More than 1000");
        }

        if(radius == 0){
            this.radius = 0;
            throw new Empty_string_exception("(Custom exception) input is 0 or empty"); //custom made

        }
        else{
            this.radius = radius;
        }
        

        
        
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.PI * this.radius*this.radius;
    }
    public double getPeri(){
        return 2*this.PI*this.radius;
    }
}
