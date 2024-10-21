class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro() {

        double pi = Math.PI;
        double perimetro = 2 * pi * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);

    }

    @Override
    public void calcularArea() {

        double pi = Math.PI;
        double area = pi * radio;
        System.out.println("El area del circulo es: + area");

    }
}
