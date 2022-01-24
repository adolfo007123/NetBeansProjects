package Modelos;
// Generated 07-dic-2021 2:23:47 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private String dnicif;
     private String nombrecli;
     private Set estadisticasClienteses = new HashSet(0);
     private Set facturasCabs = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(String dnicif, String nombrecli) {
        this.dnicif = dnicif;
        this.nombrecli = nombrecli;
    }
    public Clientes(String dnicif, String nombrecli, Set estadisticasClienteses, Set facturasCabs) {
       this.dnicif = dnicif;
       this.nombrecli = nombrecli;
       this.estadisticasClienteses = estadisticasClienteses;
       this.facturasCabs = facturasCabs;
    }

    @Override
    public String toString() {
        return "Clientes{" + "dnicif=" + dnicif + ", nombrecli=" + nombrecli + '}';
    }
   
    
    
    public String getDnicif() {
        return this.dnicif;
    }
    
    public void setDnicif(String dnicif) {
        this.dnicif = dnicif;
    }
    public String getNombrecli() {
        return this.nombrecli;
    }
    
    public void setNombrecli(String nombrecli) {
        this.nombrecli = nombrecli;
    }
    public Set getEstadisticasClienteses() {
        return this.estadisticasClienteses;
    }
    
    public void setEstadisticasClienteses(Set estadisticasClienteses) {
        this.estadisticasClienteses = estadisticasClienteses;
    }
    
    public void addEstadisticasClientes(EstadisticasClientes esta){
        this.estadisticasClienteses.add(esta);
    }
    
    public ArrayList getListEstadisticasClientes(){
        ArrayList<EstadisticasClientes> lista = new ArrayList<>(this.estadisticasClienteses);
        return lista;
    }
    
    public Set getFacturasCabs() {
        return this.facturasCabs;
    }
    
    public void setFacturasCabs(Set facturasCabs) {
        this.facturasCabs = facturasCabs;
    }

    public void addFacturasCabs(FacturasCab factura){
        this.facturasCabs.add(factura);
    }
    
    public ArrayList getListFacturasCabs(){
        ArrayList<FacturasCab> lista = new ArrayList<>(this.facturasCabs);
        return lista;
    }

}


