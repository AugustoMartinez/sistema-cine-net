package cine;

public enum Clasificacion {
    G("G","Apta para todo publico"), PG("PG","Sugiere la compañia de un adulto para los menores de 10 años"),
    PG13("PG-13","Sugiere la compañía de un adulto para los menores de 13 años"),R("R", "Restringido a menores de 17 años si no es con la compañía de un adulto"),
    NC17("NC-17","Contenido sólo para mayores de 18 años");

    private String descripcion;
    private String nombre;

    Clasificacion(String nombre, String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
