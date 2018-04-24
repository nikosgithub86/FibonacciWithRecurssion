package fibonacciwithrecursion;
public class FibNumbers {
private int n1=0;
private int n2 =1;
private int n3;
private int count;

    public FibNumbers() {
    }

  
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


public void printNumbers(int count){
    if(count>0){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.println(""+n3);
        printNumbers( count - 1);
    }
}

}
