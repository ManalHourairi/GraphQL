package ma.projet.graph.entities;

import ma.projet.graph.entities.Compte;
import ma.projet.graph.entities.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = {Compte.class})
public interface CompteProjection2 {
    public double getSolde();
    public TypeCompte getType();
}