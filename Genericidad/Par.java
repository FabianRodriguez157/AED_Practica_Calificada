package Genericidad;

public class Par<A, B> {
    private A primerElemento;  
    private B segundoElemento; 

    public Par(A primerElemento, B segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    public A getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(A primerElemento) {
        this.primerElemento = primerElemento;
    }

    public B getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(B segundoElemento) {
        this.segundoElemento = segundoElemento;
    }

    @Override
    public String toString() {
        return "(" + primerElemento + ", " + segundoElemento + ")";
    }
}