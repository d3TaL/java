import static java.lang.Math.min;

public class Matrix {
    protected int n, m;
    protected float[][] matr;
    Matrix (float[][] matr, int n, int m){
        this.n = n;
        this.m = m;
        this.matr = matr;
        }

    public float[][] plus(float[][] matr, int n, int m){
        for (int i = 0; i < min(n, this.n); i++){
            for (int j = 0; j < min(m, this.m); j++){
                this.matr[i][j] += matr[i][j];
            }
        }
        return this.matr;
    }
    public float[][] multiplication(int p){
        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.m; j++){
                this.matr[i][j] *= p;
            }
        }
        return this.matr;
    }
    @Override
    public String toString(){
        String Matr = "Matrix:\n";
        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.m; j++){
                Matr+= " " + Float.toString(matr[i][j]);
            }
            Matr+='\n';
        }
        return Matr;
    }
}
