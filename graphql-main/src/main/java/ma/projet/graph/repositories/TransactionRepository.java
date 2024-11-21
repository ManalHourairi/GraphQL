package ma.projet.graph.repositories;


import ma.projet.graph.entities.Compte;
import ma.projet.graph.entities.Transaction;
import ma.projet.graph.entities.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    List<Transaction> findByCompte(Compte compte);

    @Query("SELECT t FROM Transaction t WHERE t.compte.id = :compteId")
    List<Transaction> findByCompteId(Long compteId);

    @Query("SELECT COALESCE(SUM(t.montant), 0) FROM Transaction t WHERE t.type = :type")
    double sumByType(TypeTransaction type);


}