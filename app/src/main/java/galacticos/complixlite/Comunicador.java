package galacticos.complixlite;

/**
 * Created by NietoAll on 19/10/2017.
 */

public interface Comunicador {

    public void setValores(int fragment,int idSegment, double datos, double datos2);
    public double getValorReal(int fragment,int segmn);
    public double getValorImagi(int fragment,int segmn);

}
