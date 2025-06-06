package ar.info.unlp.arboles;

public class ArbolBinario {
    private int valor;
    private ArbolBinario hijoIzquierdo;
    private ArbolBinario hijoDerecho;

    public ArbolBinario(int valor) {
        this.valor = valor;
        this.hijoIzquierdo = new ArbolBinarioNulo();
        this.hijoDerecho = new ArbolBinarioNulo();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArbolBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(ArbolBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public ArbolBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDerecha(ArbolBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public String recorrerPreorden() {

        return valor + " - " + this.getHijoIzquierdo().recorrerPreorden() + this.getHijoDerecho().recorrerPreorden();
    }

    public String recorrerInorden() {
        return this.getHijoIzquierdo().recorrerInorden() + valor + " - " + this.getHijoDerecho().recorrerInorden();
    }

    public String recorrerPostorden() {
        return this.getHijoIzquierdo().recorrerPostorden() + this.getHijoDerecho().recorrerPostorden() + valor + " - ";
    }

}
