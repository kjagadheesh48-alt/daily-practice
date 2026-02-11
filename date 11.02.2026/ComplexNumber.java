class ComplexNumber{
    int real,image;
    public ComplexNumber(int r,int i){
        this.real = r;
        this.image= i;
    }
    public void display(){
        System.out.println(this.real + " + i" + this.image);
    }
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }
    public static void main(String args[]){
        ComplexNumber  c1 = new ComplexNumber(3,4);
        ComplexNumber  c2 = new ComplexNumber(5,6);

        System.out.print("First complex number: ");
        c1.display();
        System.out.print("Second complex number: ");
        c2.display();
        ComplexNumber res = ComplexNumber.add(c1,c2);
        System.out.print("Sum of complex number: ");
        res.display();
    }
}