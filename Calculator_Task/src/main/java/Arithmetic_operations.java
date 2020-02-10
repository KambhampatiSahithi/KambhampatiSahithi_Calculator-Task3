public abstract class Arithmetic_operations
{
    public double num1;
    public double num2;
    public double res;
    void display(double res) {}
    double evaluation(double num1,double num2){return 0;};
}
//SOLID - override , single response for each class.
//YAGNI - implement abstract.
//DRY   - implement inheritance.
//KISS  - use simple loops.
class  addition extends Arithmetic_operations
{
    @Override
    public void display(double res) {
        System.out.println(res);
    }
    @Override
    public double evaluation(double num1,double num2) {
        return (num1+num2);
    }
}
class  substraction extends addition
{
    @Override
    public double evaluation(double num1,double num2) {
        return (num1-num2);
    }
}
class  multiplication extends addition
{
    @Override
    public double evaluation(double num1,double num2) {
        return (num1*num2);
    }
}
class  division extends addition
{
    @Override
    public double evaluation(double num1,double num2) {
        return (num1/num2);
    }
}








