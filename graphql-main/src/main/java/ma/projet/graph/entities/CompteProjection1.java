package ma.projet.graph.entities;


import ma.projet.graph.entities.Compte;
import ma.projet.graph.entities.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = {Compte.class})
public interface CompteProjection1 {
    double getSolde();
}